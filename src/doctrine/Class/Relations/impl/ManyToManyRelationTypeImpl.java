/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations.impl;

import doctrine.Class.Relations.ManyToManyRelationType;
import doctrine.Class.Relations.RelationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To Many Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Class.Relations.impl.ManyToManyRelationTypeImpl#getRefClass <em>Ref Class</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.ManyToManyRelationTypeImpl#isEquals <em>Equals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToManyRelationTypeImpl extends RelationTypeImpl implements ManyToManyRelationType {
	/**
	 * The cached value of the '{@link #getRefClass() <em>Ref Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefClass()
	 * @generated
	 * @ordered
	 */
	protected doctrine.Class.Class refClass;

	/**
	 * The default value of the '{@link #isEquals() <em>Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEquals()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EQUALS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEquals() <em>Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEquals()
	 * @generated
	 * @ordered
	 */
	protected boolean equals = EQUALS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyToManyRelationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.MANY_TO_MANY_RELATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctrine.Class.Class getRefClass() {
		if (refClass != null && refClass.eIsProxy()) {
			InternalEObject oldRefClass = (InternalEObject)refClass;
			refClass = (doctrine.Class.Class)eResolveProxy(oldRefClass);
			if (refClass != oldRefClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationsPackage.MANY_TO_MANY_RELATION_TYPE__REF_CLASS, oldRefClass, refClass));
			}
		}
		return refClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctrine.Class.Class basicGetRefClass() {
		return refClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefClass(doctrine.Class.Class newRefClass) {
		doctrine.Class.Class oldRefClass = refClass;
		refClass = newRefClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.MANY_TO_MANY_RELATION_TYPE__REF_CLASS, oldRefClass, refClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEquals() {
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquals(boolean newEquals) {
		boolean oldEquals = equals;
		equals = newEquals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.MANY_TO_MANY_RELATION_TYPE__EQUALS, oldEquals, equals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE__REF_CLASS:
				if (resolve) return getRefClass();
				return basicGetRefClass();
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE__EQUALS:
				return isEquals();
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
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE__REF_CLASS:
				setRefClass((doctrine.Class.Class)newValue);
				return;
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE__EQUALS:
				setEquals((Boolean)newValue);
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
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE__REF_CLASS:
				setRefClass((doctrine.Class.Class)null);
				return;
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE__EQUALS:
				setEquals(EQUALS_EDEFAULT);
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
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE__REF_CLASS:
				return refClass != null;
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE__EQUALS:
				return equals != EQUALS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (equals: ");
		result.append(equals);
		result.append(')');
		return result.toString();
	}

} //ManyToManyRelationTypeImpl
