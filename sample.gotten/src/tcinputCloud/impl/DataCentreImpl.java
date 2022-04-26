/**
 */
package tcinputCloud.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tcinputCloud.DataCentre;
import tcinputCloud.Network;
import tcinputCloud.Rack;
import tcinputCloud.TcinputCloudPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Centre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.impl.DataCentreImpl#getNet <em>Net</em>}</li>
 *   <li>{@link tcinputCloud.impl.DataCentreImpl#getRacks <em>Racks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCentreImpl extends MinimalEObjectImpl.Container implements DataCentre {
	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Network net;

	/**
	 * The cached value of the '{@link #getRacks() <em>Racks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Rack> racks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCentreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TcinputCloudPackage.Literals.DATA_CENTRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Network newNet, NotificationChain msgs) {
		Network oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.DATA_CENTRE__NET, oldNet, newNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Network newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TcinputCloudPackage.DATA_CENTRE__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TcinputCloudPackage.DATA_CENTRE__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.DATA_CENTRE__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rack> getRacks() {
		if (racks == null) {
			racks = new EObjectContainmentEList<Rack>(Rack.class, this, TcinputCloudPackage.DATA_CENTRE__RACKS);
		}
		return racks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TcinputCloudPackage.DATA_CENTRE__NET:
				return basicSetNet(null, msgs);
			case TcinputCloudPackage.DATA_CENTRE__RACKS:
				return ((InternalEList<?>)getRacks()).basicRemove(otherEnd, msgs);
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
			case TcinputCloudPackage.DATA_CENTRE__NET:
				return getNet();
			case TcinputCloudPackage.DATA_CENTRE__RACKS:
				return getRacks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TcinputCloudPackage.DATA_CENTRE__NET:
				setNet((Network)newValue);
				return;
			case TcinputCloudPackage.DATA_CENTRE__RACKS:
				getRacks().clear();
				getRacks().addAll((Collection<? extends Rack>)newValue);
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
			case TcinputCloudPackage.DATA_CENTRE__NET:
				setNet((Network)null);
				return;
			case TcinputCloudPackage.DATA_CENTRE__RACKS:
				getRacks().clear();
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
			case TcinputCloudPackage.DATA_CENTRE__NET:
				return net != null;
			case TcinputCloudPackage.DATA_CENTRE__RACKS:
				return racks != null && !racks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataCentreImpl
