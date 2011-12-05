/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Connection.impl;

import doctrine.Connection.ConnectableElement;
import doctrine.Connection.Connection;
import doctrine.Connection.ConnectionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Connection.impl.ConnectableElementImpl#getConnnection <em>Connnection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectableElementImpl extends EObjectImpl implements ConnectableElement {
	/**
	 * The cached value of the '{@link #getConnnection() <em>Connnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectionPackage.Literals.CONNECTABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnnection() {
		if (connnection != null && connnection.eIsProxy()) {
			InternalEObject oldConnnection = (InternalEObject)connnection;
			connnection = (Connection)eResolveProxy(oldConnnection);
			if (connnection != oldConnnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION, oldConnnection, connnection));
			}
		}
		return connnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnnection() {
		return connnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnnection(Connection newConnnection) {
		Connection oldConnnection = connnection;
		connnection = newConnnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION, oldConnnection, connnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION:
				if (resolve) return getConnnection();
				return basicGetConnnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION:
				setConnnection((Connection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION:
				setConnnection((Connection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION:
				return connnection != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectableElementImpl
