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
 * A representation of the model object '<em><b>Array Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Behaviors.ArrayOption#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Behaviors.BehaviorsPackage#getArrayOption()
 * @model
 * @generated
 */
public interface ArrayOption extends LeafOption {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Behaviors.ArrayValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see doctrine.Class.Behaviors.BehaviorsPackage#getArrayOption_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayValue> getValues();

} // ArrayOption
