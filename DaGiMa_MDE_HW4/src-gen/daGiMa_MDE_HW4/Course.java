/**
 */
package daGiMa_MDE_HW4;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4.Course#getCode <em>Code</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getLanguage <em>Language</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getCfu <em>Cfu</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getCredit_type <em>Credit type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getYear <em>Year</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getPeriod <em>Period</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getDegree_courses <em>Degree courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getCalls <em>Calls</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getStudents_grades <em>Students grades</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.Course#getExtra_info <em>Extra info</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cfuCourseGreaterThan'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"F-1234"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Code()
	 * @model default="F-1234" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"A course"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Name()
	 * @model default="A course" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Language()
	 * @model default="English" required="true"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Returns the value of the '<em><b>Cfu</b></em>' attribute.
	 * The default value is <code>"6"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfu</em>' attribute.
	 * @see #setCfu(int)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Cfu()
	 * @model default="6" required="true"
	 * @generated
	 */
	int getCfu();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.Course#getCfu <em>Cfu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfu</em>' attribute.
	 * @see #getCfu()
	 * @generated
	 */
	void setCfu(int value);

	/**
	 * Returns the value of the '<em><b>Credit type</b></em>' attribute.
	 * The default value is <code>"B"</code>.
	 * The literals are from the enumeration {@link daGiMa_MDE_HW4.CreditType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit type</em>' attribute.
	 * @see daGiMa_MDE_HW4.CreditType
	 * @see #setCredit_type(CreditType)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Credit_type()
	 * @model default="B" required="true"
	 * @generated
	 */
	CreditType getCredit_type();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.Course#getCredit_type <em>Credit type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit type</em>' attribute.
	 * @see daGiMa_MDE_HW4.CreditType
	 * @see #getCredit_type()
	 * @generated
	 */
	void setCredit_type(CreditType value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Year()
	 * @model default="2" required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.Course#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"FIRST_SEMESTER"</code>.
	 * The literals are from the enumeration {@link daGiMa_MDE_HW4.CoursePeriod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see daGiMa_MDE_HW4.CoursePeriod
	 * @see #setPeriod(CoursePeriod)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Period()
	 * @model default="FIRST_SEMESTER" required="true"
	 * @generated
	 */
	CoursePeriod getPeriod();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.Course#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see daGiMa_MDE_HW4.CoursePeriod
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(CoursePeriod value);

	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4.Professor}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4.Professor#getTaught_courses <em>Taught courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' reference list.
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Teachers()
	 * @see daGiMa_MDE_HW4.Professor#getTaught_courses
	 * @model opposite="taught_courses" required="true"
	 * @generated
	 */
	EList<Professor> getTeachers();

	/**
	 * Returns the value of the '<em><b>Degree courses</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4.DegreeCourse}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4.DegreeCourse#getCourse_catalogue <em>Course catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree courses</em>' reference list.
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Degree_courses()
	 * @see daGiMa_MDE_HW4.DegreeCourse#getCourse_catalogue
	 * @model opposite="course_catalogue" required="true"
	 * @generated
	 */
	EList<DegreeCourse> getDegree_courses();

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4.ExaminationCall}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4.ExaminationCall#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Calls()
	 * @see daGiMa_MDE_HW4.ExaminationCall#getCourse
	 * @model opposite="course" containment="true"
	 * @generated
	 */
	EList<ExaminationCall> getCalls();

	/**
	 * Returns the value of the '<em><b>Students grades</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4.PassingGrade}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4.PassingGrade#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students grades</em>' reference list.
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Students_grades()
	 * @see daGiMa_MDE_HW4.PassingGrade#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	EList<PassingGrade> getStudents_grades();

	/**
	 * Returns the value of the '<em><b>Extra info</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4.ExtraInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra info</em>' reference list.
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getCourse_Extra_info()
	 * @model
	 * @generated
	 */
	EList<ExtraInfo> getExtra_info();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tcfu &gt; 0'"
	 * @generated
	 */
	boolean cfuCourseGreaterThan(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Course
