/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Connection;

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
 * @see doctrine.Connection.ConnectionFactory
 * @model kind="package"
 * @generated
 */
public interface ConnectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Connection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Connection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "connection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectionPackage eINSTANCE = doctrine.Connection.impl.ConnectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Connection.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Connection.impl.ConnectableElementImpl
	 * @see doctrine.Connection.impl.ConnectionPackageImpl#getConnectableElement()
	 * @generated
	 */
	int CONNECTABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT__CONNNECTION = 0;

	/**
	 * The number of structural features of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Connection.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Connection.impl.ConnectionImpl
	 * @see doctrine.Connection.impl.ConnectionPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Connection.impl.ConnectionsImpl <em>Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Connection.impl.ConnectionsImpl
	 * @see doctrine.Connection.impl.ConnectionPackageImpl#getConnections()
	 * @generated
	 */
	int CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__CONNECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link doctrine.Connection.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectable Element</em>'.
	 * @see doctrine.Connection.ConnectableElement
	 * @generated
	 */
	EClass getConnectableElement();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Connection.ConnectableElement#getConnnection <em>Connnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connnection</em>'.
	 * @see doctrine.Connection.ConnectableElement#getConnnection()
	 * @see #getConnectableElement()
	 * @generated
	 */
	EReference getConnectableElement_Connnection();

	/**
	 * Returns the meta object for class '{@link doctrine.Connection.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see doctrine.Connection.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Connection.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see doctrine.Connection.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for class '{@link doctrine.Connection.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections</em>'.
	 * @see doctrine.Connection.Connections
	 * @generated
	 */
	EClass getConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Connection.Connections#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see doctrine.Connection.Connections#getConnections()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_Connections();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConnectionFactory getConnectionFactory();

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
		 * The meta object literal for the '{@link doctrine.Connection.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Connection.impl.ConnectableElementImpl
		 * @see doctrine.Connection.impl.ConnectionPackageImpl#getConnectableElement()
		 * @generated
		 */
		EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

		/**
		 * The meta object literal for the '<em><b>Connnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTABLE_ELEMENT__CONNNECTION = eINSTANCE.getConnectableElement_Connnection();

		/**
		 * The meta object literal for the '{@link doctrine.Connection.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Connection.impl.ConnectionImpl
		 * @see doctrine.Connection.impl.ConnectionPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '{@link doctrine.Connection.impl.ConnectionsImpl <em>Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Connection.impl.ConnectionsImpl
		 * @see doctrine.Connection.impl.ConnectionPackageImpl#getConnections()
		 * @generated
		 */
		EClass CONNECTIONS = eINSTANCE.getConnections();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__CONNECTIONS = eINSTANCE.getConnections_Connections();

	}

} //ConnectionPackage
