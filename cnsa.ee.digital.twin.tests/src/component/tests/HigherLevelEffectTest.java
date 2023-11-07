/**
 */
package component.tests;

import component.ComponentFactory;
import component.HigherLevelEffect;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Higher Level Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HigherLevelEffectTest extends FailureEffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HigherLevelEffectTest.class);
	}

	/**
	 * Constructs a new Higher Level Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HigherLevelEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Higher Level Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HigherLevelEffect getFixture() {
		return (HigherLevelEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentFactory.eINSTANCE.createHigherLevelEffect());
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

} //HigherLevelEffectTest
