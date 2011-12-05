/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Indexes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Indexes.IndexesPackage
 * @generated
 */
public interface IndexesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IndexesFactory eINSTANCE = doctrine.Class.Indexes.impl.IndexesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Indexes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indexes</em>'.
	 * @generated
	 */
	Indexes createIndexes();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	Index createIndex();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IndexesPackage getIndexesPackage();

} //IndexesFactory
