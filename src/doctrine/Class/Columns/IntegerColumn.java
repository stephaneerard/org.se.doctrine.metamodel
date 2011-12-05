/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Columns.IntegerColumn#getDefault <em>Default</em>}</li>
 *   <li>{@link doctrine.Class.Columns.IntegerColumn#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Columns.ColumnsPackage#getIntegerColumn()
 * @model
 * @generated
 */
public interface IntegerColumn extends ColumnType, LengthColumn {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(int)
	 * @see doctrine.Class.Columns.ColumnsPackage#getIntegerColumn_Default()
	 * @model
	 * @generated
	 */
	int getDefault();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.IntegerColumn#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(int value);

	/**
	 * Returns the value of the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned</em>' attribute.
	 * @see #setUnsigned(boolean)
	 * @see doctrine.Class.Columns.ColumnsPackage#getIntegerColumn_Unsigned()
	 * @model
	 * @generated
	 */
	boolean isUnsigned();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.IntegerColumn#isUnsigned <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned</em>' attribute.
	 * @see #isUnsigned()
	 * @generated
	 */
	void setUnsigned(boolean value);

} // IntegerColumn
