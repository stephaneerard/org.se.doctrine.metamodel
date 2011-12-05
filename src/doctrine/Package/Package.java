/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Package;

import doctrine.Common.NamedElement;

import doctrine.Connection.ConnectableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Package.Package#getCustom_path <em>Custom path</em>}</li>
 *   <li>{@link doctrine.Package.Package#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Package.PackagePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ConnectableElement, NamedElement, AbstractContainer {
	/**
	 * Returns the value of the '<em><b>Custom path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom path</em>' attribute.
	 * @see #setCustom_path(String)
	 * @see doctrine.Package.PackagePackage#getPackage_Custom_path()
	 * @model
	 * @generated
	 */
	String getCustom_path();

	/**
	 * Sets the value of the '{@link doctrine.Package.Package#getCustom_path <em>Custom path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom path</em>' attribute.
	 * @see #getCustom_path()
	 * @generated
	 */
	void setCustom_path(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link doctrine.Package.AbstractContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AbstractContainer)
	 * @see doctrine.Package.PackagePackage#getPackage_Parent()
	 * @see doctrine.Package.AbstractContainer#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	AbstractContainer getParent();

	/**
	 * Sets the value of the '{@link doctrine.Package.Package#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractContainer value);

} // Package
