/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Scheme;

import doctrine.Common.NamedElement;

import doctrine.Connection.Connections;

import doctrine.Package.AbstractContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Scheme.Scheme#getGlobals <em>Globals</em>}</li>
 *   <li>{@link doctrine.Scheme.Scheme#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Scheme.SchemePackage#getScheme()
 * @model
 * @generated
 */
public interface Scheme extends NamedElement, AbstractContainer {
	/**
	 * Returns the value of the '<em><b>Globals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globals</em>' containment reference.
	 * @see #setGlobals(Globals)
	 * @see doctrine.Scheme.SchemePackage#getScheme_Globals()
	 * @model containment="true"
	 * @generated
	 */
	Globals getGlobals();

	/**
	 * Sets the value of the '{@link doctrine.Scheme.Scheme#getGlobals <em>Globals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globals</em>' containment reference.
	 * @see #getGlobals()
	 * @generated
	 */
	void setGlobals(Globals value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference.
	 * @see #setConnections(Connections)
	 * @see doctrine.Scheme.SchemePackage#getScheme_Connections()
	 * @model containment="true"
	 * @generated
	 */
	Connections getConnections();

	/**
	 * Sets the value of the '{@link doctrine.Scheme.Scheme#getConnections <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections</em>' containment reference.
	 * @see #getConnections()
	 * @generated
	 */
	void setConnections(Connections value);

} // Scheme
