/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns;

import doctrine.Common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see doctrine.Class.Columns.ColumnsFactory
 * @model kind="package"
 * @generated
 */
public interface ColumnsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Columns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Class/Columns";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "columns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ColumnsPackage eINSTANCE = doctrine.Class.Columns.impl.ColumnsPackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.ColumnsImpl <em>Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.ColumnsImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getColumns()
	 * @generated
	 */
	int COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.ColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRIMARY = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NOT_NULL = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLLATION = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.ColumnTypeImpl <em>Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.ColumnTypeImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getColumnType()
	 * @generated
	 */
	int COLUMN_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.BooleanColumnImpl <em>Boolean Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.BooleanColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getBooleanColumn()
	 * @generated
	 */
	int BOOLEAN_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COLUMN__DEFAULT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.IntegerColumnImpl <em>Integer Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.IntegerColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getIntegerColumn()
	 * @generated
	 */
	int INTEGER_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COLUMN__LENGTH = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COLUMN__DEFAULT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COLUMN__UNSIGNED = COLUMN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.FloatColumnImpl <em>Float Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.FloatColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getFloatColumn()
	 * @generated
	 */
	int FLOAT_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_COLUMN__LENGTH = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_COLUMN__DEFAULT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.SerializedColumnImpl <em>Serialized Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.SerializedColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getSerializedColumn()
	 * @generated
	 */
	int SERIALIZED_COLUMN = 9;

	/**
	 * The number of structural features of the '<em>Serialized Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZED_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.ArrayColumnImpl <em>Array Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.ArrayColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getArrayColumn()
	 * @generated
	 */
	int ARRAY_COLUMN = 6;

	/**
	 * The number of structural features of the '<em>Array Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_COLUMN_FEATURE_COUNT = SERIALIZED_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.DecimalColumnImpl <em>Decimal Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.DecimalColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getDecimalColumn()
	 * @generated
	 */
	int DECIMAL_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COLUMN__LENGTH = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COLUMN__DEFAULT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COLUMN__SCALE = COLUMN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.StringColumnImpl <em>String Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.StringColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getStringColumn()
	 * @generated
	 */
	int STRING_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COLUMN__LENGTH = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COLUMN__DEFAULT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COLUMN__FIXED = COLUMN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.BlobColumnImpl <em>Blob Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.BlobColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getBlobColumn()
	 * @generated
	 */
	int BLOB_COLUMN = 10;

	/**
	 * The number of structural features of the '<em>Blob Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.ClobColumnImpl <em>Clob Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.ClobColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getClobColumn()
	 * @generated
	 */
	int CLOB_COLUMN = 11;

	/**
	 * The number of structural features of the '<em>Clob Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOB_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.TimestampColumnImpl <em>Timestamp Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.TimestampColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getTimestampColumn()
	 * @generated
	 */
	int TIMESTAMP_COLUMN = 12;

	/**
	 * The number of structural features of the '<em>Timestamp Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.TimeColumnImpl <em>Time Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.TimeColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getTimeColumn()
	 * @generated
	 */
	int TIME_COLUMN = 13;

	/**
	 * The number of structural features of the '<em>Time Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.DateColumnImpl <em>Date Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.DateColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getDateColumn()
	 * @generated
	 */
	int DATE_COLUMN = 14;

	/**
	 * The number of structural features of the '<em>Date Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.EnumColumnImpl <em>Enum Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.EnumColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getEnumColumn()
	 * @generated
	 */
	int ENUM_COLUMN = 15;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COLUMN__VALUES = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COLUMN__DEFAULT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COLUMN__LENGTH = COLUMN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enum Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_COLUMN_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.EnumValueImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.GzipColumnImpl <em>Gzip Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.GzipColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getGzipColumn()
	 * @generated
	 */
	int GZIP_COLUMN = 17;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZIP_COLUMN__LENGTH = STRING_COLUMN__LENGTH;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZIP_COLUMN__DEFAULT = STRING_COLUMN__DEFAULT;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZIP_COLUMN__FIXED = STRING_COLUMN__FIXED;

	/**
	 * The number of structural features of the '<em>Gzip Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GZIP_COLUMN_FEATURE_COUNT = STRING_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.ObjectColumnImpl <em>Object Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.ObjectColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getObjectColumn()
	 * @generated
	 */
	int OBJECT_COLUMN = 18;

	/**
	 * The number of structural features of the '<em>Object Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COLUMN_FEATURE_COUNT = SERIALIZED_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Columns.impl.LengthColumnImpl <em>Length Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Columns.impl.LengthColumnImpl
	 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getLengthColumn()
	 * @generated
	 */
	int LENGTH_COLUMN = 19;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_COLUMN__LENGTH = 0;

	/**
	 * The number of structural features of the '<em>Length Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_COLUMN_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.Columns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns</em>'.
	 * @see doctrine.Class.Columns.Columns
	 * @generated
	 */
	EClass getColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Columns.Columns#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see doctrine.Class.Columns.Columns#getColumns()
	 * @see #getColumns()
	 * @generated
	 */
	EReference getColumns_Columns();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see doctrine.Class.Columns.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Columns.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see doctrine.Class.Columns.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.Column#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see doctrine.Class.Columns.Column#isPrimary()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Primary();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.Column#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see doctrine.Class.Columns.Column#isUnique()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.Column#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see doctrine.Class.Columns.Column#isNotNull()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.Column#getCollation <em>Collation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collation</em>'.
	 * @see doctrine.Class.Columns.Column#getCollation()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Collation();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type</em>'.
	 * @see doctrine.Class.Columns.ColumnType
	 * @generated
	 */
	EClass getColumnType();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.BooleanColumn <em>Boolean Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Column</em>'.
	 * @see doctrine.Class.Columns.BooleanColumn
	 * @generated
	 */
	EClass getBooleanColumn();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.BooleanColumn#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see doctrine.Class.Columns.BooleanColumn#isDefault()
	 * @see #getBooleanColumn()
	 * @generated
	 */
	EAttribute getBooleanColumn_Default();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.IntegerColumn <em>Integer Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Column</em>'.
	 * @see doctrine.Class.Columns.IntegerColumn
	 * @generated
	 */
	EClass getIntegerColumn();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.IntegerColumn#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see doctrine.Class.Columns.IntegerColumn#getDefault()
	 * @see #getIntegerColumn()
	 * @generated
	 */
	EAttribute getIntegerColumn_Default();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.IntegerColumn#isUnsigned <em>Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned</em>'.
	 * @see doctrine.Class.Columns.IntegerColumn#isUnsigned()
	 * @see #getIntegerColumn()
	 * @generated
	 */
	EAttribute getIntegerColumn_Unsigned();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.FloatColumn <em>Float Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Column</em>'.
	 * @see doctrine.Class.Columns.FloatColumn
	 * @generated
	 */
	EClass getFloatColumn();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.FloatColumn#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see doctrine.Class.Columns.FloatColumn#getDefault()
	 * @see #getFloatColumn()
	 * @generated
	 */
	EAttribute getFloatColumn_Default();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.ArrayColumn <em>Array Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Column</em>'.
	 * @see doctrine.Class.Columns.ArrayColumn
	 * @generated
	 */
	EClass getArrayColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.DecimalColumn <em>Decimal Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Column</em>'.
	 * @see doctrine.Class.Columns.DecimalColumn
	 * @generated
	 */
	EClass getDecimalColumn();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.DecimalColumn#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see doctrine.Class.Columns.DecimalColumn#getDefault()
	 * @see #getDecimalColumn()
	 * @generated
	 */
	EAttribute getDecimalColumn_Default();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.DecimalColumn#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see doctrine.Class.Columns.DecimalColumn#getScale()
	 * @see #getDecimalColumn()
	 * @generated
	 */
	EAttribute getDecimalColumn_Scale();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.StringColumn <em>String Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Column</em>'.
	 * @see doctrine.Class.Columns.StringColumn
	 * @generated
	 */
	EClass getStringColumn();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.StringColumn#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see doctrine.Class.Columns.StringColumn#getDefault()
	 * @see #getStringColumn()
	 * @generated
	 */
	EAttribute getStringColumn_Default();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.StringColumn#isFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see doctrine.Class.Columns.StringColumn#isFixed()
	 * @see #getStringColumn()
	 * @generated
	 */
	EAttribute getStringColumn_Fixed();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.SerializedColumn <em>Serialized Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serialized Column</em>'.
	 * @see doctrine.Class.Columns.SerializedColumn
	 * @generated
	 */
	EClass getSerializedColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.BlobColumn <em>Blob Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob Column</em>'.
	 * @see doctrine.Class.Columns.BlobColumn
	 * @generated
	 */
	EClass getBlobColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.ClobColumn <em>Clob Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clob Column</em>'.
	 * @see doctrine.Class.Columns.ClobColumn
	 * @generated
	 */
	EClass getClobColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.TimestampColumn <em>Timestamp Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Column</em>'.
	 * @see doctrine.Class.Columns.TimestampColumn
	 * @generated
	 */
	EClass getTimestampColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.TimeColumn <em>Time Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Column</em>'.
	 * @see doctrine.Class.Columns.TimeColumn
	 * @generated
	 */
	EClass getTimeColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.DateColumn <em>Date Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Column</em>'.
	 * @see doctrine.Class.Columns.DateColumn
	 * @generated
	 */
	EClass getDateColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.EnumColumn <em>Enum Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Column</em>'.
	 * @see doctrine.Class.Columns.EnumColumn
	 * @generated
	 */
	EClass getEnumColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Columns.EnumColumn#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see doctrine.Class.Columns.EnumColumn#getValues()
	 * @see #getEnumColumn()
	 * @generated
	 */
	EReference getEnumColumn_Values();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Class.Columns.EnumColumn#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see doctrine.Class.Columns.EnumColumn#getDefault()
	 * @see #getEnumColumn()
	 * @generated
	 */
	EReference getEnumColumn_Default();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.EnumColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see doctrine.Class.Columns.EnumColumn#getLength()
	 * @see #getEnumColumn()
	 * @generated
	 */
	EAttribute getEnumColumn_Length();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see doctrine.Class.Columns.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.EnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see doctrine.Class.Columns.EnumValue#getValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Value();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.GzipColumn <em>Gzip Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gzip Column</em>'.
	 * @see doctrine.Class.Columns.GzipColumn
	 * @generated
	 */
	EClass getGzipColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.ObjectColumn <em>Object Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Column</em>'.
	 * @see doctrine.Class.Columns.ObjectColumn
	 * @generated
	 */
	EClass getObjectColumn();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Columns.LengthColumn <em>Length Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Column</em>'.
	 * @see doctrine.Class.Columns.LengthColumn
	 * @generated
	 */
	EClass getLengthColumn();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Columns.LengthColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see doctrine.Class.Columns.LengthColumn#getLength()
	 * @see #getLengthColumn()
	 * @generated
	 */
	EAttribute getLengthColumn_Length();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ColumnsFactory getColumnsFactory();

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
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.ColumnsImpl <em>Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.ColumnsImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getColumns()
		 * @generated
		 */
		EClass COLUMNS = eINSTANCE.getColumns();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNS__COLUMNS = eINSTANCE.getColumns_Columns();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.ColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__PRIMARY = eINSTANCE.getColumn_Primary();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__UNIQUE = eINSTANCE.getColumn_Unique();

		/**
		 * The meta object literal for the '<em><b>Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NOT_NULL = eINSTANCE.getColumn_NotNull();

		/**
		 * The meta object literal for the '<em><b>Collation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLLATION = eINSTANCE.getColumn_Collation();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.ColumnTypeImpl <em>Column Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.ColumnTypeImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getColumnType()
		 * @generated
		 */
		EClass COLUMN_TYPE = eINSTANCE.getColumnType();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.BooleanColumnImpl <em>Boolean Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.BooleanColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getBooleanColumn()
		 * @generated
		 */
		EClass BOOLEAN_COLUMN = eINSTANCE.getBooleanColumn();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_COLUMN__DEFAULT = eINSTANCE.getBooleanColumn_Default();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.IntegerColumnImpl <em>Integer Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.IntegerColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getIntegerColumn()
		 * @generated
		 */
		EClass INTEGER_COLUMN = eINSTANCE.getIntegerColumn();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_COLUMN__DEFAULT = eINSTANCE.getIntegerColumn_Default();

		/**
		 * The meta object literal for the '<em><b>Unsigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_COLUMN__UNSIGNED = eINSTANCE.getIntegerColumn_Unsigned();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.FloatColumnImpl <em>Float Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.FloatColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getFloatColumn()
		 * @generated
		 */
		EClass FLOAT_COLUMN = eINSTANCE.getFloatColumn();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_COLUMN__DEFAULT = eINSTANCE.getFloatColumn_Default();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.ArrayColumnImpl <em>Array Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.ArrayColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getArrayColumn()
		 * @generated
		 */
		EClass ARRAY_COLUMN = eINSTANCE.getArrayColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.DecimalColumnImpl <em>Decimal Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.DecimalColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getDecimalColumn()
		 * @generated
		 */
		EClass DECIMAL_COLUMN = eINSTANCE.getDecimalColumn();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_COLUMN__DEFAULT = eINSTANCE.getDecimalColumn_Default();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_COLUMN__SCALE = eINSTANCE.getDecimalColumn_Scale();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.StringColumnImpl <em>String Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.StringColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getStringColumn()
		 * @generated
		 */
		EClass STRING_COLUMN = eINSTANCE.getStringColumn();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_COLUMN__DEFAULT = eINSTANCE.getStringColumn_Default();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_COLUMN__FIXED = eINSTANCE.getStringColumn_Fixed();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.SerializedColumnImpl <em>Serialized Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.SerializedColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getSerializedColumn()
		 * @generated
		 */
		EClass SERIALIZED_COLUMN = eINSTANCE.getSerializedColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.BlobColumnImpl <em>Blob Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.BlobColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getBlobColumn()
		 * @generated
		 */
		EClass BLOB_COLUMN = eINSTANCE.getBlobColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.ClobColumnImpl <em>Clob Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.ClobColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getClobColumn()
		 * @generated
		 */
		EClass CLOB_COLUMN = eINSTANCE.getClobColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.TimestampColumnImpl <em>Timestamp Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.TimestampColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getTimestampColumn()
		 * @generated
		 */
		EClass TIMESTAMP_COLUMN = eINSTANCE.getTimestampColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.TimeColumnImpl <em>Time Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.TimeColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getTimeColumn()
		 * @generated
		 */
		EClass TIME_COLUMN = eINSTANCE.getTimeColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.DateColumnImpl <em>Date Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.DateColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getDateColumn()
		 * @generated
		 */
		EClass DATE_COLUMN = eINSTANCE.getDateColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.EnumColumnImpl <em>Enum Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.EnumColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getEnumColumn()
		 * @generated
		 */
		EClass ENUM_COLUMN = eINSTANCE.getEnumColumn();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_COLUMN__VALUES = eINSTANCE.getEnumColumn_Values();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_COLUMN__DEFAULT = eINSTANCE.getEnumColumn_Default();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_COLUMN__LENGTH = eINSTANCE.getEnumColumn_Length();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.EnumValueImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.GzipColumnImpl <em>Gzip Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.GzipColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getGzipColumn()
		 * @generated
		 */
		EClass GZIP_COLUMN = eINSTANCE.getGzipColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.ObjectColumnImpl <em>Object Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.ObjectColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getObjectColumn()
		 * @generated
		 */
		EClass OBJECT_COLUMN = eINSTANCE.getObjectColumn();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Columns.impl.LengthColumnImpl <em>Length Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Columns.impl.LengthColumnImpl
		 * @see doctrine.Class.Columns.impl.ColumnsPackageImpl#getLengthColumn()
		 * @generated
		 */
		EClass LENGTH_COLUMN = eINSTANCE.getLengthColumn();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH_COLUMN__LENGTH = eINSTANCE.getLengthColumn_Length();

	}

} //ColumnsPackage
