/**
 */
package digital_twin;

import artifact.ArtifactPackage;

import base.ArtifactElement;

import component.ComponentPackage;

import org.eclipse.emf.common.util.EList;

import terminology.TerminologyPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Twin Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital_twin.DigitalTwinPackage#getDigitalTwinPackages <em>Digital Twin Packages</em>}</li>
 *   <li>{@link digital_twin.DigitalTwinPackage#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link digital_twin.DigitalTwinPackage#getComponentPackages <em>Component Packages</em>}</li>
 *   <li>{@link digital_twin.DigitalTwinPackage#getArtifactPackages <em>Artifact Packages</em>}</li>
 *   <li>{@link digital_twin.DigitalTwinPackage#getTerminologyPackages <em>Terminology Packages</em>}</li>
 * </ul>
 *
 * @see digital_twin.Digital_twin_Package#getDigitalTwinPackage()
 * @model
 * @generated
 */
public interface DigitalTwinPackage extends ArtifactElement {
	/**
	 * Returns the value of the '<em><b>Digital Twin Packages</b></em>' containment reference list.
	 * The list contents are of type {@link digital_twin.DigitalTwinPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Twin Packages</em>' containment reference list.
	 * @see digital_twin.Digital_twin_Package#getDigitalTwinPackage_DigitalTwinPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<DigitalTwinPackage> getDigitalTwinPackages();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link digital_twin.DigitalTwinPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see digital_twin.Digital_twin_Package#getDigitalTwinPackage_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DigitalTwinPackageInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Component Packages</b></em>' containment reference list.
	 * The list contents are of type {@link component.ComponentPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Packages</em>' containment reference list.
	 * @see digital_twin.Digital_twin_Package#getDigitalTwinPackage_ComponentPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentPackage> getComponentPackages();

	/**
	 * Returns the value of the '<em><b>Artifact Packages</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.ArtifactPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Packages</em>' containment reference list.
	 * @see digital_twin.Digital_twin_Package#getDigitalTwinPackage_ArtifactPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactPackage> getArtifactPackages();

	/**
	 * Returns the value of the '<em><b>Terminology Packages</b></em>' containment reference list.
	 * The list contents are of type {@link terminology.TerminologyPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Packages</em>' containment reference list.
	 * @see digital_twin.Digital_twin_Package#getDigitalTwinPackage_TerminologyPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyPackage> getTerminologyPackages();

} // DigitalTwinPackage
