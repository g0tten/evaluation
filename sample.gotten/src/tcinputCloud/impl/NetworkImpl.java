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

import tcinputCloud.Network;
import tcinputCloud.Switch;
import tcinputCloud.TcinputCloudPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.impl.NetworkImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link tcinputCloud.impl.NetworkImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link tcinputCloud.impl.NetworkImpl#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
	/**
	 * The default value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BANDWIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected int bandwidth = BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final int LATENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected int latency = LATENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TcinputCloudPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidth(int newBandwidth) {
		int oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.NETWORK__BANDWIDTH, oldBandwidth, bandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(int newLatency) {
		int oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.NETWORK__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new EObjectContainmentEList<Switch>(Switch.class, this, TcinputCloudPackage.NETWORK__SWITCHES);
		}
		return switches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TcinputCloudPackage.NETWORK__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
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
			case TcinputCloudPackage.NETWORK__BANDWIDTH:
				return getBandwidth();
			case TcinputCloudPackage.NETWORK__LATENCY:
				return getLatency();
			case TcinputCloudPackage.NETWORK__SWITCHES:
				return getSwitches();
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
			case TcinputCloudPackage.NETWORK__BANDWIDTH:
				setBandwidth((Integer)newValue);
				return;
			case TcinputCloudPackage.NETWORK__LATENCY:
				setLatency((Integer)newValue);
				return;
			case TcinputCloudPackage.NETWORK__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
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
			case TcinputCloudPackage.NETWORK__BANDWIDTH:
				setBandwidth(BANDWIDTH_EDEFAULT);
				return;
			case TcinputCloudPackage.NETWORK__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case TcinputCloudPackage.NETWORK__SWITCHES:
				getSwitches().clear();
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
			case TcinputCloudPackage.NETWORK__BANDWIDTH:
				return bandwidth != BANDWIDTH_EDEFAULT;
			case TcinputCloudPackage.NETWORK__LATENCY:
				return latency != LATENCY_EDEFAULT;
			case TcinputCloudPackage.NETWORK__SWITCHES:
				return switches != null && !switches.isEmpty();
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
		result.append(" (bandwidth: ");
		result.append(bandwidth);
		result.append(", latency: ");
		result.append(latency);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
