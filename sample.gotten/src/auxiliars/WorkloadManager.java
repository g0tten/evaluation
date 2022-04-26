package auxiliars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import gotten.utils.ModelManager;
import gotten.utils.exceptions.MetaModelNotFoundException;
import gotten.utils.exceptions.ModelNotFoundException;
import workloadCloud.Trace;
import workloadCloud.Workload;
import workloadCloud.WorkloadCloudFactory;
import workloadCloud.WorkloadSet;

public class WorkloadManager {

	final static int WORKLOAD_TO_MODEL=1;
	final static int MODEL_TO_WORKLOAD=2;
	public static void main(String[] args)
	{
		String strWorkloadPath, strMetamodelPath, strOutputPath, strWorkloadName;
		int nTraces, nOperation;

		
		nOperation = 0;
		if (args.length > 2)
		{
			nOperation = Integer.parseInt(args[1]);
			strMetamodelPath = args[2];
			strWorkloadPath = args[3];
			strOutputPath = args[4];
		}
		else
		{
			
			//nOperation = MODEL_TO_WORKLOAD;
			nOperation = WORKLOAD_TO_MODEL;
			strMetamodelPath = "C:\\eclipse\\runtime-EclipseApplication\\sample.gotten\\model\\workload.ecore";
			if(nOperation==WORKLOAD_TO_MODEL)
			{
				//"/home/j0hn/eclipse/workspace3/dissect-cf-examples-master/anon_jobs.gwf";
				strWorkloadPath = "C:\\eclipse\\workspace3\\dissect-cf-examples-master\\anon_jobs.gwf";
				//strWorkloadPath = "C:\\eclipse\\workspace3\\cloudsim-examples\\workload\\io_mix\\cpu\\mix_vm";
				//strWorkloadPath = "/home/j0hn/eclipse/workspace3/dissect-cf-examples-master/anon_jobs.gwf";
				strOutputPath = "C:\\eclipse\\runtime-EclipseApplication\\sample.gotten\\model\\dissect_workload.model";
				//strOutputPath = "C:\\eclipse\\runtime-EclipseApplication\\sample.gotten\\model\\cloudsim_workload.model";
			}
			else
			{
				strMetamodelPath = "C:\\eclipse\\runtime-EclipseApplication\\sample.gotten\\model\\workload.ecore";	
				strWorkloadPath = "C:\\eclipse\\runtime-EclipseApplication\\sample.gotten\\model\\cloudsim_workload.model";
				strOutputPath = "C:\\eclipse\\runtime-EclipseApplication\\sample.gotten\\model\\test\\cpu";
			}

		}
		
		nTraces=8000;
		
		//Obtain the metamodel, workload and output paths
		
		if(nOperation == WORKLOAD_TO_MODEL)
			workloadToModel(strWorkloadPath, strMetamodelPath, strOutputPath, nTraces);
		else if(nOperation == MODEL_TO_WORKLOAD)
			modelToWorkload(strWorkloadPath, strMetamodelPath, strOutputPath);
		
		System.out.println(">End");
		
	}


	private static void modelToWorkload(String strWorkloadPath, String strMetamodelPath, String strOutputPath) {
		//EMFHandler modelHandler;
		List<EPackage> packageList;
		Resource res;
		WorkloadSet wlSet;
		File workloadOutputFile, wlFile;
		
		try {
			//Open the metamodel
			//modelHandler = new EMFHandler();
			
			packageList = ModelManager.loadMetaModel(strMetamodelPath);
			res = ModelManager.loadModel(packageList, strWorkloadPath);
			
			wlSet = (WorkloadSet) res.getContents().get(0);
			
			
			//If the output file is a directory, create it!
			workloadOutputFile = new File(strOutputPath);
			if (workloadOutputFile.isDirectory())
				workloadOutputFile.mkdirs();
			//Iterate
			for(Workload wl: wlSet.getWorkloads())
			{
				if(wl != null)
				{
					//Create file
					wl.getName();
					wlFile = new File(strOutputPath+File.separator+wl.getName());
					Writer writer = null;
					String strTrace = null;

					try {
						for(Trace trace: wl.getTraces())
						{
								strTrace = trace.getName();
							    writer = new BufferedWriter(new OutputStreamWriter(
							          new FileOutputStream(wlFile.getAbsolutePath()), "utf-8"));
							    writer.write(strTrace);
						}
					} catch (IOException ex) {
					    // Report
					} finally {
					   try {writer.close();} catch (Exception ex) {/*ignore*/}
					}
				}
			}
		} catch (MetaModelNotFoundException | ModelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static void workloadToModel(String strWorkloadPath, String strMetamodelPath,
			String strOutputPath, int nTraces) {
		String strWorkloadName;
		File workloadFile, filePath;
		WorkloadSet wlSet;
		Workload wl;
		Resource res;
		List<EPackage> packageList;
//		EMFHandler modelHandler;
		
		//Check if the workload file exists
		try {
//			modelHandler = new EMFHandler();
			packageList = ModelManager.loadMetaModel(strMetamodelPath);
			res = ModelManager.createModel(strOutputPath);
			
			//Check if the path is a file or folder
			workloadFile = new File(strWorkloadPath);
			
			if (workloadFile.exists())
			{
				//create a workload set
				wlSet = WorkloadCloudFactory.eINSTANCE.createWorkloadSet();
				if (workloadFile.isFile())
				{
					strWorkloadName = workloadFile.getName();
					//loads the workload
					//wl = generateWorkload(modelHandler, strWorkloadName, strWorkloadPath, workloadFile, nTraces);
					wl = generateWorkload(strWorkloadName, strWorkloadPath, workloadFile, nTraces);
					wlSet.getWorkloads().add(wl);
					
				}
				else if (workloadFile.isDirectory())
				{
					//List all files of the directory
					String[] listFiles = workloadFile.list();
					
					 for(String strWPath : listFiles) {
					      System.out.println(strWPath);
					      strWorkloadName  = strWPath;
					      filePath = new File(strWorkloadPath+File.separator+strWPath);
//					      wl = generateWorkload(modelHandler, strWPath, filePath.getAbsolutePath(), filePath, nTraces);
					      wl = generateWorkload(strWPath, filePath.getAbsolutePath(), filePath, nTraces);
					      if(wl != null)
					    	  wlSet.getWorkloads().add(wl);
					      else
					    	  System.err.println("Null workload: "+strWPath);
					 }
				}
				
				res.getContents().add(wlSet);
				ModelManager.saveOutModel(res, strOutputPath);
				
				
			}
		} catch (MetaModelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


//	private static Workload generateWorkload(EMFHandler modelHandler, String strWorkloadName, String strWorkloadPath, File workloadFile, int nTraces) {
	private static Workload generateWorkload(String strWorkloadName, String strWorkloadPath, File workloadFile, int nTraces) {
//		LinkedList<String> linesList;
		List<Trace> tracesList;
		BufferedReader br;
		Workload wRet;
		int nLoadedTraces;
		
		nLoadedTraces = 0;
		br = null;
		wRet = null;
		
		if(workloadFile.exists())
		{
			String line;
//			linesList = new LinkedList<String>();
			tracesList = new ArrayList<Trace>();
			
			try  
			{
				
				br = new BufferedReader(new FileReader(workloadFile));
				while ((line = br.readLine()) != null && nLoadedTraces < nTraces) {
					// process the line.

					System.out.printf("line %d: %s\n", nLoadedTraces,line);
					Trace trace = WorkloadCloudFactory.eINSTANCE.createTrace();
					trace.setName(line);
					tracesList.add(trace);
					nLoadedTraces++;
				}
//				wRet = modelHandler.createWorkloadEcore("wl-", linesList);
				wRet = WorkloadCloudFactory.eINSTANCE.createWorkload();
//				wRet.setNumTraces(linesList.size());
				wRet.setNumTraces(tracesList.size());
				wRet.setPath(strWorkloadPath);
				wRet.setName(strWorkloadName);
				wRet.setProcessorID("Dissect");
				wRet.getTraces().addAll(tracesList);
				br.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception reading the file: "+strWorkloadPath);
			}

		}
		
		return wRet;
	}
	
}
