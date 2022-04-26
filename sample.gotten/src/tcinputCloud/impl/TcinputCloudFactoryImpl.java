/**
 */
package tcinputCloud.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tcinputCloud.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TcinputCloudFactoryImpl extends EFactoryImpl implements TcinputCloudFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TcinputCloudFactory init() {
		try {
			TcinputCloudFactory theTcinputCloudFactory = (TcinputCloudFactory)EPackage.Registry.INSTANCE.getEFactory(TcinputCloudPackage.eNS_URI);
			if (theTcinputCloudFactory != null) {
				return theTcinputCloudFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TcinputCloudFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcinputCloudFactoryImpl() {
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
			case TcinputCloudPackage.DATA_CENTRE: return createDataCentre();
			case TcinputCloudPackage.NETWORK: return createNetwork();
			case TcinputCloudPackage.RACK: return createRack();
			case TcinputCloudPackage.BOARD: return createBoard();
			case TcinputCloudPackage.SWITCH: return createSwitch();
			case TcinputCloudPackage.NODE_TYPE: return createNodeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCentre createDataCentre() {
		DataCentreImpl dataCentre = new DataCentreImpl();
		return dataCentre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack createRack() {
		RackImpl rack = new RackImpl();
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcinputCloudPackage getTcinputCloudPackage() {
		return (TcinputCloudPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TcinputCloudPackage getPackage() {
		return TcinputCloudPackage.eINSTANCE;
	}

} //TcinputCloudFactoryImpl
