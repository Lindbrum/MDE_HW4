/**
 */
package daGiMa_MDE_HW4_old.impl;

import daGiMa_MDE_HW4_old.Course;
import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage;
import daGiMa_MDE_HW4_old.Professor;
import daGiMa_MDE_HW4_old.Student;
import daGiMa_MDE_HW4_old.University;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.ContainerImpl#getUniversities <em>Universities</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.ContainerImpl#getProfessors <em>Professors</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.ContainerImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.ContainerImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.ContainerImpl#getModel_name <em>Model name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements daGiMa_MDE_HW4_old.Container {
	/**
	 * The cached value of the '{@link #getUniversities() <em>Universities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversities()
	 * @generated
	 * @ordered
	 */
	protected EList<University> universities;

	/**
	 * The cached value of the '{@link #getProfessors() <em>Professors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Professor> professors;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The default value of the '{@link #getModel_name() <em>Model name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_name()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = "NewModel";

	/**
	 * The cached value of the '{@link #getModel_name() <em>Model name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_name()
	 * @generated
	 * @ordered
	 */
	protected String model_name = MODEL_NAME_EDEFAULT;

	/**
	 * This is true if the Model name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean model_nameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4_oldPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<University> getUniversities() {
		if (universities == null) {
			universities = new EObjectContainmentEList<University>(University.class, this, DaGiMa_MDE_HW4_oldPackage.CONTAINER__UNIVERSITIES);
		}
		return universities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Professor> getProfessors() {
		if (professors == null) {
			professors = new EObjectContainmentEList<Professor>(Professor.class, this, DaGiMa_MDE_HW4_oldPackage.CONTAINER__PROFESSORS);
		}
		return professors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this, DaGiMa_MDE_HW4_oldPackage.CONTAINER__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, DaGiMa_MDE_HW4_oldPackage.CONTAINER__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel_name() {
		return model_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel_name(String newModel_name) {
		String oldModel_name = model_name;
		model_name = newModel_name;
		boolean oldModel_nameESet = model_nameESet;
		model_nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.CONTAINER__MODEL_NAME, oldModel_name, model_name, !oldModel_nameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetModel_name() {
		String oldModel_name = model_name;
		boolean oldModel_nameESet = model_nameESet;
		model_name = MODEL_NAME_EDEFAULT;
		model_nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DaGiMa_MDE_HW4_oldPackage.CONTAINER__MODEL_NAME, oldModel_name, MODEL_NAME_EDEFAULT, oldModel_nameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetModel_name() {
		return model_nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__UNIVERSITIES:
				return ((InternalEList<?>)getUniversities()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__PROFESSORS:
				return ((InternalEList<?>)getProfessors()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__COURSES:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__UNIVERSITIES:
				return getUniversities();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__PROFESSORS:
				return getProfessors();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__STUDENTS:
				return getStudents();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__COURSES:
				return getCourses();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__MODEL_NAME:
				return getModel_name();
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
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__UNIVERSITIES:
				getUniversities().clear();
				getUniversities().addAll((Collection<? extends University>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__PROFESSORS:
				getProfessors().clear();
				getProfessors().addAll((Collection<? extends Professor>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__MODEL_NAME:
				setModel_name((String)newValue);
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
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__UNIVERSITIES:
				getUniversities().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__PROFESSORS:
				getProfessors().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__STUDENTS:
				getStudents().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__COURSES:
				getCourses().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__MODEL_NAME:
				unsetModel_name();
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
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__UNIVERSITIES:
				return universities != null && !universities.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__PROFESSORS:
				return professors != null && !professors.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__STUDENTS:
				return students != null && !students.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__COURSES:
				return courses != null && !courses.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER__MODEL_NAME:
				return isSetModel_name();
		}
		return super.eIsSet(featureID);
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
		result.append(" (model_name: ");
		if (model_nameESet) result.append(model_name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
