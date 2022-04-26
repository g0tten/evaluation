/**
 */
package tcinputCloud;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.NodeType#getCPUCores <em>CPU Cores</em>}</li>
 *   <li>{@link tcinputCloud.NodeType#getCPUSpeed <em>CPU Speed</em>}</li>
 *   <li>{@link tcinputCloud.NodeType#getMEMSpeed <em>MEM Speed</em>}</li>
 *   <li>{@link tcinputCloud.NodeType#getDiskSpeed <em>Disk Speed</em>}</li>
 * </ul>
 *
 * @see tcinputCloud.TcinputCloudPackage#getNodeType()
 * @model
 * @generated
 */
public interface NodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>CPU Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPU Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPU Cores</em>' attribute.
	 * @see #setCPUCores(int)
	 * @see tcinputCloud.TcinputCloudPackage#getNodeType_CPUCores()
	 * @model required="true"
	 * @generated
	 */
	int getCPUCores();

	/**
	 * Sets the value of the '{@link tcinputCloud.NodeType#getCPUCores <em>CPU Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU Cores</em>' attribute.
	 * @see #getCPUCores()
	 * @generated
	 */
	void setCPUCores(int value);

	/**
	 * Returns the value of the '<em><b>CPU Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPU Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPU Speed</em>' attribute.
	 * @see #setCPUSpeed(int)
	 * @see tcinputCloud.TcinputCloudPackage#getNodeType_CPUSpeed()
	 * @model required="true"
	 * @generated
	 */
	int getCPUSpeed();

	/**
	 * Sets the value of the '{@link tcinputCloud.NodeType#getCPUSpeed <em>CPU Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU Speed</em>' attribute.
	 * @see #getCPUSpeed()
	 * @generated
	 */
	void setCPUSpeed(int value);

	/**
	 * Returns the value of the '<em><b>MEM Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEM Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEM Speed</em>' attribute.
	 * @see #setMEMSpeed(int)
	 * @see tcinputCloud.TcinputCloudPackage#getNodeType_MEMSpeed()
	 * @model required="true"
	 * @generated
	 */
	int getMEMSpeed();

	/**
	 * Sets the value of the '{@link tcinputCloud.NodeType#getMEMSpeed <em>MEM Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEM Speed</em>' attribute.
	 * @see #getMEMSpeed()
	 * @generated
	 */
	void setMEMSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Disk Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Speed</em>' attribute.
	 * @see #setDiskSpeed(int)
	 * @see tcinputCloud.TcinputCloudPackage#getNodeType_DiskSpeed()
	 * @model required="true"
	 * @generated
	 */
	int getDiskSpeed();

	/**
	 * Sets the value of the '{@link tcinputCloud.NodeType#getDiskSpeed <em>Disk Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Speed</em>' attribute.
	 * @see #getDiskSpeed()
	 * @generated
	 */
	void setDiskSpeed(int value);

} // NodeType
