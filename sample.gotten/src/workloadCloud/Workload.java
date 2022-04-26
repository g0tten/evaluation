/**
 */
package workloadCloud;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workloadCloud.Workload#getProcessorID <em>Processor ID</em>}</li>
 *   <li>{@link workloadCloud.Workload#getName <em>Name</em>}</li>
 *   <li>{@link workloadCloud.Workload#getPath <em>Path</em>}</li>
 *   <li>{@link workloadCloud.Workload#getNumTraces <em>Num Traces</em>}</li>
 *   <li>{@link workloadCloud.Workload#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see workloadCloud.WorkloadCloudPackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends EObject {
	/**
	 * Returns the value of the '<em><b>Processor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor ID</em>' attribute.
	 * @see #setProcessorID(String)
	 * @see workloadCloud.WorkloadCloudPackage#getWorkload_ProcessorID()
	 * @model
	 * @generated
	 */
	String getProcessorID();

	/**
	 * Sets the value of the '{@link workloadCloud.Workload#getProcessorID <em>Processor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor ID</em>' attribute.
	 * @see #getProcessorID()
	 * @generated
	 */
	void setProcessorID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workloadCloud.WorkloadCloudPackage#getWorkload_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workloadCloud.Workload#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see workloadCloud.WorkloadCloudPackage#getWorkload_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link workloadCloud.Workload#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Num Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Traces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Traces</em>' attribute.
	 * @see #setNumTraces(int)
	 * @see workloadCloud.WorkloadCloudPackage#getWorkload_NumTraces()
	 * @model
	 * @generated
	 */
	int getNumTraces();

	/**
	 * Sets the value of the '{@link workloadCloud.Workload#getNumTraces <em>Num Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Traces</em>' attribute.
	 * @see #getNumTraces()
	 * @generated
	 */
	void setNumTraces(int value);

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link workloadCloud.Trace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see workloadCloud.WorkloadCloudPackage#getWorkload_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trace> getTraces();

} // Workload
