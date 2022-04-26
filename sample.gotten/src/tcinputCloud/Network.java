/**
 */
package tcinputCloud;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.Network#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link tcinputCloud.Network#getLatency <em>Latency</em>}</li>
 *   <li>{@link tcinputCloud.Network#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @see tcinputCloud.TcinputCloudPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(int)
	 * @see tcinputCloud.TcinputCloudPackage#getNetwork_Bandwidth()
	 * @model required="true"
	 * @generated
	 */
	int getBandwidth();

	/**
	 * Sets the value of the '{@link tcinputCloud.Network#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(int value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(int)
	 * @see tcinputCloud.TcinputCloudPackage#getNetwork_Latency()
	 * @model required="true"
	 * @generated
	 */
	int getLatency();

	/**
	 * Sets the value of the '{@link tcinputCloud.Network#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(int value);

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' containment reference list.
	 * The list contents are of type {@link tcinputCloud.Switch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' containment reference list.
	 * @see tcinputCloud.TcinputCloudPackage#getNetwork_Switches()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Switch> getSwitches();

} // Network
