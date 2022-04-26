package gotten.momot;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import workloadCloud.WorkloadSet;
import workloadCloud.Workload;
import workloadCloud.Trace;
import gotten.utils.ModelManager;
import java.lang.Math;

public class FitnessFunctionForWorkload_mr6 {
	private static String INITIAL_MODEL = null;
	private static double INITIAL_Workload = 0.0;

	private static double getWOrkloadDynamic(EObject eObject, Set<EObject> processed) {
		double workload = 0.0;
		if (processed.contains(eObject) == false) {
			workload += 1.0;
			for (EReference ref : eObject.eClass().getEAllReferences()) {
				if (ref.getName().equals("workloads")) {
					Object o = ModelManager.getReferencedNoException(ref.getName(), eObject);
					if (o instanceof EObject) {
						EObject containedEObject = (EObject) o;
						if (processed.contains(containedEObject) == false) {
							double result = getWOrkloadDynamic(containedEObject, processed);
							if (result != 0) {
								workload += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getWOrkloadDynamic(containedEObject, processed);
								if (result != 0) {
									workload += result;
								}
							}
						}
					}
				}
				if (ref.getName().equals("Traces")) {
					Object o = ModelManager.getReferencedNoException(ref.getName(), eObject);
					if (o instanceof EObject) {
						EObject containedEObject = (EObject) o;
						if (processed.contains(containedEObject) == false) {
							double result = getWOrkloadDynamic(containedEObject, processed);
							if (result != 0) {
								workload += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getWOrkloadDynamic(containedEObject, processed);
								if (result != 0) {
									workload += result;
								}
							}
						}
					}
				}
			}
			processed.add(eObject);
		}
		return workload;
	}

	private static double getWOrkload(WorkloadSet object) {
		double workload = 0.0;
		workload += 1.0;
		List<Workload> objectsWorkload = object.getWorkloads();
		for (Workload objectWorkload : objectsWorkload) {
			double result = getWOrkload(objectWorkload);
			if (result != 0) {
				workload += result;
			}
		}
		return workload;
	}

	private static double getWOrkload(Workload object) {
		double workload = 0.0;
		workload += 1.0;
		List<Trace> objectsTrace = object.getTraces();
		for (Trace objectTrace : objectsTrace) {
			double result = getWOrkload(objectTrace);
			if (result != 0) {
				workload += result;
			}
		}
		return workload;
	}

	private static double getWOrkload(Trace object) {
		double workload = 0.0;
		workload += 1.0;
		return workload;
	}

	public static double getWOrkloadDistance(final WorkloadSet root, final String initial_model) {
		if (INITIAL_MODEL == null) {
			INITIAL_MODEL = initial_model;
			List<EPackage> packages = ModelManager.loadMetaModelNoException("model/workload.ecore");
			Resource resource = ModelManager.loadModelNoException(packages, initial_model);
			EObject initial_model_root = resource.getContents().get(0);
			Set<EObject> processed = new HashSet<EObject>();
			INITIAL_Workload = getWOrkloadDynamic(initial_model_root, processed);
		}
		double workload = getWOrkload(root);
		return Math.abs(INITIAL_Workload - workload);
	}
}
