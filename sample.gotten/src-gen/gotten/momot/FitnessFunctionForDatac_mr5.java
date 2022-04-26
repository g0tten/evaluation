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

public class FitnessFunctionForDatac_mr5 {
	private static String INITIAL_MODEL = null;
	private static double INITIAL_Memory = 0.0;

	private static double getMEmoryDynamic(EObject eObject, Set<EObject> processed) {
		double memory = 0.0;
		if (processed.contains(eObject) == false) {
			for (EAttribute att : eObject.eClass().getEAllAttributes()) {
				if (att.getName().equals("numBoards")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							memory += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							memory += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							memory += (double) value;
						}
					}
				}
				if (att.getName().equals("nodesPerBoard")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							memory += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							memory += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							memory += (double) value;
						}
					}
				}
				if (att.getName().equals("MEMSpeed")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							memory += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							memory += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							memory += (double) value;
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
							double result = getMEmoryDynamic(containedEObject, processed);
							if (result != 0) {
								memory += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getMEmoryDynamic(containedEObject, processed);
								if (result != 0) {
									memory += result;
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
							double result = getMEmoryDynamic(containedEObject, processed);
							if (result != 0) {
								memory += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getMEmoryDynamic(containedEObject, processed);
								if (result != 0) {
									memory += result;
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
							double result = getMEmoryDynamic(containedEObject, processed);
							if (result != 0) {
								memory += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getMEmoryDynamic(containedEObject, processed);
								if (result != 0) {
									memory += result;
								}
							}
						}
					}
				}
			}
			processed.add(eObject);
		}
		return memory;
	}

	private static double getMEmory(DataCentre object) {
		double memory = 0.0;
		List<Rack> objectsRack = object.getRacks();
		for (Rack objectRack : objectsRack) {
			double result = getMEmory(objectRack);
			if (result != 0) {
				memory += result;
			}
		}
		return memory;
	}

	private static double getMEmory(Rack object) {
		double memory = 0.0;
		Object valuenumBoards = object.getNumBoards();
		if (valuenumBoards instanceof Integer) {
			if ((int) valuenumBoards != 0) {
				memory += (int) valuenumBoards;
			}
		}
		if (valuenumBoards instanceof Float) {
			if ((float) valuenumBoards != 0) {
				memory += (float) valuenumBoards;
			}
		}
		if (valuenumBoards instanceof Double) {
			if ((double) valuenumBoards != 0) {
				memory += (double) valuenumBoards;
			}
		}
		Board objectBoard = object.getBoard();
		double result = getMEmory(objectBoard);
		if (result != 0) {
			memory += result;
		}
		return memory;
	}

	private static double getMEmory(Board object) {
		double memory = 0.0;
		Object valuenodesPerBoard = object.getNodesPerBoard();
		if (valuenodesPerBoard instanceof Integer) {
			if ((int) valuenodesPerBoard != 0) {
				memory += (int) valuenodesPerBoard;
			}
		}
		if (valuenodesPerBoard instanceof Float) {
			if ((float) valuenodesPerBoard != 0) {
				memory += (float) valuenodesPerBoard;
			}
		}
		if (valuenodesPerBoard instanceof Double) {
			if ((double) valuenodesPerBoard != 0) {
				memory += (double) valuenodesPerBoard;
			}
		}
		NodeType objectNodeType = object.getNodeType();
		double result = getMEmory(objectNodeType);
		if (result != 0) {
			memory += result;
		}
		return memory;
	}

	private static double getMEmory(NodeType object) {
		double memory = 0.0;
		Object valueMEMSpeed = object.getMEMSpeed();
		if (valueMEMSpeed instanceof Integer) {
			if ((int) valueMEMSpeed != 0) {
				memory += (int) valueMEMSpeed;
			}
		}
		if (valueMEMSpeed instanceof Float) {
			if ((float) valueMEMSpeed != 0) {
				memory += (float) valueMEMSpeed;
			}
		}
		if (valueMEMSpeed instanceof Double) {
			if ((double) valueMEMSpeed != 0) {
				memory += (double) valueMEMSpeed;
			}
		}
		return memory;
	}

	public static double getMEmoryDistance(final DataCentre root, final String initial_model) {
		if (INITIAL_MODEL == null) {
			INITIAL_MODEL = initial_model;
			List<EPackage> packages = ModelManager.loadMetaModelNoException("model/datac.ecore");
			Resource resource = ModelManager.loadModelNoException(packages, initial_model);
			EObject initial_model_root = resource.getContents().get(0);
			Set<EObject> processed = new HashSet<EObject>();
			INITIAL_Memory = getMEmoryDynamic(initial_model_root, processed);
		}
		double memory = getMEmory(root);
		return Math.abs(INITIAL_Memory - memory);
	}
}
