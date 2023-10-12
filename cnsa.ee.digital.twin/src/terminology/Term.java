/**
 */
package terminology;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.Term#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getTerm()
 * @model
 * @generated
 */
public interface Term extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(ModelElement)
	 * @see terminology.Terminology_Package#getTerm_Origin()
	 * @model
	 * @generated
	 */
	ModelElement getOrigin();

	/**
	 * Sets the value of the '{@link terminology.Term#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(ModelElement value);

} // Term
