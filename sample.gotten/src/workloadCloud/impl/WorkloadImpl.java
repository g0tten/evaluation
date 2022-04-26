/**
 */
package workloadCloud.impl;

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

import workloadCloud.Trace;
import workloadCloud.Workload;
import workloadCloud.WorkloadCloudPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workloadCloud.impl.WorkloadImpl#getProcessorID <em>Processor ID</em>}</li>
 *   <li>{@link workloadCloud.impl.WorkloadImpl#getName <em>Name</em>}</li>
 *   <li>{@link workloadCloud.impl.WorkloadImpl#getPath <em>Path</em>}</li>
 *   <li>{@link workloadCloud.impl.WorkloadImpl#getNumTraces <em>Num Traces</em>}</li>
 *   <li>{@link workloadCloud.impl.WorkloadImpl#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadImpl extends MinimalEObjectImpl.Container implements Workload {
	/**
	 * The default value of the '{@link #getProcessorID() <em>Processor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorID() <em>Processor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorID()
	 * @generated
	 * @ordered
	 */
	protected String processorID = PROCESSOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumTraces() <em>Num Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTraces()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_TRACES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumTraces() <em>Num Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTraces()
	 * @generated
	 * @ordered
	 */
	protected int numTraces = NUM_TRACES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> traces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadCloudPackage.Literals.WORKLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessorID() {
		return processorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorID(String newProcessorID) {
		String oldProcessorID = processorID;
		processorID = newProcessorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkloadCloudPackage.WORKLOAD__PROCESSOR_ID, oldProcessorID, processorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkloadCloudPackage.WORKLOAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkloadCloudPackage.WORKLOAD__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumTraces() {
		return numTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumTraces(int newNumTraces) {
		int oldNumTraces = numTraces;
		numTraces = newNumTraces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkloadCloudPackage.WORKLOAD__NUM_TRACES, oldNumTraces, numTraces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<Trace>(Trace.class, this, WorkloadCloudPackage.WORKLOAD__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadCloudPackage.WORKLOAD__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
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
			case WorkloadCloudPackage.WORKLOAD__PROCESSOR_ID:
				return getProcessorID();
			case WorkloadCloudPackage.WORKLOAD__NAME:
				return getName();
			case WorkloadCloudPackage.WORKLOAD__PATH:
				return getPath();
			case WorkloadCloudPackage.WORKLOAD__NUM_TRACES:
				return getNumTraces();
			case WorkloadCloudPackage.WORKLOAD__TRACES:
				return getTraces();
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
			case WorkloadCloudPackage.WORKLOAD__PROCESSOR_ID:
				setProcessorID((String)newValue);
				return;
			case WorkloadCloudPackage.WORKLOAD__NAME:
				setName((String)newValue);
				return;
			case WorkloadCloudPackage.WORKLOAD__PATH:
				setPath((String)newValue);
				return;
			case WorkloadCloudPackage.WORKLOAD__NUM_TRACES:
				setNumTraces((Integer)newValue);
				return;
			case WorkloadCloudPackage.WORKLOAD__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Trace>)newValue);
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
			case WorkloadCloudPackage.WORKLOAD__PROCESSOR_ID:
				setProcessorID(PROCESSOR_ID_EDEFAULT);
				return;
			case WorkloadCloudPackage.WORKLOAD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkloadCloudPackage.WORKLOAD__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case WorkloadCloudPackage.WORKLOAD__NUM_TRACES:
				setNumTraces(NUM_TRACES_EDEFAULT);
				return;
			case WorkloadCloudPackage.WORKLOAD__TRACES:
				getTraces().clear();
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
			case WorkloadCloudPackage.WORKLOAD__PROCESSOR_ID:
				return PROCESSOR_ID_EDEFAULT == null ? processorID != null : !PROCESSOR_ID_EDEFAULT.equals(processorID);
			case WorkloadCloudPackage.WORKLOAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkloadCloudPackage.WORKLOAD__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case WorkloadCloudPackage.WORKLOAD__NUM_TRACES:
				return numTraces != NUM_TRACES_EDEFAULT;
			case WorkloadCloudPackage.WORKLOAD__TRACES:
				return traces != null && !traces.isEmpty();
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
		result.append(" (ProcessorID: ");
		result.append(processorID);
		result.append(", Name: ");
		result.append(name);
		result.append(", Path: ");
		result.append(path);
		result.append(", NumTraces: ");
		result.append(numTraces);
		result.append(')');
		return result.toString();
	}

} //WorkloadImpl
