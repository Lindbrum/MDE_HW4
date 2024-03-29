/**
 */
package daGiMa_MDE_HW4_dest.impl;

import daGiMa_MDE_HW4_dest.Career;
import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage;
import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destTables;
import daGiMa_MDE_HW4_dest.DegreeCourse;
import daGiMa_MDE_HW4_dest.PassingGrade;
import daGiMa_MDE_HW4_dest.Student;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;

import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Career</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.CareerImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.CareerImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.CareerImpl#getDegree_course <em>Degree course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.CareerImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.CareerImpl#getMatriculation_number <em>Matriculation number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CareerImpl extends MinimalEObjectImpl.Container implements Career {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "New transcript";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDegree_course() <em>Degree course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree_course()
	 * @generated
	 * @ordered
	 */
	protected DegreeCourse degree_course;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<PassingGrade> courses;

	/**
	 * The default value of the '{@link #getMatriculation_number() <em>Matriculation number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculation_number()
	 * @generated
	 * @ordered
	 */
	protected static final long MATRICULATION_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMatriculation_number() <em>Matriculation number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculation_number()
	 * @generated
	 * @ordered
	 */
	protected long matriculation_number = MATRICULATION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4_destPackage.Literals.CAREER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.CAREER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT) return null;
		return (Student)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeCourse getDegree_course() {
		if (degree_course != null && degree_course.eIsProxy()) {
			InternalEObject oldDegree_course = (InternalEObject)degree_course;
			degree_course = (DegreeCourse)eResolveProxy(oldDegree_course);
			if (degree_course != oldDegree_course) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW4_destPackage.CAREER__DEGREE_COURSE, oldDegree_course, degree_course));
			}
		}
		return degree_course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeCourse basicGetDegree_course() {
		return degree_course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree_course(DegreeCourse newDegree_course) {
		DegreeCourse oldDegree_course = degree_course;
		degree_course = newDegree_course;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.CAREER__DEGREE_COURSE, oldDegree_course, degree_course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PassingGrade> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<PassingGrade>(PassingGrade.class, this, DaGiMa_MDE_HW4_destPackage.CAREER__COURSES, DaGiMa_MDE_HW4_destPackage.PASSING_GRADE__STUDENT);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMatriculation_number() {
		return matriculation_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatriculation_number(long newMatriculation_number) {
		long oldMatriculation_number = matriculation_number;
		matriculation_number = newMatriculation_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.CAREER__MATRICULATION_NUMBER, oldMatriculation_number, matriculation_number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean passedAllExams() {
		/**
		 *
		 * courses->forAll(course | course.grade.size() > 0)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<PassingGrade> courses = this.getCourses();
		final /*@NonInvalid*/ OrderedSetValue BOXED_courses = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW4_destTables.ORD_CLSSid_PassingGrade, courses);
		/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		Iterator<Object> ITERATOR_course = BOXED_courses.iterator();
		/*@Thrown*/ Boolean forAll;
		while (true) {
			if (!ITERATOR_course.hasNext()) {
				if (accumulator == ValueUtil.TRUE_VALUE) {
					forAll = ValueUtil.TRUE_VALUE;
				}
				else {
					throw (InvalidValueException)accumulator;
				}
				break;
			}
			/*@NonInvalid*/ PassingGrade course = (PassingGrade)ITERATOR_course.next();
			/**
			 * course.grade.size() > 0
			 */
			/*@Caught*/ Object CAUGHT_gt;
			try {
				final /*@NonInvalid*/ String grade = course.getGrade();
				if (grade == null) {
					throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
				}
				final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(grade);
				final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, DaGiMa_MDE_HW4_destTables.INT_0).booleanValue();
				CAUGHT_gt = gt;
			}
			catch (Exception e) {
				CAUGHT_gt = ValueUtil.createInvalidValue(e);
			}
			//
			if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
				forAll = ValueUtil.FALSE_VALUE;
				break;														// Stop immediately
			}
			else if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
				;															// Carry on
			}
			else if (CAUGHT_gt instanceof InvalidValueException) {		// Abnormal exception evaluation result
				accumulator = CAUGHT_gt;									// Cache an exception failure
			}
			else {															// Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
			}
		}
		if (forAll == null) {
			throw new InvalidValueException("Null body for \'daGiMa_MDE_HW4_dest::Career::passedAllExams() : Boolean[1]\'");
		}
		return forAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Student)otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.CAREER__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT:
				return basicSetStudent(null, msgs);
			case DaGiMa_MDE_HW4_destPackage.CAREER__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS, Student.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DaGiMa_MDE_HW4_destPackage.CAREER__NAME:
				return getName();
			case DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT:
				return getStudent();
			case DaGiMa_MDE_HW4_destPackage.CAREER__DEGREE_COURSE:
				if (resolve) return getDegree_course();
				return basicGetDegree_course();
			case DaGiMa_MDE_HW4_destPackage.CAREER__COURSES:
				return getCourses();
			case DaGiMa_MDE_HW4_destPackage.CAREER__MATRICULATION_NUMBER:
				return getMatriculation_number();
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
			case DaGiMa_MDE_HW4_destPackage.CAREER__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT:
				setStudent((Student)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.CAREER__DEGREE_COURSE:
				setDegree_course((DegreeCourse)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.CAREER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends PassingGrade>)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.CAREER__MATRICULATION_NUMBER:
				setMatriculation_number((Long)newValue);
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
			case DaGiMa_MDE_HW4_destPackage.CAREER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT:
				setStudent((Student)null);
				return;
			case DaGiMa_MDE_HW4_destPackage.CAREER__DEGREE_COURSE:
				setDegree_course((DegreeCourse)null);
				return;
			case DaGiMa_MDE_HW4_destPackage.CAREER__COURSES:
				getCourses().clear();
				return;
			case DaGiMa_MDE_HW4_destPackage.CAREER__MATRICULATION_NUMBER:
				setMatriculation_number(MATRICULATION_NUMBER_EDEFAULT);
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
			case DaGiMa_MDE_HW4_destPackage.CAREER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT:
				return getStudent() != null;
			case DaGiMa_MDE_HW4_destPackage.CAREER__DEGREE_COURSE:
				return degree_course != null;
			case DaGiMa_MDE_HW4_destPackage.CAREER__COURSES:
				return courses != null && !courses.isEmpty();
			case DaGiMa_MDE_HW4_destPackage.CAREER__MATRICULATION_NUMBER:
				return matriculation_number != MATRICULATION_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DaGiMa_MDE_HW4_destPackage.CAREER___PASSED_ALL_EXAMS:
				return passedAllExams();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", matriculation_number: ");
		result.append(matriculation_number);
		result.append(')');
		return result.toString();
	}

} //CareerImpl
