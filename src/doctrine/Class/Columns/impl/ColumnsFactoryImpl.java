/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns.impl;

import doctrine.Class.Columns.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnsFactoryImpl extends EFactoryImpl implements ColumnsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColumnsFactory init() {
		try {
			ColumnsFactory theColumnsFactory = (ColumnsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.se/doctrine/Class/Columns"); 
			if (theColumnsFactory != null) {
				return theColumnsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ColumnsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ColumnsPackage.COLUMNS: return createColumns();
			case ColumnsPackage.COLUMN: return createColumn();
			case ColumnsPackage.BOOLEAN_COLUMN: return createBooleanColumn();
			case ColumnsPackage.INTEGER_COLUMN: return createIntegerColumn();
			case ColumnsPackage.FLOAT_COLUMN: return createFloatColumn();
			case ColumnsPackage.ARRAY_COLUMN: return createArrayColumn();
			case ColumnsPackage.DECIMAL_COLUMN: return createDecimalColumn();
			case ColumnsPackage.STRING_COLUMN: return createStringColumn();
			case ColumnsPackage.BLOB_COLUMN: return createBlobColumn();
			case ColumnsPackage.CLOB_COLUMN: return createClobColumn();
			case ColumnsPackage.TIMESTAMP_COLUMN: return createTimestampColumn();
			case ColumnsPackage.TIME_COLUMN: return createTimeColumn();
			case ColumnsPackage.DATE_COLUMN: return createDateColumn();
			case ColumnsPackage.ENUM_COLUMN: return createEnumColumn();
			case ColumnsPackage.ENUM_VALUE: return createEnumValue();
			case ColumnsPackage.GZIP_COLUMN: return createGzipColumn();
			case ColumnsPackage.OBJECT_COLUMN: return createObjectColumn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columns createColumns() {
		ColumnsImpl columns = new ColumnsImpl();
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanColumn createBooleanColumn() {
		BooleanColumnImpl booleanColumn = new BooleanColumnImpl();
		return booleanColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerColumn createIntegerColumn() {
		IntegerColumnImpl integerColumn = new IntegerColumnImpl();
		return integerColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatColumn createFloatColumn() {
		FloatColumnImpl floatColumn = new FloatColumnImpl();
		return floatColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayColumn createArrayColumn() {
		ArrayColumnImpl arrayColumn = new ArrayColumnImpl();
		return arrayColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalColumn createDecimalColumn() {
		DecimalColumnImpl decimalColumn = new DecimalColumnImpl();
		return decimalColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringColumn createStringColumn() {
		StringColumnImpl stringColumn = new StringColumnImpl();
		return stringColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlobColumn createBlobColumn() {
		BlobColumnImpl blobColumn = new BlobColumnImpl();
		return blobColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClobColumn createClobColumn() {
		ClobColumnImpl clobColumn = new ClobColumnImpl();
		return clobColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampColumn createTimestampColumn() {
		TimestampColumnImpl timestampColumn = new TimestampColumnImpl();
		return timestampColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeColumn createTimeColumn() {
		TimeColumnImpl timeColumn = new TimeColumnImpl();
		return timeColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateColumn createDateColumn() {
		DateColumnImpl dateColumn = new DateColumnImpl();
		return dateColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumColumn createEnumColumn() {
		EnumColumnImpl enumColumn = new EnumColumnImpl();
		return enumColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GzipColumn createGzipColumn() {
		GzipColumnImpl gzipColumn = new GzipColumnImpl();
		return gzipColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectColumn createObjectColumn() {
		ObjectColumnImpl objectColumn = new ObjectColumnImpl();
		return objectColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsPackage getColumnsPackage() {
		return (ColumnsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ColumnsPackage getPackage() {
		return ColumnsPackage.eINSTANCE;
	}

} //ColumnsFactoryImpl
