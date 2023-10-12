/**
 */
package base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DT Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.DTElement#getGid <em>Gid</em>}</li>
 *   <li>{@link base.DTElement#isIsCitation <em>Is Citation</em>}</li>
 *   <li>{@link base.DTElement#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link base.DTElement#getCitedElement <em>Cited Element</em>}</li>
 *   <li>{@link base.DTElement#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link base.DTElement#getDimension <em>Dimension</em>}</li>
 *   <li>{@link base.DTElement#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getDTElement()
 * @model abstract="true"
 * @generated
 */
public interface DTElement extends Element {
	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(String)
	 * @see base.Base_Package#getDTElement_Gid()
	 * @model
	 * @generated
	 */
	String getGid();

	/**
	 * Sets the value of the '{@link base.DTElement#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(String value);

	/**
	 * Returns the value of the '<em><b>Is Citation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Citation</em>' attribute.
	 * @see #setIsCitation(boolean)
	 * @see base.Base_Package#getDTElement_IsCitation()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsCitation();

	/**
	 * Sets the value of the '{@link base.DTElement#isIsCitation <em>Is Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Citation</em>' attribute.
	 * @see #isIsCitation()
	 * @generated
	 */
	void setIsCitation(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see base.Base_Package#getDTElement_IsAbstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link base.DTElement#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Element</em>' reference.
	 * @see #setCitedElement(DTElement)
	 * @see base.Base_Package#getDTElement_CitedElement()
	 * @model
	 * @generated
	 */
	DTElement getCitedElement();

	/**
	 * Sets the value of the '{@link base.DTElement#getCitedElement <em>Cited Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Element</em>' reference.
	 * @see #getCitedElement()
	 * @generated
	 */
	void setCitedElement(DTElement value);

	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference.
	 * @see #setCoordinate(Coordinate)
	 * @see base.Base_Package#getDTElement_Coordinate()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getCoordinate();

	/**
	 * Sets the value of the '{@link base.DTElement#getCoordinate <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' containment reference.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Dimension)
	 * @see base.Base_Package#getDTElement_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link base.DTElement#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference.
	 * @see #setHeading(Heading)
	 * @see base.Base_Package#getDTElement_Heading()
	 * @model containment="true"
	 * @generated
	 */
	Heading getHeading();

	/**
	 * Sets the value of the '{@link base.DTElement#getHeading <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' containment reference.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(Heading value);

} // DTElement
