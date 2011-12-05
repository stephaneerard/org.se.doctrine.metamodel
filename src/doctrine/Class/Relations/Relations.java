/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Relations.Relations#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Relations.RelationsPackage#getRelations()
 * @model
 * @generated
 */
public interface Relations extends EObject {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Relations.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see doctrine.Class.Relations.RelationsPackage#getRelations_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // Relations
