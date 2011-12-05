/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Inheritance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Inheritance.Inheritance#getClass_ <em>Class</em>}</li>
 *   <li>{@link doctrine.Class.Inheritance.Inheritance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Inheritance.InheritancePackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link doctrine.Class.Class#getExtendedBy <em>Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(doctrine.Class.Class)
	 * @see doctrine.Class.Inheritance.InheritancePackage#getInheritance_Class()
	 * @see doctrine.Class.Class#getExtendedBy
	 * @model opposite="extendedBy"
	 * @generated
	 */
	doctrine.Class.Class getClass_();

	/**
	 * Sets the value of the '{@link doctrine.Class.Inheritance.Inheritance#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(doctrine.Class.Class value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see doctrine.Class.Inheritance.InheritancePackage#getInheritance_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link doctrine.Class.Inheritance.Inheritance#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Inheritance
