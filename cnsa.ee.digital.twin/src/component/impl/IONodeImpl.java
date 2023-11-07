/**
 */
package component.impl;

import component.Component_Package;
import component.IONode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.IONodeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link component.impl.IONodeImpl#getFunc <em>Func</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IONodeImpl extends UtilityNodesImpl implements IONode {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> parameters;

	/**
	 * The default value of the '{@link #getFunc() <em>Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunc()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunc() <em>Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunc()
	 * @generated
	 * @ordered
	 */
	protected String func = FUNC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IONodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.IO_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<Float>(Float.class, this, Component_Package.IO_NODE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunc() {
		return func;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunc(String newFunc) {
		String oldFunc = func;
		func = newFunc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.IO_NODE__FUNC, oldFunc, func));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_Package.IO_NODE__PARAMETERS:
				return getParameters();
			case Component_Package.IO_NODE__FUNC:
				return getFunc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_Package.IO_NODE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Float>)newValue);
				return;
			case Component_Package.IO_NODE__FUNC:
				setFunc((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Component_Package.IO_NODE__PARAMETERS:
				getParameters().clear();
				return;
			case Component_Package.IO_NODE__FUNC:
				setFunc(FUNC_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Component_Package.IO_NODE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Component_Package.IO_NODE__FUNC:
				return FUNC_EDEFAULT == null ? func != null : !FUNC_EDEFAULT.equals(func);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(", func: ");
		result.append(func);
		result.append(')');
		return result.toString();
	}

} //IONodeImpl
