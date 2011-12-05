/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Columns.ColumnsPackage
 * @generated
 */
public interface ColumnsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ColumnsFactory eINSTANCE = doctrine.Class.Columns.impl.ColumnsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Columns</em>'.
	 * @generated
	 */
	Columns createColumns();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Boolean Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Column</em>'.
	 * @generated
	 */
	BooleanColumn createBooleanColumn();

	/**
	 * Returns a new object of class '<em>Integer Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Column</em>'.
	 * @generated
	 */
	IntegerColumn createIntegerColumn();

	/**
	 * Returns a new object of class '<em>Float Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Column</em>'.
	 * @generated
	 */
	FloatColumn createFloatColumn();

	/**
	 * Returns a new object of class '<em>Array Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Column</em>'.
	 * @generated
	 */
	ArrayColumn createArrayColumn();

	/**
	 * Returns a new object of class '<em>Decimal Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Column</em>'.
	 * @generated
	 */
	DecimalColumn createDecimalColumn();

	/**
	 * Returns a new object of class '<em>String Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Column</em>'.
	 * @generated
	 */
	StringColumn createStringColumn();

	/**
	 * Returns a new object of class '<em>Blob Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blob Column</em>'.
	 * @generated
	 */
	BlobColumn createBlobColumn();

	/**
	 * Returns a new object of class '<em>Clob Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clob Column</em>'.
	 * @generated
	 */
	ClobColumn createClobColumn();

	/**
	 * Returns a new object of class '<em>Timestamp Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timestamp Column</em>'.
	 * @generated
	 */
	TimestampColumn createTimestampColumn();

	/**
	 * Returns a new object of class '<em>Time Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Column</em>'.
	 * @generated
	 */
	TimeColumn createTimeColumn();

	/**
	 * Returns a new object of class '<em>Date Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Column</em>'.
	 * @generated
	 */
	DateColumn createDateColumn();

	/**
	 * Returns a new object of class '<em>Enum Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Column</em>'.
	 * @generated
	 */
	EnumColumn createEnumColumn();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns a new object of class '<em>Gzip Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gzip Column</em>'.
	 * @generated
	 */
	GzipColumn createGzipColumn();

	/**
	 * Returns a new object of class '<em>Object Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Column</em>'.
	 * @generated
	 */
	ObjectColumn createObjectColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ColumnsPackage getColumnsPackage();

} //ColumnsFactory
