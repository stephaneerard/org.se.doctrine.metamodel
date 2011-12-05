/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Scheme;

import doctrine.Class.Behaviors.Behaviors;

import doctrine.Connection.Connection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Globals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Scheme.Globals#getConnection <em>Connection</em>}</li>
 *   <li>{@link doctrine.Scheme.Globals#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link doctrine.Scheme.Globals#getPackage <em>Package</em>}</li>
 *   <li>{@link doctrine.Scheme.Globals#getOptions <em>Options</em>}</li>
 *   <li>{@link doctrine.Scheme.Globals#isDetect_relations <em>Detect relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Scheme.SchemePackage#getGlobals()
 * @model
 * @generated
 */
public interface Globals extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see doctrine.Scheme.SchemePackage#getGlobals_Connection()
	 * @model
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link doctrine.Scheme.Globals#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference.
	 * @see #setBehaviors(Behaviors)
	 * @see doctrine.Scheme.SchemePackage#getGlobals_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	Behaviors getBehaviors();

	/**
	 * Sets the value of the '{@link doctrine.Scheme.Globals#getBehaviors <em>Behaviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviors</em>' containment reference.
	 * @see #getBehaviors()
	 * @generated
	 */
	void setBehaviors(Behaviors value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(doctrine.Package.Package)
	 * @see doctrine.Scheme.SchemePackage#getGlobals_Package()
	 * @model
	 * @generated
	 */
	doctrine.Package.Package getPackage();

	/**
	 * Sets the value of the '{@link doctrine.Scheme.Globals#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(doctrine.Package.Package value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Scheme.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see doctrine.Scheme.SchemePackage#getGlobals_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

	/**
	 * Returns the value of the '<em><b>Detect relations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detect relations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detect relations</em>' attribute.
	 * @see #setDetect_relations(boolean)
	 * @see doctrine.Scheme.SchemePackage#getGlobals_Detect_relations()
	 * @model
	 * @generated
	 */
	boolean isDetect_relations();

	/**
	 * Sets the value of the '{@link doctrine.Scheme.Globals#isDetect_relations <em>Detect relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detect relations</em>' attribute.
	 * @see #isDetect_relations()
	 * @generated
	 */
	void setDetect_relations(boolean value);

} // Globals
