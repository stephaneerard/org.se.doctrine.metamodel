/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Connection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Connection.Connections#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Connection.ConnectionPackage#getConnections()
 * @model
 * @generated
 */
public interface Connections extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Connection.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see doctrine.Connection.ConnectionPackage#getConnections_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // Connections
