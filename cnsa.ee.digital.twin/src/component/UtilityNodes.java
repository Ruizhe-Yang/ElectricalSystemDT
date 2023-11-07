/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utility Nodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.UtilityNodes#getReading <em>Reading</em>}</li>
 *   <li>{@link component.UtilityNodes#getSimulated_reading <em>Simulated reading</em>}</li>
 *   <li>{@link component.UtilityNodes#getActual_reading <em>Actual reading</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getUtilityNodes()
 * @model abstract="true"
 * @generated
 */
public interface UtilityNodes extends ComponentAsset {
	/**
	 * Returns the value of the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' containment reference.
	 * @see #setReading(Reading)
	 * @see component.Component_Package#getUtilityNodes_Reading()
	 * @model containment="true"
	 * @generated
	 */
	Reading getReading();

	/**
	 * Sets the value of the '{@link component.UtilityNodes#getReading <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' containment reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(Reading value);

	/**
	 * Returns the value of the '<em><b>Simulated reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulated reading</em>' containment reference.
	 * @see #setSimulated_reading(Reading)
	 * @see component.Component_Package#getUtilityNodes_Simulated_reading()
	 * @model containment="true"
	 * @generated
	 */
	Reading getSimulated_reading();

	/**
	 * Sets the value of the '{@link component.UtilityNodes#getSimulated_reading <em>Simulated reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulated reading</em>' containment reference.
	 * @see #getSimulated_reading()
	 * @generated
	 */
	void setSimulated_reading(Reading value);

	/**
	 * Returns the value of the '<em><b>Actual reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual reading</em>' containment reference.
	 * @see #setActual_reading(Reading)
	 * @see component.Component_Package#getUtilityNodes_Actual_reading()
	 * @model containment="true"
	 * @generated
	 */
	Reading getActual_reading();

	/**
	 * Sets the value of the '{@link component.UtilityNodes#getActual_reading <em>Actual reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual reading</em>' containment reference.
	 * @see #getActual_reading()
	 * @generated
	 */
	void setActual_reading(Reading value);

} // UtilityNodes
