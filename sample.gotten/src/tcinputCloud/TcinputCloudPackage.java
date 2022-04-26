/**
 */
package tcinputCloud;

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
 * @see tcinputCloud.TcinputCloudFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TcinputCloudPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tcinputCloud";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tcinputCloud/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tcinputCloud";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TcinputCloudPackage eINSTANCE = tcinputCloud.impl.TcinputCloudPackageImpl.init();

	/**
	 * The meta object id for the '{@link tcinputCloud.impl.DataCentreImpl <em>Data Centre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tcinputCloud.impl.DataCentreImpl
	 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getDataCentre()
	 * @generated
	 */
	int DATA_CENTRE = 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTRE__NET = 0;

	/**
	 * The feature id for the '<em><b>Racks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTRE__RACKS = 1;

	/**
	 * The number of structural features of the '<em>Data Centre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Centre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tcinputCloud.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tcinputCloud.impl.NetworkImpl
	 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__BANDWIDTH = 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LATENCY = 1;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SWITCHES = 2;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tcinputCloud.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tcinputCloud.impl.RackImpl
	 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getRack()
	 * @generated
	 */
	int RACK = 2;

	/**
	 * The feature id for the '<em><b>Num Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NUM_BOARDS = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__BOARD = 1;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tcinputCloud.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tcinputCloud.impl.BoardImpl
	 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 3;

	/**
	 * The feature id for the '<em><b>Nodes Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NODES_PER_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SWITCH = 1;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NODE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tcinputCloud.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tcinputCloud.impl.SwitchImpl
	 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 4;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tcinputCloud.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tcinputCloud.impl.NodeTypeImpl
	 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>CPU Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__CPU_CORES = 0;

	/**
	 * The feature id for the '<em><b>CPU Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__CPU_SPEED = 1;

	/**
	 * The feature id for the '<em><b>MEM Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__MEM_SPEED = 2;

	/**
	 * The feature id for the '<em><b>Disk Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__DISK_SPEED = 3;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tcinputCloud.DataCentre <em>Data Centre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Centre</em>'.
	 * @see tcinputCloud.DataCentre
	 * @generated
	 */
	EClass getDataCentre();

	/**
	 * Returns the meta object for the containment reference '{@link tcinputCloud.DataCentre#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net</em>'.
	 * @see tcinputCloud.DataCentre#getNet()
	 * @see #getDataCentre()
	 * @generated
	 */
	EReference getDataCentre_Net();

	/**
	 * Returns the meta object for the containment reference list '{@link tcinputCloud.DataCentre#getRacks <em>Racks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Racks</em>'.
	 * @see tcinputCloud.DataCentre#getRacks()
	 * @see #getDataCentre()
	 * @generated
	 */
	EReference getDataCentre_Racks();

	/**
	 * Returns the meta object for class '{@link tcinputCloud.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see tcinputCloud.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link tcinputCloud.Network#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth</em>'.
	 * @see tcinputCloud.Network#getBandwidth()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Bandwidth();

	/**
	 * Returns the meta object for the attribute '{@link tcinputCloud.Network#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see tcinputCloud.Network#getLatency()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Latency();

	/**
	 * Returns the meta object for the containment reference list '{@link tcinputCloud.Network#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switches</em>'.
	 * @see tcinputCloud.Network#getSwitches()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Switches();

	/**
	 * Returns the meta object for class '{@link tcinputCloud.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see tcinputCloud.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the attribute '{@link tcinputCloud.Rack#getNumBoards <em>Num Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Boards</em>'.
	 * @see tcinputCloud.Rack#getNumBoards()
	 * @see #getRack()
	 * @generated
	 */
	EAttribute getRack_NumBoards();

	/**
	 * Returns the meta object for the containment reference '{@link tcinputCloud.Rack#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see tcinputCloud.Rack#getBoard()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Board();

	/**
	 * Returns the meta object for class '{@link tcinputCloud.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see tcinputCloud.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link tcinputCloud.Board#getNodesPerBoard <em>Nodes Per Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodes Per Board</em>'.
	 * @see tcinputCloud.Board#getNodesPerBoard()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_NodesPerBoard();

	/**
	 * Returns the meta object for the containment reference '{@link tcinputCloud.Board#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch</em>'.
	 * @see tcinputCloud.Board#getSwitch()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Switch();

	/**
	 * Returns the meta object for the containment reference '{@link tcinputCloud.Board#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Type</em>'.
	 * @see tcinputCloud.Board#getNodeType()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_NodeType();

	/**
	 * Returns the meta object for class '{@link tcinputCloud.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see tcinputCloud.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for class '{@link tcinputCloud.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see tcinputCloud.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the attribute '{@link tcinputCloud.NodeType#getCPUCores <em>CPU Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU Cores</em>'.
	 * @see tcinputCloud.NodeType#getCPUCores()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_CPUCores();

	/**
	 * Returns the meta object for the attribute '{@link tcinputCloud.NodeType#getCPUSpeed <em>CPU Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU Speed</em>'.
	 * @see tcinputCloud.NodeType#getCPUSpeed()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_CPUSpeed();

	/**
	 * Returns the meta object for the attribute '{@link tcinputCloud.NodeType#getMEMSpeed <em>MEM Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MEM Speed</em>'.
	 * @see tcinputCloud.NodeType#getMEMSpeed()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_MEMSpeed();

	/**
	 * Returns the meta object for the attribute '{@link tcinputCloud.NodeType#getDiskSpeed <em>Disk Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Speed</em>'.
	 * @see tcinputCloud.NodeType#getDiskSpeed()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_DiskSpeed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TcinputCloudFactory getTcinputCloudFactory();

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
		 * The meta object literal for the '{@link tcinputCloud.impl.DataCentreImpl <em>Data Centre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tcinputCloud.impl.DataCentreImpl
		 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getDataCentre()
		 * @generated
		 */
		EClass DATA_CENTRE = eINSTANCE.getDataCentre();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTRE__NET = eINSTANCE.getDataCentre_Net();

		/**
		 * The meta object literal for the '<em><b>Racks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTRE__RACKS = eINSTANCE.getDataCentre_Racks();

		/**
		 * The meta object literal for the '{@link tcinputCloud.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tcinputCloud.impl.NetworkImpl
		 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__BANDWIDTH = eINSTANCE.getNetwork_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__LATENCY = eINSTANCE.getNetwork_Latency();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__SWITCHES = eINSTANCE.getNetwork_Switches();

		/**
		 * The meta object literal for the '{@link tcinputCloud.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tcinputCloud.impl.RackImpl
		 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getRack()
		 * @generated
		 */
		EClass RACK = eINSTANCE.getRack();

		/**
		 * The meta object literal for the '<em><b>Num Boards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK__NUM_BOARDS = eINSTANCE.getRack_NumBoards();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__BOARD = eINSTANCE.getRack_Board();

		/**
		 * The meta object literal for the '{@link tcinputCloud.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tcinputCloud.impl.BoardImpl
		 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Nodes Per Board</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NODES_PER_BOARD = eINSTANCE.getBoard_NodesPerBoard();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SWITCH = eINSTANCE.getBoard_Switch();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__NODE_TYPE = eINSTANCE.getBoard_NodeType();

		/**
		 * The meta object literal for the '{@link tcinputCloud.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tcinputCloud.impl.SwitchImpl
		 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '{@link tcinputCloud.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tcinputCloud.impl.NodeTypeImpl
		 * @see tcinputCloud.impl.TcinputCloudPackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '<em><b>CPU Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__CPU_CORES = eINSTANCE.getNodeType_CPUCores();

		/**
		 * The meta object literal for the '<em><b>CPU Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__CPU_SPEED = eINSTANCE.getNodeType_CPUSpeed();

		/**
		 * The meta object literal for the '<em><b>MEM Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__MEM_SPEED = eINSTANCE.getNodeType_MEMSpeed();

		/**
		 * The meta object literal for the '<em><b>Disk Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__DISK_SPEED = eINSTANCE.getNodeType_DiskSpeed();

	}

} //TcinputCloudPackage
