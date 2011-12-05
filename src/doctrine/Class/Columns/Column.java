/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns;

import doctrine.Common.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Columns.Column#getType <em>Type</em>}</li>
 *   <li>{@link doctrine.Class.Columns.Column#isPrimary <em>Primary</em>}</li>
 *   <li>{@link doctrine.Class.Columns.Column#isUnique <em>Unique</em>}</li>
 *   <li>{@link doctrine.Class.Columns.Column#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link doctrine.Class.Columns.Column#getCollation <em>Collation</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Columns.ColumnsPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ColumnType)
	 * @see doctrine.Class.Columns.ColumnsPackage#getColumn_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ColumnType getType();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.Column#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ColumnType value);

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' attribute.
	 * @see #setPrimary(boolean)
	 * @see doctrine.Class.Columns.ColumnsPackage#getColumn_Primary()
	 * @model
	 * @generated
	 */
	boolean isPrimary();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.Column#isPrimary <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' attribute.
	 * @see #isPrimary()
	 * @generated
	 */
	void setPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see doctrine.Class.Columns.ColumnsPackage#getColumn_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.Column#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Null</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Null</em>' attribute.
	 * @see #setNotNull(boolean)
	 * @see doctrine.Class.Columns.ColumnsPackage#getColumn_NotNull()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.Column#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Null</em>' attribute.
	 * @see #isNotNull()
	 * @generated
	 */
	void setNotNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collation</em>' attribute.
	 * @see #setCollation(String)
	 * @see doctrine.Class.Columns.ColumnsPackage#getColumn_Collation()
	 * @model
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link doctrine.Class.Columns.Column#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

} // Column
