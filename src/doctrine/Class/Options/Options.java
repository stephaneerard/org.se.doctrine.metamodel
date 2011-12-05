/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Options;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Options.Options#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.Options.OptionsPackage#getOptions()
 * @model
 * @generated
 */
public interface Options extends EObject {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link doctrine.Class.Options.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see doctrine.Class.Options.OptionsPackage#getOptions_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // Options
