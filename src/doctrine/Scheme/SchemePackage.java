/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Scheme;

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
 * @see doctrine.Scheme.SchemeFactory
 * @model kind="package"
 * @generated
 */
public interface SchemePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Scheme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Scheme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scheme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemePackage eINSTANCE = doctrine.Scheme.impl.SchemePackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Scheme.impl.SchemeImpl <em>Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Scheme.impl.SchemeImpl
	 * @see doctrine.Scheme.impl.SchemePackageImpl#getScheme()
	 * @generated
	 */
	int SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__CHILDREN = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__CLASSES = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Globals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__GLOBALS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__CONNECTIONS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link doctrine.Scheme.impl.GlobalsImpl <em>Globals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Scheme.impl.GlobalsImpl
	 * @see doctrine.Scheme.impl.SchemePackageImpl#getGlobals()
	 * @generated
	 */
	int GLOBALS = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALS__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALS__BEHAVIORS = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALS__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALS__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Detect relations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALS__DETECT_RELATIONS = 4;

	/**
	 * The number of structural features of the '<em>Globals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link doctrine.Scheme.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Scheme.impl.OptionImpl
	 * @see doctrine.Scheme.impl.SchemePackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link doctrine.Scheme.Scheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheme</em>'.
	 * @see doctrine.Scheme.Scheme
	 * @generated
	 */
	EClass getScheme();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Scheme.Scheme#getGlobals <em>Globals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Globals</em>'.
	 * @see doctrine.Scheme.Scheme#getGlobals()
	 * @see #getScheme()
	 * @generated
	 */
	EReference getScheme_Globals();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Scheme.Scheme#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connections</em>'.
	 * @see doctrine.Scheme.Scheme#getConnections()
	 * @see #getScheme()
	 * @generated
	 */
	EReference getScheme_Connections();

	/**
	 * Returns the meta object for class '{@link doctrine.Scheme.Globals <em>Globals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Globals</em>'.
	 * @see doctrine.Scheme.Globals
	 * @generated
	 */
	EClass getGlobals();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Scheme.Globals#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see doctrine.Scheme.Globals#getConnection()
	 * @see #getGlobals()
	 * @generated
	 */
	EReference getGlobals_Connection();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Scheme.Globals#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviors</em>'.
	 * @see doctrine.Scheme.Globals#getBehaviors()
	 * @see #getGlobals()
	 * @generated
	 */
	EReference getGlobals_Behaviors();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Scheme.Globals#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see doctrine.Scheme.Globals#getPackage()
	 * @see #getGlobals()
	 * @generated
	 */
	EReference getGlobals_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Scheme.Globals#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see doctrine.Scheme.Globals#getOptions()
	 * @see #getGlobals()
	 * @generated
	 */
	EReference getGlobals_Options();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Scheme.Globals#isDetect_relations <em>Detect relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detect relations</em>'.
	 * @see doctrine.Scheme.Globals#isDetect_relations()
	 * @see #getGlobals()
	 * @generated
	 */
	EAttribute getGlobals_Detect_relations();

	/**
	 * Returns the meta object for class '{@link doctrine.Scheme.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see doctrine.Scheme.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Scheme.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see doctrine.Scheme.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Scheme.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see doctrine.Scheme.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemeFactory getSchemeFactory();

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
		 * The meta object literal for the '{@link doctrine.Scheme.impl.SchemeImpl <em>Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Scheme.impl.SchemeImpl
		 * @see doctrine.Scheme.impl.SchemePackageImpl#getScheme()
		 * @generated
		 */
		EClass SCHEME = eINSTANCE.getScheme();

		/**
		 * The meta object literal for the '<em><b>Globals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEME__GLOBALS = eINSTANCE.getScheme_Globals();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEME__CONNECTIONS = eINSTANCE.getScheme_Connections();

		/**
		 * The meta object literal for the '{@link doctrine.Scheme.impl.GlobalsImpl <em>Globals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Scheme.impl.GlobalsImpl
		 * @see doctrine.Scheme.impl.SchemePackageImpl#getGlobals()
		 * @generated
		 */
		EClass GLOBALS = eINSTANCE.getGlobals();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBALS__CONNECTION = eINSTANCE.getGlobals_Connection();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBALS__BEHAVIORS = eINSTANCE.getGlobals_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBALS__PACKAGE = eINSTANCE.getGlobals_Package();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBALS__OPTIONS = eINSTANCE.getGlobals_Options();

		/**
		 * The meta object literal for the '<em><b>Detect relations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBALS__DETECT_RELATIONS = eINSTANCE.getGlobals_Detect_relations();

		/**
		 * The meta object literal for the '{@link doctrine.Scheme.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Scheme.impl.OptionImpl
		 * @see doctrine.Scheme.impl.SchemePackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

	}

} //SchemePackage
