/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Inheritance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Inheritance.InheritancePackage
 * @generated
 */
public interface InheritanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InheritanceFactory eINSTANCE = doctrine.Class.Inheritance.impl.InheritanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance</em>'.
	 * @generated
	 */
	Inheritance createInheritance();

	/**
	 * Returns a new object of class '<em>Simple Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Inheritance</em>'.
	 * @generated
	 */
	SimpleInheritance createSimpleInheritance();

	/**
	 * Returns a new object of class '<em>Concrete Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Inheritance</em>'.
	 * @generated
	 */
	ConcreteInheritance createConcreteInheritance();

	/**
	 * Returns a new object of class '<em>Column Aggregation Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Aggregation Inheritance</em>'.
	 * @generated
	 */
	ColumnAggregationInheritance createColumnAggregationInheritance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InheritancePackage getInheritancePackage();

} //InheritanceFactory
