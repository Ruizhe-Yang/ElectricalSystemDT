/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.ArtifactPackageInterface;
import artifact.Artifact_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.ArtifactPackageInterfaceImpl#getInterfaceOf <em>Interface Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactPackageInterfaceImpl extends ArtifactPackageImpl implements ArtifactPackageInterface {
	/**
	 * The cached value of the '{@link #getInterfaceOf() <em>Interface Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceOf()
	 * @generated
	 * @ordered
	 */
	protected ArtifactPackage interfaceOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactPackageInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Artifact_Package.Literals.ARTIFACT_PACKAGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactPackage getInterfaceOf() {
		if (interfaceOf != null && interfaceOf.eIsProxy()) {
			InternalEObject oldInterfaceOf = (InternalEObject)interfaceOf;
			interfaceOf = (ArtifactPackage)eResolveProxy(oldInterfaceOf);
			if (interfaceOf != oldInterfaceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Artifact_Package.ARTIFACT_PACKAGE_INTERFACE__INTERFACE_OF, oldInterfaceOf, interfaceOf));
			}
		}
		return interfaceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackage basicGetInterfaceOf() {
		return interfaceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceOf(ArtifactPackage newInterfaceOf) {
		ArtifactPackage oldInterfaceOf = interfaceOf;
		interfaceOf = newInterfaceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Artifact_Package.ARTIFACT_PACKAGE_INTERFACE__INTERFACE_OF, oldInterfaceOf, interfaceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Artifact_Package.ARTIFACT_PACKAGE_INTERFACE__INTERFACE_OF:
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
			case Artifact_Package.ARTIFACT_PACKAGE_INTERFACE__INTERFACE_OF:
				setInterfaceOf((ArtifactPackage)newValue);
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
			case Artifact_Package.ARTIFACT_PACKAGE_INTERFACE__INTERFACE_OF:
				setInterfaceOf((ArtifactPackage)null);
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
			case Artifact_Package.ARTIFACT_PACKAGE_INTERFACE__INTERFACE_OF:
				return interfaceOf != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactPackageInterfaceImpl
