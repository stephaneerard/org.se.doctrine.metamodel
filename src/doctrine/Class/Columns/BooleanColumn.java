/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Columns.BooleanColumn#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Columns.ColumnsPackage#getBooleanColumn()
 * @model
 * @generated
 */
public interface BooleanColumn extends ColumnType {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see doctrine.Class.Columns.ColumnsPackage#getBooleanColumn_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.BooleanColumn#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

} // BooleanColumn
