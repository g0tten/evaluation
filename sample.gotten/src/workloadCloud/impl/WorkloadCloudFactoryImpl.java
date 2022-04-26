/**
 */
package workloadCloud.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workloadCloud.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadCloudFactoryImpl extends EFactoryImpl implements WorkloadCloudFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkloadCloudFactory init() {
		try {
			WorkloadCloudFactory theWorkloadCloudFactory = (WorkloadCloudFactory)EPackage.Registry.INSTANCE.getEFactory(WorkloadCloudPackage.eNS_URI);
			if (theWorkloadCloudFactory != null) {
				return theWorkloadCloudFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkloadCloudFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadCloudFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkloadCloudPackage.WORKLOAD_SET: return createWorkloadSet();
			case WorkloadCloudPackage.WORKLOAD: return createWorkload();
			case WorkloadCloudPackage.TRACE: return createTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadSet createWorkloadSet() {
		WorkloadSetImpl workloadSet = new WorkloadSetImpl();
		return workloadSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload createWorkload() {
		WorkloadImpl workload = new WorkloadImpl();
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadCloudPackage getWorkloadCloudPackage() {
		return (WorkloadCloudPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkloadCloudPackage getPackage() {
		return WorkloadCloudPackage.eINSTANCE;
	}

} //WorkloadCloudFactoryImpl
