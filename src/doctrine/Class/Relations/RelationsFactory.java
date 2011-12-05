/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Relations.RelationsPackage
 * @generated
 */
public interface RelationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationsFactory eINSTANCE = doctrine.Class.Relations.impl.RelationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Relations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relations</em>'.
	 * @generated
	 */
	Relations createRelations();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>One To Many Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One To Many Relation Type</em>'.
	 * @generated
	 */
	OneToManyRelationType createOneToManyRelationType();

	/**
	 * Returns a new object of class '<em>One To One Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One To One Relation Type</em>'.
	 * @generated
	 */
	OneToOneRelationType createOneToOneRelationType();

	/**
	 * Returns a new object of class '<em>Many To Many Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many To Many Relation Type</em>'.
	 * @generated
	 */
	ManyToManyRelationType createManyToManyRelationType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RelationsPackage getRelationsPackage();

} //RelationsFactory
