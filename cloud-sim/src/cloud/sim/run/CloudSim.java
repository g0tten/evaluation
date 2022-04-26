package cloud.sim.run;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import gotten.processor.run.Processor;
import gotten.utils.ModelManager;
import gotten.utils.exceptions.MetaModelNotFoundException;
import gotten.utils.exceptions.ModelNotFoundException;
import gotten.utils.exceptions.ReferenceNonExistingException;
import z_MT_experiments.Executor_MT;

public class CloudSim extends Processor {

	private static final String PROJECT_PATH = ModelManager.getWorkspaceAbsolutePath() + File.separator + "sample.gotten";
	private static final String INITIAL_WORKLOAD_PATH = ModelManager.getEclipseHomePath() + File.separator + "workspace3" + File.separator + "cloudsim-examples" + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "workload"  + File.separator + "io_mix" + File.separator + "cpu" + File.separator + "mix_vm";
	private static final String DATACENTRE_CLOUD_NSURI = "http://tcinputCloud/1.0";
	private static final String WORKLOAD_CLOUD_NSURI = "http://workloadCloud/1.0";
	private static final String DATACENTRE_CLOUD_ECORE_PATH = PROJECT_PATH + File.separator + "model" + File.separator + "datac.ecore";
	private static final String DATACENTRE_CLOUD_SOURCE_PATH = PROJECT_PATH + File.separator + "model" + File.separator + "dcmodels" + File.separator + "input_00001.model";

	private static List<String> workloadPaths = new ArrayList<String>();
	private static int workloadIndex = 0;
	
	public CloudSim() {
		workloadPaths.add(INITIAL_WORKLOAD_PATH);
	}
	
	@Override
	public String getID() {
		return "CloudSim";
	}
	
	@Override
	public String getMetamodel() {
		return "datac.ecore";
	}

	@Override
	public Object getProcessorFeature(List<Resource> models, String name) {
		List<Object> values = new ArrayList<Object>();
		try {
			for (Resource model : models) {
				String modelName = model.getURI().toFileString().substring(model.getURI().toFileString().lastIndexOf(File.separator + "model" + File.separator) + (File.pathSeparator + "model" + File.separator).length(), model.getURI().toFileString().length());
				String outputSimpleName = modelName.substring(modelName.lastIndexOf(File.separator) + 1, modelName.length());
				outputSimpleName = outputSimpleName.replace("input_", "output_").replace("workload_", "output_").replace("followup_", "output_").replace(".model", ".tc");
				String outputFileName = modelName.substring(0, modelName.lastIndexOf(File.separator) + 1) + outputSimpleName;
				File outputFile = new File(PROJECT_PATH + File.separator + "tc" + File.separator + this.getID() + File.separator + outputFileName);
				if (outputFile.exists() == true) {
					switch (name.toLowerCase()) {
					case "time":
						FileReader reader = new FileReader(outputFile);
						Scanner scanner = new Scanner(reader);
						while (scanner.hasNextLine()) {
						String line = scanner.nextLine();

						//Total simulation time:
						String search = "Total simulation time: ";
						int nStart = line.indexOf(search);
						if (nStart != -1) {

						nStart = nStart + search.length();
						int nEnd = line.indexOf(" sec", nStart);
						String strValue = line.substring(nStart, nEnd);

						strValue = strValue.replace(",", ".");
						System.out.println("[cloudsim] simulationtime: " + strValue);
						float fValue = Float.parseFloat(strValue);
						values.add(fValue);
						}
						}
						reader.close();
						break;
					case "energy":
						reader = new FileReader(outputFile);
						scanner = new Scanner(reader);
						while (scanner.hasNextLine()) {
							String line, search, strValue;
							int nStart, nEnd;
							float fValue;
							
							line = scanner.nextLine();
							
							search = "total Energy consumption (CPU+storage): ";
							nStart = line.indexOf(search);
							if (nStart != -1) {
								
								nStart = nStart + search.length();
								nEnd = line.indexOf(" kWh", nStart);
								strValue = line.substring(nStart, nEnd);
								
								strValue = strValue.replace(",", ".");
								System.out.println("[cloudsim] energyvalue: " + strValue);
								
								System.out.println("Total energy: " + strValue);
								fValue =  Float.parseFloat(strValue);
								values.add(fValue);
							}
						}
						reader.close();						
						break;
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (values.size() > 0) {
			values.add(this.getID());
		}
		return values;
	}
	
	private String generateInputTestCase(List<EPackage> packages, Resource model) {
		String generated = "";
		try {
			String packageName = packages.get(0).getName();
			generated += "#" + packageName + "\n";
			generated += "#Vm\n";
			int quantity = 0;
			int bandwidth = 0;
			int latency = 0;
			int cpuCores = 0;
			int cpuSpeed = 0;
			int memSpeed = 0;
			int diskSpeed = 0;
			//reads the model
			EObject eObject = ModelManager.getRoot(model);
			for (EReference ref : eObject.eClass().getEAllReferences()) {
				Object ob = ModelManager.getReferenced(ref, eObject);
				// if it is an EObject 
				if (ob instanceof EObject) {
					EObject eOb = (EObject) ob;
					String className = eOb.eClass().getName();
					if (className.equals("Rack")) {
						for (EStructuralFeature sf : eOb.eClass().getEAllStructuralFeatures()) {
							// if it is an EAttribute
							if (sf instanceof EAttribute) {
								generated += className.toLowerCase() + "." + sf.getName();
								Object value = ModelManager.getAttributeValue(sf.getName(), eOb);
								if (value != null) {
									generated += " = " + value.toString() + "\n";
								}
								else {
									generated += " = null\n";
								}
							}
							// if it is an EReference
						}
					}
					if (className.equals("Network")) {
						for (EStructuralFeature sf : eOb.eClass().getEAllStructuralFeatures()) {
							// if it is an EAttribute
							if (sf instanceof EAttribute) {
								if (sf.getName().equals("bandwidth")) {
									Object value = ModelManager.getAttributeValue(sf.getName(), eOb);
									if (value != null) {
										bandwidth = (int) value;
									}
								}
								if (sf.getName().equals("latency")) {
									Object value = ModelManager.getAttributeValue(sf.getName(), eOb);
									if (value != null) {
										latency = (int) value;
									}
								}
							}
							// if it is an EReference
						}
					}
					//generated += "#" + className + "\n";
					//for (EStructuralFeature sf : eOb.eClass().getEAllStructuralFeatures()) {
						// if it is an EAttribute
						//if (sf instanceof EAttribute) {
							//generated += className.toLowerCase() + "." + sf.getName();
							//Object value = ModelManager.getAttributeValue(sf.getName(), eOb);
							//if (value != null) {
								//generated += " = " + value.toString() + "\n";
							//}
							//else {
								//generated += " = null\n";
							//}
						//}
						// if it is an EReference
					//}
				}
				// if it is a list
				if (ob instanceof List<?>) {
					List<EObject> leOb = (List<EObject>) ob;
					int numBoards = 0;
					int nodesPerBoard = 0;
					for (EObject eOb: leOb) {
						String className = eOb.eClass().getName();
						if (className.equals("Rack")) {
							for (EStructuralFeature sf : eOb.eClass().getEAllStructuralFeatures()) {
								if (sf instanceof EAttribute) {
									if (sf.getName().equals("numBoards")) {
										Object value = ModelManager.getAttributeValue(sf.getName(), eOb);
										if (value != null) {
											numBoards += (int) value;
										}
									}
								}
								if (sf instanceof EReference) {
									if (sf.getName().equals("board")) {
										Object o = ModelManager.getReferenced((EReference) sf, eOb);
										if (o instanceof EObject) {
											EObject board = (EObject) o;
											for (EStructuralFeature sff : board.eClass().getEAllStructuralFeatures()) {
												if (sff.getName().equals("nodesPerBoard")) {
													Object value = ModelManager.getAttributeValue(sff.getName(), board);
													if (value != null) {
														nodesPerBoard += (int) value;
													}
												}
												if (sff.getName().equals("nodeType")) {
													Object oo = ModelManager.getReferenced((EReference) sff, board);
													if (oo instanceof EObject) {
														EObject nodeType = (EObject) oo;
														for (EStructuralFeature sfff : nodeType.eClass().getEAllStructuralFeatures()) {
															if (sfff.getName().equals("CPUCores")) {
																Object value = ModelManager.getAttributeValue(sfff.getName(), nodeType);
																if (value != null) {
																	cpuCores += (int) value;
																}
															}
															if (sfff.getName().equals("CPUSpeed")) {
																Object value = ModelManager.getAttributeValue(sfff.getName(), nodeType);
																if (value != null) {
																	cpuSpeed += (int) value;
																}
															}
															if (sfff.getName().equals("MEMSpeed")) {
																Object value = ModelManager.getAttributeValue(sfff.getName(), nodeType);
																if (value != null) {
																	memSpeed += (int) value;
																}
															}
															if (sfff.getName().equals("DiskSpeed")) {
																Object value = ModelManager.getAttributeValue(sfff.getName(), nodeType);
																if (value != null) {
																	diskSpeed += (int) value;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					if (nodesPerBoard == 0) {
						quantity += numBoards;
					}
					else {
						quantity += numBoards * nodesPerBoard;
					}
				}
			}
			String workloadPath = workloadPaths.get(workloadIndex);
			if (workloadPath.indexOf(File.separator) != -1) {
				workloadPath = workloadPath.substring(0, workloadPath.lastIndexOf(File.separator));
			}
			generated += "vm.quantity = " + quantity*2 + "\n";
			generated += "vm.mips = 250\n";
			generated += "vm.pes = 1\n";
			generated += "vm.ram = 128\n";
			generated += "vm.bw = " + bandwidth + "\n";
			generated += "vm.size = 2500\n";
			generated += "vm.priority = 1\n";
			generated += "vm.schedulingInterval = 300\n";
			generated += "vm.scheduler = null\n\n";
			generated += "#User\n";
			generated += "user.trace = null\n\n";
			generated += "#Cloud\n";
			generated += "cloud.model = null\n";
			generated += "cloud.description = null\n";
			generated += "cloud.scheduler = null\n\n";
			generated += "#Host\n";
			generated += "host.quantity = " + quantity + "\n";
			generated += "host.ram = 1024\n";
			generated += "host.ramspeed = " + memSpeed + "\n";
			generated += "host.bw = " + (bandwidth*10) + "\n";
			generated += "host.sto = 1000000\n";
			generated += "host.mips = "+ cpuSpeed +"\n";
			generated += "host.pes = "+ cpuCores +"\n\n";
			generated += "#Storage\n";
			generated += "sto.type = hdd\n";
			generated += "sto.capacity = 1000000\n";
			generated += "sto.maxTransferRate = "+ diskSpeed +"\n";
			generated += "sto.latency = 5\n\n";
			generated += "#Work\n";
			generated += "work.path = " + workloadPath + "\n";
			generated += "work.name = mix_vm\n";
			generated += "work.volume = 10\n";
			generated += "work.numTraces = 10\n\n";
			generated += "#Network\n";
			generated += "net.bandwidth = " + (bandwidth*10) + "\n";
			generated += "net.latency = " + latency + "\n";
			generated += "net.switches = 0\n\n\n";
		} catch (ReferenceNonExistingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return generated;
	}

	private boolean generateWorkload(Resource model) {
		EObject root = ModelManager.getRoot(model);
		try {
			Object object = ModelManager.getReferenced("workloads", root);
			List<EObject> workloads = new ArrayList<EObject>();
			if (object instanceof EObject) {
				EObject workloadEObject = (EObject) object;
				workloads.add(workloadEObject);
			}
			if (object instanceof List<?>) {
				List<EObject> workloadList = (List<EObject>) object;
				workloads.addAll(workloadList);
			}
			for (EObject workload : workloads) {
				Object value = ModelManager.getAttributeValue("ProcessorID", workload);
				if ((value instanceof String && ((String) value) != null && ((String) value).length() > 0)) {
					String processorID = (String) value;
					if (!processorID.equals(this.getID())) {
						return false;
					}
				}
				value = ModelManager.getAttributeValue("Path", workload);
				if (!(value instanceof String && ((String) value) != null && ((String) value).length() > 0)) {
					continue;
				}
				String path = (String) value;
				String pathToAdd = path;
				if (path.indexOf(File.separatorChar) != -1) {
					pathToAdd = pathToAdd.substring(0, pathToAdd.lastIndexOf(File.separatorChar));
				}
				pathToAdd = pathToAdd.replace(File.separator + "workload" + File.separator, File.separator + "workload" + File.separator + this.getID() + File.separator+ model.getURI().lastSegment().toString().replace(".model", "") + File.separator);
				if (workloadPaths.contains(pathToAdd) == false) {
					workloadPaths.add(pathToAdd);
					workloadIndex++;
				}
				File workloadFolder = new File(pathToAdd);
				if (workloadFolder.exists() == false) {
					workloadFolder.mkdirs();
				}
				value = ModelManager.getAttributeValue("Name", workload);
				String workloadName = "";
				if (!(value instanceof String && ((String) value) != null && ((String) value).length() > 0)) {
					continue;
				}
				workloadName = (String) value;
				File workloadFile = new File (pathToAdd + File.separator + workloadName);
				value = ModelManager.getReferenced("Traces", workload);
				List<EObject> traces = new ArrayList<EObject>();
				if (value instanceof EObject) {
					EObject traceEObject = (EObject) value;
					traces.add(traceEObject);
				}
				if (value instanceof List<?>) {
					List<EObject> traceList = (List<EObject>) value;
					traces.addAll(traceList);
				}
				for (EObject trace : traces) {
					value = ModelManager.getAttributeValue("Name", trace);
					String strTrace = "";
					if (!(value instanceof String && ((String) value) != null && ((String) value).length() > 0)) {
						continue;
					}
					strTrace = (String) value;
					FileOutputStream fileOutputStream = new FileOutputStream(workloadFile.getAbsolutePath());
					OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
					Writer writer = new BufferedWriter(outputStreamWriter);
					writer.write(strTrace);
					writer.close();
					outputStreamWriter.close();
					fileOutputStream.close();
				}
			}
		} catch (ReferenceNonExistingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public String generate(String metamodel, Resource model) {
		String generated = "";
		try {
			List<EPackage> packages = ModelManager.loadMetaModel(metamodel);
			/* DataCentre model */
			if (packages.get(0).getNsURI().equals(DATACENTRE_CLOUD_NSURI)) {
				generated = generateInputTestCase(packages, model);
			}
			/* Workload model */
			if (packages.get(0).getNsURI().equals(WORKLOAD_CLOUD_NSURI)) {
				boolean success = generateWorkload(model);
				if (success != true) {
					return generated;
				}
				List<EPackage> sourcePackages = ModelManager.loadMetaModel(DATACENTRE_CLOUD_ECORE_PATH);
				Resource sourceModel = ModelManager.loadModel(sourcePackages, DATACENTRE_CLOUD_SOURCE_PATH);
				generated = generateInputTestCase(sourcePackages, sourceModel);
			}
		} catch (MetaModelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ModelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return generated;
	}
	
	@Override
	public String createTest(String pathInput, String pathOutput) {
		String mtcScript = "Id: 1\n";
		mtcScript += "MutantId: 0\n";
		mtcScript += "GroupId: 0\n";
		mtcScript += "InputSrc: " + pathInput + "\n";
		mtcScript += "OutputSrc: " + pathOutput + "\n";
		mtcScript += "ExecCommands: \n";
		mtcScript += "isSourceTC: false\n";
		mtcScript += "followUpChilds: #0##\n";
		mtcScript += "Description:\n";
		return mtcScript;
	}

	@Override
	public int execute(List<Resource> models) {
		String[] args = new String[2];
		System.out.println("[cloud-sim] - running models!");
		args[0] = "--standalone";
		for (Resource model : models) {
			String modelName = model.getURI().toFileString().substring(model.getURI().toFileString().lastIndexOf(File.separator + "model" + File.separator) + (File.pathSeparator + "model" + File.separator).length(), model.getURI().toFileString().length());
			String mtcSimpleName = modelName.substring(modelName.lastIndexOf(File.separator) + 1, modelName.length());
			mtcSimpleName = mtcSimpleName.replace("input_", "tc_").replace("followup_", "tc_").replace("workload_", "tc_").replace(".model", ".mtc");
			String mtcName = modelName.substring(0, modelName.lastIndexOf(File.separator) + 1) + mtcSimpleName;
			args[1] = PROJECT_PATH + File.separator + "tc" + File.separator + this.getID() + File.separator + mtcName;
			try {
				Executor_MT.main(args);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
}
