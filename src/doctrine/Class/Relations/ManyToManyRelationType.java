/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To Many Relation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Relations.ManyToManyRelationType#getRefClass <em>Ref Class</em>}</li>
 *   <li>{@link doctrine.Class.Relations.ManyToManyRelationType#isEquals <em>Equals</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Relations.RelationsPackage#getManyToManyRelationType()
 * @model
 * @generated
 */
public interface ManyToManyRelationType extends RelationType {
	/**
	 * Returns the value of the '<em><b>Ref Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Class</em>' reference.
	 * @see #setRefClass(doctrine.Class.Class)
	 * @see doctrine.Class.Relations.RelationsPackage#getManyToManyRelationType_RefClass()
	 * @model required="true"
	 * @generated
	 */
	doctrine.Class.Class getRefClass();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.ManyToManyRelationType#getRefClass <em>Ref Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Class</em>' reference.
	 * @see #getRefClass()
	 * @generated
	 */
	void setRefClass(doctrine.Class.Class value);

	/**
	 * Returns the value of the '<em><b>Equals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equals</em>' attribute.
	 * @see #setEquals(boolean)
	 * @see doctrine.Class.Relations.RelationsPackage#getManyToManyRelationType_Equals()
	 * @model
	 * @generated
	 */
	boolean isEquals();

	/**
	 * Sets the value of the '{@link doctrine.Class.Relations.ManyToManyRelationType#isEquals <em>Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equals</em>' attribute.
	 * @see #isEquals()
	 * @generated
	 */
	void setEquals(boolean value);

} // ManyToManyRelationType
