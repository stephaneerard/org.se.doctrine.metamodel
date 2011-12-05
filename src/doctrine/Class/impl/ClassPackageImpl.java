/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.impl;

import doctrine.Class.Behaviors.BehaviorsPackage;

import doctrine.Class.Behaviors.impl.BehaviorsPackageImpl;

import doctrine.Class.Checks.ChecksPackage;

import doctrine.Class.Checks.impl.ChecksPackageImpl;

import doctrine.Class.ClassFactory;
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

import doctrine.Class.Relations.RelationsPackage;

import doctrine.Class.Relations.impl.RelationsPackageImpl;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassPackageImpl extends EPackageImpl implements ClassPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

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
	 * @see doctrine.Class.ClassPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassPackageImpl() {
		super(eNS_URI, ClassFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClassPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassPackage init() {
		if (isInited) return (ClassPackage)EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI);

		// Obtain or create and register package
		ClassPackageImpl theClassPackage = (ClassPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PackagePackageImpl thePackagePackage = (PackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) instanceof PackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) : PackagePackage.eINSTANCE);
		BehaviorsPackageImpl theBehaviorsPackage = (BehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) instanceof BehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) : BehaviorsPackage.eINSTANCE);
		ColumnsPackageImpl theColumnsPackage = (ColumnsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI) instanceof ColumnsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI) : ColumnsPackage.eINSTANCE);
		RelationsPackageImpl theRelationsPackage = (RelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI) instanceof RelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI) : RelationsPackage.eINSTANCE);
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI) instanceof OptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI) : OptionsPackage.eINSTANCE);
		ListenersPackageImpl theListenersPackage = (ListenersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) instanceof ListenersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) : ListenersPackage.eINSTANCE);
		IndexesPackageImpl theIndexesPackage = (IndexesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI) instanceof IndexesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI) : IndexesPackage.eINSTANCE);
		InheritancePackageImpl theInheritancePackage = (InheritancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI) instanceof InheritancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI) : InheritancePackage.eINSTANCE);
		ChecksPackageImpl theChecksPackage = (ChecksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI) instanceof ChecksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI) : ChecksPackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		SchemePackageImpl theSchemePackage = (SchemePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemePackage.eNS_URI) instanceof SchemePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemePackage.eNS_URI) : SchemePackage.eINSTANCE);

		// Create package meta-data objects
		theClassPackage.createPackageContents();
		thePackagePackage.createPackageContents();
		theBehaviorsPackage.createPackageContents();
		theColumnsPackage.createPackageContents();
		theRelationsPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theListenersPackage.createPackageContents();
		theIndexesPackage.createPackageContents();
		theInheritancePackage.createPackageContents();
		theChecksPackage.createPackageContents();
		theConnectionPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theSchemePackage.createPackageContents();

		// Initialize created meta-data
		theClassPackage.initializePackageContents();
		thePackagePackage.initializePackageContents();
		theBehaviorsPackage.initializePackageContents();
		theColumnsPackage.initializePackageContents();
		theRelationsPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theListenersPackage.initializePackageContents();
		theIndexesPackage.initializePackageContents();
		theInheritancePackage.initializePackageContents();
		theChecksPackage.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theSchemePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassPackage.eNS_URI, theClassPackage);
		return theClassPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Behaviors() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Columns() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_TableName() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Package() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Options() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Listeners() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Inheritance() {
		return (EReference)classEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Indexes() {
		return (EReference)classEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_ExtendedBy() {
		return (EReference)classEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Checks() {
		return (EReference)classEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Relations() {
		return (EReference)classEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassFactory getClassFactory() {
		return (ClassFactory)getEFactoryInstance();
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
		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__BEHAVIORS);
		createEReference(classEClass, CLASS__COLUMNS);
		createEAttribute(classEClass, CLASS__TABLE_NAME);
		createEReference(classEClass, CLASS__PACKAGE);
		createEReference(classEClass, CLASS__OPTIONS);
		createEReference(classEClass, CLASS__LISTENERS);
		createEReference(classEClass, CLASS__INHERITANCE);
		createEReference(classEClass, CLASS__INDEXES);
		createEReference(classEClass, CLASS__EXTENDED_BY);
		createEReference(classEClass, CLASS__CHECKS);
		createEReference(classEClass, CLASS__RELATIONS);
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
		BehaviorsPackage theBehaviorsPackage = (BehaviorsPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI);
		ColumnsPackage theColumnsPackage = (ColumnsPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI);
		RelationsPackage theRelationsPackage = (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);
		OptionsPackage theOptionsPackage = (OptionsPackage)EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);
		ListenersPackage theListenersPackage = (ListenersPackage)EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI);
		IndexesPackage theIndexesPackage = (IndexesPackage)EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI);
		InheritancePackage theInheritancePackage = (InheritancePackage)EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI);
		ChecksPackage theChecksPackage = (ChecksPackage)EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		ConnectionPackage theConnectionPackage = (ConnectionPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI);
		PackagePackage thePackagePackage = (PackagePackage)EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBehaviorsPackage);
		getESubpackages().add(theColumnsPackage);
		getESubpackages().add(theRelationsPackage);
		getESubpackages().add(theOptionsPackage);
		getESubpackages().add(theListenersPackage);
		getESubpackages().add(theIndexesPackage);
		getESubpackages().add(theInheritancePackage);
		getESubpackages().add(theChecksPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classEClass.getESuperTypes().add(theCommonPackage.getNamedElement());
		classEClass.getESuperTypes().add(theConnectionPackage.getConnectableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(classEClass, doctrine.Class.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Behaviors(), theBehaviorsPackage.getBehaviors(), null, "behaviors", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Columns(), theColumnsPackage.getColumns(), null, "columns", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Package(), thePackagePackage.getAbstractContainer(), thePackagePackage.getAbstractContainer_Classes(), "package", null, 1, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Options(), theOptionsPackage.getOptions(), null, "options", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Listeners(), theListenersPackage.getListeners(), null, "listeners", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Inheritance(), theInheritancePackage.getInheritance(), null, "inheritance", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Indexes(), theIndexesPackage.getIndexes(), null, "indexes", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_ExtendedBy(), theInheritancePackage.getInheritance(), theInheritancePackage.getInheritance_Class(), "extendedBy", null, 0, -1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Checks(), theChecksPackage.getChecks(), null, "checks", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Relations(), theRelationsPackage.getRelations(), null, "relations", null, 0, 1, doctrine.Class.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ClassPackageImpl
