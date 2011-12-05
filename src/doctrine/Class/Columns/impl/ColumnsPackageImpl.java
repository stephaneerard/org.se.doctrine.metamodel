/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns.impl;

import doctrine.Class.Behaviors.BehaviorsPackage;

import doctrine.Class.Behaviors.impl.BehaviorsPackageImpl;

import doctrine.Class.Checks.ChecksPackage;

import doctrine.Class.Checks.impl.ChecksPackageImpl;

import doctrine.Class.ClassPackage;

import doctrine.Class.Columns.ArrayColumn;
import doctrine.Class.Columns.BlobColumn;
import doctrine.Class.Columns.BooleanColumn;
import doctrine.Class.Columns.ClobColumn;
import doctrine.Class.Columns.Column;
import doctrine.Class.Columns.ColumnType;
import doctrine.Class.Columns.Columns;
import doctrine.Class.Columns.ColumnsFactory;
import doctrine.Class.Columns.ColumnsPackage;
import doctrine.Class.Columns.DateColumn;
import doctrine.Class.Columns.DecimalColumn;
import doctrine.Class.Columns.EnumColumn;
import doctrine.Class.Columns.EnumValue;
import doctrine.Class.Columns.FloatColumn;
import doctrine.Class.Columns.GzipColumn;
import doctrine.Class.Columns.IntegerColumn;
import doctrine.Class.Columns.LengthColumn;
import doctrine.Class.Columns.ObjectColumn;
import doctrine.Class.Columns.SerializedColumn;
import doctrine.Class.Columns.StringColumn;
import doctrine.Class.Columns.TimeColumn;
import doctrine.Class.Columns.TimestampColumn;

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
public class ColumnsPackageImpl extends EPackageImpl implements ColumnsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clobColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gzipColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthColumnEClass = null;

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
	 * @see doctrine.Class.Columns.ColumnsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ColumnsPackageImpl() {
		super(eNS_URI, ColumnsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ColumnsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ColumnsPackage init() {
		if (isInited) return (ColumnsPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnsPackage.eNS_URI);

		// Obtain or create and register package
		ColumnsPackageImpl theColumnsPackage = (ColumnsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ColumnsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ColumnsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PackagePackageImpl thePackagePackage = (PackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) instanceof PackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagePackage.eNS_URI) : PackagePackage.eINSTANCE);
		ClassPackageImpl theClassPackage = (ClassPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI) instanceof ClassPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassPackage.eNS_URI) : ClassPackage.eINSTANCE);
		BehaviorsPackageImpl theBehaviorsPackage = (BehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) instanceof BehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) : BehaviorsPackage.eINSTANCE);
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
		theColumnsPackage.createPackageContents();
		thePackagePackage.createPackageContents();
		theClassPackage.createPackageContents();
		theBehaviorsPackage.createPackageContents();
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
		theColumnsPackage.initializePackageContents();
		thePackagePackage.initializePackageContents();
		theClassPackage.initializePackageContents();
		theBehaviorsPackage.initializePackageContents();
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
		theColumnsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ColumnsPackage.eNS_URI, theColumnsPackage);
		return theColumnsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumns() {
		return columnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumns_Columns() {
		return (EReference)columnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Type() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Primary() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Unique() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_NotNull() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Collation() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnType() {
		return columnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanColumn() {
		return booleanColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanColumn_Default() {
		return (EAttribute)booleanColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerColumn() {
		return integerColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerColumn_Default() {
		return (EAttribute)integerColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerColumn_Unsigned() {
		return (EAttribute)integerColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatColumn() {
		return floatColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatColumn_Default() {
		return (EAttribute)floatColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayColumn() {
		return arrayColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalColumn() {
		return decimalColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalColumn_Default() {
		return (EAttribute)decimalColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalColumn_Scale() {
		return (EAttribute)decimalColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringColumn() {
		return stringColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringColumn_Default() {
		return (EAttribute)stringColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringColumn_Fixed() {
		return (EAttribute)stringColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedColumn() {
		return serializedColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlobColumn() {
		return blobColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClobColumn() {
		return clobColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimestampColumn() {
		return timestampColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeColumn() {
		return timeColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateColumn() {
		return dateColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumColumn() {
		return enumColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumColumn_Values() {
		return (EReference)enumColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumColumn_Default() {
		return (EReference)enumColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumColumn_Length() {
		return (EAttribute)enumColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumValue_Value() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGzipColumn() {
		return gzipColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectColumn() {
		return objectColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthColumn() {
		return lengthColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthColumn_Length() {
		return (EAttribute)lengthColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsFactory getColumnsFactory() {
		return (ColumnsFactory)getEFactoryInstance();
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
		columnsEClass = createEClass(COLUMNS);
		createEReference(columnsEClass, COLUMNS__COLUMNS);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__TYPE);
		createEAttribute(columnEClass, COLUMN__PRIMARY);
		createEAttribute(columnEClass, COLUMN__UNIQUE);
		createEAttribute(columnEClass, COLUMN__NOT_NULL);
		createEAttribute(columnEClass, COLUMN__COLLATION);

		columnTypeEClass = createEClass(COLUMN_TYPE);

		booleanColumnEClass = createEClass(BOOLEAN_COLUMN);
		createEAttribute(booleanColumnEClass, BOOLEAN_COLUMN__DEFAULT);

		integerColumnEClass = createEClass(INTEGER_COLUMN);
		createEAttribute(integerColumnEClass, INTEGER_COLUMN__DEFAULT);
		createEAttribute(integerColumnEClass, INTEGER_COLUMN__UNSIGNED);

		floatColumnEClass = createEClass(FLOAT_COLUMN);
		createEAttribute(floatColumnEClass, FLOAT_COLUMN__DEFAULT);

		arrayColumnEClass = createEClass(ARRAY_COLUMN);

		decimalColumnEClass = createEClass(DECIMAL_COLUMN);
		createEAttribute(decimalColumnEClass, DECIMAL_COLUMN__DEFAULT);
		createEAttribute(decimalColumnEClass, DECIMAL_COLUMN__SCALE);

		stringColumnEClass = createEClass(STRING_COLUMN);
		createEAttribute(stringColumnEClass, STRING_COLUMN__DEFAULT);
		createEAttribute(stringColumnEClass, STRING_COLUMN__FIXED);

		serializedColumnEClass = createEClass(SERIALIZED_COLUMN);

		blobColumnEClass = createEClass(BLOB_COLUMN);

		clobColumnEClass = createEClass(CLOB_COLUMN);

		timestampColumnEClass = createEClass(TIMESTAMP_COLUMN);

		timeColumnEClass = createEClass(TIME_COLUMN);

		dateColumnEClass = createEClass(DATE_COLUMN);

		enumColumnEClass = createEClass(ENUM_COLUMN);
		createEReference(enumColumnEClass, ENUM_COLUMN__VALUES);
		createEReference(enumColumnEClass, ENUM_COLUMN__DEFAULT);
		createEAttribute(enumColumnEClass, ENUM_COLUMN__LENGTH);

		enumValueEClass = createEClass(ENUM_VALUE);
		createEAttribute(enumValueEClass, ENUM_VALUE__VALUE);

		gzipColumnEClass = createEClass(GZIP_COLUMN);

		objectColumnEClass = createEClass(OBJECT_COLUMN);

		lengthColumnEClass = createEClass(LENGTH_COLUMN);
		createEAttribute(lengthColumnEClass, LENGTH_COLUMN__LENGTH);
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
		columnEClass.getESuperTypes().add(theCommonPackage.getNamedElement());
		booleanColumnEClass.getESuperTypes().add(this.getColumnType());
		integerColumnEClass.getESuperTypes().add(this.getColumnType());
		integerColumnEClass.getESuperTypes().add(this.getLengthColumn());
		floatColumnEClass.getESuperTypes().add(this.getColumnType());
		floatColumnEClass.getESuperTypes().add(this.getLengthColumn());
		arrayColumnEClass.getESuperTypes().add(this.getSerializedColumn());
		decimalColumnEClass.getESuperTypes().add(this.getColumnType());
		decimalColumnEClass.getESuperTypes().add(this.getLengthColumn());
		stringColumnEClass.getESuperTypes().add(this.getColumnType());
		stringColumnEClass.getESuperTypes().add(this.getLengthColumn());
		serializedColumnEClass.getESuperTypes().add(this.getColumnType());
		blobColumnEClass.getESuperTypes().add(this.getColumnType());
		clobColumnEClass.getESuperTypes().add(this.getColumnType());
		timestampColumnEClass.getESuperTypes().add(this.getColumnType());
		timeColumnEClass.getESuperTypes().add(this.getColumnType());
		dateColumnEClass.getESuperTypes().add(this.getColumnType());
		enumColumnEClass.getESuperTypes().add(this.getColumnType());
		gzipColumnEClass.getESuperTypes().add(this.getStringColumn());
		objectColumnEClass.getESuperTypes().add(this.getSerializedColumn());

		// Initialize classes and features; add operations and parameters
		initEClass(columnsEClass, Columns.class, "Columns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumns_Columns(), this.getColumn(), null, "columns", null, 0, -1, Columns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Type(), this.getColumnType(), null, "type", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Primary(), ecorePackage.getEBoolean(), "primary", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_NotNull(), ecorePackage.getEBoolean(), "notNull", "false", 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Collation(), ecorePackage.getEString(), "collation", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnTypeEClass, ColumnType.class, "ColumnType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanColumnEClass, BooleanColumn.class, "BooleanColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanColumn_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1, BooleanColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerColumnEClass, IntegerColumn.class, "IntegerColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerColumn_Default(), ecorePackage.getEInt(), "default", null, 0, 1, IntegerColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerColumn_Unsigned(), ecorePackage.getEBoolean(), "unsigned", null, 0, 1, IntegerColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatColumnEClass, FloatColumn.class, "FloatColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatColumn_Default(), ecorePackage.getEFloat(), "default", null, 0, 1, FloatColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayColumnEClass, ArrayColumn.class, "ArrayColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalColumnEClass, DecimalColumn.class, "DecimalColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalColumn_Default(), ecorePackage.getEBigDecimal(), "default", null, 0, 1, DecimalColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalColumn_Scale(), ecorePackage.getEInt(), "scale", null, 1, 1, DecimalColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringColumnEClass, StringColumn.class, "StringColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringColumn_Default(), ecorePackage.getEString(), "default", null, 0, 1, StringColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringColumn_Fixed(), ecorePackage.getEBoolean(), "fixed", null, 0, 1, StringColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializedColumnEClass, SerializedColumn.class, "SerializedColumn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blobColumnEClass, BlobColumn.class, "BlobColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clobColumnEClass, ClobColumn.class, "ClobColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timestampColumnEClass, TimestampColumn.class, "TimestampColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeColumnEClass, TimeColumn.class, "TimeColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateColumnEClass, DateColumn.class, "DateColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumColumnEClass, EnumColumn.class, "EnumColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumColumn_Values(), this.getEnumValue(), null, "values", null, 0, -1, EnumColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumColumn_Default(), this.getEnumValue(), null, "default", null, 0, 1, EnumColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumColumn_Length(), ecorePackage.getEInt(), "length", null, 0, 1, EnumColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gzipColumnEClass, GzipColumn.class, "GzipColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectColumnEClass, ObjectColumn.class, "ObjectColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthColumnEClass, LengthColumn.class, "LengthColumn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLengthColumn_Length(), ecorePackage.getEInt(), "length", null, 1, 1, LengthColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ColumnsPackageImpl
