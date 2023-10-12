/**
 */
package digital_twin;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Twin Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital_twin.DigitalTwinPackageInterface#getInterfaceOf <em>Interface Of</em>}</li>
 * </ul>
 *
 * @see digital_twin.Digital_twin_Package#getDigitalTwinPackageInterface()
 * @model
 * @generated
 */
public interface DigitalTwinPackageInterface extends DigitalTwinPackage {
	/**
	 * Returns the value of the '<em><b>Interface Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Of</em>' reference.
	 * @see #setInterfaceOf(DigitalTwinPackage)
	 * @see digital_twin.Digital_twin_Package#getDigitalTwinPackageInterface_InterfaceOf()
	 * @model
	 * @generated
	 */
	DigitalTwinPackage getInterfaceOf();

	/**
	 * Sets the value of the '{@link digital_twin.DigitalTwinPackageInterface#getInterfaceOf <em>Interface Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Of</em>' reference.
	 * @see #getInterfaceOf()
	 * @generated
	 */
	void setInterfaceOf(DigitalTwinPackage value);

} // DigitalTwinPackageInterface
