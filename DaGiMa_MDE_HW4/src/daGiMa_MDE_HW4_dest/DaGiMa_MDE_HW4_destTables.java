/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /DaGiMa_MDE_HW4/model/DaGiMa_MDE_HW4_dest.ecore
 * using:
 *   /DaGiMa_MDE_HW4/model/DaGiMa_MDE_HW4_dest.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package daGiMa_MDE_HW4_dest;

// import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage;
// import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * DaGiMa_MDE_HW4_destTables provides the dispatch tables for the daGiMa_MDE_HW4_dest for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DaGiMa_MDE_HW4_destTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DaGiMa_MDE_HW4_destPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest = IdManager.getNsURIPackageId("http://www.example.org/dagima_mde_hw4_dest", null, DaGiMa_MDE_HW4_destPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Career = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("Career", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Container = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("Container", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Course = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("Course", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CustomEnumeration = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("CustomEnumeration", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DegreeCourse = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("DegreeCourse", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Department = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("Department", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExaminationCall = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("ExaminationCall", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExtraInfo = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("ExtraInfo", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_News = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("News", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PassingGrade = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("PassingGrade", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PrimitiveType = DaGiMa_MDE_HW4_destTables.PACKid_$metamodel$.getClassId("PrimitiveType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Professor = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("Professor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Student = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("Student", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Thesis = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("Thesis", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_University = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getClassId("University", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELong = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELong", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CreditType = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getEnumerationId("CreditType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ExamType = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getEnumerationId("ExamType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MetadataType = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getEnumerationId("MetadataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ThesisType = DaGiMa_MDE_HW4_destTables.PACKid_http_c_s_s_www_example_org_s_dagima_mde_hw4_dest.getEnumerationId("ThesisType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_15 = ValueUtil.integerValueOf("15");
	public static final /*@NonInvalid*/ IntegerValue INT_360 = ValueUtil.integerValueOf("360");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ String STR__91_0_m_9_93_p = "[0-9]+";
	public static final /*@NonInvalid*/ String STR__91_0_m_9_93_p_o_91__93_123_1_125_91_0_m_9_93_p_e_63_91_Dd_93 = "[0-9]+([.]{1}[0-9]+)?[Dd]";
	public static final /*@NonInvalid*/ String STR__91_0_m_9_93_p_o_91__93_123_1_125_91_0_m_9_93_p_e_63_91_Ff_93 = "[0-9]+([.]{1}[0-9]+)?[Ff]";
	public static final /*@NonInvalid*/ String STR__94_true_124_false$ = "^true|false$";
	public static final /*@NonInvalid*/ String STR__o_91_Aa_93_91_p_93_123_0_44_1_125_e_123_1_125_124_91_B_m_Db_m_d_93_123_1_125_124_o_1_91_8_m_9_93_123_1_125_124_2_91_0_m_9_93_123_1_125_124_30_91_Ll_93_123_0_44_1_125_e_123 = "([Aa][+]{0,1}){1}|[B-Db-d]{1}|(1[8-9]{1}|2[0-9]{1}|30[Ll]{0,1}){1}";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Career = TypeId.BAG.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Career, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Course = TypeId.BAG.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Course, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DegreeCourse = TypeId.BAG.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_DegreeCourse, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ExtraInfo = TypeId.BAG.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_ExtraInfo, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Thesis = TypeId.BAG.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Thesis, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_University = TypeId.BAG.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_University, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_BOOLEAN = DaGiMa_MDE_HW4_destTables.ENUMid_MetadataType.getEnumerationLiteralId("BOOLEAN");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_DOUBLE = DaGiMa_MDE_HW4_destTables.ENUMid_MetadataType.getEnumerationLiteralId("DOUBLE");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ENUMERATION = DaGiMa_MDE_HW4_destTables.ENUMid_MetadataType.getEnumerationLiteralId("ENUMERATION");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_FLOAT = DaGiMa_MDE_HW4_destTables.ENUMid_MetadataType.getEnumerationLiteralId("FLOAT");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_INTEGER = DaGiMa_MDE_HW4_destTables.ENUMid_MetadataType.getEnumerationLiteralId("INTEGER");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_STRING = DaGiMa_MDE_HW4_destTables.ENUMid_MetadataType.getEnumerationLiteralId("STRING");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Career = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Career, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Course = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Course, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Course_0 = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Course, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_CustomEnumeration = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_CustomEnumeration, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DegreeCourse = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_DegreeCourse, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DegreeCourse_0 = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_DegreeCourse, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Department = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Department, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ExaminationCall = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_ExaminationCall, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ExtraInfo = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_ExtraInfo, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_News = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_News, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PassingGrade = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_PassingGrade, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Professor = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Professor, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Professor_0 = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Professor, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Student = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Student, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Thesis = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_Thesis, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_University = TypeId.ORDERED_SET.getSpecializedId(DaGiMa_MDE_HW4_destTables.CLSSid_University, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(DaGiMa_MDE_HW4_destTables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DaGiMa_MDE_HW4_destTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Career = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.CAREER, PACKAGE, 0);
		public static final EcoreExecutorType _Container = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER, PACKAGE, 0);
		public static final EcoreExecutorType _Course = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.COURSE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _CreditType = new EcoreExecutorEnumeration(DaGiMa_MDE_HW4_destPackage.Literals.CREDIT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _CustomEnumeration = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.CUSTOM_ENUMERATION, PACKAGE, 0);
		public static final EcoreExecutorType _DegreeCourse = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE, PACKAGE, 0);
		public static final EcoreExecutorType _Department = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.DEPARTMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ExamType = new EcoreExecutorEnumeration(DaGiMa_MDE_HW4_destPackage.Literals.EXAM_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ExaminationCall = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.EXAMINATION_CALL, PACKAGE, 0);
		public static final EcoreExecutorType _ExtraInfo = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.EXTRA_INFO, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MetadataType = new EcoreExecutorEnumeration(DaGiMa_MDE_HW4_destPackage.Literals.METADATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _News = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.NEWS, PACKAGE, 0);
		public static final EcoreExecutorType _PassingGrade = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.PASSING_GRADE, PACKAGE, 0);
		public static final EcoreExecutorType _Professor = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.PROFESSOR, PACKAGE, 0);
		public static final EcoreExecutorType _Student = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.STUDENT, PACKAGE, 0);
		public static final EcoreExecutorType _Thesis = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.THESIS, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ThesisType = new EcoreExecutorEnumeration(DaGiMa_MDE_HW4_destPackage.Literals.THESIS_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _University = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.UNIVERSITY, PACKAGE, 0);
		public static final EcoreExecutorType _User = new EcoreExecutorType(DaGiMa_MDE_HW4_destPackage.Literals.USER, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Career,
			_Container,
			_Course,
			_CreditType,
			_CustomEnumeration,
			_DegreeCourse,
			_Department,
			_ExamType,
			_ExaminationCall,
			_ExtraInfo,
			_MetadataType,
			_News,
			_PassingGrade,
			_Professor,
			_Student,
			_Thesis,
			_ThesisType,
			_University,
			_User
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Career__Career = new ExecutorFragment(Types._Career, DaGiMa_MDE_HW4_destTables.Types._Career);
		private static final ExecutorFragment _Career__OclAny = new ExecutorFragment(Types._Career, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Career__OclElement = new ExecutorFragment(Types._Career, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Container__Container = new ExecutorFragment(Types._Container, DaGiMa_MDE_HW4_destTables.Types._Container);
		private static final ExecutorFragment _Container__OclAny = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Container__OclElement = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Course__Course = new ExecutorFragment(Types._Course, DaGiMa_MDE_HW4_destTables.Types._Course);
		private static final ExecutorFragment _Course__OclAny = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Course__OclElement = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CreditType__CreditType = new ExecutorFragment(Types._CreditType, DaGiMa_MDE_HW4_destTables.Types._CreditType);
		private static final ExecutorFragment _CreditType__OclAny = new ExecutorFragment(Types._CreditType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CreditType__OclElement = new ExecutorFragment(Types._CreditType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CreditType__OclEnumeration = new ExecutorFragment(Types._CreditType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _CreditType__OclType = new ExecutorFragment(Types._CreditType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _CustomEnumeration__CustomEnumeration = new ExecutorFragment(Types._CustomEnumeration, DaGiMa_MDE_HW4_destTables.Types._CustomEnumeration);
		private static final ExecutorFragment _CustomEnumeration__OclAny = new ExecutorFragment(Types._CustomEnumeration, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CustomEnumeration__OclElement = new ExecutorFragment(Types._CustomEnumeration, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DegreeCourse__DegreeCourse = new ExecutorFragment(Types._DegreeCourse, DaGiMa_MDE_HW4_destTables.Types._DegreeCourse);
		private static final ExecutorFragment _DegreeCourse__OclAny = new ExecutorFragment(Types._DegreeCourse, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DegreeCourse__OclElement = new ExecutorFragment(Types._DegreeCourse, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Department__Department = new ExecutorFragment(Types._Department, DaGiMa_MDE_HW4_destTables.Types._Department);
		private static final ExecutorFragment _Department__OclAny = new ExecutorFragment(Types._Department, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Department__OclElement = new ExecutorFragment(Types._Department, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExamType__ExamType = new ExecutorFragment(Types._ExamType, DaGiMa_MDE_HW4_destTables.Types._ExamType);
		private static final ExecutorFragment _ExamType__OclAny = new ExecutorFragment(Types._ExamType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExamType__OclElement = new ExecutorFragment(Types._ExamType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ExamType__OclEnumeration = new ExecutorFragment(Types._ExamType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ExamType__OclType = new ExecutorFragment(Types._ExamType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ExaminationCall__ExaminationCall = new ExecutorFragment(Types._ExaminationCall, DaGiMa_MDE_HW4_destTables.Types._ExaminationCall);
		private static final ExecutorFragment _ExaminationCall__OclAny = new ExecutorFragment(Types._ExaminationCall, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExaminationCall__OclElement = new ExecutorFragment(Types._ExaminationCall, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExtraInfo__ExtraInfo = new ExecutorFragment(Types._ExtraInfo, DaGiMa_MDE_HW4_destTables.Types._ExtraInfo);
		private static final ExecutorFragment _ExtraInfo__OclAny = new ExecutorFragment(Types._ExtraInfo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExtraInfo__OclElement = new ExecutorFragment(Types._ExtraInfo, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MetadataType__MetadataType = new ExecutorFragment(Types._MetadataType, DaGiMa_MDE_HW4_destTables.Types._MetadataType);
		private static final ExecutorFragment _MetadataType__OclAny = new ExecutorFragment(Types._MetadataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MetadataType__OclElement = new ExecutorFragment(Types._MetadataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MetadataType__OclEnumeration = new ExecutorFragment(Types._MetadataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MetadataType__OclType = new ExecutorFragment(Types._MetadataType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _News__News = new ExecutorFragment(Types._News, DaGiMa_MDE_HW4_destTables.Types._News);
		private static final ExecutorFragment _News__OclAny = new ExecutorFragment(Types._News, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _News__OclElement = new ExecutorFragment(Types._News, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PassingGrade__OclAny = new ExecutorFragment(Types._PassingGrade, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PassingGrade__OclElement = new ExecutorFragment(Types._PassingGrade, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PassingGrade__PassingGrade = new ExecutorFragment(Types._PassingGrade, DaGiMa_MDE_HW4_destTables.Types._PassingGrade);

		private static final ExecutorFragment _Professor__OclAny = new ExecutorFragment(Types._Professor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Professor__OclElement = new ExecutorFragment(Types._Professor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Professor__Professor = new ExecutorFragment(Types._Professor, DaGiMa_MDE_HW4_destTables.Types._Professor);
		private static final ExecutorFragment _Professor__User = new ExecutorFragment(Types._Professor, DaGiMa_MDE_HW4_destTables.Types._User);

		private static final ExecutorFragment _Student__OclAny = new ExecutorFragment(Types._Student, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Student__OclElement = new ExecutorFragment(Types._Student, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Student__Student = new ExecutorFragment(Types._Student, DaGiMa_MDE_HW4_destTables.Types._Student);
		private static final ExecutorFragment _Student__User = new ExecutorFragment(Types._Student, DaGiMa_MDE_HW4_destTables.Types._User);

		private static final ExecutorFragment _Thesis__OclAny = new ExecutorFragment(Types._Thesis, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Thesis__OclElement = new ExecutorFragment(Types._Thesis, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Thesis__Thesis = new ExecutorFragment(Types._Thesis, DaGiMa_MDE_HW4_destTables.Types._Thesis);

		private static final ExecutorFragment _ThesisType__OclAny = new ExecutorFragment(Types._ThesisType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ThesisType__OclElement = new ExecutorFragment(Types._ThesisType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ThesisType__OclEnumeration = new ExecutorFragment(Types._ThesisType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ThesisType__OclType = new ExecutorFragment(Types._ThesisType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _ThesisType__ThesisType = new ExecutorFragment(Types._ThesisType, DaGiMa_MDE_HW4_destTables.Types._ThesisType);

		private static final ExecutorFragment _University__OclAny = new ExecutorFragment(Types._University, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _University__OclElement = new ExecutorFragment(Types._University, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _University__University = new ExecutorFragment(Types._University, DaGiMa_MDE_HW4_destTables.Types._University);

		private static final ExecutorFragment _User__OclAny = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _User__OclElement = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _User__User = new ExecutorFragment(Types._User, DaGiMa_MDE_HW4_destTables.Types._User);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Career__passedAllExams = new ExecutorOperation("passedAllExams", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Career,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Professor__totalCfuTaught = new ExecutorOperation("totalCfuTaught", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Professor,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Career__courses = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CAREER__COURSES, Types._Career, 0);
		public static final ExecutorProperty _Career__degree_course = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CAREER__DEGREE_COURSE, Types._Career, 1);
		public static final ExecutorProperty _Career__matriculation_number = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CAREER__MATRICULATION_NUMBER, Types._Career, 2);
		public static final ExecutorProperty _Career__name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CAREER__NAME, Types._Career, 3);
		public static final ExecutorProperty _Career__student = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CAREER__STUDENT, Types._Career, 4);

		public static final ExecutorProperty _Container__courses = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__COURSES, Types._Container, 0);
		public static final ExecutorProperty _Container__custom_enumerations = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__CUSTOM_ENUMERATIONS, Types._Container, 1);
		public static final ExecutorProperty _Container__extra_infos = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__EXTRA_INFOS, Types._Container, 2);
		public static final ExecutorProperty _Container__model_name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__MODEL_NAME, Types._Container, 3);
		public static final ExecutorProperty _Container__professors = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__PROFESSORS, Types._Container, 4);
		public static final ExecutorProperty _Container__students = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__STUDENTS, Types._Container, 5);
		public static final ExecutorProperty _Container__universities = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__UNIVERSITIES, Types._Container, 6);

		public static final ExecutorProperty _Course__calls = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CALLS, Types._Course, 0);
		public static final ExecutorProperty _Course__cfu = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CFU, Types._Course, 1);
		public static final ExecutorProperty _Course__code = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CODE, Types._Course, 2);
		public static final ExecutorProperty _Course__credit_type = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__CREDIT_TYPE, Types._Course, 3);
		public static final ExecutorProperty _Course__degree_courses = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__DEGREE_COURSES, Types._Course, 4);
		public static final ExecutorProperty _Course__extra_info = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__EXTRA_INFO, Types._Course, 5);
		public static final ExecutorProperty _Course__language = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__LANGUAGE, Types._Course, 6);
		public static final ExecutorProperty _Course__name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__NAME, Types._Course, 7);
		public static final ExecutorProperty _Course__students_grades = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__STUDENTS_GRADES, Types._Course, 8);
		public static final ExecutorProperty _Course__teachers = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHERS, Types._Course, 9);
		public static final ExecutorProperty _Course__teaching_period_end_day = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_END_DAY, Types._Course, 10);
		public static final ExecutorProperty _Course__teaching_period_end_month = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_END_MONTH, Types._Course, 11);
		public static final ExecutorProperty _Course__teaching_period_end_year = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_END_YEAR, Types._Course, 12);
		public static final ExecutorProperty _Course__teaching_period_start_day = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_START_DAY, Types._Course, 13);
		public static final ExecutorProperty _Course__teaching_period_start_month = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_START_MONTH, Types._Course, 14);
		public static final ExecutorProperty _Course__teaching_period_start_year = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__TEACHING_PERIOD_START_YEAR, Types._Course, 15);
		public static final ExecutorProperty _Course__year = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__YEAR, Types._Course, 16);
		public static final ExecutorProperty _Course__Container__courses = new ExecutorPropertyWithImplementation("Container", Types._Course, 17, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__COURSES));

		public static final ExecutorProperty _CustomEnumeration__name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CUSTOM_ENUMERATION__NAME, Types._CustomEnumeration, 0);
		public static final ExecutorProperty _CustomEnumeration__values = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.CUSTOM_ENUMERATION__VALUES, Types._CustomEnumeration, 1);
		public static final ExecutorProperty _CustomEnumeration__Container__custom_enumerations = new ExecutorPropertyWithImplementation("Container", Types._CustomEnumeration, 2, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__CUSTOM_ENUMERATIONS));
		public static final ExecutorProperty _CustomEnumeration__ExtraInfo__enum = new ExecutorPropertyWithImplementation("ExtraInfo", Types._CustomEnumeration, 3, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXTRA_INFO__ENUM));

		public static final ExecutorProperty _DegreeCourse__cfu = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__CFU, Types._DegreeCourse, 0);
		public static final ExecutorProperty _DegreeCourse__code = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__CODE, Types._DegreeCourse, 1);
		public static final ExecutorProperty _DegreeCourse__coordinator = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__COORDINATOR, Types._DegreeCourse, 2);
		public static final ExecutorProperty _DegreeCourse__course_catalogue = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__COURSE_CATALOGUE, Types._DegreeCourse, 3);
		public static final ExecutorProperty _DegreeCourse__department = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__DEPARTMENT, Types._DegreeCourse, 4);
		public static final ExecutorProperty _DegreeCourse__description = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__DESCRIPTION, Types._DegreeCourse, 5);
		public static final ExecutorProperty _DegreeCourse__duration = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__DURATION, Types._DegreeCourse, 6);
		public static final ExecutorProperty _DegreeCourse__enrolled_students = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__ENROLLED_STUDENTS, Types._DegreeCourse, 7);
		public static final ExecutorProperty _DegreeCourse__extra_info = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__EXTRA_INFO, Types._DegreeCourse, 8);
		public static final ExecutorProperty _DegreeCourse__language = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__LANGUAGE, Types._DegreeCourse, 9);
		public static final ExecutorProperty _DegreeCourse__name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__NAME, Types._DegreeCourse, 10);
		public static final ExecutorProperty _DegreeCourse__reference_year = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__REFERENCE_YEAR, Types._DegreeCourse, 11);
		public static final ExecutorProperty _DegreeCourse__Career__degree_course = new ExecutorPropertyWithImplementation("Career", Types._DegreeCourse, 12, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.CAREER__DEGREE_COURSE));
		public static final ExecutorProperty _DegreeCourse__Thesis__degree_course = new ExecutorPropertyWithImplementation("Thesis", Types._DegreeCourse, 13, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.THESIS__DEGREE_COURSE));

		public static final ExecutorProperty _Department__name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEPARTMENT__NAME, Types._Department, 0);
		public static final ExecutorProperty _Department__offered_courses = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEPARTMENT__OFFERED_COURSES, Types._Department, 1);
		public static final ExecutorProperty _Department__related_news = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEPARTMENT__RELATED_NEWS, Types._Department, 2);
		public static final ExecutorProperty _Department__university = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEPARTMENT__UNIVERSITY, Types._Department, 3);
		public static final ExecutorProperty _Department__website = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEPARTMENT__WEBSITE, Types._Department, 4);

		public static final ExecutorProperty _ExaminationCall__booked_students = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXAMINATION_CALL__BOOKED_STUDENTS, Types._ExaminationCall, 0);
		public static final ExecutorProperty _ExaminationCall__classroom = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXAMINATION_CALL__CLASSROOM, Types._ExaminationCall, 1);
		public static final ExecutorProperty _ExaminationCall__course = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXAMINATION_CALL__COURSE, Types._ExaminationCall, 2);
		public static final ExecutorProperty _ExaminationCall__date = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXAMINATION_CALL__DATE, Types._ExaminationCall, 3);
		public static final ExecutorProperty _ExaminationCall__description = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXAMINATION_CALL__DESCRIPTION, Types._ExaminationCall, 4);
		public static final ExecutorProperty _ExaminationCall__type = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXAMINATION_CALL__TYPE, Types._ExaminationCall, 5);

		public static final ExecutorProperty _ExtraInfo__enum = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXTRA_INFO__ENUM, Types._ExtraInfo, 0);
		public static final ExecutorProperty _ExtraInfo__higher_multiplicity = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXTRA_INFO__HIGHER_MULTIPLICITY, Types._ExtraInfo, 1);
		public static final ExecutorProperty _ExtraInfo__lower_multiplicity = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXTRA_INFO__LOWER_MULTIPLICITY, Types._ExtraInfo, 2);
		public static final ExecutorProperty _ExtraInfo__name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXTRA_INFO__NAME, Types._ExtraInfo, 3);
		public static final ExecutorProperty _ExtraInfo__type = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXTRA_INFO__TYPE, Types._ExtraInfo, 4);
		public static final ExecutorProperty _ExtraInfo__value = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.EXTRA_INFO__VALUE, Types._ExtraInfo, 5);
		public static final ExecutorProperty _ExtraInfo__Container__extra_infos = new ExecutorPropertyWithImplementation("Container", Types._ExtraInfo, 6, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__EXTRA_INFOS));
		public static final ExecutorProperty _ExtraInfo__Course__extra_info = new ExecutorPropertyWithImplementation("Course", Types._ExtraInfo, 7, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.COURSE__EXTRA_INFO));
		public static final ExecutorProperty _ExtraInfo__DegreeCourse__extra_info = new ExecutorPropertyWithImplementation("DegreeCourse", Types._ExtraInfo, 8, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.DEGREE_COURSE__EXTRA_INFO));

		public static final ExecutorProperty _News__author = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.NEWS__AUTHOR, Types._News, 0);
		public static final ExecutorProperty _News__body = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.NEWS__BODY, Types._News, 1);
		public static final ExecutorProperty _News__department = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.NEWS__DEPARTMENT, Types._News, 2);
		public static final ExecutorProperty _News__publication_date = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.NEWS__PUBLICATION_DATE, Types._News, 3);
		public static final ExecutorProperty _News__title = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.NEWS__TITLE, Types._News, 4);

		public static final ExecutorProperty _PassingGrade__course = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PASSING_GRADE__COURSE, Types._PassingGrade, 0);
		public static final ExecutorProperty _PassingGrade__date = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PASSING_GRADE__DATE, Types._PassingGrade, 1);
		public static final ExecutorProperty _PassingGrade__grade = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PASSING_GRADE__GRADE, Types._PassingGrade, 2);
		public static final ExecutorProperty _PassingGrade__student = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PASSING_GRADE__STUDENT, Types._PassingGrade, 3);

		public static final ExecutorProperty _Professor__coordinated_degree_courses = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PROFESSOR__COORDINATED_DEGREE_COURSES, Types._Professor, 0);
		public static final ExecutorProperty _Professor__news_posted = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PROFESSOR__NEWS_POSTED, Types._Professor, 1);
		public static final ExecutorProperty _Professor__office_telephone = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PROFESSOR__OFFICE_TELEPHONE, Types._Professor, 2);
		public static final ExecutorProperty _Professor__orcid = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PROFESSOR__ORCID, Types._Professor, 3);
		public static final ExecutorProperty _Professor__supervised_thesis = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PROFESSOR__SUPERVISED_THESIS, Types._Professor, 4);
		public static final ExecutorProperty _Professor__taught_courses = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.PROFESSOR__TAUGHT_COURSES, Types._Professor, 5);
		public static final ExecutorProperty _Professor__Container__professors = new ExecutorPropertyWithImplementation("Container", Types._Professor, 6, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__PROFESSORS));
		public static final ExecutorProperty _Professor__University__rector = new ExecutorPropertyWithImplementation("University", Types._Professor, 7, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.UNIVERSITY__RECTOR));

		public static final ExecutorProperty _Student__booked_calls = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.STUDENT__BOOKED_CALLS, Types._Student, 0);
		public static final ExecutorProperty _Student__enrolled_courses = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.STUDENT__ENROLLED_COURSES, Types._Student, 1);
		public static final ExecutorProperty _Student__thesis_defended = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.STUDENT__THESIS_DEFENDED, Types._Student, 2);
		public static final ExecutorProperty _Student__transcripts = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.STUDENT__TRANSCRIPTS, Types._Student, 3);
		public static final ExecutorProperty _Student__Container__students = new ExecutorPropertyWithImplementation("Container", Types._Student, 4, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__STUDENTS));

		public static final ExecutorProperty _Thesis__degree_course = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.THESIS__DEGREE_COURSE, Types._Thesis, 0);
		public static final ExecutorProperty _Thesis__student = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.THESIS__STUDENT, Types._Thesis, 1);
		public static final ExecutorProperty _Thesis__supervisor = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.THESIS__SUPERVISOR, Types._Thesis, 2);
		public static final ExecutorProperty _Thesis__title = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.THESIS__TITLE, Types._Thesis, 3);
		public static final ExecutorProperty _Thesis__type = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.THESIS__TYPE, Types._Thesis, 4);

		public static final ExecutorProperty _University__departments = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.UNIVERSITY__DEPARTMENTS, Types._University, 0);
		public static final ExecutorProperty _University__name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.UNIVERSITY__NAME, Types._University, 1);
		public static final ExecutorProperty _University__rector = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.UNIVERSITY__RECTOR, Types._University, 2);
		public static final ExecutorProperty _University__Container__universities = new ExecutorPropertyWithImplementation("Container", Types._University, 3, new EcoreLibraryOppositeProperty(DaGiMa_MDE_HW4_destPackage.Literals.CONTAINER__UNIVERSITIES));

		public static final ExecutorProperty _User__birth_date = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.USER__BIRTH_DATE, Types._User, 0);
		public static final ExecutorProperty _User__email = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.USER__EMAIL, Types._User, 1);
		public static final ExecutorProperty _User__name = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.USER__NAME, Types._User, 2);
		public static final ExecutorProperty _User__surname = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.USER__SURNAME, Types._User, 3);
		public static final ExecutorProperty _User__telephone = new EcoreExecutorProperty(DaGiMa_MDE_HW4_destPackage.Literals.USER__TELEPHONE, Types._User, 4);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Career =
			{
				Fragments._Career__OclAny /* 0 */,
				Fragments._Career__OclElement /* 1 */,
				Fragments._Career__Career /* 2 */
			};
		private static final int /*@NonNull*/ [] __Career = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Container =
			{
				Fragments._Container__OclAny /* 0 */,
				Fragments._Container__OclElement /* 1 */,
				Fragments._Container__Container /* 2 */
			};
		private static final int /*@NonNull*/ [] __Container = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Course =
			{
				Fragments._Course__OclAny /* 0 */,
				Fragments._Course__OclElement /* 1 */,
				Fragments._Course__Course /* 2 */
			};
		private static final int /*@NonNull*/ [] __Course = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CreditType =
			{
				Fragments._CreditType__OclAny /* 0 */,
				Fragments._CreditType__OclElement /* 1 */,
				Fragments._CreditType__OclType /* 2 */,
				Fragments._CreditType__OclEnumeration /* 3 */,
				Fragments._CreditType__CreditType /* 4 */
			};
		private static final int /*@NonNull*/ [] __CreditType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CustomEnumeration =
			{
				Fragments._CustomEnumeration__OclAny /* 0 */,
				Fragments._CustomEnumeration__OclElement /* 1 */,
				Fragments._CustomEnumeration__CustomEnumeration /* 2 */
			};
		private static final int /*@NonNull*/ [] __CustomEnumeration = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DegreeCourse =
			{
				Fragments._DegreeCourse__OclAny /* 0 */,
				Fragments._DegreeCourse__OclElement /* 1 */,
				Fragments._DegreeCourse__DegreeCourse /* 2 */
			};
		private static final int /*@NonNull*/ [] __DegreeCourse = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Department =
			{
				Fragments._Department__OclAny /* 0 */,
				Fragments._Department__OclElement /* 1 */,
				Fragments._Department__Department /* 2 */
			};
		private static final int /*@NonNull*/ [] __Department = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExamType =
			{
				Fragments._ExamType__OclAny /* 0 */,
				Fragments._ExamType__OclElement /* 1 */,
				Fragments._ExamType__OclType /* 2 */,
				Fragments._ExamType__OclEnumeration /* 3 */,
				Fragments._ExamType__ExamType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ExamType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExaminationCall =
			{
				Fragments._ExaminationCall__OclAny /* 0 */,
				Fragments._ExaminationCall__OclElement /* 1 */,
				Fragments._ExaminationCall__ExaminationCall /* 2 */
			};
		private static final int /*@NonNull*/ [] __ExaminationCall = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExtraInfo =
			{
				Fragments._ExtraInfo__OclAny /* 0 */,
				Fragments._ExtraInfo__OclElement /* 1 */,
				Fragments._ExtraInfo__ExtraInfo /* 2 */
			};
		private static final int /*@NonNull*/ [] __ExtraInfo = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MetadataType =
			{
				Fragments._MetadataType__OclAny /* 0 */,
				Fragments._MetadataType__OclElement /* 1 */,
				Fragments._MetadataType__OclType /* 2 */,
				Fragments._MetadataType__OclEnumeration /* 3 */,
				Fragments._MetadataType__MetadataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __MetadataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _News =
			{
				Fragments._News__OclAny /* 0 */,
				Fragments._News__OclElement /* 1 */,
				Fragments._News__News /* 2 */
			};
		private static final int /*@NonNull*/ [] __News = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PassingGrade =
			{
				Fragments._PassingGrade__OclAny /* 0 */,
				Fragments._PassingGrade__OclElement /* 1 */,
				Fragments._PassingGrade__PassingGrade /* 2 */
			};
		private static final int /*@NonNull*/ [] __PassingGrade = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Professor =
			{
				Fragments._Professor__OclAny /* 0 */,
				Fragments._Professor__OclElement /* 1 */,
				Fragments._Professor__User /* 2 */,
				Fragments._Professor__Professor /* 3 */
			};
		private static final int /*@NonNull*/ [] __Professor = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Student =
			{
				Fragments._Student__OclAny /* 0 */,
				Fragments._Student__OclElement /* 1 */,
				Fragments._Student__User /* 2 */,
				Fragments._Student__Student /* 3 */
			};
		private static final int /*@NonNull*/ [] __Student = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Thesis =
			{
				Fragments._Thesis__OclAny /* 0 */,
				Fragments._Thesis__OclElement /* 1 */,
				Fragments._Thesis__Thesis /* 2 */
			};
		private static final int /*@NonNull*/ [] __Thesis = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ThesisType =
			{
				Fragments._ThesisType__OclAny /* 0 */,
				Fragments._ThesisType__OclElement /* 1 */,
				Fragments._ThesisType__OclType /* 2 */,
				Fragments._ThesisType__OclEnumeration /* 3 */,
				Fragments._ThesisType__ThesisType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ThesisType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _University =
			{
				Fragments._University__OclAny /* 0 */,
				Fragments._University__OclElement /* 1 */,
				Fragments._University__University /* 2 */
			};
		private static final int /*@NonNull*/ [] __University = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _User =
			{
				Fragments._User__OclAny /* 0 */,
				Fragments._User__OclElement /* 1 */,
				Fragments._User__User /* 2 */
			};
		private static final int /*@NonNull*/ [] __User = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Career.initFragments(_Career, __Career);
			Types._Container.initFragments(_Container, __Container);
			Types._Course.initFragments(_Course, __Course);
			Types._CreditType.initFragments(_CreditType, __CreditType);
			Types._CustomEnumeration.initFragments(_CustomEnumeration, __CustomEnumeration);
			Types._DegreeCourse.initFragments(_DegreeCourse, __DegreeCourse);
			Types._Department.initFragments(_Department, __Department);
			Types._ExamType.initFragments(_ExamType, __ExamType);
			Types._ExaminationCall.initFragments(_ExaminationCall, __ExaminationCall);
			Types._ExtraInfo.initFragments(_ExtraInfo, __ExtraInfo);
			Types._MetadataType.initFragments(_MetadataType, __MetadataType);
			Types._News.initFragments(_News, __News);
			Types._PassingGrade.initFragments(_PassingGrade, __PassingGrade);
			Types._Professor.initFragments(_Professor, __Professor);
			Types._Student.initFragments(_Student, __Student);
			Types._Thesis.initFragments(_Thesis, __Thesis);
			Types._ThesisType.initFragments(_ThesisType, __ThesisType);
			Types._University.initFragments(_University, __University);
			Types._User.initFragments(_User, __User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Career__Career = {
			DaGiMa_MDE_HW4_destTables.Operations._Career__passedAllExams /* passedAllExams() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Career__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Career__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Container__Container = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Course__Course = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CreditType__CreditType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CreditType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CreditType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CreditType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CreditType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CustomEnumeration__CustomEnumeration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CustomEnumeration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CustomEnumeration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DegreeCourse__DegreeCourse = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeCourse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeCourse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Department__Department = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExamType__ExamType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExamType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExamType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExamType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExamType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExaminationCall__ExaminationCall = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExaminationCall__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExaminationCall__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExtraInfo__ExtraInfo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExtraInfo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExtraInfo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MetadataType__MetadataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MetadataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MetadataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MetadataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MetadataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _News__News = {};
		private static final ExecutorOperation /*@NonNull*/ [] _News__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _News__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PassingGrade__PassingGrade = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PassingGrade__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PassingGrade__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Professor__Professor = {
			DaGiMa_MDE_HW4_destTables.Operations._Professor__totalCfuTaught /* totalCfuTaught() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Professor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Professor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Professor__User = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Student__Student = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__User = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Thesis__Thesis = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Thesis__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Thesis__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ThesisType__ThesisType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ThesisType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ThesisType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ThesisType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ThesisType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _University__University = {};
		private static final ExecutorOperation /*@NonNull*/ [] _University__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _University__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _User__User = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Career__Career.initOperations(_Career__Career);
			Fragments._Career__OclAny.initOperations(_Career__OclAny);
			Fragments._Career__OclElement.initOperations(_Career__OclElement);

			Fragments._Container__Container.initOperations(_Container__Container);
			Fragments._Container__OclAny.initOperations(_Container__OclAny);
			Fragments._Container__OclElement.initOperations(_Container__OclElement);

			Fragments._Course__Course.initOperations(_Course__Course);
			Fragments._Course__OclAny.initOperations(_Course__OclAny);
			Fragments._Course__OclElement.initOperations(_Course__OclElement);

			Fragments._CreditType__CreditType.initOperations(_CreditType__CreditType);
			Fragments._CreditType__OclAny.initOperations(_CreditType__OclAny);
			Fragments._CreditType__OclElement.initOperations(_CreditType__OclElement);
			Fragments._CreditType__OclEnumeration.initOperations(_CreditType__OclEnumeration);
			Fragments._CreditType__OclType.initOperations(_CreditType__OclType);

			Fragments._CustomEnumeration__CustomEnumeration.initOperations(_CustomEnumeration__CustomEnumeration);
			Fragments._CustomEnumeration__OclAny.initOperations(_CustomEnumeration__OclAny);
			Fragments._CustomEnumeration__OclElement.initOperations(_CustomEnumeration__OclElement);

			Fragments._DegreeCourse__DegreeCourse.initOperations(_DegreeCourse__DegreeCourse);
			Fragments._DegreeCourse__OclAny.initOperations(_DegreeCourse__OclAny);
			Fragments._DegreeCourse__OclElement.initOperations(_DegreeCourse__OclElement);

			Fragments._Department__Department.initOperations(_Department__Department);
			Fragments._Department__OclAny.initOperations(_Department__OclAny);
			Fragments._Department__OclElement.initOperations(_Department__OclElement);

			Fragments._ExamType__ExamType.initOperations(_ExamType__ExamType);
			Fragments._ExamType__OclAny.initOperations(_ExamType__OclAny);
			Fragments._ExamType__OclElement.initOperations(_ExamType__OclElement);
			Fragments._ExamType__OclEnumeration.initOperations(_ExamType__OclEnumeration);
			Fragments._ExamType__OclType.initOperations(_ExamType__OclType);

			Fragments._ExaminationCall__ExaminationCall.initOperations(_ExaminationCall__ExaminationCall);
			Fragments._ExaminationCall__OclAny.initOperations(_ExaminationCall__OclAny);
			Fragments._ExaminationCall__OclElement.initOperations(_ExaminationCall__OclElement);

			Fragments._ExtraInfo__ExtraInfo.initOperations(_ExtraInfo__ExtraInfo);
			Fragments._ExtraInfo__OclAny.initOperations(_ExtraInfo__OclAny);
			Fragments._ExtraInfo__OclElement.initOperations(_ExtraInfo__OclElement);

			Fragments._MetadataType__MetadataType.initOperations(_MetadataType__MetadataType);
			Fragments._MetadataType__OclAny.initOperations(_MetadataType__OclAny);
			Fragments._MetadataType__OclElement.initOperations(_MetadataType__OclElement);
			Fragments._MetadataType__OclEnumeration.initOperations(_MetadataType__OclEnumeration);
			Fragments._MetadataType__OclType.initOperations(_MetadataType__OclType);

			Fragments._News__News.initOperations(_News__News);
			Fragments._News__OclAny.initOperations(_News__OclAny);
			Fragments._News__OclElement.initOperations(_News__OclElement);

			Fragments._PassingGrade__OclAny.initOperations(_PassingGrade__OclAny);
			Fragments._PassingGrade__OclElement.initOperations(_PassingGrade__OclElement);
			Fragments._PassingGrade__PassingGrade.initOperations(_PassingGrade__PassingGrade);

			Fragments._Professor__OclAny.initOperations(_Professor__OclAny);
			Fragments._Professor__OclElement.initOperations(_Professor__OclElement);
			Fragments._Professor__Professor.initOperations(_Professor__Professor);
			Fragments._Professor__User.initOperations(_Professor__User);

			Fragments._Student__OclAny.initOperations(_Student__OclAny);
			Fragments._Student__OclElement.initOperations(_Student__OclElement);
			Fragments._Student__Student.initOperations(_Student__Student);
			Fragments._Student__User.initOperations(_Student__User);

			Fragments._Thesis__OclAny.initOperations(_Thesis__OclAny);
			Fragments._Thesis__OclElement.initOperations(_Thesis__OclElement);
			Fragments._Thesis__Thesis.initOperations(_Thesis__Thesis);

			Fragments._ThesisType__OclAny.initOperations(_ThesisType__OclAny);
			Fragments._ThesisType__OclElement.initOperations(_ThesisType__OclElement);
			Fragments._ThesisType__OclEnumeration.initOperations(_ThesisType__OclEnumeration);
			Fragments._ThesisType__OclType.initOperations(_ThesisType__OclType);
			Fragments._ThesisType__ThesisType.initOperations(_ThesisType__ThesisType);

			Fragments._University__OclAny.initOperations(_University__OclAny);
			Fragments._University__OclElement.initOperations(_University__OclElement);
			Fragments._University__University.initOperations(_University__University);

			Fragments._User__OclAny.initOperations(_User__OclAny);
			Fragments._User__OclElement.initOperations(_User__OclElement);
			Fragments._User__User.initOperations(_User__User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Career = {
			DaGiMa_MDE_HW4_destTables.Properties._Career__courses,
			DaGiMa_MDE_HW4_destTables.Properties._Career__degree_course,
			DaGiMa_MDE_HW4_destTables.Properties._Career__matriculation_number,
			DaGiMa_MDE_HW4_destTables.Properties._Career__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._Career__student
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Container = {
			DaGiMa_MDE_HW4_destTables.Properties._Container__courses,
			DaGiMa_MDE_HW4_destTables.Properties._Container__custom_enumerations,
			DaGiMa_MDE_HW4_destTables.Properties._Container__extra_infos,
			DaGiMa_MDE_HW4_destTables.Properties._Container__model_name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._Container__professors,
			DaGiMa_MDE_HW4_destTables.Properties._Container__students,
			DaGiMa_MDE_HW4_destTables.Properties._Container__universities
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Course = {
			DaGiMa_MDE_HW4_destTables.Properties._Course__calls,
			DaGiMa_MDE_HW4_destTables.Properties._Course__cfu,
			DaGiMa_MDE_HW4_destTables.Properties._Course__code,
			DaGiMa_MDE_HW4_destTables.Properties._Course__credit_type,
			DaGiMa_MDE_HW4_destTables.Properties._Course__degree_courses,
			DaGiMa_MDE_HW4_destTables.Properties._Course__extra_info,
			DaGiMa_MDE_HW4_destTables.Properties._Course__language,
			DaGiMa_MDE_HW4_destTables.Properties._Course__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._Course__students_grades,
			DaGiMa_MDE_HW4_destTables.Properties._Course__teachers,
			DaGiMa_MDE_HW4_destTables.Properties._Course__teaching_period_end_day,
			DaGiMa_MDE_HW4_destTables.Properties._Course__teaching_period_end_month,
			DaGiMa_MDE_HW4_destTables.Properties._Course__teaching_period_end_year,
			DaGiMa_MDE_HW4_destTables.Properties._Course__teaching_period_start_day,
			DaGiMa_MDE_HW4_destTables.Properties._Course__teaching_period_start_month,
			DaGiMa_MDE_HW4_destTables.Properties._Course__teaching_period_start_year,
			DaGiMa_MDE_HW4_destTables.Properties._Course__year
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CreditType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CustomEnumeration = {
			DaGiMa_MDE_HW4_destTables.Properties._CustomEnumeration__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._CustomEnumeration__values
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DegreeCourse = {
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__cfu,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__code,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__coordinator,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__course_catalogue,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__department,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__description,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__duration,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__enrolled_students,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__extra_info,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__language,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._DegreeCourse__reference_year
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Department = {
			DaGiMa_MDE_HW4_destTables.Properties._Department__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._Department__offered_courses,
			DaGiMa_MDE_HW4_destTables.Properties._Department__related_news,
			DaGiMa_MDE_HW4_destTables.Properties._Department__university,
			DaGiMa_MDE_HW4_destTables.Properties._Department__website
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExamType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExaminationCall = {
			DaGiMa_MDE_HW4_destTables.Properties._ExaminationCall__booked_students,
			DaGiMa_MDE_HW4_destTables.Properties._ExaminationCall__classroom,
			DaGiMa_MDE_HW4_destTables.Properties._ExaminationCall__course,
			DaGiMa_MDE_HW4_destTables.Properties._ExaminationCall__date,
			DaGiMa_MDE_HW4_destTables.Properties._ExaminationCall__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._ExaminationCall__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExtraInfo = {
			DaGiMa_MDE_HW4_destTables.Properties._ExtraInfo__enum,
			DaGiMa_MDE_HW4_destTables.Properties._ExtraInfo__higher_multiplicity,
			DaGiMa_MDE_HW4_destTables.Properties._ExtraInfo__lower_multiplicity,
			DaGiMa_MDE_HW4_destTables.Properties._ExtraInfo__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._ExtraInfo__type,
			DaGiMa_MDE_HW4_destTables.Properties._ExtraInfo__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MetadataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _News = {
			DaGiMa_MDE_HW4_destTables.Properties._News__author,
			DaGiMa_MDE_HW4_destTables.Properties._News__body,
			DaGiMa_MDE_HW4_destTables.Properties._News__department,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._News__publication_date,
			DaGiMa_MDE_HW4_destTables.Properties._News__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PassingGrade = {
			DaGiMa_MDE_HW4_destTables.Properties._PassingGrade__course,
			DaGiMa_MDE_HW4_destTables.Properties._PassingGrade__date,
			DaGiMa_MDE_HW4_destTables.Properties._PassingGrade__grade,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._PassingGrade__student
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Professor = {
			DaGiMa_MDE_HW4_destTables.Properties._User__birth_date,
			DaGiMa_MDE_HW4_destTables.Properties._Professor__coordinated_degree_courses,
			DaGiMa_MDE_HW4_destTables.Properties._User__email,
			DaGiMa_MDE_HW4_destTables.Properties._User__name,
			DaGiMa_MDE_HW4_destTables.Properties._Professor__news_posted,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._Professor__office_telephone,
			DaGiMa_MDE_HW4_destTables.Properties._Professor__orcid,
			DaGiMa_MDE_HW4_destTables.Properties._Professor__supervised_thesis,
			DaGiMa_MDE_HW4_destTables.Properties._User__surname,
			DaGiMa_MDE_HW4_destTables.Properties._Professor__taught_courses,
			DaGiMa_MDE_HW4_destTables.Properties._User__telephone
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Student = {
			DaGiMa_MDE_HW4_destTables.Properties._User__birth_date,
			DaGiMa_MDE_HW4_destTables.Properties._Student__booked_calls,
			DaGiMa_MDE_HW4_destTables.Properties._User__email,
			DaGiMa_MDE_HW4_destTables.Properties._Student__enrolled_courses,
			DaGiMa_MDE_HW4_destTables.Properties._User__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._User__surname,
			DaGiMa_MDE_HW4_destTables.Properties._User__telephone,
			DaGiMa_MDE_HW4_destTables.Properties._Student__thesis_defended,
			DaGiMa_MDE_HW4_destTables.Properties._Student__transcripts
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Thesis = {
			DaGiMa_MDE_HW4_destTables.Properties._Thesis__degree_course,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._Thesis__student,
			DaGiMa_MDE_HW4_destTables.Properties._Thesis__supervisor,
			DaGiMa_MDE_HW4_destTables.Properties._Thesis__title,
			DaGiMa_MDE_HW4_destTables.Properties._Thesis__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ThesisType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _University = {
			DaGiMa_MDE_HW4_destTables.Properties._University__departments,
			DaGiMa_MDE_HW4_destTables.Properties._University__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._University__rector
		};

		private static final ExecutorProperty /*@NonNull*/ [] _User = {
			DaGiMa_MDE_HW4_destTables.Properties._User__birth_date,
			DaGiMa_MDE_HW4_destTables.Properties._User__email,
			DaGiMa_MDE_HW4_destTables.Properties._User__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DaGiMa_MDE_HW4_destTables.Properties._User__surname,
			DaGiMa_MDE_HW4_destTables.Properties._User__telephone
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Career__Career.initProperties(_Career);
			Fragments._Container__Container.initProperties(_Container);
			Fragments._Course__Course.initProperties(_Course);
			Fragments._CreditType__CreditType.initProperties(_CreditType);
			Fragments._CustomEnumeration__CustomEnumeration.initProperties(_CustomEnumeration);
			Fragments._DegreeCourse__DegreeCourse.initProperties(_DegreeCourse);
			Fragments._Department__Department.initProperties(_Department);
			Fragments._ExamType__ExamType.initProperties(_ExamType);
			Fragments._ExaminationCall__ExaminationCall.initProperties(_ExaminationCall);
			Fragments._ExtraInfo__ExtraInfo.initProperties(_ExtraInfo);
			Fragments._MetadataType__MetadataType.initProperties(_MetadataType);
			Fragments._News__News.initProperties(_News);
			Fragments._PassingGrade__PassingGrade.initProperties(_PassingGrade);
			Fragments._Professor__Professor.initProperties(_Professor);
			Fragments._Student__Student.initProperties(_Student);
			Fragments._Thesis__Thesis.initProperties(_Thesis);
			Fragments._ThesisType__ThesisType.initProperties(_ThesisType);
			Fragments._University__University.initProperties(_University);
			Fragments._User__User.initProperties(_User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _CreditType__B = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.CREDIT_TYPE.getEEnumLiteral("B"), Types._CreditType, 0);
		public static final EcoreExecutorEnumerationLiteral _CreditType__C = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.CREDIT_TYPE.getEEnumLiteral("C"), Types._CreditType, 1);
		public static final EcoreExecutorEnumerationLiteral _CreditType__D = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.CREDIT_TYPE.getEEnumLiteral("D"), Types._CreditType, 2);
		public static final EcoreExecutorEnumerationLiteral _CreditType__E = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.CREDIT_TYPE.getEEnumLiteral("E"), Types._CreditType, 3);
		public static final EcoreExecutorEnumerationLiteral _CreditType__F = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.CREDIT_TYPE.getEEnumLiteral("F"), Types._CreditType, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CreditType = {
			_CreditType__B,
			_CreditType__C,
			_CreditType__D,
			_CreditType__E,
			_CreditType__F
		};

		public static final EcoreExecutorEnumerationLiteral _ExamType__WRITTEN = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.EXAM_TYPE.getEEnumLiteral("WRITTEN"), Types._ExamType, 0);
		public static final EcoreExecutorEnumerationLiteral _ExamType__ORAL = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.EXAM_TYPE.getEEnumLiteral("ORAL"), Types._ExamType, 1);
		public static final EcoreExecutorEnumerationLiteral _ExamType__PROJECT = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.EXAM_TYPE.getEEnumLiteral("PROJECT"), Types._ExamType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ExamType = {
			_ExamType__WRITTEN,
			_ExamType__ORAL,
			_ExamType__PROJECT
		};

		public static final EcoreExecutorEnumerationLiteral _MetadataType__STRING = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.METADATA_TYPE.getEEnumLiteral("STRING"), Types._MetadataType, 0);
		public static final EcoreExecutorEnumerationLiteral _MetadataType__INTEGER = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.METADATA_TYPE.getEEnumLiteral("INTEGER"), Types._MetadataType, 1);
		public static final EcoreExecutorEnumerationLiteral _MetadataType__BOOLEAN = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.METADATA_TYPE.getEEnumLiteral("BOOLEAN"), Types._MetadataType, 2);
		public static final EcoreExecutorEnumerationLiteral _MetadataType__FLOAT = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.METADATA_TYPE.getEEnumLiteral("FLOAT"), Types._MetadataType, 3);
		public static final EcoreExecutorEnumerationLiteral _MetadataType__DOUBLE = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.METADATA_TYPE.getEEnumLiteral("DOUBLE"), Types._MetadataType, 4);
		public static final EcoreExecutorEnumerationLiteral _MetadataType__ENUMERATION = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.METADATA_TYPE.getEEnumLiteral("ENUMERATION"), Types._MetadataType, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MetadataType = {
			_MetadataType__STRING,
			_MetadataType__INTEGER,
			_MetadataType__BOOLEAN,
			_MetadataType__FLOAT,
			_MetadataType__DOUBLE,
			_MetadataType__ENUMERATION
		};

		public static final EcoreExecutorEnumerationLiteral _ThesisType__COMPILATION = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.THESIS_TYPE.getEEnumLiteral("COMPILATION"), Types._ThesisType, 0);
		public static final EcoreExecutorEnumerationLiteral _ThesisType__EXPERIMENTAL = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.THESIS_TYPE.getEEnumLiteral("EXPERIMENTAL"), Types._ThesisType, 1);
		public static final EcoreExecutorEnumerationLiteral _ThesisType__PUBLICATION = new EcoreExecutorEnumerationLiteral(DaGiMa_MDE_HW4_destPackage.Literals.THESIS_TYPE.getEEnumLiteral("PUBLICATION"), Types._ThesisType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ThesisType = {
			_ThesisType__COMPILATION,
			_ThesisType__EXPERIMENTAL,
			_ThesisType__PUBLICATION
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._CreditType.initLiterals(_CreditType);
			Types._ExamType.initLiterals(_ExamType);
			Types._MetadataType.initLiterals(_MetadataType);
			Types._ThesisType.initLiterals(_ThesisType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DaGiMa_MDE_HW4_destTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DaGiMa_MDE_HW4_destTables();
	}

	private DaGiMa_MDE_HW4_destTables() {
		super(DaGiMa_MDE_HW4_destPackage.eNS_URI);
	}
}
