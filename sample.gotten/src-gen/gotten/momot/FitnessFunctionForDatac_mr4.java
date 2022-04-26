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
import tcinputCloud.Network;
import gotten.utils.ModelManager;
import java.lang.Math;

public class FitnessFunctionForDatac_mr4 {
	private static String INITIAL_MODEL = null;
	private static double INITIAL_Network = 0.0;

	private static double getNEtworkDynamic(EObject eObject, Set<EObject> processed) {
		double network = 0.0;
		if (processed.contains(eObject) == false) {
			for (EAttribute att : eObject.eClass().getEAllAttributes()) {
				if (att.getName().equals("bandwidth")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							network += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							network += (float) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							network += (double) value;
						}
					}
				}
			}
			for (EReference ref : eObject.eClass().getEAllReferences()) {
				if (ref.getName().equals("net")) {
					Object o = ModelManager.getReferencedNoException(ref.getName(), eObject);
					if (o instanceof EObject) {
						EObject containedEObject = (EObject) o;
						if (processed.contains(containedEObject) == false) {
							double result = getNEtworkDynamic(containedEObject, processed);
							if (result != 0) {
								network += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getNEtworkDynamic(containedEObject, processed);
								if (result != 0) {
									network += result;
								}
							}
						}
					}
				}
			}
			processed.add(eObject);
		}
		return network;
	}

	private static double getNEtwork(DataCentre object) {
		double network = 0.0;
		Network objectNetwork = object.getNet();
		double result = getNEtwork(objectNetwork);
		if (result != 0) {
			network += result;
		}
		return network;
	}

	private static double getNEtwork(Network object) {
		double network = 0.0;
		Object valuebandwidth = object.getBandwidth();
		if (valuebandwidth instanceof Integer) {
			if ((int) valuebandwidth != 0) {
				network += (int) valuebandwidth;
			}
		}
		if (valuebandwidth instanceof Float) {
			if ((float) valuebandwidth != 0) {
				network += (float) valuebandwidth;
			}
		}
		if (valuebandwidth instanceof Double) {
			if ((double) valuebandwidth != 0) {
				network += (double) valuebandwidth;
			}
		}
		return network;
	}

	public static double getNEtworkDistance(final DataCentre root, final String initial_model) {
		if (INITIAL_MODEL == null) {
			INITIAL_MODEL = initial_model;
			List<EPackage> packages = ModelManager.loadMetaModelNoException("model/datac.ecore");
			Resource resource = ModelManager.loadModelNoException(packages, initial_model);
			EObject initial_model_root = resource.getContents().get(0);
			Set<EObject> processed = new HashSet<EObject>();
			INITIAL_Network = getNEtworkDynamic(initial_model_root, processed);
		}
		double network = getNEtwork(root);
		return Math.abs(INITIAL_Network - network);
	}
}
