/**
 */
package workloadCloud;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workloadCloud.WorkloadSet#getWorkloads <em>Workloads</em>}</li>
 * </ul>
 *
 * @see workloadCloud.WorkloadCloudPackage#getWorkloadSet()
 * @model
 * @generated
 */
public interface WorkloadSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Workloads</b></em>' containment reference list.
	 * The list contents are of type {@link workloadCloud.Workload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workloads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workloads</em>' containment reference list.
	 * @see workloadCloud.WorkloadCloudPackage#getWorkloadSet_Workloads()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Workload> getWorkloads();

} // WorkloadSet
