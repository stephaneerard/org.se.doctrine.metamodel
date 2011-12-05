/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Behaviors.IntegerOption#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Behaviors.BehaviorsPackage#getIntegerOption()
 * @model
 * @generated
 */
public interface IntegerOption extends LeafOption {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see doctrine.Class.Behaviors.BehaviorsPackage#getIntegerOption_Value()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link doctrine.Class.Behaviors.IntegerOption#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

} // IntegerOption
