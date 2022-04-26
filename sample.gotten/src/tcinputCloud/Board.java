/**
 */
package tcinputCloud;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.Board#getNodesPerBoard <em>Nodes Per Board</em>}</li>
 *   <li>{@link tcinputCloud.Board#getSwitch <em>Switch</em>}</li>
 *   <li>{@link tcinputCloud.Board#getNodeType <em>Node Type</em>}</li>
 * </ul>
 *
 * @see tcinputCloud.TcinputCloudPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes Per Board</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes Per Board</em>' attribute.
	 * @see #setNodesPerBoard(int)
	 * @see tcinputCloud.TcinputCloudPackage#getBoard_NodesPerBoard()
	 * @model required="true"
	 * @generated
	 */
	int getNodesPerBoard();

	/**
	 * Sets the value of the '{@link tcinputCloud.Board#getNodesPerBoard <em>Nodes Per Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes Per Board</em>' attribute.
	 * @see #getNodesPerBoard()
	 * @generated
	 */
	void setNodesPerBoard(int value);

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' containment reference.
	 * @see #setSwitch(Switch)
	 * @see tcinputCloud.TcinputCloudPackage#getBoard_Switch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Switch getSwitch();

	/**
	 * Sets the value of the '{@link tcinputCloud.Board#getSwitch <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' containment reference.
	 * @see #getSwitch()
	 * @generated
	 */
	void setSwitch(Switch value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' containment reference.
	 * @see #setNodeType(NodeType)
	 * @see tcinputCloud.TcinputCloudPackage#getBoard_NodeType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeType getNodeType();

	/**
	 * Sets the value of the '{@link tcinputCloud.Board#getNodeType <em>Node Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' containment reference.
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(NodeType value);

} // Board
