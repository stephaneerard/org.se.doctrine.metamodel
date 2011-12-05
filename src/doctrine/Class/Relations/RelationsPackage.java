/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations;

import doctrine.Common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see doctrine.Class.Relations.RelationsFactory
 * @model kind="package"
 * @generated
 */
public interface RelationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Relations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Class/Relations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationsPackage eINSTANCE = doctrine.Class.Relations.impl.RelationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Class.Relations.impl.RelationsImpl <em>Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Relations.impl.RelationsImpl
	 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getRelations()
	 * @generated
	 */
	int RELATIONS = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__RELATIONS = 0;

	/**
	 * The number of structural features of the '<em>Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Relations.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Relations.impl.RelationImpl
	 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Local</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LOCAL = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FOREIGN = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CLASS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Foreign Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FOREIGN_ALIAS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OWNING_SIDE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ON_DELETE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>On Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ON_UPDATE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DELETE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Foreign Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FOREIGN_KEY_NAME = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link doctrine.Class.Relations.impl.RelationTypeImpl <em>Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Relations.impl.RelationTypeImpl
	 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Relations.impl.OneToManyRelationTypeImpl <em>One To Many Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Relations.impl.OneToManyRelationTypeImpl
	 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getOneToManyRelationType()
	 * @generated
	 */
	int ONE_TO_MANY_RELATION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>One To Many Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_TYPE_FEATURE_COUNT = RELATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Relations.impl.OneToOneRelationTypeImpl <em>One To One Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Relations.impl.OneToOneRelationTypeImpl
	 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getOneToOneRelationType()
	 * @generated
	 */
	int ONE_TO_ONE_RELATION_TYPE = 3;

	/**
	 * The number of structural features of the '<em>One To One Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_TYPE_FEATURE_COUNT = RELATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Relations.impl.ManyToManyRelationTypeImpl <em>Many To Many Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Relations.impl.ManyToManyRelationTypeImpl
	 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getManyToManyRelationType()
	 * @generated
	 */
	int MANY_TO_MANY_RELATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Ref Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_TYPE__REF_CLASS = RELATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_TYPE__EQUALS = RELATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Many To Many Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_TYPE_FEATURE_COUNT = RELATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link doctrine.Class.Relations.DATABASE_LEVEL_CASCADING <em>DATABASE LEVEL CASCADING</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Relations.DATABASE_LEVEL_CASCADING
	 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getDATABASE_LEVEL_CASCADING()
	 * @generated
	 */
	int DATABASE_LEVEL_CASCADING = 6;

	/**
	 * The meta object id for the '{@link doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING <em>APPLICATION LEVEL CASCADING</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING
	 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getAPPLICATION_LEVEL_CASCADING()
	 * @generated
	 */
	int APPLICATION_LEVEL_CASCADING = 7;


	/**
	 * Returns the meta object for class '{@link doctrine.Class.Relations.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relations</em>'.
	 * @see doctrine.Class.Relations.Relations
	 * @generated
	 */
	EClass getRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Relations.Relations#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see doctrine.Class.Relations.Relations#getRelations()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_Relations();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Relations.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see doctrine.Class.Relations.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Class.Relations.Relation#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local</em>'.
	 * @see doctrine.Class.Relations.Relation#getLocal()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Local();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Class.Relations.Relation#getForeign <em>Foreign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign</em>'.
	 * @see doctrine.Class.Relations.Relation#getForeign()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Foreign();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Class.Relations.Relation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see doctrine.Class.Relations.Relation#getClass_()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Class();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Relations.Relation#getForeignAlias <em>Foreign Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Alias</em>'.
	 * @see doctrine.Class.Relations.Relation#getForeignAlias()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_ForeignAlias();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Relations.Relation#isOwningSide <em>Owning Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Side</em>'.
	 * @see doctrine.Class.Relations.Relation#isOwningSide()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_OwningSide();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Relations.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see doctrine.Class.Relations.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Relations.Relation#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see doctrine.Class.Relations.Relation#getOnDelete()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_OnDelete();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Relations.Relation#getOnUpdate <em>On Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update</em>'.
	 * @see doctrine.Class.Relations.Relation#getOnUpdate()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_OnUpdate();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Relations.Relation#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see doctrine.Class.Relations.Relation#getDelete()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Delete();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Relations.Relation#getForeignKeyName <em>Foreign Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key Name</em>'.
	 * @see doctrine.Class.Relations.Relation#getForeignKeyName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_ForeignKeyName();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Relations.OneToManyRelationType <em>One To Many Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many Relation Type</em>'.
	 * @see doctrine.Class.Relations.OneToManyRelationType
	 * @generated
	 */
	EClass getOneToManyRelationType();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Relations.OneToOneRelationType <em>One To One Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One Relation Type</em>'.
	 * @see doctrine.Class.Relations.OneToOneRelationType
	 * @generated
	 */
	EClass getOneToOneRelationType();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Relations.ManyToManyRelationType <em>Many To Many Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many Relation Type</em>'.
	 * @see doctrine.Class.Relations.ManyToManyRelationType
	 * @generated
	 */
	EClass getManyToManyRelationType();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Class.Relations.ManyToManyRelationType#getRefClass <em>Ref Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Class</em>'.
	 * @see doctrine.Class.Relations.ManyToManyRelationType#getRefClass()
	 * @see #getManyToManyRelationType()
	 * @generated
	 */
	EReference getManyToManyRelationType_RefClass();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Relations.ManyToManyRelationType#isEquals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equals</em>'.
	 * @see doctrine.Class.Relations.ManyToManyRelationType#isEquals()
	 * @see #getManyToManyRelationType()
	 * @generated
	 */
	EAttribute getManyToManyRelationType_Equals();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Relations.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Type</em>'.
	 * @see doctrine.Class.Relations.RelationType
	 * @generated
	 */
	EClass getRelationType();

	/**
	 * Returns the meta object for enum '{@link doctrine.Class.Relations.DATABASE_LEVEL_CASCADING <em>DATABASE LEVEL CASCADING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DATABASE LEVEL CASCADING</em>'.
	 * @see doctrine.Class.Relations.DATABASE_LEVEL_CASCADING
	 * @generated
	 */
	EEnum getDATABASE_LEVEL_CASCADING();

	/**
	 * Returns the meta object for enum '{@link doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING <em>APPLICATION LEVEL CASCADING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>APPLICATION LEVEL CASCADING</em>'.
	 * @see doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING
	 * @generated
	 */
	EEnum getAPPLICATION_LEVEL_CASCADING();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationsFactory getRelationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link doctrine.Class.Relations.impl.RelationsImpl <em>Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Relations.impl.RelationsImpl
		 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getRelations()
		 * @generated
		 */
		EClass RELATIONS = eINSTANCE.getRelations();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__RELATIONS = eINSTANCE.getRelations_Relations();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Relations.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Relations.impl.RelationImpl
		 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__LOCAL = eINSTANCE.getRelation_Local();

		/**
		 * The meta object literal for the '<em><b>Foreign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__FOREIGN = eINSTANCE.getRelation_Foreign();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__CLASS = eINSTANCE.getRelation_Class();

		/**
		 * The meta object literal for the '<em><b>Foreign Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__FOREIGN_ALIAS = eINSTANCE.getRelation_ForeignAlias();

		/**
		 * The meta object literal for the '<em><b>Owning Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__OWNING_SIDE = eINSTANCE.getRelation_OwningSide();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '<em><b>On Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__ON_DELETE = eINSTANCE.getRelation_OnDelete();

		/**
		 * The meta object literal for the '<em><b>On Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__ON_UPDATE = eINSTANCE.getRelation_OnUpdate();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__DELETE = eINSTANCE.getRelation_Delete();

		/**
		 * The meta object literal for the '<em><b>Foreign Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__FOREIGN_KEY_NAME = eINSTANCE.getRelation_ForeignKeyName();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Relations.impl.OneToManyRelationTypeImpl <em>One To Many Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Relations.impl.OneToManyRelationTypeImpl
		 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getOneToManyRelationType()
		 * @generated
		 */
		EClass ONE_TO_MANY_RELATION_TYPE = eINSTANCE.getOneToManyRelationType();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Relations.impl.OneToOneRelationTypeImpl <em>One To One Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Relations.impl.OneToOneRelationTypeImpl
		 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getOneToOneRelationType()
		 * @generated
		 */
		EClass ONE_TO_ONE_RELATION_TYPE = eINSTANCE.getOneToOneRelationType();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Relations.impl.ManyToManyRelationTypeImpl <em>Many To Many Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Relations.impl.ManyToManyRelationTypeImpl
		 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getManyToManyRelationType()
		 * @generated
		 */
		EClass MANY_TO_MANY_RELATION_TYPE = eINSTANCE.getManyToManyRelationType();

		/**
		 * The meta object literal for the '<em><b>Ref Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_MANY_RELATION_TYPE__REF_CLASS = eINSTANCE.getManyToManyRelationType_RefClass();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY_RELATION_TYPE__EQUALS = eINSTANCE.getManyToManyRelationType_Equals();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Relations.impl.RelationTypeImpl <em>Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Relations.impl.RelationTypeImpl
		 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getRelationType()
		 * @generated
		 */
		EClass RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Relations.DATABASE_LEVEL_CASCADING <em>DATABASE LEVEL CASCADING</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Relations.DATABASE_LEVEL_CASCADING
		 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getDATABASE_LEVEL_CASCADING()
		 * @generated
		 */
		EEnum DATABASE_LEVEL_CASCADING = eINSTANCE.getDATABASE_LEVEL_CASCADING();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING <em>APPLICATION LEVEL CASCADING</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING
		 * @see doctrine.Class.Relations.impl.RelationsPackageImpl#getAPPLICATION_LEVEL_CASCADING()
		 * @generated
		 */
		EEnum APPLICATION_LEVEL_CASCADING = eINSTANCE.getAPPLICATION_LEVEL_CASCADING();

	}

} //RelationsPackage
