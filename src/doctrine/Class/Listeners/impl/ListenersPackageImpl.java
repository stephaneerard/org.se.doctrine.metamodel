/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Listeners.impl;

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

import doctrine.Class.Listeners.Listener;
import doctrine.Class.Listeners.Listeners;
import doctrine.Class.Listeners.ListenersFactory;
import doctrine.Class.Listeners.ListenersPackage;

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
public class ListenersPackageImpl extends EPackageImpl implements ListenersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listenersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listenerEClass = null;

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
	 * @see doctrine.Class.Listeners.ListenersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ListenersPackageImpl() {
		super(eNS_URI, ListenersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ListenersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ListenersPackage init() {
		if (isInited) return (ListenersPackage)EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI);

		// Obtain or create and register package
		ListenersPackageImpl theListenersPackage = (ListenersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ListenersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ListenersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PackagePackageImpl thePackagePackage = (PackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) instanceof PackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) : PackagePackage.eINSTANCE);
		ClassPackageImpl theClassPackage = (ClassPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI) instanceof ClassPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI) : ClassPackage.eINSTANCE);
		BehaviorsPackageImpl theBehaviorsPackage = (BehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) instanceof BehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) : BehaviorsPackage.eINSTANCE);
		ColumnsPackageImpl theColumnsPackage = (ColumnsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI) instanceof ColumnsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI) : ColumnsPackage.eINSTANCE);
		RelationsPackageImpl theRelationsPackage = (RelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI) instanceof RelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI) : RelationsPackage.eINSTANCE);
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI) instanceof OptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI) : OptionsPackage.eINSTANCE);
		IndexesPackageImpl theIndexesPackage = (IndexesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI) instanceof IndexesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexesPackage.eNS_URI) : IndexesPackage.eINSTANCE);
		InheritancePackageImpl theInheritancePackage = (InheritancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI) instanceof InheritancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI) : InheritancePackage.eINSTANCE);
		ChecksPackageImpl theChecksPackage = (ChecksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI) instanceof ChecksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChecksPackage.eNS_URI) : ChecksPackage.eINSTANCE);
		ConnectionPackageImpl theConnectionPackage = (ConnectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) instanceof ConnectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI) : ConnectionPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		SchemePackageImpl theSchemePackage = (SchemePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemePackage.eNS_URI) instanceof SchemePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemePackage.eNS_URI) : SchemePackage.eINSTANCE);

		// Create package meta-data objects
		theListenersPackage.createPackageContents();
		thePackagePackage.createPackageContents();
		theClassPackage.createPackageContents();
		theBehaviorsPackage.createPackageContents();
		theColumnsPackage.createPackageContents();
		theRelationsPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theIndexesPackage.createPackageContents();
		theInheritancePackage.createPackageContents();
		theChecksPackage.createPackageContents();
		theConnectionPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theSchemePackage.createPackageContents();

		// Initialize created meta-data
		theListenersPackage.initializePackageContents();
		thePackagePackage.initializePackageContents();
		theClassPackage.initializePackageContents();
		theBehaviorsPackage.initializePackageContents();
		theColumnsPackage.initializePackageContents();
		theRelationsPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theIndexesPackage.initializePackageContents();
		theInheritancePackage.initializePackageContents();
		theChecksPackage.initializePackageContents();
		theConnectionPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theSchemePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theListenersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ListenersPackage.eNS_URI, theListenersPackage);
		return theListenersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListeners() {
		return listenersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListeners_Listeners() {
		return (EReference)listenersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListener() {
		return listenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenersFactory getListenersFactory() {
		return (ListenersFactory)getEFactoryInstance();
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
		listenersEClass = createEClass(LISTENERS);
		createEReference(listenersEClass, LISTENERS__LISTENERS);

		listenerEClass = createEClass(LISTENER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		listenerEClass.getESuperTypes().add(theCommonPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(listenersEClass, Listeners.class, "Listeners", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListeners_Listeners(), this.getListener(), null, "listeners", null, 0, -1, Listeners.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listenerEClass, Listener.class, "Listener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ListenersPackageImpl
