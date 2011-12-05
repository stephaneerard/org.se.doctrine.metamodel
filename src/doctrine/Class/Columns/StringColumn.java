/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Columns.StringColumn#getDefault <em>Default</em>}</li>
 *   <li>{@link doctrine.Class.Columns.StringColumn#isFixed <em>Fixed</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Columns.ColumnsPackage#getStringColumn()
 * @model
 * @generated
 */
public interface StringColumn extends ColumnType, LengthColumn {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see doctrine.Class.Columns.ColumnsPackage#getStringColumn_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.StringColumn#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see #setFixed(boolean)
	 * @see doctrine.Class.Columns.ColumnsPackage#getStringColumn_Fixed()
	 * @model
	 * @generated
	 */
	boolean isFixed();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.StringColumn#isFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see #isFixed()
	 * @generated
	 */
	void setFixed(boolean value);

} // StringColumn
