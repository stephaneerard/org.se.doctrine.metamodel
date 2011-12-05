/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Listeners;

import doctrine.Common.CommonPackage;

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
 * @see doctrine.Class.Listeners.ListenersFactory
 * @model kind="package"
 * @generated
 */
public interface ListenersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Listeners";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Class/Listeners";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "listeners";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListenersPackage eINSTANCE = doctrine.Class.Listeners.impl.ListenersPackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Class.Listeners.impl.ListenersImpl <em>Listeners</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Listeners.impl.ListenersImpl
	 * @see doctrine.Class.Listeners.impl.ListenersPackageImpl#getListeners()
	 * @generated
	 */
	int LISTENERS = 0;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENERS__LISTENERS = 0;

	/**
	 * The number of structural features of the '<em>Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Listeners.impl.ListenerImpl <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Listeners.impl.ListenerImpl
	 * @see doctrine.Class.Listeners.impl.ListenersPackageImpl#getListener()
	 * @generated
	 */
	int LISTENER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link doctrine.Class.Listeners.Listeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listeners</em>'.
	 * @see doctrine.Class.Listeners.Listeners
	 * @generated
	 */
	EClass getListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Listeners.Listeners#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listeners</em>'.
	 * @see doctrine.Class.Listeners.Listeners#getListeners()
	 * @see #getListeners()
	 * @generated
	 */
	EReference getListeners_Listeners();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Listeners.Listener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener</em>'.
	 * @see doctrine.Class.Listeners.Listener
	 * @generated
	 */
	EClass getListener();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ListenersFactory getListenersFactory();

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
		 * The meta object literal for the '{@link doctrine.Class.Listeners.impl.ListenersImpl <em>Listeners</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Listeners.impl.ListenersImpl
		 * @see doctrine.Class.Listeners.impl.ListenersPackageImpl#getListeners()
		 * @generated
		 */
		EClass LISTENERS = eINSTANCE.getListeners();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENERS__LISTENERS = eINSTANCE.getListeners_Listeners();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Listeners.impl.ListenerImpl <em>Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Listeners.impl.ListenerImpl
		 * @see doctrine.Class.Listeners.impl.ListenersPackageImpl#getListener()
		 * @generated
		 */
		EClass LISTENER = eINSTANCE.getListener();

	}

} //ListenersPackage
