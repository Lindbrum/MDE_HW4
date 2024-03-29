/**
 */
package daGiMa_MDE_HW4_dest.provider;

import daGiMa_MDE_HW4_dest.util.DaGiMa_MDE_HW4_destAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DaGiMa_MDE_HW4_destItemProviderAdapterFactory extends DaGiMa_MDE_HW4_destAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaGiMa_MDE_HW4_destItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.University} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityItemProvider universityItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.University}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniversityAdapter() {
		if (universityItemProvider == null) {
			universityItemProvider = new UniversityItemProvider(this);
		}

		return universityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.Professor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorItemProvider professorItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfessorAdapter() {
		if (professorItemProvider == null) {
			professorItemProvider = new ProfessorItemProvider(this);
		}

		return professorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.Student} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentItemProvider studentItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudentAdapter() {
		if (studentItemProvider == null) {
			studentItemProvider = new StudentItemProvider(this);
		}

		return studentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.Department} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentItemProvider departmentItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDepartmentAdapter() {
		if (departmentItemProvider == null) {
			departmentItemProvider = new DepartmentItemProvider(this);
		}

		return departmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.DegreeCourse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeCourseItemProvider degreeCourseItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.DegreeCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDegreeCourseAdapter() {
		if (degreeCourseItemProvider == null) {
			degreeCourseItemProvider = new DegreeCourseItemProvider(this);
		}

		return degreeCourseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.Thesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThesisItemProvider thesisItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.Thesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThesisAdapter() {
		if (thesisItemProvider == null) {
			thesisItemProvider = new ThesisItemProvider(this);
		}

		return thesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.Course} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseItemProvider courseItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCourseAdapter() {
		if (courseItemProvider == null) {
			courseItemProvider = new CourseItemProvider(this);
		}

		return courseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.ExaminationCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationCallItemProvider examinationCallItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.ExaminationCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExaminationCallAdapter() {
		if (examinationCallItemProvider == null) {
			examinationCallItemProvider = new ExaminationCallItemProvider(this);
		}

		return examinationCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.PassingGrade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassingGradeItemProvider passingGradeItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.PassingGrade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPassingGradeAdapter() {
		if (passingGradeItemProvider == null) {
			passingGradeItemProvider = new PassingGradeItemProvider(this);
		}

		return passingGradeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.Career} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareerItemProvider careerItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.Career}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCareerAdapter() {
		if (careerItemProvider == null) {
			careerItemProvider = new CareerItemProvider(this);
		}

		return careerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.News} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewsItemProvider newsItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.News}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNewsAdapter() {
		if (newsItemProvider == null) {
			newsItemProvider = new NewsItemProvider(this);
		}

		return newsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.ExtraInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraInfoItemProvider extraInfoItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.ExtraInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtraInfoAdapter() {
		if (extraInfoItemProvider == null) {
			extraInfoItemProvider = new ExtraInfoItemProvider(this);
		}

		return extraInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.CustomEnumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomEnumerationItemProvider customEnumerationItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.CustomEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomEnumerationAdapter() {
		if (customEnumerationItemProvider == null) {
			customEnumerationItemProvider = new CustomEnumerationItemProvider(this);
		}

		return customEnumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_dest.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_dest.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (universityItemProvider != null) universityItemProvider.dispose();
		if (professorItemProvider != null) professorItemProvider.dispose();
		if (studentItemProvider != null) studentItemProvider.dispose();
		if (departmentItemProvider != null) departmentItemProvider.dispose();
		if (degreeCourseItemProvider != null) degreeCourseItemProvider.dispose();
		if (thesisItemProvider != null) thesisItemProvider.dispose();
		if (courseItemProvider != null) courseItemProvider.dispose();
		if (examinationCallItemProvider != null) examinationCallItemProvider.dispose();
		if (passingGradeItemProvider != null) passingGradeItemProvider.dispose();
		if (careerItemProvider != null) careerItemProvider.dispose();
		if (newsItemProvider != null) newsItemProvider.dispose();
		if (extraInfoItemProvider != null) extraInfoItemProvider.dispose();
		if (customEnumerationItemProvider != null) customEnumerationItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
	}

}
