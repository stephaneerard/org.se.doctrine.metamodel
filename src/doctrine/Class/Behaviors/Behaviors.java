/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Behaviors.Behaviors#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Behaviors.BehaviorsPackage#getBehaviors()
 * @model
 * @generated
 */
public interface Behaviors extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Behaviors.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see doctrine.Class.Behaviors.BehaviorsPackage#getBehaviors_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

} // Behaviors
