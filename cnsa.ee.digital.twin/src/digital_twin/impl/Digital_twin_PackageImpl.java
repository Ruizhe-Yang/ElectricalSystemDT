/**
 */
package digital_twin.impl;

import artifact.Artifact_Package;

import artifact.impl.Artifact_PackageImpl;

import base.Base_Package;

import base.impl.Base_PackageImpl;

import component.Component_Package;

import component.impl.Component_PackageImpl;

import digital_twin.DigitalTwinPackage;
import digital_twin.DigitalTwinPackageInterface;
import digital_twin.Digital_twin_Factory;
import digital_twin.Digital_twin_Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import terminology.Terminology_Package;

import terminology.impl.Terminology_PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Digital_twin_PackageImpl extends EPackageImpl implements Digital_twin_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalTwinPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalTwinPackageInterfaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see digital_twin.Digital_twin_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Digital_twin_PackageImpl() {
		super(eNS_URI, Digital_twin_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Digital_twin_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Digital_twin_Package init() {
		if (isInited) return (Digital_twin_Package)EPackage.Registry.INSTANCE.getEPackage(Digital_twin_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredDigital_twin_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Digital_twin_PackageImpl theDigital_twin_Package = registeredDigital_twin_Package instanceof Digital_twin_PackageImpl ? (Digital_twin_PackageImpl)registeredDigital_twin_Package : new Digital_twin_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Base_PackageImpl theBase_Package = (Base_PackageImpl)(registeredPackage instanceof Base_PackageImpl ? registeredPackage : Base_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Component_Package.eNS_URI);
		Component_PackageImpl theComponent_Package = (Component_PackageImpl)(registeredPackage instanceof Component_PackageImpl ? registeredPackage : Component_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI);
		Artifact_PackageImpl theArtifact_Package = (Artifact_PackageImpl)(registeredPackage instanceof Artifact_PackageImpl ? registeredPackage : Artifact_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI);
		Terminology_PackageImpl theTerminology_Package = (Terminology_PackageImpl)(registeredPackage instanceof Terminology_PackageImpl ? registeredPackage : Terminology_Package.eINSTANCE);

		// Create package meta-data objects
		theDigital_twin_Package.createPackageContents();
		theBase_Package.createPackageContents();
		theComponent_Package.createPackageContents();
		theArtifact_Package.createPackageContents();
		theTerminology_Package.createPackageContents();

		// Initialize created meta-data
		theDigital_twin_Package.initializePackageContents();
		theBase_Package.initializePackageContents();
		theComponent_Package.initializePackageContents();
		theArtifact_Package.initializePackageContents();
		theTerminology_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDigital_twin_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Digital_twin_Package.eNS_URI, theDigital_twin_Package);
		return theDigital_twin_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalTwinPackage() {
		return digitalTwinPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDigitalTwinPackage_DigitalTwinPackages() {
		return (EReference)digitalTwinPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDigitalTwinPackage_Interfaces() {
		return (EReference)digitalTwinPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDigitalTwinPackage_ComponentPackages() {
		return (EReference)digitalTwinPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDigitalTwinPackage_ArtifactPackages() {
		return (EReference)digitalTwinPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDigitalTwinPackage_TerminologyPackages() {
		return (EReference)digitalTwinPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigitalTwinPackageInterface() {
		return digitalTwinPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDigitalTwinPackageInterface_InterfaceOf() {
		return (EReference)digitalTwinPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Digital_twin_Factory getDigital_twin_Factory() {
		return (Digital_twin_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		digitalTwinPackageEClass = createEClass(DIGITAL_TWIN_PACKAGE);
		createEReference(digitalTwinPackageEClass, DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES);
		createEReference(digitalTwinPackageEClass, DIGITAL_TWIN_PACKAGE__INTERFACES);
		createEReference(digitalTwinPackageEClass, DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES);
		createEReference(digitalTwinPackageEClass, DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES);
		createEReference(digitalTwinPackageEClass, DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES);

		digitalTwinPackageInterfaceEClass = createEClass(DIGITAL_TWIN_PACKAGE_INTERFACE);
		createEReference(digitalTwinPackageInterfaceEClass, DIGITAL_TWIN_PACKAGE_INTERFACE__INTERFACE_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Component_Package theComponent_Package = (Component_Package)EPackage.Registry.INSTANCE.getEPackage(Component_Package.eNS_URI);
		Artifact_Package theArtifact_Package = (Artifact_Package)EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI);
		Terminology_Package theTerminology_Package = (Terminology_Package)EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		digitalTwinPackageEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		digitalTwinPackageInterfaceEClass.getESuperTypes().add(this.getDigitalTwinPackage());

		// Initialize classes and features; add operations and parameters
		initEClass(digitalTwinPackageEClass, DigitalTwinPackage.class, "DigitalTwinPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalTwinPackage_DigitalTwinPackages(), this.getDigitalTwinPackage(), null, "digitalTwinPackages", null, 0, -1, DigitalTwinPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalTwinPackage_Interfaces(), this.getDigitalTwinPackageInterface(), null, "interfaces", null, 0, -1, DigitalTwinPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalTwinPackage_ComponentPackages(), theComponent_Package.getComponentPackage(), null, "componentPackages", null, 0, -1, DigitalTwinPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalTwinPackage_ArtifactPackages(), theArtifact_Package.getArtifactPackage(), null, "artifactPackages", null, 0, -1, DigitalTwinPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalTwinPackage_TerminologyPackages(), theTerminology_Package.getTerminologyPackage(), null, "terminologyPackages", null, 0, -1, DigitalTwinPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalTwinPackageInterfaceEClass, DigitalTwinPackageInterface.class, "DigitalTwinPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalTwinPackageInterface_InterfaceOf(), this.getDigitalTwinPackage(), null, "interfaceOf", null, 0, 1, DigitalTwinPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Digital_twin_PackageImpl
