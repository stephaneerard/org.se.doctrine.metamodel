/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Indexes;

import doctrine.Class.Columns.Column;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Indexes.Index#getFields <em>Fields</em>}</li>
 *   <li>{@link doctrine.Class.Indexes.Index#getSorting <em>Sorting</em>}</li>
 *   <li>{@link doctrine.Class.Indexes.Index#getLength <em>Length</em>}</li>
 *   <li>{@link doctrine.Class.Indexes.Index#isPrimary <em>Primary</em>}</li>
 *   <li>{@link doctrine.Class.Indexes.Index#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Indexes.IndexesPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link doctrine.Class.Columns.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see doctrine.Class.Indexes.IndexesPackage#getIndex_Fields()
	 * @model
	 * @generated
	 */
	EList<Column> getFields();

	/**
	 * Returns the value of the '<em><b>Sorting</b></em>' attribute.
	 * The literals are from the enumeration {@link doctrine.Class.Indexes.INDEX_SORTING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting</em>' attribute.
	 * @see doctrine.Class.Indexes.INDEX_SORTING
	 * @see #setSorting(INDEX_SORTING)
	 * @see doctrine.Class.Indexes.IndexesPackage#getIndex_Sorting()
	 * @model
	 * @generated
	 */
	INDEX_SORTING getSorting();

	/**
	 * Sets the value of the '{@link doctrine.Class.Indexes.Index#getSorting <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting</em>' attribute.
	 * @see doctrine.Class.Indexes.INDEX_SORTING
	 * @see #getSorting()
	 * @generated
	 */
	void setSorting(INDEX_SORTING value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see doctrine.Class.Indexes.IndexesPackage#getIndex_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link doctrine.Class.Indexes.Index#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

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
	 * @see doctrine.Class.Indexes.IndexesPackage#getIndex_Primary()
	 * @model
	 * @generated
	 */
	boolean isPrimary();

	/**
	 * Sets the value of the '{@link doctrine.Class.Indexes.Index#isPrimary <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' attribute.
	 * @see #isPrimary()
	 * @generated
	 */
	void setPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link doctrine.Class.Indexes.INDEX_TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see doctrine.Class.Indexes.INDEX_TYPE
	 * @see #setType(INDEX_TYPE)
	 * @see doctrine.Class.Indexes.IndexesPackage#getIndex_Type()
	 * @model
	 * @generated
	 */
	INDEX_TYPE getType();

	/**
	 * Sets the value of the '{@link doctrine.Class.Indexes.Index#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see doctrine.Class.Indexes.INDEX_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(INDEX_TYPE value);

} // Index
