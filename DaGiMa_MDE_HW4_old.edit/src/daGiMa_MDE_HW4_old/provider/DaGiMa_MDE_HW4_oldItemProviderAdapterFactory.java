/**
 */
package daGiMa_MDE_HW4_old.provider;

import daGiMa_MDE_HW4_old.util.DaGiMa_MDE_HW4_oldAdapterFactory;

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
public class DaGiMa_MDE_HW4_oldItemProviderAdapterFactory extends DaGiMa_MDE_HW4_oldAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public DaGiMa_MDE_HW4_oldItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.University} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityItemProvider universityItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.University}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.Professor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorItemProvider professorItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.Professor}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.Student} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentItemProvider studentItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.Student}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.Department} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentItemProvider departmentItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.Department}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.DegreeCourse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeCourseItemProvider degreeCourseItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.DegreeCourse}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.Thesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThesisItemProvider thesisItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.Thesis}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.Course} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseItemProvider courseItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.Course}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.ExaminationCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationCallItemProvider examinationCallItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.ExaminationCall}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.PassingGrade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassingGradeItemProvider passingGradeItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.PassingGrade}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.Career} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareerItemProvider careerItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.Career}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.News} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewsItemProvider newsItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.News}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.Container}.
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
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.PhD} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhDItemProvider phDItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.PhD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhDAdapter() {
		if (phDItemProvider == null) {
			phDItemProvider = new PhDItemProvider(this);
		}

		return phDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link daGiMa_MDE_HW4_old.Master} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterItemProvider masterItemProvider;

	/**
	 * This creates an adapter for a {@link daGiMa_MDE_HW4_old.Master}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMasterAdapter() {
		if (masterItemProvider == null) {
			masterItemProvider = new MasterItemProvider(this);
		}

		return masterItemProvider;
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
		if (containerItemProvider != null) containerItemProvider.dispose();
		if (phDItemProvider != null) phDItemProvider.dispose();
		if (masterItemProvider != null) masterItemProvider.dispose();
	}

}
