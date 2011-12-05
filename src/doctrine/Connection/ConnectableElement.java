/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Connection;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Connection.ConnectableElement#getConnnection <em>Connnection</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Connection.ConnectionPackage#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Connnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connnection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connnection</em>' reference.
	 * @see #setConnnection(Connection)
	 * @see doctrine.Connection.ConnectionPackage#getConnectableElement_Connnection()
	 * @model
	 * @generated
	 */
	Connection getConnnection();

	/**
	 * Sets the value of the '{@link doctrine.Connection.ConnectableElement#getConnnection <em>Connnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connnection</em>' reference.
	 * @see #getConnnection()
	 * @generated
	 */
	void setConnnection(Connection value);

} // ConnectableElement
