/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Inheritance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Aggregation Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Inheritance.ColumnAggregationInheritance#getKeyField <em>Key Field</em>}</li>
 *   <li>{@link doctrine.Class.Inheritance.ColumnAggregationInheritance#getKeyValue <em>Key Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Inheritance.InheritancePackage#getColumnAggregationInheritance()
 * @model
 * @generated
 */
public interface ColumnAggregationInheritance extends Type {
	/**
	 * Returns the value of the '<em><b>Key Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Field</em>' attribute.
	 * @see #setKeyField(String)
	 * @see doctrine.Class.Inheritance.InheritancePackage#getColumnAggregationInheritance_KeyField()
	 * @model required="true"
	 * @generated
	 */
	String getKeyField();

	/**
	 * Sets the value of the '{@link doctrine.Class.Inheritance.ColumnAggregationInheritance#getKeyField <em>Key Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Field</em>' attribute.
	 * @see #getKeyField()
	 * @generated
	 */
	void setKeyField(String value);

	/**
	 * Returns the value of the '<em><b>Key Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value</em>' attribute.
	 * @see #setKeyValue(String)
	 * @see doctrine.Class.Inheritance.InheritancePackage#getColumnAggregationInheritance_KeyValue()
	 * @model required="true"
	 * @generated
	 */
	String getKeyValue();

	/**
	 * Sets the value of the '{@link doctrine.Class.Inheritance.ColumnAggregationInheritance#getKeyValue <em>Key Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value</em>' attribute.
	 * @see #getKeyValue()
	 * @generated
	 */
	void setKeyValue(String value);

} // ColumnAggregationInheritance
