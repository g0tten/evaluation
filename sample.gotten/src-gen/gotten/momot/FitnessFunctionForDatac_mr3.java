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

public class FitnessFunctionForDatac_mr3 {
	private static String INITIAL_MODEL = null;
	private static double INITIAL_Storage = 0.0;

	private static double getSTorageDynamic(EObject eObject, Set<EObject> processed) {
		double storage = 0.0;
		if (processed.contains(eObject) == false) {
			for (EAttribute att : eObject.eClass().getEAllAttributes()) {
				if (att.getName().equals("numBoards")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							storage += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							storage += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							storage += (double) value;
						}
					}
				}
				if (att.getName().equals("nodesPerBoard")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							storage += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							storage += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							storage += (double) value;
						}
					}
				}
				if (att.getName().equals("DiskSpeed")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							storage += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							storage += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							storage += (double) value;
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
							double result = getSTorageDynamic(containedEObject, processed);
							if (result != 0) {
								storage += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getSTorageDynamic(containedEObject, processed);
								if (result != 0) {
									storage += result;
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
							double result = getSTorageDynamic(containedEObject, processed);
							if (result != 0) {
								storage += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getSTorageDynamic(containedEObject, processed);
								if (result != 0) {
									storage += result;
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
							double result = getSTorageDynamic(containedEObject, processed);
							if (result != 0) {
								storage += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getSTorageDynamic(containedEObject, processed);
								if (result != 0) {
									storage += result;
								}
							}
						}
					}
				}
			}
			processed.add(eObject);
		}
		return storage;
	}

	private static double getSTorage(DataCentre object) {
		double storage = 0.0;
		List<Rack> objectsRack = object.getRacks();
		for (Rack objectRack : objectsRack) {
			double result = getSTorage(objectRack);
			if (result != 0) {
				storage += result;
			}
		}
		return storage;
	}

	private static double getSTorage(Rack object) {
		double storage = 0.0;
		Object valuenumBoards = object.getNumBoards();
		if (valuenumBoards instanceof Integer) {
			if ((int) valuenumBoards != 0) {
				storage += (int) valuenumBoards;
			}
		}
		if (valuenumBoards instanceof Float) {
			if ((float) valuenumBoards != 0) {
				storage += (float) valuenumBoards;
			}
		}
		if (valuenumBoards instanceof Double) {
			if ((double) valuenumBoards != 0) {
				storage += (double) valuenumBoards;
			}
		}
		Board objectBoard = object.getBoard();
		double result = getSTorage(objectBoard);
		if (result != 0) {
			storage += result;
		}
		return storage;
	}

	private static double getSTorage(Board object) {
		double storage = 0.0;
		Object valuenodesPerBoard = object.getNodesPerBoard();
		if (valuenodesPerBoard instanceof Integer) {
			if ((int) valuenodesPerBoard != 0) {
				storage += (int) valuenodesPerBoard;
			}
		}
		if (valuenodesPerBoard instanceof Float) {
			if ((float) valuenodesPerBoard != 0) {
				storage += (float) valuenodesPerBoard;
			}
		}
		if (valuenodesPerBoard instanceof Double) {
			if ((double) valuenodesPerBoard != 0) {
				storage += (double) valuenodesPerBoard;
			}
		}
		NodeType objectNodeType = object.getNodeType();
		double result = getSTorage(objectNodeType);
		if (result != 0) {
			storage += result;
		}
		return storage;
	}

	private static double getSTorage(NodeType object) {
		double storage = 0.0;
		Object valueDiskSpeed = object.getDiskSpeed();
		if (valueDiskSpeed instanceof Integer) {
			if ((int) valueDiskSpeed != 0) {
				storage += (int) valueDiskSpeed;
			}
		}
		if (valueDiskSpeed instanceof Float) {
			if ((float) valueDiskSpeed != 0) {
				storage += (float) valueDiskSpeed;
			}
		}
		if (valueDiskSpeed instanceof Double) {
			if ((double) valueDiskSpeed != 0) {
				storage += (double) valueDiskSpeed;
			}
		}
		return storage;
	}

	public static double getSTorageDistance(final DataCentre root, final String initial_model) {
		if (INITIAL_MODEL == null) {
			INITIAL_MODEL = initial_model;
			List<EPackage> packages = ModelManager.loadMetaModelNoException("model/datac.ecore");
			Resource resource = ModelManager.loadModelNoException(packages, initial_model);
			EObject initial_model_root = resource.getContents().get(0);
			Set<EObject> processed = new HashSet<EObject>();
			INITIAL_Storage = getSTorageDynamic(initial_model_root, processed);
		}
		double storage = getSTorage(root);
		return Math.abs(INITIAL_Storage - storage);
	}
}
