/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Checks.impl;

import doctrine.Class.Checks.Check;
import doctrine.Class.Checks.Checks;
import doctrine.Class.Checks.ChecksPackage;

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
 * An implementation of the model object '<em><b>Checks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Class.Checks.impl.ChecksImpl#getChecks <em>Checks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChecksImpl extends EObjectImpl implements Checks {
	/**
	 * The cached value of the '{@link #getChecks() <em>Checks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> checks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChecksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChecksPackage.Literals.CHECKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Check> getChecks() {
		if (checks == null) {
			checks = new EObjectContainmentEList<Check>(Check.class, this, ChecksPackage.CHECKS__CHECKS);
		}
		return checks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChecksPackage.CHECKS__CHECKS:
				return ((InternalEList<?>)getChecks()).basicRemove(otherEnd, msgs);
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
			case ChecksPackage.CHECKS__CHECKS:
				return getChecks();
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
			case ChecksPackage.CHECKS__CHECKS:
				getChecks().clear();
				getChecks().addAll((Collection<? extends Check>)newValue);
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
			case ChecksPackage.CHECKS__CHECKS:
				getChecks().clear();
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
			case ChecksPackage.CHECKS__CHECKS:
				return checks != null && !checks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChecksImpl
