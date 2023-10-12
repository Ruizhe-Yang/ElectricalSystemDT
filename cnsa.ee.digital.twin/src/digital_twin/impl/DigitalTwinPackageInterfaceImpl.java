/**
 */
package digital_twin.impl;

import digital_twin.DigitalTwinPackage;
import digital_twin.DigitalTwinPackageInterface;
import digital_twin.Digital_twin_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Twin Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link digital_twin.impl.DigitalTwinPackageInterfaceImpl#getInterfaceOf <em>Interface Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalTwinPackageInterfaceImpl extends DigitalTwinPackageImpl implements DigitalTwinPackageInterface {
	/**
	 * The cached value of the '{@link #getInterfaceOf() <em>Interface Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceOf()
	 * @generated
	 * @ordered
	 */
	protected DigitalTwinPackage interfaceOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalTwinPackageInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalTwinPackage getInterfaceOf() {
		if (interfaceOf != null && interfaceOf.eIsProxy()) {
			InternalEObject oldInterfaceOf = (InternalEObject)interfaceOf;
			interfaceOf = (DigitalTwinPackage)eResolveProxy(oldInterfaceOf);
			if (interfaceOf != oldInterfaceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Digital_twin_Package.DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF, oldInterfaceOf, interfaceOf));
			}
		}
		return interfaceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalTwinPackage basicGetInterfaceOf() {
		return interfaceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceOf(DigitalTwinPackage newInterfaceOf) {
		DigitalTwinPackage oldInterfaceOf = interfaceOf;
		interfaceOf = newInterfaceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Digital_twin_Package.DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF, oldInterfaceOf, interfaceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF:
				if (resolve) return getInterfaceOf();
				return basicGetInterfaceOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF:
				setInterfaceOf((DigitalTwinPackage)newValue);
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
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF:
				setInterfaceOf((DigitalTwinPackage)null);
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
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF:
				return interfaceOf != null;
		}
		return super.eIsSet(featureID);
	}

} //DigitalTwinPackageInterfaceImpl
