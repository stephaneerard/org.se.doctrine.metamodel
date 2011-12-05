/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations;

import doctrine.Class.Columns.IntegerColumn;

import doctrine.Common.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Relations.Relation#getLocal <em>Local</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#getForeign <em>Foreign</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#getClass_ <em>Class</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#getForeignAlias <em>Foreign Alias</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#isOwningSide <em>Owning Side</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#getType <em>Type</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#getOnUpdate <em>On Update</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#getDelete <em>Delete</em>}</li>
 *   <li>{@link doctrine.Class.Relations.Relation#getForeignKeyName <em>Foreign Key Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Relations.RelationsPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Local</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' reference.
	 * @see #setLocal(IntegerColumn)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_Local()
	 * @model required="true"
	 * @generated
	 */
	IntegerColumn getLocal();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getLocal <em>Local</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' reference.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(IntegerColumn value);

	/**
	 * Returns the value of the '<em><b>Foreign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign</em>' reference.
	 * @see #setForeign(IntegerColumn)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_Foreign()
	 * @model required="true"
	 * @generated
	 */
	IntegerColumn getForeign();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getForeign <em>Foreign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign</em>' reference.
	 * @see #getForeign()
	 * @generated
	 */
	void setForeign(IntegerColumn value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(doctrine.Class.Class)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_Class()
	 * @model required="true"
	 * @generated
	 */
	doctrine.Class.Class getClass_();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(doctrine.Class.Class value);

	/**
	 * Returns the value of the '<em><b>Foreign Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Alias</em>' attribute.
	 * @see #setForeignAlias(String)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_ForeignAlias()
	 * @model
	 * @generated
	 */
	String getForeignAlias();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getForeignAlias <em>Foreign Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Alias</em>' attribute.
	 * @see #getForeignAlias()
	 * @generated
	 */
	void setForeignAlias(String value);

	/**
	 * Returns the value of the '<em><b>Owning Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Side</em>' attribute.
	 * @see #setOwningSide(boolean)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_OwningSide()
	 * @model
	 * @generated
	 */
	boolean isOwningSide();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#isOwningSide <em>Owning Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Side</em>' attribute.
	 * @see #isOwningSide()
	 * @generated
	 */
	void setOwningSide(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(RelationType)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelationType getType();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationType value);

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link doctrine.Class.Relations.DATABASE_LEVEL_CASCADING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see doctrine.Class.Relations.DATABASE_LEVEL_CASCADING
	 * @see #setOnDelete(DATABASE_LEVEL_CASCADING)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_OnDelete()
	 * @model default=""
	 * @generated
	 */
	DATABASE_LEVEL_CASCADING getOnDelete();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' attribute.
	 * @see doctrine.Class.Relations.DATABASE_LEVEL_CASCADING
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(DATABASE_LEVEL_CASCADING value);

	/**
	 * Returns the value of the '<em><b>On Update</b></em>' attribute.
	 * The literals are from the enumeration {@link doctrine.Class.Relations.DATABASE_LEVEL_CASCADING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Update</em>' attribute.
	 * @see doctrine.Class.Relations.DATABASE_LEVEL_CASCADING
	 * @see #setOnUpdate(DATABASE_LEVEL_CASCADING)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_OnUpdate()
	 * @model
	 * @generated
	 */
	DATABASE_LEVEL_CASCADING getOnUpdate();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getOnUpdate <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Update</em>' attribute.
	 * @see doctrine.Class.Relations.DATABASE_LEVEL_CASCADING
	 * @see #getOnUpdate()
	 * @generated
	 */
	void setOnUpdate(DATABASE_LEVEL_CASCADING value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' attribute.
	 * The literals are from the enumeration {@link doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' attribute.
	 * @see doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING
	 * @see #setDelete(APPLICATION_LEVEL_CASCADING)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_Delete()
	 * @model
	 * @generated
	 */
	APPLICATION_LEVEL_CASCADING getDelete();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getDelete <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' attribute.
	 * @see doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(APPLICATION_LEVEL_CASCADING value);

	/**
	 * Returns the value of the '<em><b>Foreign Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Name</em>' attribute.
	 * @see #setForeignKeyName(String)
	 * @see doctrine.Class.Relations.RelationsPackage#getRelation_ForeignKeyName()
	 * @model
	 * @generated
	 */
	String getForeignKeyName();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.Relation#getForeignKeyName <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Name</em>' attribute.
	 * @see #getForeignKeyName()
	 * @generated
	 */
	void setForeignKeyName(String value);

} // Relation
