/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Columns.DecimalColumn#getDefault <em>Default</em>}</li>
 *   <li>{@link doctrine.Class.Columns.DecimalColumn#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Columns.ColumnsPackage#getDecimalColumn()
 * @model
 * @generated
 */
public interface DecimalColumn extends ColumnType, LengthColumn {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(BigDecimal)
	 * @see doctrine.Class.Columns.ColumnsPackage#getDecimalColumn_Default()
	 * @model
	 * @generated
	 */
	BigDecimal getDefault();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.DecimalColumn#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see doctrine.Class.Columns.ColumnsPackage#getDecimalColumn_Scale()
	 * @model required="true"
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.DecimalColumn#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

} // DecimalColumn
