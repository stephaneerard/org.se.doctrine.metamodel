/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Indexes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Indexes.Indexes#getIndexes <em>Indexes</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Indexes.IndexesPackage#getIndexes()
 * @model
 * @generated
 */
public interface Indexes extends EObject {
	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Indexes.Index}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see doctrine.Class.Indexes.IndexesPackage#getIndexes_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

} // Indexes
