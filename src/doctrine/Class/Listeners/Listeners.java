/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Listeners;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listeners</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Listeners.Listeners#getListeners <em>Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Listeners.ListenersPackage#getListeners()
 * @model
 * @generated
 */
public interface Listeners extends EObject {
	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Listeners.Listener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference list.
	 * @see doctrine.Class.Listeners.ListenersPackage#getListeners_Listeners()
	 * @model containment="true"
	 * @generated
	 */
	EList<Listener> getListeners();

} // Listeners
