/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors;

import doctrine.Common.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Behaviors.Behavior#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Behaviors.BehaviorsPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Behaviors.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see doctrine.Class.Behaviors.BehaviorsPackage#getBehavior_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // Behavior
