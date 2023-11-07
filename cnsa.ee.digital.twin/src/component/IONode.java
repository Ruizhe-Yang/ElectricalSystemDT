/**
 */
package component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.IONode#getParameters <em>Parameters</em>}</li>
 *   <li>{@link component.IONode#getFunc <em>Func</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getIONode()
 * @model abstract="true"
 * @generated
 */
public interface IONode extends UtilityNodes {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see component.Component_Package#getIONode_Parameters()
	 * @model
	 * @generated
	 */
	EList<Float> getParameters();

	/**
	 * Returns the value of the '<em><b>Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func</em>' attribute.
	 * @see #setFunc(String)
	 * @see component.Component_Package#getIONode_Func()
	 * @model
	 * @generated
	 */
	String getFunc();

	/**
	 * Sets the value of the '{@link component.IONode#getFunc <em>Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func</em>' attribute.
	 * @see #getFunc()
	 * @generated
	 */
	void setFunc(String value);

} // IONode
