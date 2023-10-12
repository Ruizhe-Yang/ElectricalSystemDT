/**
 */
package digital_twin.impl;

import artifact.ArtifactPackage;

import base.impl.ArtifactElementImpl;

import component.ComponentPackage;

import digital_twin.DigitalTwinPackage;
import digital_twin.DigitalTwinPackageInterface;
import digital_twin.Digital_twin_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import terminology.TerminologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Twin Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link digital_twin.impl.DigitalTwinPackageImpl#getDigitalTwinPackages <em>Digital Twin Packages</em>}</li>
 *   <li>{@link digital_twin.impl.DigitalTwinPackageImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link digital_twin.impl.DigitalTwinPackageImpl#getComponentPackages <em>Component Packages</em>}</li>
 *   <li>{@link digital_twin.impl.DigitalTwinPackageImpl#getArtifactPackages <em>Artifact Packages</em>}</li>
 *   <li>{@link digital_twin.impl.DigitalTwinPackageImpl#getTerminologyPackages <em>Terminology Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalTwinPackageImpl extends ArtifactElementImpl implements DigitalTwinPackage {
	/**
	 * The cached value of the '{@link #getDigitalTwinPackages() <em>Digital Twin Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalTwinPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<DigitalTwinPackage> digitalTwinPackages;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DigitalTwinPackageInterface> interfaces;

	/**
	 * The cached value of the '{@link #getComponentPackages() <em>Component Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPackage> componentPackages;

	/**
	 * The cached value of the '{@link #getArtifactPackages() <em>Artifact Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactPackage> artifactPackages;

	/**
	 * The cached value of the '{@link #getTerminologyPackages() <em>Terminology Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyPackage> terminologyPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalTwinPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DigitalTwinPackage> getDigitalTwinPackages() {
		if (digitalTwinPackages == null) {
			digitalTwinPackages = new EObjectContainmentEList<DigitalTwinPackage>(DigitalTwinPackage.class, this, Digital_twin_Package.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES);
		}
		return digitalTwinPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DigitalTwinPackageInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<DigitalTwinPackageInterface>(DigitalTwinPackageInterface.class, this, Digital_twin_Package.DIGITAL_TWIN_PACKAGE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentPackage> getComponentPackages() {
		if (componentPackages == null) {
			componentPackages = new EObjectContainmentEList<ComponentPackage>(ComponentPackage.class, this, Digital_twin_Package.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES);
		}
		return componentPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactPackage> getArtifactPackages() {
		if (artifactPackages == null) {
			artifactPackages = new EObjectContainmentEList<ArtifactPackage>(ArtifactPackage.class, this, Digital_twin_Package.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES);
		}
		return artifactPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminologyPackage> getTerminologyPackages() {
		if (terminologyPackages == null) {
			terminologyPackages = new EObjectContainmentEList<TerminologyPackage>(TerminologyPackage.class, this, Digital_twin_Package.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES);
		}
		return terminologyPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES:
				return ((InternalEList<?>)getDigitalTwinPackages()).basicRemove(otherEnd, msgs);
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES:
				return ((InternalEList<?>)getComponentPackages()).basicRemove(otherEnd, msgs);
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES:
				return ((InternalEList<?>)getArtifactPackages()).basicRemove(otherEnd, msgs);
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES:
				return ((InternalEList<?>)getTerminologyPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES:
				return getDigitalTwinPackages();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__INTERFACES:
				return getInterfaces();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES:
				return getComponentPackages();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES:
				return getArtifactPackages();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES:
				return getTerminologyPackages();
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
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES:
				getDigitalTwinPackages().clear();
				getDigitalTwinPackages().addAll((Collection<? extends DigitalTwinPackage>)newValue);
				return;
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends DigitalTwinPackageInterface>)newValue);
				return;
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES:
				getComponentPackages().clear();
				getComponentPackages().addAll((Collection<? extends ComponentPackage>)newValue);
				return;
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES:
				getArtifactPackages().clear();
				getArtifactPackages().addAll((Collection<? extends ArtifactPackage>)newValue);
				return;
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES:
				getTerminologyPackages().clear();
				getTerminologyPackages().addAll((Collection<? extends TerminologyPackage>)newValue);
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
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES:
				getDigitalTwinPackages().clear();
				return;
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__INTERFACES:
				getInterfaces().clear();
				return;
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES:
				getComponentPackages().clear();
				return;
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES:
				getArtifactPackages().clear();
				return;
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES:
				getTerminologyPackages().clear();
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
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES:
				return digitalTwinPackages != null && !digitalTwinPackages.isEmpty();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES:
				return componentPackages != null && !componentPackages.isEmpty();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES:
				return artifactPackages != null && !artifactPackages.isEmpty();
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES:
				return terminologyPackages != null && !terminologyPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DigitalTwinPackageImpl
