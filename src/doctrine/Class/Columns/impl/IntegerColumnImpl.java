/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns.impl;

import doctrine.Class.Columns.ColumnsPackage;
import doctrine.Class.Columns.IntegerColumn;
import doctrine.Class.Columns.LengthColumn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Class.Columns.impl.IntegerColumnImpl#getLength <em>Length</em>}</li>
 *   <li>{@link doctrine.Class.Columns.impl.IntegerColumnImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link doctrine.Class.Columns.impl.IntegerColumnImpl#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerColumnImpl extends ColumnTypeImpl implements IntegerColumn {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected int default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSIGNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected boolean unsigned = UNSIGNED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColumnsPackage.Literals.INTEGER_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColumnsPackage.INTEGER_COLUMN__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(int newDefault) {
		int oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColumnsPackage.INTEGER_COLUMN__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnsigned() {
		return unsigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsigned(boolean newUnsigned) {
		boolean oldUnsigned = unsigned;
		unsigned = newUnsigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColumnsPackage.INTEGER_COLUMN__UNSIGNED, oldUnsigned, unsigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ColumnsPackage.INTEGER_COLUMN__LENGTH:
				return getLength();
			case ColumnsPackage.INTEGER_COLUMN__DEFAULT:
				return getDefault();
			case ColumnsPackage.INTEGER_COLUMN__UNSIGNED:
				return isUnsigned();
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
			case ColumnsPackage.INTEGER_COLUMN__LENGTH:
				setLength((Integer)newValue);
				return;
			case ColumnsPackage.INTEGER_COLUMN__DEFAULT:
				setDefault((Integer)newValue);
				return;
			case ColumnsPackage.INTEGER_COLUMN__UNSIGNED:
				setUnsigned((Boolean)newValue);
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
			case ColumnsPackage.INTEGER_COLUMN__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case ColumnsPackage.INTEGER_COLUMN__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case ColumnsPackage.INTEGER_COLUMN__UNSIGNED:
				setUnsigned(UNSIGNED_EDEFAULT);
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
			case ColumnsPackage.INTEGER_COLUMN__LENGTH:
				return length != LENGTH_EDEFAULT;
			case ColumnsPackage.INTEGER_COLUMN__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case ColumnsPackage.INTEGER_COLUMN__UNSIGNED:
				return unsigned != UNSIGNED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == LengthColumn.class) {
			switch (derivedFeatureID) {
				case ColumnsPackage.INTEGER_COLUMN__LENGTH: return ColumnsPackage.LENGTH_COLUMN__LENGTH;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == LengthColumn.class) {
			switch (baseFeatureID) {
				case ColumnsPackage.LENGTH_COLUMN__LENGTH: return ColumnsPackage.INTEGER_COLUMN__LENGTH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (length: ");
		result.append(length);
		result.append(", default: ");
		result.append(default_);
		result.append(", unsigned: ");
		result.append(unsigned);
		result.append(')');
		return result.toString();
	}

} //IntegerColumnImpl
