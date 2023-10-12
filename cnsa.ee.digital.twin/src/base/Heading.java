/**
 */
package base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.Heading#getRoll <em>Roll</em>}</li>
 *   <li>{@link base.Heading#getPitch <em>Pitch</em>}</li>
 *   <li>{@link base.Heading#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getHeading()
 * @model
 * @generated
 */
public interface Heading extends Element {
	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #setRoll(float)
	 * @see base.Base_Package#getHeading_Roll()
	 * @model
	 * @generated
	 */
	float getRoll();

	/**
	 * Sets the value of the '{@link base.Heading#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(float value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(float)
	 * @see base.Base_Package#getHeading_Pitch()
	 * @model
	 * @generated
	 */
	float getPitch();

	/**
	 * Sets the value of the '{@link base.Heading#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(float value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(float)
	 * @see base.Base_Package#getHeading_Heading()
	 * @model
	 * @generated
	 */
	float getHeading();

	/**
	 * Sets the value of the '{@link base.Heading#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(float value);

} // Heading
