/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class;

import doctrine.Common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see doctrine.Class.ClassFactory
 * @model kind="package"
 * @generated
 */
public interface ClassPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Class";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Class";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "class";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassPackage eINSTANCE = doctrine.Class.impl.ClassPackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Class.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.impl.ClassImpl
	 * @see doctrine.Class.impl.ClassPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONNNECTION = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BEHAVIORS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COLUMNS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TABLE_NAME = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OPTIONS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LISTENERS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERITANCE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INDEXES = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Extended By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDED_BY = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Checks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CHECKS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__RELATIONS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;


	/**
	 * Returns the meta object for class '{@link doctrine.Class.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see doctrine.Class.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Class#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviors</em>'.
	 * @see doctrine.Class.Class#getBehaviors()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Behaviors();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Class#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columns</em>'.
	 * @see doctrine.Class.Class#getColumns()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Columns();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Class#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see doctrine.Class.Class#getTableName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_TableName();

	/**
	 * Returns the meta object for the container reference '{@link doctrine.Class.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see doctrine.Class.Class#getPackage()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Package();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Class#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see doctrine.Class.Class#getOptions()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Options();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Class#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listeners</em>'.
	 * @see doctrine.Class.Class#getListeners()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Listeners();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Class#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance</em>'.
	 * @see doctrine.Class.Class#getInheritance()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Inheritance();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Class#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indexes</em>'.
	 * @see doctrine.Class.Class#getIndexes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Indexes();

	/**
	 * Returns the meta object for the reference list '{@link doctrine.Class.Class#getExtendedBy <em>Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extended By</em>'.
	 * @see doctrine.Class.Class#getExtendedBy()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ExtendedBy();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Class#getChecks <em>Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checks</em>'.
	 * @see doctrine.Class.Class#getChecks()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Checks();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Class#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relations</em>'.
	 * @see doctrine.Class.Class#getRelations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Relations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassFactory getClassFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link doctrine.Class.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.impl.ClassImpl
		 * @see doctrine.Class.impl.ClassPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__BEHAVIORS = eINSTANCE.getClass_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__COLUMNS = eINSTANCE.getClass_Columns();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__TABLE_NAME = eINSTANCE.getClass_TableName();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PACKAGE = eINSTANCE.getClass_Package();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OPTIONS = eINSTANCE.getClass_Options();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__LISTENERS = eINSTANCE.getClass_Listeners();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INHERITANCE = eINSTANCE.getClass_Inheritance();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INDEXES = eINSTANCE.getClass_Indexes();

		/**
		 * The meta object literal for the '<em><b>Extended By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTENDED_BY = eINSTANCE.getClass_ExtendedBy();

		/**
		 * The meta object literal for the '<em><b>Checks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CHECKS = eINSTANCE.getClass_Checks();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__RELATIONS = eINSTANCE.getClass_Relations();

	}

} //ClassPackage
