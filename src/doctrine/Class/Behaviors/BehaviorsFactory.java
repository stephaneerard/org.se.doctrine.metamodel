/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Behaviors.BehaviorsPackage
 * @generated
 */
public interface BehaviorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorsFactory eINSTANCE = doctrine.Class.Behaviors.impl.BehaviorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behaviors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviors</em>'.
	 * @generated
	 */
	Behaviors createBehaviors();

	/**
	 * Returns a new object of class '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior</em>'.
	 * @generated
	 */
	Behavior createBehavior();

	/**
	 * Returns a new object of class '<em>Intermediate Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Option</em>'.
	 * @generated
	 */
	IntermediateOption createIntermediateOption();

	/**
	 * Returns a new object of class '<em>Integer Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Option</em>'.
	 * @generated
	 */
	IntegerOption createIntegerOption();

	/**
	 * Returns a new object of class '<em>Array Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Option</em>'.
	 * @generated
	 */
	ArrayOption createArrayOption();

	/**
	 * Returns a new object of class '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Value</em>'.
	 * @generated
	 */
	ArrayValue createArrayValue();

	/**
	 * Returns a new object of class '<em>String Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Option</em>'.
	 * @generated
	 */
	StringOption createStringOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviorsPackage getBehaviorsPackage();

} //BehaviorsFactory
