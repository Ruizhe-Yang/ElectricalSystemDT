/**
 */
package digital_twin.impl;

import digital_twin.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Digital_twin_FactoryImpl extends EFactoryImpl implements Digital_twin_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Digital_twin_Factory init() {
		try {
			Digital_twin_Factory theDigital_twin_Factory = (Digital_twin_Factory)EPackage.Registry.INSTANCE.getEFactory(Digital_twin_Package.eNS_URI);
			if (theDigital_twin_Factory != null) {
				return theDigital_twin_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Digital_twin_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Digital_twin_FactoryImpl() {
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
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE: return createDigitalTwinPackage();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE_INTERFACE: return createDigitalTwinPackageInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalTwinPackage createDigitalTwinPackage() {
		DigitalTwinPackageImpl digitalTwinPackage = new DigitalTwinPackageImpl();
		return digitalTwinPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalTwinPackageInterface createDigitalTwinPackageInterface() {
		DigitalTwinPackageInterfaceImpl digitalTwinPackageInterface = new DigitalTwinPackageInterfaceImpl();
		return digitalTwinPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Digital_twin_Package getDigital_twin_Package() {
		return (Digital_twin_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Digital_twin_Package getPackage() {
		return Digital_twin_Package.eINSTANCE;
	}

} //Digital_twin_FactoryImpl
