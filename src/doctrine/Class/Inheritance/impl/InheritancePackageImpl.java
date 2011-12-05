/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Inheritance.impl;

import doctrine.Class.Behaviors.BehaviorsPackage;

import doctrine.Class.Behaviors.impl.BehaviorsPackageImpl;

import doctrine.Class.Checks.ChecksPackage;

import doctrine.Class.Checks.impl.ChecksPackageImpl;

import doctrine.Class.ClassPackage;

import doctrine.Class.Columns.ColumnsPackage;

import doctrine.Class.Columns.impl.ColumnsPackageImpl;

import doctrine.Class.Indexes.IndexesPackage;

import doctrine.Class.Indexes.impl.IndexesPackageImpl;

import doctrine.Class.Inheritance.ColumnAggregationInheritance;
import doctrine.Class.Inheritance.ConcreteInheritance;
import doctrine.Class.Inheritance.Inheritance;
import doctrine.Class.Inheritance.InheritanceFactory;
import doctrine.Class.Inheritance.InheritancePackage;
import doctrine.Class.Inheritance.SimpleInheritance;
import doctrine.Class.Inheritance.Type;

import doctrine.Class.Listeners.ListenersPackage;

import doctrine.Class.Listeners.impl.ListenersPackageImpl;

import doctrine.Class.Options.OptionsPackage;

import doctrine.Class.Options.impl.OptionsPackageImpl;

import doctrine.Class.Relations.RelationsPackage;

import doctrine.Class.Relations.impl.RelationsPackageImpl;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritancePackageImpl extends EPackageImpl implements InheritancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnAggregationInheritanceEClass = null;

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
	 * @see doctrine.Class.Inheritance.InheritancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InheritancePackageImpl() {
		super(eNS_URI, InheritanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InheritancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InheritancePackage init() {
		if (isInited) return (InheritancePackage)EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI);

		// Obtain or create and register package
		InheritancePackageImpl theInheritancePackage = (InheritancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InheritancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InheritancePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PackagePackageImpl thePackagePackage = (PackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) instanceof PackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) : PackagePackage.eINSTANCE);
		ClassPackageImpl theClassPackage = (ClassPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI) instanceof ClassPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI) : ClassPackage.eINSTANCE);
		BehaviorsPackageImpl theBehaviorsPackage = (BehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) instanceof BehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) : BehaviorsPackage.eINSTANCE);
		ColumnsPackageImpl theColumnsPackage = (ColumnsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI) instanceof ColumnsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI) : ColumnsPackage.eINSTANCE);
		RelationsPackageImpl theRelationsPackage = (RelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI) instanceof RelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI) : RelationsPackage.eINSTANCE);
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI) instanceof OptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI) : OptionsPackage.eINSTANCE);
		ListenersPackageImpl theListenersPackage = (ListenersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) instanceof ListenersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) : ListenersPackage.eINSTANCE);
		IndexesPackageImpl theIndexesPackage = (IndexesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI) instanceof IndexesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI) : IndexesPackage.eINSTANCE);
		ChecksPackageImpl theChecksPackage = (ChecksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI) instanceof ChecksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI) : ChecksPackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		SchemePackageImpl theSchemePackage = (SchemePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemePackage.eNS_URI) instanceof SchemePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemePackage.eNS_URI) : SchemePackage.eINSTANCE);

		// Create package meta-data objects
		theInheritancePackage.createPackageContents();
		thePackagePackage.createPackageContents();
		theClassPackage.createPackageContents();
		theBehaviorsPackage.createPackageContents();
		theColumnsPackage.createPackageContents();
		theRelationsPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theListenersPackage.createPackageContents();
		theIndexesPackage.createPackageContents();
		theChecksPackage.createPackageContents();
		theConnectionPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theSchemePackage.createPackageContents();

		// Initialize created meta-data
		theInheritancePackage.initializePackageContents();
		thePackagePackage.initializePackageContents();
		theClassPackage.initializePackageContents();
		theBehaviorsPackage.initializePackageContents();
		theColumnsPackage.initializePackageContents();
		theRelationsPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theListenersPackage.initializePackageContents();
		theIndexesPackage.initializePackageContents();
		theChecksPackage.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theSchemePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInheritancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InheritancePackage.eNS_URI, theInheritancePackage);
		return theInheritancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritance_Class() {
		return (EReference)inheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritance_Type() {
		return (EReference)inheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleInheritance() {
		return simpleInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteInheritance() {
		return concreteInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnAggregationInheritance() {
		return columnAggregationInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnAggregationInheritance_KeyField() {
		return (EAttribute)columnAggregationInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnAggregationInheritance_KeyValue() {
		return (EAttribute)columnAggregationInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceFactory getInheritanceFactory() {
		return (InheritanceFactory)getEFactoryInstance();
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
		inheritanceEClass = createEClass(INHERITANCE);
		createEReference(inheritanceEClass, INHERITANCE__CLASS);
		createEReference(inheritanceEClass, INHERITANCE__TYPE);

		typeEClass = createEClass(TYPE);

		simpleInheritanceEClass = createEClass(SIMPLE_INHERITANCE);

		concreteInheritanceEClass = createEClass(CONCRETE_INHERITANCE);

		columnAggregationInheritanceEClass = createEClass(COLUMN_AGGREGATION_INHERITANCE);
		createEAttribute(columnAggregationInheritanceEClass, COLUMN_AGGREGATION_INHERITANCE__KEY_FIELD);
		createEAttribute(columnAggregationInheritanceEClass, COLUMN_AGGREGATION_INHERITANCE__KEY_VALUE);
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
		ClassPackage theClassPackage = (ClassPackage)EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleInheritanceEClass.getESuperTypes().add(this.getType());
		concreteInheritanceEClass.getESuperTypes().add(this.getType());
		columnAggregationInheritanceEClass.getESuperTypes().add(this.getType());

		// Initialize classes and features; add operations and parameters
		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInheritance_Class(), theClassPackage.getClass_(), theClassPackage.getClass_ExtendedBy(), "class", null, 0, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInheritance_Type(), this.getType(), null, "type", null, 1, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleInheritanceEClass, SimpleInheritance.class, "SimpleInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteInheritanceEClass, ConcreteInheritance.class, "ConcreteInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnAggregationInheritanceEClass, ColumnAggregationInheritance.class, "ColumnAggregationInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnAggregationInheritance_KeyField(), ecorePackage.getEString(), "keyField", null, 1, 1, ColumnAggregationInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnAggregationInheritance_KeyValue(), ecorePackage.getEString(), "keyValue", null, 1, 1, ColumnAggregationInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //InheritancePackageImpl
