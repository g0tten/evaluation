package gotten.momot;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import tcinputCloud.DataCentre;
import tcinputCloud.Rack;
import tcinputCloud.Board;
import tcinputCloud.NodeType;
import gotten.utils.ModelManager;
import java.lang.Math;

public class FitnessFunctionForDatac_mr2 {
	private static String INITIAL_MODEL = null;
	private static double INITIAL_NMachines = 0.0;

	private static double getNMachinesDynamic(EObject eObject, Set<EObject> processed) {
		double nmachines = 0.0;
		if (processed.contains(eObject) == false) {
			for (EAttribute att : eObject.eClass().getEAllAttributes()) {
				if (att.getName().equals("numBoards")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							nmachines += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							nmachines += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							nmachines += (double) value;
						}
					}
				}
				if (att.getName().equals("nodesPerBoard")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							nmachines += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							nmachines += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							nmachines += (double) value;
						}
					}
				}
				if (att.getName().equals("CPUCores")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							nmachines += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							nmachines += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							nmachines += (double) value;
						}
					}
				}
			}
			for (EReference ref : eObject.eClass().getEAllReferences()) {
				if (ref.getName().equals("racks")) {
					Object o = ModelManager.getReferencedNoException(ref.getName(), eObject);
					if (o instanceof EObject) {
						EObject containedEObject = (EObject) o;
						if (processed.contains(containedEObject) == false) {
							double result = getNMachinesDynamic(containedEObject, processed);
							if (result != 0) {
								nmachines += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getNMachinesDynamic(containedEObject, processed);
								if (result != 0) {
									nmachines += result;
								}
							}
						}
					}
				}
				if (ref.getName().equals("board")) {
					Object o = ModelManager.getReferencedNoException(ref.getName(), eObject);
					if (o instanceof EObject) {
						EObject containedEObject = (EObject) o;
						if (processed.contains(containedEObject) == false) {
							double result = getNMachinesDynamic(containedEObject, processed);
							if (result != 0) {
								nmachines += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getNMachinesDynamic(containedEObject, processed);
								if (result != 0) {
									nmachines += result;
								}
							}
						}
					}
				}
				if (ref.getName().equals("nodeType")) {
					Object o = ModelManager.getReferencedNoException(ref.getName(), eObject);
					if (o instanceof EObject) {
						EObject containedEObject = (EObject) o;
						if (processed.contains(containedEObject) == false) {
							double result = getNMachinesDynamic(containedEObject, processed);
							if (result != 0) {
								nmachines += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getNMachinesDynamic(containedEObject, processed);
								if (result != 0) {
									nmachines += result;
								}
							}
						}
					}
				}
			}
			processed.add(eObject);
		}
		return nmachines;
	}

	private static double getNMachines(DataCentre object) {
		double nmachines = 0.0;
		List<Rack> objectsRack = object.getRacks();
		for (Rack objectRack : objectsRack) {
			double result = getNMachines(objectRack);
			if (result != 0) {
				nmachines += result;
			}
		}
		return nmachines;
	}

	private static double getNMachines(Rack object) {
		double nmachines = 0.0;
		Object valuenumBoards = object.getNumBoards();
		if (valuenumBoards instanceof Integer) {
			if ((int) valuenumBoards != 0) {
				nmachines += (int) valuenumBoards;
			}
		}
		if (valuenumBoards instanceof Float) {
			if ((float) valuenumBoards != 0) {
				nmachines += (float) valuenumBoards;
			}
		}
		if (valuenumBoards instanceof Double) {
			if ((double) valuenumBoards != 0) {
				nmachines += (double) valuenumBoards;
			}
		}
		Board objectBoard = object.getBoard();
		double result = getNMachines(objectBoard);
		if (result != 0) {
			nmachines += result;
		}
		return nmachines;
	}

	private static double getNMachines(Board object) {
		double nmachines = 0.0;
		Object valuenodesPerBoard = object.getNodesPerBoard();
		if (valuenodesPerBoard instanceof Integer) {
			if ((int) valuenodesPerBoard != 0) {
				nmachines += (int) valuenodesPerBoard;
			}
		}
		if (valuenodesPerBoard instanceof Float) {
			if ((float) valuenodesPerBoard != 0) {
				nmachines += (float) valuenodesPerBoard;
			}
		}
		if (valuenodesPerBoard instanceof Double) {
			if ((double) valuenodesPerBoard != 0) {
				nmachines += (double) valuenodesPerBoard;
			}
		}
		NodeType objectNodeType = object.getNodeType();
		double result = getNMachines(objectNodeType);
		if (result != 0) {
			nmachines += result;
		}
		return nmachines;
	}

	private static double getNMachines(NodeType object) {
		double nmachines = 0.0;
		Object valueCPUCores = object.getCPUCores();
		if (valueCPUCores instanceof Integer) {
			if ((int) valueCPUCores != 0) {
				nmachines += (int) valueCPUCores;
			}
		}
		if (valueCPUCores instanceof Float) {
			if ((float) valueCPUCores != 0) {
				nmachines += (float) valueCPUCores;
			}
		}
		if (valueCPUCores instanceof Double) {
			if ((double) valueCPUCores != 0) {
				nmachines += (double) valueCPUCores;
			}
		}
		return nmachines;
	}

	public static double getNMachinesDistance(final DataCentre root, final String initial_model) {
		if (INITIAL_MODEL == null) {
			INITIAL_MODEL = initial_model;
			List<EPackage> packages = ModelManager.loadMetaModelNoException("model/datac.ecore");
			Resource resource = ModelManager.loadModelNoException(packages, initial_model);
			EObject initial_model_root = resource.getContents().get(0);
			Set<EObject> processed = new HashSet<EObject>();
			INITIAL_NMachines = getNMachinesDynamic(initial_model_root, processed);
		}
		double nmachines = getNMachines(root);
		return Math.abs(INITIAL_NMachines - nmachines);
	}
}
