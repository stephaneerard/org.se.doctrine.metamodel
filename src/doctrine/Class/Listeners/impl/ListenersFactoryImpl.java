/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Listeners.impl;

import doctrine.Class.Listeners.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListenersFactoryImpl extends EFactoryImpl implements ListenersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListenersFactory init() {
		try {
			ListenersFactory theListenersFactory = (ListenersFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.se/doctrine/Class/Listeners"); 
			if (theListenersFactory != null) {
				return theListenersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ListenersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ListenersPackage.LISTENERS: return createListeners();
			case ListenersPackage.LISTENER: return createListener();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listeners createListeners() {
		ListenersImpl listeners = new ListenersImpl();
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listener createListener() {
		ListenerImpl listener = new ListenerImpl();
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenersPackage getListenersPackage() {
		return (ListenersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ListenersPackage getPackage() {
		return ListenersPackage.eINSTANCE;
	}

} //ListenersFactoryImpl
