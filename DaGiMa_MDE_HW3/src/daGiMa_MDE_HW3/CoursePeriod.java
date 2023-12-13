/**
 */
package daGiMa_MDE_HW3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Period</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getCoursePeriod()
 * @model
 * @generated
 */
public enum CoursePeriod implements Enumerator {
	/**
	 * The '<em><b>FIRST SEMESTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_SEMESTER_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_SEMESTER(0, "FIRST_SEMESTER", "FIRST_SEMESTER"),

	/**
	 * The '<em><b>SECOND SEMESTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_SEMESTER_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_SEMESTER(1, "SECOND_SEMESTER", "SECOND_SEMESTER");

	/**
	 * The '<em><b>FIRST SEMESTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_SEMESTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_SEMESTER_VALUE = 0;

	/**
	 * The '<em><b>SECOND SEMESTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_SEMESTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_SEMESTER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Course Period</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CoursePeriod[] VALUES_ARRAY =
		new CoursePeriod[] {
			FIRST_SEMESTER,
			SECOND_SEMESTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Course Period</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CoursePeriod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Period</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoursePeriod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoursePeriod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Period</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoursePeriod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoursePeriod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Period</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoursePeriod get(int value) {
		switch (value) {
			case FIRST_SEMESTER_VALUE: return FIRST_SEMESTER;
			case SECOND_SEMESTER_VALUE: return SECOND_SEMESTER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CoursePeriod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CoursePeriod