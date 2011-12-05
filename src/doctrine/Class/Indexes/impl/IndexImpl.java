/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Indexes.impl;

import doctrine.Class.Columns.Column;

import doctrine.Class.Indexes.INDEX_SORTING;
import doctrine.Class.Indexes.INDEX_TYPE;
import doctrine.Class.Indexes.Index;
import doctrine.Class.Indexes.IndexesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Class.Indexes.impl.IndexImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link doctrine.Class.Indexes.impl.IndexImpl#getSorting <em>Sorting</em>}</li>
 *   <li>{@link doctrine.Class.Indexes.impl.IndexImpl#getLength <em>Length</em>}</li>
 *   <li>{@link doctrine.Class.Indexes.impl.IndexImpl#isPrimary <em>Primary</em>}</li>
 *   <li>{@link doctrine.Class.Indexes.impl.IndexImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexImpl extends EObjectImpl implements Index {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> fields;

	/**
	 * The default value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorting()
	 * @generated
	 * @ordered
	 */
	protected static final INDEX_SORTING SORTING_EDEFAULT = INDEX_SORTING.ASC;

	/**
	 * The cached value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorting()
	 * @generated
	 * @ordered
	 */
	protected INDEX_SORTING sorting = SORTING_EDEFAULT;

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
	 * The default value of the '{@link #isPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimary()
	 * @generated
	 * @ordered
	 */
	protected boolean primary = PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final INDEX_TYPE TYPE_EDEFAULT = INDEX_TYPE.FULLTEXT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected INDEX_TYPE type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndexesPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<Column>(Column.class, this, IndexesPackage.INDEX__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INDEX_SORTING getSorting() {
		return sorting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorting(INDEX_SORTING newSorting) {
		INDEX_SORTING oldSorting = sorting;
		sorting = newSorting == null ? SORTING_EDEFAULT : newSorting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndexesPackage.INDEX__SORTING, oldSorting, sorting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IndexesPackage.INDEX__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimary() {
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(boolean newPrimary) {
		boolean oldPrimary = primary;
		primary = newPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndexesPackage.INDEX__PRIMARY, oldPrimary, primary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INDEX_TYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(INDEX_TYPE newType) {
		INDEX_TYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndexesPackage.INDEX__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IndexesPackage.INDEX__FIELDS:
				return getFields();
			case IndexesPackage.INDEX__SORTING:
				return getSorting();
			case IndexesPackage.INDEX__LENGTH:
				return getLength();
			case IndexesPackage.INDEX__PRIMARY:
				return isPrimary();
			case IndexesPackage.INDEX__TYPE:
				return getType();
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
			case IndexesPackage.INDEX__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Column>)newValue);
				return;
			case IndexesPackage.INDEX__SORTING:
				setSorting((INDEX_SORTING)newValue);
				return;
			case IndexesPackage.INDEX__LENGTH:
				setLength((Integer)newValue);
				return;
			case IndexesPackage.INDEX__PRIMARY:
				setPrimary((Boolean)newValue);
				return;
			case IndexesPackage.INDEX__TYPE:
				setType((INDEX_TYPE)newValue);
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
			case IndexesPackage.INDEX__FIELDS:
				getFields().clear();
				return;
			case IndexesPackage.INDEX__SORTING:
				setSorting(SORTING_EDEFAULT);
				return;
			case IndexesPackage.INDEX__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case IndexesPackage.INDEX__PRIMARY:
				setPrimary(PRIMARY_EDEFAULT);
				return;
			case IndexesPackage.INDEX__TYPE:
				setType(TYPE_EDEFAULT);
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
			case IndexesPackage.INDEX__FIELDS:
				return fields != null && !fields.isEmpty();
			case IndexesPackage.INDEX__SORTING:
				return sorting != SORTING_EDEFAULT;
			case IndexesPackage.INDEX__LENGTH:
				return length != LENGTH_EDEFAULT;
			case IndexesPackage.INDEX__PRIMARY:
				return primary != PRIMARY_EDEFAULT;
			case IndexesPackage.INDEX__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (sorting: ");
		result.append(sorting);
		result.append(", length: ");
		result.append(length);
		result.append(", primary: ");
		result.append(primary);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //IndexImpl
