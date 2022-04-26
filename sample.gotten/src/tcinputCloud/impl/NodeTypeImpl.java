/**
 */
package tcinputCloud.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tcinputCloud.NodeType;
import tcinputCloud.TcinputCloudPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tcinputCloud.impl.NodeTypeImpl#getCPUCores <em>CPU Cores</em>}</li>
 *   <li>{@link tcinputCloud.impl.NodeTypeImpl#getCPUSpeed <em>CPU Speed</em>}</li>
 *   <li>{@link tcinputCloud.impl.NodeTypeImpl#getMEMSpeed <em>MEM Speed</em>}</li>
 *   <li>{@link tcinputCloud.impl.NodeTypeImpl#getDiskSpeed <em>Disk Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeImpl extends MinimalEObjectImpl.Container implements NodeType {
	/**
	 * The default value of the '{@link #getCPUCores() <em>CPU Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUCores()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCPUCores() <em>CPU Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUCores()
	 * @generated
	 * @ordered
	 */
	protected int cpuCores = CPU_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPUSpeed() <em>CPU Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCPUSpeed() <em>CPU Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUSpeed()
	 * @generated
	 * @ordered
	 */
	protected int cpuSpeed = CPU_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMEMSpeed() <em>MEM Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEMSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int MEM_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMEMSpeed() <em>MEM Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEMSpeed()
	 * @generated
	 * @ordered
	 */
	protected int memSpeed = MEM_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSpeed() <em>Disk Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiskSpeed() <em>Disk Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSpeed()
	 * @generated
	 * @ordered
	 */
	protected int diskSpeed = DISK_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TcinputCloudPackage.Literals.NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCPUCores() {
		return cpuCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPUCores(int newCPUCores) {
		int oldCPUCores = cpuCores;
		cpuCores = newCPUCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.NODE_TYPE__CPU_CORES, oldCPUCores, cpuCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCPUSpeed() {
		return cpuSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPUSpeed(int newCPUSpeed) {
		int oldCPUSpeed = cpuSpeed;
		cpuSpeed = newCPUSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.NODE_TYPE__CPU_SPEED, oldCPUSpeed, cpuSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMEMSpeed() {
		return memSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMEMSpeed(int newMEMSpeed) {
		int oldMEMSpeed = memSpeed;
		memSpeed = newMEMSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.NODE_TYPE__MEM_SPEED, oldMEMSpeed, memSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiskSpeed() {
		return diskSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskSpeed(int newDiskSpeed) {
		int oldDiskSpeed = diskSpeed;
		diskSpeed = newDiskSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TcinputCloudPackage.NODE_TYPE__DISK_SPEED, oldDiskSpeed, diskSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TcinputCloudPackage.NODE_TYPE__CPU_CORES:
				return getCPUCores();
			case TcinputCloudPackage.NODE_TYPE__CPU_SPEED:
				return getCPUSpeed();
			case TcinputCloudPackage.NODE_TYPE__MEM_SPEED:
				return getMEMSpeed();
			case TcinputCloudPackage.NODE_TYPE__DISK_SPEED:
				return getDiskSpeed();
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
			case TcinputCloudPackage.NODE_TYPE__CPU_CORES:
				setCPUCores((Integer)newValue);
				return;
			case TcinputCloudPackage.NODE_TYPE__CPU_SPEED:
				setCPUSpeed((Integer)newValue);
				return;
			case TcinputCloudPackage.NODE_TYPE__MEM_SPEED:
				setMEMSpeed((Integer)newValue);
				return;
			case TcinputCloudPackage.NODE_TYPE__DISK_SPEED:
				setDiskSpeed((Integer)newValue);
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
			case TcinputCloudPackage.NODE_TYPE__CPU_CORES:
				setCPUCores(CPU_CORES_EDEFAULT);
				return;
			case TcinputCloudPackage.NODE_TYPE__CPU_SPEED:
				setCPUSpeed(CPU_SPEED_EDEFAULT);
				return;
			case TcinputCloudPackage.NODE_TYPE__MEM_SPEED:
				setMEMSpeed(MEM_SPEED_EDEFAULT);
				return;
			case TcinputCloudPackage.NODE_TYPE__DISK_SPEED:
				setDiskSpeed(DISK_SPEED_EDEFAULT);
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
			case TcinputCloudPackage.NODE_TYPE__CPU_CORES:
				return cpuCores != CPU_CORES_EDEFAULT;
			case TcinputCloudPackage.NODE_TYPE__CPU_SPEED:
				return cpuSpeed != CPU_SPEED_EDEFAULT;
			case TcinputCloudPackage.NODE_TYPE__MEM_SPEED:
				return memSpeed != MEM_SPEED_EDEFAULT;
			case TcinputCloudPackage.NODE_TYPE__DISK_SPEED:
				return diskSpeed != DISK_SPEED_EDEFAULT;
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
		result.append(" (CPUCores: ");
		result.append(cpuCores);
		result.append(", CPUSpeed: ");
		result.append(cpuSpeed);
		result.append(", MEMSpeed: ");
		result.append(memSpeed);
		result.append(", DiskSpeed: ");
		result.append(diskSpeed);
		result.append(')');
		return result.toString();
	}

} //NodeTypeImpl
