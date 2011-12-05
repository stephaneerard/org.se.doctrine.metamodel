/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns.util;

import doctrine.Class.Columns.*;

import doctrine.Common.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Columns.ColumnsPackage
 * @generated
 */
public class ColumnsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ColumnsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsSwitch() {
		if (modelPackage == null) {
			modelPackage = ColumnsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ColumnsPackage.COLUMNS: {
				Columns columns = (Columns)theEObject;
				T result = caseColumns(columns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseNamedElement(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.COLUMN_TYPE: {
				ColumnType columnType = (ColumnType)theEObject;
				T result = caseColumnType(columnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.BOOLEAN_COLUMN: {
				BooleanColumn booleanColumn = (BooleanColumn)theEObject;
				T result = caseBooleanColumn(booleanColumn);
				if (result == null) result = caseColumnType(booleanColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.INTEGER_COLUMN: {
				IntegerColumn integerColumn = (IntegerColumn)theEObject;
				T result = caseIntegerColumn(integerColumn);
				if (result == null) result = caseColumnType(integerColumn);
				if (result == null) result = caseLengthColumn(integerColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.FLOAT_COLUMN: {
				FloatColumn floatColumn = (FloatColumn)theEObject;
				T result = caseFloatColumn(floatColumn);
				if (result == null) result = caseColumnType(floatColumn);
				if (result == null) result = caseLengthColumn(floatColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.ARRAY_COLUMN: {
				ArrayColumn arrayColumn = (ArrayColumn)theEObject;
				T result = caseArrayColumn(arrayColumn);
				if (result == null) result = caseSerializedColumn(arrayColumn);
				if (result == null) result = caseColumnType(arrayColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.DECIMAL_COLUMN: {
				DecimalColumn decimalColumn = (DecimalColumn)theEObject;
				T result = caseDecimalColumn(decimalColumn);
				if (result == null) result = caseColumnType(decimalColumn);
				if (result == null) result = caseLengthColumn(decimalColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.STRING_COLUMN: {
				StringColumn stringColumn = (StringColumn)theEObject;
				T result = caseStringColumn(stringColumn);
				if (result == null) result = caseColumnType(stringColumn);
				if (result == null) result = caseLengthColumn(stringColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.SERIALIZED_COLUMN: {
				SerializedColumn serializedColumn = (SerializedColumn)theEObject;
				T result = caseSerializedColumn(serializedColumn);
				if (result == null) result = caseColumnType(serializedColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.BLOB_COLUMN: {
				BlobColumn blobColumn = (BlobColumn)theEObject;
				T result = caseBlobColumn(blobColumn);
				if (result == null) result = caseColumnType(blobColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.CLOB_COLUMN: {
				ClobColumn clobColumn = (ClobColumn)theEObject;
				T result = caseClobColumn(clobColumn);
				if (result == null) result = caseColumnType(clobColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.TIMESTAMP_COLUMN: {
				TimestampColumn timestampColumn = (TimestampColumn)theEObject;
				T result = caseTimestampColumn(timestampColumn);
				if (result == null) result = caseColumnType(timestampColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.TIME_COLUMN: {
				TimeColumn timeColumn = (TimeColumn)theEObject;
				T result = caseTimeColumn(timeColumn);
				if (result == null) result = caseColumnType(timeColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.DATE_COLUMN: {
				DateColumn dateColumn = (DateColumn)theEObject;
				T result = caseDateColumn(dateColumn);
				if (result == null) result = caseColumnType(dateColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.ENUM_COLUMN: {
				EnumColumn enumColumn = (EnumColumn)theEObject;
				T result = caseEnumColumn(enumColumn);
				if (result == null) result = caseColumnType(enumColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.GZIP_COLUMN: {
				GzipColumn gzipColumn = (GzipColumn)theEObject;
				T result = caseGzipColumn(gzipColumn);
				if (result == null) result = caseStringColumn(gzipColumn);
				if (result == null) result = caseColumnType(gzipColumn);
				if (result == null) result = caseLengthColumn(gzipColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.OBJECT_COLUMN: {
				ObjectColumn objectColumn = (ObjectColumn)theEObject;
				T result = caseObjectColumn(objectColumn);
				if (result == null) result = caseSerializedColumn(objectColumn);
				if (result == null) result = caseColumnType(objectColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnsPackage.LENGTH_COLUMN: {
				LengthColumn lengthColumn = (LengthColumn)theEObject;
				T result = caseLengthColumn(lengthColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumns(Columns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType(ColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanColumn(BooleanColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerColumn(IntegerColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatColumn(FloatColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayColumn(ArrayColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalColumn(DecimalColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringColumn(StringColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedColumn(SerializedColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlobColumn(BlobColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clob Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clob Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClobColumn(ClobColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestampColumn(TimestampColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeColumn(TimeColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateColumn(DateColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumColumn(EnumColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gzip Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gzip Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGzipColumn(GzipColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectColumn(ObjectColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthColumn(LengthColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ColumnsSwitch
