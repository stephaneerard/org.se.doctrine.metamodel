/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Checks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Checks.Checks#getChecks <em>Checks</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Checks.ChecksPackage#getChecks()
 * @model
 * @generated
 */
public interface Checks extends EObject {
	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Checks.Check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference list.
	 * @see doctrine.Class.Checks.ChecksPackage#getChecks_Checks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Check> getChecks();

} // Checks
