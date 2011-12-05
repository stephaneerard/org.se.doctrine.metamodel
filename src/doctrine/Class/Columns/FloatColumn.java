/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Columns.FloatColumn#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Columns.ColumnsPackage#getFloatColumn()
 * @model
 * @generated
 */
public interface FloatColumn extends ColumnType, LengthColumn {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(float)
	 * @see doctrine.Class.Columns.ColumnsPackage#getFloatColumn_Default()
	 * @model
	 * @generated
	 */
	float getDefault();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.FloatColumn#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(float value);

} // FloatColumn
