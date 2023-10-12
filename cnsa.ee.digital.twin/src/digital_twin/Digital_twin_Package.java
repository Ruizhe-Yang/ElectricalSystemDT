/**
 */
package digital_twin;

import base.Base_Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see digital_twin.Digital_twin_Factory
 * @model kind="package"
 * @generated
 */
public interface Digital_twin_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "digital_twin";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cnsa.ee.digital.twin/digital_twin";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "digital_twin_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Digital_twin_Package eINSTANCE = digital_twin.impl.Digital_twin_PackageImpl.init();

	/**
	 * The meta object id for the '{@link digital_twin.impl.DigitalTwinPackageImpl <em>Digital Twin Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital_twin.impl.DigitalTwinPackageImpl
	 * @see digital_twin.impl.Digital_twin_PackageImpl#getDigitalTwinPackage()
	 * @generated
	 */
	int DIGITAL_TWIN_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__COORDINATE = Base_Package.ARTIFACT_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__DIMENSION = Base_Package.ARTIFACT_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__HEADING = Base_Package.ARTIFACT_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__EXTERNAL_REFERENCE = Base_Package.ARTIFACT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Digital Twin Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__INTERFACES = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Terminology Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Digital Twin Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link digital_twin.impl.DigitalTwinPackageInterfaceImpl <em>Digital Twin Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital_twin.impl.DigitalTwinPackageInterfaceImpl
	 * @see digital_twin.impl.Digital_twin_PackageImpl#getDigitalTwinPackageInterface()
	 * @generated
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__GID = DIGITAL_TWIN_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__IS_CITATION = DIGITAL_TWIN_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__IS_ABSTRACT = DIGITAL_TWIN_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__CITED_ELEMENT = DIGITAL_TWIN_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__COORDINATE = DIGITAL_TWIN_PACKAGE__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__DIMENSION = DIGITAL_TWIN_PACKAGE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__HEADING = DIGITAL_TWIN_PACKAGE__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__NAME = DIGITAL_TWIN_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__DESCRIPTION = DIGITAL_TWIN_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT = DIGITAL_TWIN_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__NOTE = DIGITAL_TWIN_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__TAGGED_VALUE = DIGITAL_TWIN_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__EXTERNAL_REFERENCE = DIGITAL_TWIN_PACKAGE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Digital Twin Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__DIGITAL_TWIN_PACKAGES = DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACES = DIGITAL_TWIN_PACKAGE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Component Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__COMPONENT_PACKAGES = DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES;

	/**
	 * The feature id for the '<em><b>Artifact Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__ARTIFACT_PACKAGES = DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES;

	/**
	 * The feature id for the '<em><b>Terminology Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__TERMINOLOGY_PACKAGES = DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES;

	/**
	 * The feature id for the '<em><b>Interface Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF = DIGITAL_TWIN_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Twin Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_TWIN_PACKAGE_INTERFACE_FEATURE_COUNT = DIGITAL_TWIN_PACKAGE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link digital_twin.DigitalTwinPackage <em>Digital Twin Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Twin Package</em>'.
	 * @see digital_twin.DigitalTwinPackage
	 * @generated
	 */
	EClass getDigitalTwinPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link digital_twin.DigitalTwinPackage#getDigitalTwinPackages <em>Digital Twin Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Digital Twin Packages</em>'.
	 * @see digital_twin.DigitalTwinPackage#getDigitalTwinPackages()
	 * @see #getDigitalTwinPackage()
	 * @generated
	 */
	EReference getDigitalTwinPackage_DigitalTwinPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link digital_twin.DigitalTwinPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see digital_twin.DigitalTwinPackage#getInterfaces()
	 * @see #getDigitalTwinPackage()
	 * @generated
	 */
	EReference getDigitalTwinPackage_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link digital_twin.DigitalTwinPackage#getComponentPackages <em>Component Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Packages</em>'.
	 * @see digital_twin.DigitalTwinPackage#getComponentPackages()
	 * @see #getDigitalTwinPackage()
	 * @generated
	 */
	EReference getDigitalTwinPackage_ComponentPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link digital_twin.DigitalTwinPackage#getArtifactPackages <em>Artifact Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Packages</em>'.
	 * @see digital_twin.DigitalTwinPackage#getArtifactPackages()
	 * @see #getDigitalTwinPackage()
	 * @generated
	 */
	EReference getDigitalTwinPackage_ArtifactPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link digital_twin.DigitalTwinPackage#getTerminologyPackages <em>Terminology Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Packages</em>'.
	 * @see digital_twin.DigitalTwinPackage#getTerminologyPackages()
	 * @see #getDigitalTwinPackage()
	 * @generated
	 */
	EReference getDigitalTwinPackage_TerminologyPackages();

	/**
	 * Returns the meta object for class '{@link digital_twin.DigitalTwinPackageInterface <em>Digital Twin Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Twin Package Interface</em>'.
	 * @see digital_twin.DigitalTwinPackageInterface
	 * @generated
	 */
	EClass getDigitalTwinPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link digital_twin.DigitalTwinPackageInterface#getInterfaceOf <em>Interface Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Of</em>'.
	 * @see digital_twin.DigitalTwinPackageInterface#getInterfaceOf()
	 * @see #getDigitalTwinPackageInterface()
	 * @generated
	 */
	EReference getDigitalTwinPackageInterface_InterfaceOf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Digital_twin_Factory getDigital_twin_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link digital_twin.impl.DigitalTwinPackageImpl <em>Digital Twin Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital_twin.impl.DigitalTwinPackageImpl
		 * @see digital_twin.impl.Digital_twin_PackageImpl#getDigitalTwinPackage()
		 * @generated
		 */
		EClass DIGITAL_TWIN_PACKAGE = eINSTANCE.getDigitalTwinPackage();

		/**
		 * The meta object literal for the '<em><b>Digital Twin Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES = eINSTANCE.getDigitalTwinPackage_DigitalTwinPackages();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN_PACKAGE__INTERFACES = eINSTANCE.getDigitalTwinPackage_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Component Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES = eINSTANCE.getDigitalTwinPackage_ComponentPackages();

		/**
		 * The meta object literal for the '<em><b>Artifact Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES = eINSTANCE.getDigitalTwinPackage_ArtifactPackages();

		/**
		 * The meta object literal for the '<em><b>Terminology Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES = eINSTANCE.getDigitalTwinPackage_TerminologyPackages();

		/**
		 * The meta object literal for the '{@link digital_twin.impl.DigitalTwinPackageInterfaceImpl <em>Digital Twin Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital_twin.impl.DigitalTwinPackageInterfaceImpl
		 * @see digital_twin.impl.Digital_twin_PackageImpl#getDigitalTwinPackageInterface()
		 * @generated
		 */
		EClass DIGITAL_TWIN_PACKAGE_INTERFACE = eINSTANCE.getDigitalTwinPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Interface Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF = eINSTANCE.getDigitalTwinPackageInterface_InterfaceOf();

	}

} //Digital_twin_Package
