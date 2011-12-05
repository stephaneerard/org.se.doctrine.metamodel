/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Scheme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Scheme.SchemePackage
 * @generated
 */
public interface SchemeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemeFactory eINSTANCE = doctrine.Scheme.impl.SchemeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheme</em>'.
	 * @generated
	 */
	Scheme createScheme();

	/**
	 * Returns a new object of class '<em>Globals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Globals</em>'.
	 * @generated
	 */
	Globals createGlobals();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchemePackage getSchemePackage();

} //SchemeFactory
