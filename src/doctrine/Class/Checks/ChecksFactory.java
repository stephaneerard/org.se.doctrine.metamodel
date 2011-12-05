/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Checks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Checks.ChecksPackage
 * @generated
 */
public interface ChecksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChecksFactory eINSTANCE = doctrine.Class.Checks.impl.ChecksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Checks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checks</em>'.
	 * @generated
	 */
	Checks createChecks();

	/**
	 * Returns a new object of class '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check</em>'.
	 * @generated
	 */
	Check createCheck();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChecksPackage getChecksPackage();

} //ChecksFactory
