/**
 */
package tcinputCloud;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.Rack#getNumBoards <em>Num Boards</em>}</li>
 *   <li>{@link tcinputCloud.Rack#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @see tcinputCloud.TcinputCloudPackage#getRack()
 * @model
 * @generated
 */
public interface Rack extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Boards</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Boards</em>' attribute.
	 * @see #setNumBoards(int)
	 * @see tcinputCloud.TcinputCloudPackage#getRack_NumBoards()
	 * @model required="true"
	 * @generated
	 */
	int getNumBoards();

	/**
	 * Sets the value of the '{@link tcinputCloud.Rack#getNumBoards <em>Num Boards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Boards</em>' attribute.
	 * @see #getNumBoards()
	 * @generated
	 */
	void setNumBoards(int value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see tcinputCloud.TcinputCloudPackage#getRack_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link tcinputCloud.Rack#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

} // Rack
