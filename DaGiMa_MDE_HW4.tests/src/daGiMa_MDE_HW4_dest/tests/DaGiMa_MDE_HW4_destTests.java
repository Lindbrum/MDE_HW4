/**
 */
package daGiMa_MDE_HW4_dest.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>daGiMa_MDE_HW4_dest</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DaGiMa_MDE_HW4_destTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DaGiMa_MDE_HW4_destTests("daGiMa_MDE_HW4_dest Tests");
		suite.addTestSuite(ProfessorTest.class);
		suite.addTestSuite(DegreeCourseTest.class);
		suite.addTestSuite(ThesisTest.class);
		suite.addTestSuite(CourseTest.class);
		suite.addTestSuite(PassingGradeTest.class);
		suite.addTestSuite(CareerTest.class);
		suite.addTestSuite(ExtraInfoTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaGiMa_MDE_HW4_destTests(String name) {
		super(name);
	}

} //DaGiMa_MDE_HW4_destTests
