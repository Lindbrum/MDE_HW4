/**
 */
package daGiMa_MDE_HW4_dest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_dest.CustomEnumeration#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.CustomEnumeration#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCustomEnumeration()
 * @model
 * @generated
 */
public interface CustomEnumeration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCustomEnumeration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.CustomEnumeration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCustomEnumeration_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValues();

} // CustomEnumeration
