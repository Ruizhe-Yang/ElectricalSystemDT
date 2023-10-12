/**
 */
package digital_twin;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see digital_twin.Digital_twin_Package
 * @generated
 */
public interface Digital_twin_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Digital_twin_Factory eINSTANCE = digital_twin.impl.Digital_twin_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Digital Twin Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Twin Package</em>'.
	 * @generated
	 */
	DigitalTwinPackage createDigitalTwinPackage();

	/**
	 * Returns a new object of class '<em>Digital Twin Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Twin Package Interface</em>'.
	 * @generated
	 */
	DigitalTwinPackageInterface createDigitalTwinPackageInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Digital_twin_Package getDigital_twin_Package();

} //Digital_twin_Factory
