/**
 */
package daGiMa_MDE_HW4_dest.tests;

import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destFactory;
import daGiMa_MDE_HW4_dest.University;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityTest extends TestCase {

	/**
	 * The fixture for this University test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected University fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniversityTest.class);
	}

	/**
	 * Constructs a new University test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this University test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(University fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this University test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected University getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DaGiMa_MDE_HW4_destFactory.eINSTANCE.createUniversity());
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

} //UniversityTest
