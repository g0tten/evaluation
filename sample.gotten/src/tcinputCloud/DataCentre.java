/**
 */
package tcinputCloud;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Centre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.DataCentre#getNet <em>Net</em>}</li>
 *   <li>{@link tcinputCloud.DataCentre#getRacks <em>Racks</em>}</li>
 * </ul>
 *
 * @see tcinputCloud.TcinputCloudPackage#getDataCentre()
 * @model
 * @generated
 */
public interface DataCentre extends EObject {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Network)
	 * @see tcinputCloud.TcinputCloudPackage#getDataCentre_Net()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Network getNet();

	/**
	 * Sets the value of the '{@link tcinputCloud.DataCentre#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Network value);

	/**
	 * Returns the value of the '<em><b>Racks</b></em>' containment reference list.
	 * The list contents are of type {@link tcinputCloud.Rack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Racks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Racks</em>' containment reference list.
	 * @see tcinputCloud.TcinputCloudPackage#getDataCentre_Racks()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Rack> getRacks();

} // DataCentre
