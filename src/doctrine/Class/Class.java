/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class;

import doctrine.Class.Behaviors.Behaviors;

import doctrine.Class.Checks.Checks;

import doctrine.Class.Columns.Columns;

import doctrine.Class.Indexes.Indexes;

import doctrine.Class.Inheritance.Inheritance;

import doctrine.Class.Listeners.Listeners;

import doctrine.Class.Options.Options;

import doctrine.Class.Relations.Relations;

import doctrine.Common.NamedElement;

import doctrine.Connection.ConnectableElement;

import doctrine.Package.AbstractContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link doctrine.Class.Class#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link doctrine.Class.Class#getColumns <em>Columns</em>}</li>
 *   <li>{@link doctrine.Class.Class#getTableName <em>Table Name</em>}</li>
 *   <li>{@link doctrine.Class.Class#getPackage <em>Package</em>}</li>
 *   <li>{@link doctrine.Class.Class#getOptions <em>Options</em>}</li>
 *   <li>{@link doctrine.Class.Class#getListeners <em>Listeners</em>}</li>
 *   <li>{@link doctrine.Class.Class#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link doctrine.Class.Class#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link doctrine.Class.Class#getExtendedBy <em>Extended By</em>}</li>
 *   <li>{@link doctrine.Class.Class#getChecks <em>Checks</em>}</li>
 *   <li>{@link doctrine.Class.Class#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see doctrine.Class.ClassPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends NamedElement, ConnectableElement {
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
	 * @see doctrine.Class.ClassPackage#getClass_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	Behaviors getBehaviors();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getBehaviors <em>Behaviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviors</em>' containment reference.
	 * @see #getBehaviors()
	 * @generated
	 */
	void setBehaviors(Behaviors value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(Columns)
	 * @see doctrine.Class.ClassPackage#getClass_Columns()
	 * @model containment="true"
	 * @generated
	 */
	Columns getColumns();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(Columns value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see doctrine.Class.ClassPackage#getClass_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link doctrine.Package.AbstractContainer#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(AbstractContainer)
	 * @see doctrine.Class.ClassPackage#getClass_Package()
	 * @see doctrine.Package.AbstractContainer#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	AbstractContainer getPackage();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(AbstractContainer value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Options)
	 * @see doctrine.Class.ClassPackage#getClass_Options()
	 * @model containment="true"
	 * @generated
	 */
	Options getOptions();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Options value);

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference.
	 * @see #setListeners(Listeners)
	 * @see doctrine.Class.ClassPackage#getClass_Listeners()
	 * @model containment="true"
	 * @generated
	 */
	Listeners getListeners();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getListeners <em>Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listeners</em>' containment reference.
	 * @see #getListeners()
	 * @generated
	 */
	void setListeners(Listeners value);

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' containment reference.
	 * @see #setInheritance(Inheritance)
	 * @see doctrine.Class.ClassPackage#getClass_Inheritance()
	 * @model containment="true"
	 * @generated
	 */
	Inheritance getInheritance();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getInheritance <em>Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' containment reference.
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(Inheritance value);

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference.
	 * @see #setIndexes(Indexes)
	 * @see doctrine.Class.ClassPackage#getClass_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	Indexes getIndexes();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getIndexes <em>Indexes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexes</em>' containment reference.
	 * @see #getIndexes()
	 * @generated
	 */
	void setIndexes(Indexes value);

	/**
	 * Returns the value of the '<em><b>Extended By</b></em>' reference list.
	 * The list contents are of type {@link doctrine.Class.Inheritance.Inheritance}.
	 * It is bidirectional and its opposite is '{@link doctrine.Class.Inheritance.Inheritance#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended By</em>' reference list.
	 * @see doctrine.Class.ClassPackage#getClass_ExtendedBy()
	 * @see doctrine.Class.Inheritance.Inheritance#getClass_
	 * @model opposite="class"
	 * @generated
	 */
	EList<Inheritance> getExtendedBy();

	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference.
	 * @see #setChecks(Checks)
	 * @see doctrine.Class.ClassPackage#getClass_Checks()
	 * @model containment="true"
	 * @generated
	 */
	Checks getChecks();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getChecks <em>Checks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checks</em>' containment reference.
	 * @see #getChecks()
	 * @generated
	 */
	void setChecks(Checks value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference.
	 * @see #setRelations(Relations)
	 * @see doctrine.Class.ClassPackage#getClass_Relations()
	 * @model containment="true"
	 * @generated
	 */
	Relations getRelations();

	/**
	 * Sets the value of the '{@link doctrine.Class.Class#getRelations <em>Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relations</em>' containment reference.
	 * @see #getRelations()
	 * @generated
	 */
	void setRelations(Relations value);

} // Class
