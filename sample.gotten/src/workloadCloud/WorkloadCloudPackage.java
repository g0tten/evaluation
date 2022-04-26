/**
 */
package workloadCloud;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workloadCloud.WorkloadCloudFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface WorkloadCloudPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workloadCloud";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://workloadCloud/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workloadCloud";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkloadCloudPackage eINSTANCE = workloadCloud.impl.WorkloadCloudPackageImpl.init();

	/**
	 * The meta object id for the '{@link workloadCloud.impl.WorkloadSetImpl <em>Workload Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workloadCloud.impl.WorkloadSetImpl
	 * @see workloadCloud.impl.WorkloadCloudPackageImpl#getWorkloadSet()
	 * @generated
	 */
	int WORKLOAD_SET = 0;

	/**
	 * The feature id for the '<em><b>Workloads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_SET__WORKLOADS = 0;

	/**
	 * The number of structural features of the '<em>Workload Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workload Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workloadCloud.impl.WorkloadImpl <em>Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workloadCloud.impl.WorkloadImpl
	 * @see workloadCloud.impl.WorkloadCloudPackageImpl#getWorkload()
	 * @generated
	 */
	int WORKLOAD = 1;

	/**
	 * The feature id for the '<em><b>Processor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__PROCESSOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__PATH = 2;

	/**
	 * The feature id for the '<em><b>Num Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__NUM_TRACES = 3;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__TRACES = 4;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workloadCloud.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workloadCloud.impl.TraceImpl
	 * @see workloadCloud.impl.WorkloadCloudPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link workloadCloud.WorkloadSet <em>Workload Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Set</em>'.
	 * @see workloadCloud.WorkloadSet
	 * @generated
	 */
	EClass getWorkloadSet();

	/**
	 * Returns the meta object for the containment reference list '{@link workloadCloud.WorkloadSet#getWorkloads <em>Workloads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workloads</em>'.
	 * @see workloadCloud.WorkloadSet#getWorkloads()
	 * @see #getWorkloadSet()
	 * @generated
	 */
	EReference getWorkloadSet_Workloads();

	/**
	 * Returns the meta object for class '{@link workloadCloud.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload</em>'.
	 * @see workloadCloud.Workload
	 * @generated
	 */
	EClass getWorkload();

	/**
	 * Returns the meta object for the attribute '{@link workloadCloud.Workload#getProcessorID <em>Processor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor ID</em>'.
	 * @see workloadCloud.Workload#getProcessorID()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_ProcessorID();

	/**
	 * Returns the meta object for the attribute '{@link workloadCloud.Workload#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workloadCloud.Workload#getName()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Name();

	/**
	 * Returns the meta object for the attribute '{@link workloadCloud.Workload#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see workloadCloud.Workload#getPath()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Path();

	/**
	 * Returns the meta object for the attribute '{@link workloadCloud.Workload#getNumTraces <em>Num Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Traces</em>'.
	 * @see workloadCloud.Workload#getNumTraces()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_NumTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link workloadCloud.Workload#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see workloadCloud.Workload#getTraces()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_Traces();

	/**
	 * Returns the meta object for class '{@link workloadCloud.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see workloadCloud.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link workloadCloud.Trace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workloadCloud.Trace#getName()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkloadCloudFactory getWorkloadCloudFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link workloadCloud.impl.WorkloadSetImpl <em>Workload Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workloadCloud.impl.WorkloadSetImpl
		 * @see workloadCloud.impl.WorkloadCloudPackageImpl#getWorkloadSet()
		 * @generated
		 */
		EClass WORKLOAD_SET = eINSTANCE.getWorkloadSet();

		/**
		 * The meta object literal for the '<em><b>Workloads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_SET__WORKLOADS = eINSTANCE.getWorkloadSet_Workloads();

		/**
		 * The meta object literal for the '{@link workloadCloud.impl.WorkloadImpl <em>Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workloadCloud.impl.WorkloadImpl
		 * @see workloadCloud.impl.WorkloadCloudPackageImpl#getWorkload()
		 * @generated
		 */
		EClass WORKLOAD = eINSTANCE.getWorkload();

		/**
		 * The meta object literal for the '<em><b>Processor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__PROCESSOR_ID = eINSTANCE.getWorkload_ProcessorID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__NAME = eINSTANCE.getWorkload_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__PATH = eINSTANCE.getWorkload_Path();

		/**
		 * The meta object literal for the '<em><b>Num Traces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__NUM_TRACES = eINSTANCE.getWorkload_NumTraces();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__TRACES = eINSTANCE.getWorkload_Traces();

		/**
		 * The meta object literal for the '{@link workloadCloud.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workloadCloud.impl.TraceImpl
		 * @see workloadCloud.impl.WorkloadCloudPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__NAME = eINSTANCE.getTrace_Name();

	}

} //WorkloadCloudPackage
