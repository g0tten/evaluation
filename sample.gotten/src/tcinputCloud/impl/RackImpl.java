/**
 */
package tcinputCloud.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tcinputCloud.Board;
import tcinputCloud.Rack;
import tcinputCloud.TcinputCloudPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.impl.RackImpl#getNumBoards <em>Num Boards</em>}</li>
 *   <li>{@link tcinputCloud.impl.RackImpl#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RackImpl extends MinimalEObjectImpl.Container implements Rack {
	/**
	 * The default value of the '{@link #getNumBoards() <em>Num Boards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBoards()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_BOARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumBoards() <em>Num Boards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBoards()
	 * @generated
	 * @ordered
	 */
	protected int numBoards = NUM_BOARDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TcinputCloudPackage.Literals.RACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumBoards() {
		return numBoards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumBoards(int newNumBoards) {
		int oldNumBoards = numBoards;
		numBoards = newNumBoards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.RACK__NUM_BOARDS, oldNumBoards, numBoards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.RACK__BOARD, oldBoard, newBoard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject)board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TcinputCloudPackage.RACK__BOARD, null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject)newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TcinputCloudPackage.RACK__BOARD, null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.RACK__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TcinputCloudPackage.RACK__BOARD:
				return basicSetBoard(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TcinputCloudPackage.RACK__NUM_BOARDS:
				return getNumBoards();
			case TcinputCloudPackage.RACK__BOARD:
				return getBoard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TcinputCloudPackage.RACK__NUM_BOARDS:
				setNumBoards((Integer)newValue);
				return;
			case TcinputCloudPackage.RACK__BOARD:
				setBoard((Board)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TcinputCloudPackage.RACK__NUM_BOARDS:
				setNumBoards(NUM_BOARDS_EDEFAULT);
				return;
			case TcinputCloudPackage.RACK__BOARD:
				setBoard((Board)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TcinputCloudPackage.RACK__NUM_BOARDS:
				return numBoards != NUM_BOARDS_EDEFAULT;
			case TcinputCloudPackage.RACK__BOARD:
				return board != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numBoards: ");
		result.append(numBoards);
		result.append(')');
		return result.toString();
	}

} //RackImpl
