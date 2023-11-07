/**
 */
package component.tests;

import component.ComponentFactory;
import component.UndirectedRelationship;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Undirected Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UndirectedRelationshipTest extends ComponentRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UndirectedRelationshipTest.class);
	}

	/**
	 * Constructs a new Undirected Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndirectedRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Undirected Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UndirectedRelationship getFixture() {
		return (UndirectedRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentFactory.eINSTANCE.createUndirectedRelationship());
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

} //UndirectedRelationshipTest
