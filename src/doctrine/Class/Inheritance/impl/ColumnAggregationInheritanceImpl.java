/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Inheritance.impl;

import doctrine.Class.Inheritance.ColumnAggregationInheritance;
import doctrine.Class.Inheritance.InheritancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Aggregation Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Class.Inheritance.impl.ColumnAggregationInheritanceImpl#getKeyField <em>Key Field</em>}</li>
 *   <li>{@link doctrine.Class.Inheritance.impl.ColumnAggregationInheritanceImpl#getKeyValue <em>Key Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnAggregationInheritanceImpl extends TypeImpl implements ColumnAggregationInheritance {
	/**
	 * The default value of the '{@link #getKeyField() <em>Key Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyField()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyField() <em>Key Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyField()
	 * @generated
	 * @ordered
	 */
	protected String keyField = KEY_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyValue() <em>Key Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyValue() <em>Key Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValue()
	 * @generated
	 * @ordered
	 */
	protected String keyValue = KEY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnAggregationInheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InheritancePackage.Literals.COLUMN_AGGREGATION_INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyField() {
		return keyField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyField(String newKeyField) {
		String oldKeyField = keyField;
		keyField = newKeyField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_FIELD, oldKeyField, keyField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyValue() {
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyValue(String newKeyValue) {
		String oldKeyValue = keyValue;
		keyValue = newKeyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_VALUE, oldKeyValue, keyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_FIELD:
				return getKeyField();
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_VALUE:
				return getKeyValue();
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
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_FIELD:
				setKeyField((String)newValue);
				return;
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_VALUE:
				setKeyValue((String)newValue);
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
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_FIELD:
				setKeyField(KEY_FIELD_EDEFAULT);
				return;
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_VALUE:
				setKeyValue(KEY_VALUE_EDEFAULT);
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
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_FIELD:
				return KEY_FIELD_EDEFAULT == null ? keyField != null : !KEY_FIELD_EDEFAULT.equals(keyField);
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE__KEY_VALUE:
				return KEY_VALUE_EDEFAULT == null ? keyValue != null : !KEY_VALUE_EDEFAULT.equals(keyValue);
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
		result.append(" (keyField: ");
		result.append(keyField);
		result.append(", keyValue: ");
		result.append(keyValue);
		result.append(')');
		return result.toString();
	}

} //ColumnAggregationInheritanceImpl
