/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Behaviors.IntermediateOption#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Behaviors.BehaviorsPackage#getIntermediateOption()
 * @model
 * @generated
 */
public interface IntermediateOption extends Option {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Behaviors.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see doctrine.Class.Behaviors.BehaviorsPackage#getIntermediateOption_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getChildren();

} // IntermediateOption
