/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Listeners.impl;

import doctrine.Class.Listeners.Listener;
import doctrine.Class.Listeners.Listeners;
import doctrine.Class.Listeners.ListenersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listeners</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Class.Listeners.impl.ListenersImpl#getListeners <em>Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListenersImpl extends EObjectImpl implements Listeners {
	/**
	 * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<Listener> listeners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListenersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListenersPackage.Literals.LISTENERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Listener> getListeners() {
		if (listeners == null) {
			listeners = new EObjectContainmentEList<Listener>(Listener.class, this, ListenersPackage.LISTENERS__LISTENERS);
		}
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListenersPackage.LISTENERS__LISTENERS:
				return ((InternalEList<?>)getListeners()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ListenersPackage.LISTENERS__LISTENERS:
				return getListeners();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ListenersPackage.LISTENERS__LISTENERS:
				getListeners().clear();
				getListeners().addAll((Collection<? extends Listener>)newValue);
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
			case ListenersPackage.LISTENERS__LISTENERS:
				getListeners().clear();
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
			case ListenersPackage.LISTENERS__LISTENERS:
				return listeners != null && !listeners.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListenersImpl
