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
import tcinputCloud.NodeType;
import tcinputCloud.Switch;
import tcinputCloud.TcinputCloudPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.impl.BoardImpl#getNodesPerBoard <em>Nodes Per Board</em>}</li>
 *   <li>{@link tcinputCloud.impl.BoardImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link tcinputCloud.impl.BoardImpl#getNodeType <em>Node Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The default value of the '{@link #getNodesPerBoard() <em>Nodes Per Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesPerBoard()
	 * @generated
	 * @ordered
	 */
	protected static final int NODES_PER_BOARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodesPerBoard() <em>Nodes Per Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesPerBoard()
	 * @generated
	 * @ordered
	 */
	protected int nodesPerBoard = NODES_PER_BOARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected Switch switch_;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeType nodeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TcinputCloudPackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodesPerBoard() {
		return nodesPerBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesPerBoard(int newNodesPerBoard) {
		int oldNodesPerBoard = nodesPerBoard;
		nodesPerBoard = newNodesPerBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.BOARD__NODES_PER_BOARD, oldNodesPerBoard, nodesPerBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch getSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitch(Switch newSwitch, NotificationChain msgs) {
		Switch oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.BOARD__SWITCH, oldSwitch, newSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitch(Switch newSwitch) {
		if (newSwitch != switch_) {
			NotificationChain msgs = null;
			if (switch_ != null)
				msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TcinputCloudPackage.BOARD__SWITCH, null, msgs);
			if (newSwitch != null)
				msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TcinputCloudPackage.BOARD__SWITCH, null, msgs);
			msgs = basicSetSwitch(newSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.BOARD__SWITCH, newSwitch, newSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeType(NodeType newNodeType, NotificationChain msgs) {
		NodeType oldNodeType = nodeType;
		nodeType = newNodeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.BOARD__NODE_TYPE, oldNodeType, newNodeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(NodeType newNodeType) {
		if (newNodeType != nodeType) {
			NotificationChain msgs = null;
			if (nodeType != null)
				msgs = ((InternalEObject)nodeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TcinputCloudPackage.BOARD__NODE_TYPE, null, msgs);
			if (newNodeType != null)
				msgs = ((InternalEObject)newNodeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TcinputCloudPackage.BOARD__NODE_TYPE, null, msgs);
			msgs = basicSetNodeType(newNodeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.BOARD__NODE_TYPE, newNodeType, newNodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TcinputCloudPackage.BOARD__SWITCH:
				return basicSetSwitch(null, msgs);
			case TcinputCloudPackage.BOARD__NODE_TYPE:
				return basicSetNodeType(null, msgs);
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
			case TcinputCloudPackage.BOARD__NODES_PER_BOARD:
				return getNodesPerBoard();
			case TcinputCloudPackage.BOARD__SWITCH:
				return getSwitch();
			case TcinputCloudPackage.BOARD__NODE_TYPE:
				return getNodeType();
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
			case TcinputCloudPackage.BOARD__NODES_PER_BOARD:
				setNodesPerBoard((Integer)newValue);
				return;
			case TcinputCloudPackage.BOARD__SWITCH:
				setSwitch((Switch)newValue);
				return;
			case TcinputCloudPackage.BOARD__NODE_TYPE:
				setNodeType((NodeType)newValue);
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
			case TcinputCloudPackage.BOARD__NODES_PER_BOARD:
				setNodesPerBoard(NODES_PER_BOARD_EDEFAULT);
				return;
			case TcinputCloudPackage.BOARD__SWITCH:
				setSwitch((Switch)null);
				return;
			case TcinputCloudPackage.BOARD__NODE_TYPE:
				setNodeType((NodeType)null);
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
			case TcinputCloudPackage.BOARD__NODES_PER_BOARD:
				return nodesPerBoard != NODES_PER_BOARD_EDEFAULT;
			case TcinputCloudPackage.BOARD__SWITCH:
				return switch_ != null;
			case TcinputCloudPackage.BOARD__NODE_TYPE:
				return nodeType != null;
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
		result.append(" (nodesPerBoard: ");
		result.append(nodesPerBoard);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
