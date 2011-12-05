/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Listeners;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Listeners.ListenersPackage
 * @generated
 */
public interface ListenersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListenersFactory eINSTANCE = doctrine.Class.Listeners.impl.ListenersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Listeners</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listeners</em>'.
	 * @generated
	 */
	Listeners createListeners();

	/**
	 * Returns a new object of class '<em>Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listener</em>'.
	 * @generated
	 */
	Listener createListener();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ListenersPackage getListenersPackage();

} //ListenersFactory
