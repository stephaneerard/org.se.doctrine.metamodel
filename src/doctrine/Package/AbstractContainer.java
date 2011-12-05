/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Package;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Package.AbstractContainer#getChildren <em>Children</em>}</li>
 *   <li>{@link doctrine.Package.AbstractContainer#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Package.PackagePackage#getAbstractContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Package.Package}.
	 * It is bidirectional and its opposite is '{@link doctrine.Package.Package#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see doctrine.Package.PackagePackage#getAbstractContainer_Children()
	 * @see doctrine.Package.Package#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<doctrine.Package.Package> getChildren();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Class}.
	 * It is bidirectional and its opposite is '{@link doctrine.Class.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see doctrine.Package.PackagePackage#getAbstractContainer_Classes()
	 * @see doctrine.Class.Class#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<doctrine.Class.Class> getClasses();

} // AbstractContainer
