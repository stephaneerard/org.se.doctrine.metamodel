/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations.impl;

import doctrine.Class.Behaviors.BehaviorsPackage;

import doctrine.Class.Behaviors.impl.BehaviorsPackageImpl;

import doctrine.Class.Checks.ChecksPackage;

import doctrine.Class.Checks.impl.ChecksPackageImpl;

import doctrine.Class.ClassPackage;

import doctrine.Class.Columns.ColumnsPackage;

import doctrine.Class.Columns.impl.ColumnsPackageImpl;

import doctrine.Class.Indexes.IndexesPackage;

import doctrine.Class.Indexes.impl.IndexesPackageImpl;

import doctrine.Class.Inheritance.InheritancePackage;

import doctrine.Class.Inheritance.impl.InheritancePackageImpl;

import doctrine.Class.Listeners.ListenersPackage;

import doctrine.Class.Listeners.impl.ListenersPackageImpl;

import doctrine.Class.Options.OptionsPackage;

import doctrine.Class.Options.impl.OptionsPackageImpl;

import doctrine.Class.Relations.ManyToManyRelationType;
import doctrine.Class.Relations.OneToManyRelationType;
import doctrine.Class.Relations.OneToOneRelationType;
import doctrine.Class.Relations.Relation;
import doctrine.Class.Relations.RelationType;
import doctrine.Class.Relations.Relations;
import doctrine.Class.Relations.RelationsFactory;
import doctrine.Class.Relations.RelationsPackage;

import doctrine.Class.impl.ClassPackageImpl;

import doctrine.Common.CommonPackage;

import doctrine.Common.impl.CommonPackageImpl;

import doctrine.Connection.ConnectionPackage;

import doctrine.Connection.impl.ConnectionPackageImpl;

import doctrine.Package.PackagePackage;

import doctrine.Package.impl.PackagePackageImpl;

import doctrine.Scheme.SchemePackage;

import doctrine.Scheme.impl.SchemePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationsPackageImpl extends EPackageImpl implements RelationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToManyRelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToOneRelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToManyRelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databasE_LEVEL_CASCADINGEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicatioN_LEVEL_CASCADINGEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see doctrine.Class.Relations.RelationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationsPackageImpl() {
		super(eNS_URI, RelationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RelationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationsPackage init() {
		if (isInited) return (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);

		// Obtain or create and register package
		RelationsPackageImpl theRelationsPackage = (RelationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RelationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RelationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PackagePackageImpl thePackagePackage = (PackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) instanceof PackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) : PackagePackage.eINSTANCE);
		ClassPackageImpl theClassPackage = (ClassPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI) instanceof ClassPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI) : ClassPackage.eINSTANCE);
		BehaviorsPackageImpl theBehaviorsPackage = (BehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) instanceof BehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) : BehaviorsPackage.eINSTANCE);
		ColumnsPackageImpl theColumnsPackage = (ColumnsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI) instanceof ColumnsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI) : ColumnsPackage.eINSTANCE);
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI) instanceof OptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI) : OptionsPackage.eINSTANCE);
		ListenersPackageImpl theListenersPackage = (ListenersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) instanceof ListenersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) : ListenersPackage.eINSTANCE);
		IndexesPackageImpl theIndexesPackage = (IndexesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI) instanceof IndexesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI) : IndexesPackage.eINSTANCE);
		InheritancePackageImpl theInheritancePackage = (InheritancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI) instanceof InheritancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI) : InheritancePackage.eINSTANCE);
		ChecksPackageImpl theChecksPackage = (ChecksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI) instanceof ChecksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI) : ChecksPackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		SchemePackageImpl theSchemePackage = (SchemePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemePackage.eNS_URI) instanceof SchemePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemePackage.eNS_URI) : SchemePackage.eINSTANCE);

		// Create package meta-data objects
		theRelationsPackage.createPackageContents();
		thePackagePackage.createPackageContents();
		theClassPackage.createPackageContents();
		theBehaviorsPackage.createPackageContents();
		theColumnsPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theListenersPackage.createPackageContents();
		theIndexesPackage.createPackageContents();
		theInheritancePackage.createPackageContents();
		theChecksPackage.createPackageContents();
		theConnectionPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theSchemePackage.createPackageContents();

		// Initialize created meta-data
		theRelationsPackage.initializePackageContents();
		thePackagePackage.initializePackageContents();
		theClassPackage.initializePackageContents();
		theBehaviorsPackage.initializePackageContents();
		theColumnsPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theListenersPackage.initializePackageContents();
		theIndexesPackage.initializePackageContents();
		theInheritancePackage.initializePackageContents();
		theChecksPackage.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theSchemePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationsPackage.eNS_URI, theRelationsPackage);
		return theRelationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelations() {
		return relationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelations_Relations() {
		return (EReference)relationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Local() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Foreign() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Class() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_ForeignAlias() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_OwningSide() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Type() {
		return (EReference)relationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_OnDelete() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_OnUpdate() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Delete() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_ForeignKeyName() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToManyRelationType() {
		return oneToManyRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToOneRelationType() {
		return oneToOneRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToManyRelationType() {
		return manyToManyRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToManyRelationType_RefClass() {
		return (EReference)manyToManyRelationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToManyRelationType_Equals() {
		return (EAttribute)manyToManyRelationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationType() {
		return relationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDATABASE_LEVEL_CASCADING() {
		return databasE_LEVEL_CASCADINGEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAPPLICATION_LEVEL_CASCADING() {
		return applicatioN_LEVEL_CASCADINGEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationsFactory getRelationsFactory() {
		return (RelationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		relationsEClass = createEClass(RELATIONS);
		createEReference(relationsEClass, RELATIONS__RELATIONS);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__LOCAL);
		createEReference(relationEClass, RELATION__FOREIGN);
		createEReference(relationEClass, RELATION__CLASS);
		createEAttribute(relationEClass, RELATION__FOREIGN_ALIAS);
		createEAttribute(relationEClass, RELATION__OWNING_SIDE);
		createEReference(relationEClass, RELATION__TYPE);
		createEAttribute(relationEClass, RELATION__ON_DELETE);
		createEAttribute(relationEClass, RELATION__ON_UPDATE);
		createEAttribute(relationEClass, RELATION__DELETE);
		createEAttribute(relationEClass, RELATION__FOREIGN_KEY_NAME);

		oneToManyRelationTypeEClass = createEClass(ONE_TO_MANY_RELATION_TYPE);

		oneToOneRelationTypeEClass = createEClass(ONE_TO_ONE_RELATION_TYPE);

		manyToManyRelationTypeEClass = createEClass(MANY_TO_MANY_RELATION_TYPE);
		createEReference(manyToManyRelationTypeEClass, MANY_TO_MANY_RELATION_TYPE__REF_CLASS);
		createEAttribute(manyToManyRelationTypeEClass, MANY_TO_MANY_RELATION_TYPE__EQUALS);

		relationTypeEClass = createEClass(RELATION_TYPE);

		// Create enums
		databasE_LEVEL_CASCADINGEEnum = createEEnum(DATABASE_LEVEL_CASCADING);
		applicatioN_LEVEL_CASCADINGEEnum = createEEnum(APPLICATION_LEVEL_CASCADING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		ColumnsPackage theColumnsPackage = (ColumnsPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI);
		ClassPackage theClassPackage = (ClassPackage)EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationEClass.getESuperTypes().add(theCommonPackage.getNamedElement());
		oneToManyRelationTypeEClass.getESuperTypes().add(this.getRelationType());
		oneToOneRelationTypeEClass.getESuperTypes().add(this.getRelationType());
		manyToManyRelationTypeEClass.getESuperTypes().add(this.getRelationType());

		// Initialize classes and features; add operations and parameters
		initEClass(relationsEClass, Relations.class, "Relations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelations_Relations(), this.getRelation(), null, "relations", null, 0, -1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Local(), theColumnsPackage.getIntegerColumn(), null, "local", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Foreign(), theColumnsPackage.getIntegerColumn(), null, "foreign", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Class(), theClassPackage.getClass_(), null, "class", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_ForeignAlias(), ecorePackage.getEString(), "foreignAlias", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_OwningSide(), ecorePackage.getEBoolean(), "owningSide", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Type(), this.getRelationType(), null, "type", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_OnDelete(), this.getDATABASE_LEVEL_CASCADING(), "onDelete", "", 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_OnUpdate(), this.getDATABASE_LEVEL_CASCADING(), "onUpdate", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Delete(), this.getAPPLICATION_LEVEL_CASCADING(), "delete", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_ForeignKeyName(), ecorePackage.getEString(), "foreignKeyName", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToManyRelationTypeEClass, OneToManyRelationType.class, "OneToManyRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oneToOneRelationTypeEClass, OneToOneRelationType.class, "OneToOneRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manyToManyRelationTypeEClass, ManyToManyRelationType.class, "ManyToManyRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManyToManyRelationType_RefClass(), theClassPackage.getClass_(), null, "refClass", null, 1, 1, ManyToManyRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToManyRelationType_Equals(), ecorePackage.getEBoolean(), "equals", null, 0, 1, ManyToManyRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationTypeEClass, RelationType.class, "RelationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(databasE_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.DATABASE_LEVEL_CASCADING.class, "DATABASE_LEVEL_CASCADING");
		addEEnumLiteral(databasE_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.DATABASE_LEVEL_CASCADING.NONE);
		addEEnumLiteral(databasE_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.DATABASE_LEVEL_CASCADING.CASCADE);
		addEEnumLiteral(databasE_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.DATABASE_LEVEL_CASCADING.SET_NULL);
		addEEnumLiteral(databasE_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.DATABASE_LEVEL_CASCADING.NO_ACTION);
		addEEnumLiteral(databasE_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.DATABASE_LEVEL_CASCADING.RESTRICT);
		addEEnumLiteral(databasE_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.DATABASE_LEVEL_CASCADING.SET_DEFAULT);

		initEEnum(applicatioN_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING.class, "APPLICATION_LEVEL_CASCADING");
		addEEnumLiteral(applicatioN_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING.NONE);
		addEEnumLiteral(applicatioN_LEVEL_CASCADINGEEnum, doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING.DELETE);
	}

} //RelationsPackageImpl
