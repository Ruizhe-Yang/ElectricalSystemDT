/**
 */
package component.tests;

import component.ComponentFactory;
import component.SafetyMechanism;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safety Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyMechanismTest extends ComponentSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafetyMechanismTest.class);
	}

	/**
	 * Constructs a new Safety Mechanism test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyMechanismTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safety Mechanism test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafetyMechanism getFixture() {
		return (SafetyMechanism)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentFactory.eINSTANCE.createSafetyMechanism());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SafetyMechanismTest
