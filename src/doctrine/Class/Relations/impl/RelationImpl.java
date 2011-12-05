/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations.impl;

import doctrine.Class.Columns.IntegerColumn;

import doctrine.Class.Relations.APPLICATION_LEVEL_CASCADING;
import doctrine.Class.Relations.DATABASE_LEVEL_CASCADING;
import doctrine.Class.Relations.Relation;
import doctrine.Class.Relations.RelationType;
import doctrine.Class.Relations.RelationsPackage;

import doctrine.Common.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getForeign <em>Foreign</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getForeignAlias <em>Foreign Alias</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#isOwningSide <em>Owning Side</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getOnUpdate <em>On Update</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link doctrine.Class.Relations.impl.RelationImpl#getForeignKeyName <em>Foreign Key Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends NamedElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected IntegerColumn local;

	/**
	 * The cached value of the '{@link #getForeign() <em>Foreign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeign()
	 * @generated
	 * @ordered
	 */
	protected IntegerColumn foreign;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected doctrine.Class.Class class_;

	/**
	 * The default value of the '{@link #getForeignAlias() <em>Foreign Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignAlias() <em>Foreign Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignAlias()
	 * @generated
	 * @ordered
	 */
	protected String foreignAlias = FOREIGN_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOwningSide() <em>Owning Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwningSide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OWNING_SIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOwningSide() <em>Owning Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwningSide()
	 * @generated
	 * @ordered
	 */
	protected boolean owningSide = OWNING_SIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelationType type;

	/**
	 * The default value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final DATABASE_LEVEL_CASCADING ON_DELETE_EDEFAULT = DATABASE_LEVEL_CASCADING.NONE;

	/**
	 * The cached value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected DATABASE_LEVEL_CASCADING onDelete = ON_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnUpdate() <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final DATABASE_LEVEL_CASCADING ON_UPDATE_EDEFAULT = DATABASE_LEVEL_CASCADING.NONE;

	/**
	 * The cached value of the '{@link #getOnUpdate() <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdate()
	 * @generated
	 * @ordered
	 */
	protected DATABASE_LEVEL_CASCADING onUpdate = ON_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected static final APPLICATION_LEVEL_CASCADING DELETE_EDEFAULT = APPLICATION_LEVEL_CASCADING.NONE;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected APPLICATION_LEVEL_CASCADING delete = DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeignKeyName() <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKeyName() <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyName()
	 * @generated
	 * @ordered
	 */
	protected String foreignKeyName = FOREIGN_KEY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerColumn getLocal() {
		if (local != null && local.eIsProxy()) {
			InternalEObject oldLocal = (InternalEObject)local;
			local = (IntegerColumn)eResolveProxy(oldLocal);
			if (local != oldLocal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationsPackage.RELATION__LOCAL, oldLocal, local));
			}
		}
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerColumn basicGetLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(IntegerColumn newLocal) {
		IntegerColumn oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__LOCAL, oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerColumn getForeign() {
		if (foreign != null && foreign.eIsProxy()) {
			InternalEObject oldForeign = (InternalEObject)foreign;
			foreign = (IntegerColumn)eResolveProxy(oldForeign);
			if (foreign != oldForeign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationsPackage.RELATION__FOREIGN, oldForeign, foreign));
			}
		}
		return foreign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerColumn basicGetForeign() {
		return foreign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeign(IntegerColumn newForeign) {
		IntegerColumn oldForeign = foreign;
		foreign = newForeign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__FOREIGN, oldForeign, foreign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctrine.Class.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (doctrine.Class.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationsPackage.RELATION__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctrine.Class.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(doctrine.Class.Class newClass) {
		doctrine.Class.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignAlias() {
		return foreignAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignAlias(String newForeignAlias) {
		String oldForeignAlias = foreignAlias;
		foreignAlias = newForeignAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__FOREIGN_ALIAS, oldForeignAlias, foreignAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOwningSide() {
		return owningSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningSide(boolean newOwningSide) {
		boolean oldOwningSide = owningSide;
		owningSide = newOwningSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__OWNING_SIDE, oldOwningSide, owningSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(RelationType newType, NotificationChain msgs) {
		RelationType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelationType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RelationsPackage.RELATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RelationsPackage.RELATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATABASE_LEVEL_CASCADING getOnDelete() {
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDelete(DATABASE_LEVEL_CASCADING newOnDelete) {
		DATABASE_LEVEL_CASCADING oldOnDelete = onDelete;
		onDelete = newOnDelete == null ? ON_DELETE_EDEFAULT : newOnDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__ON_DELETE, oldOnDelete, onDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATABASE_LEVEL_CASCADING getOnUpdate() {
		return onUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdate(DATABASE_LEVEL_CASCADING newOnUpdate) {
		DATABASE_LEVEL_CASCADING oldOnUpdate = onUpdate;
		onUpdate = newOnUpdate == null ? ON_UPDATE_EDEFAULT : newOnUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__ON_UPDATE, oldOnUpdate, onUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APPLICATION_LEVEL_CASCADING getDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(APPLICATION_LEVEL_CASCADING newDelete) {
		APPLICATION_LEVEL_CASCADING oldDelete = delete;
		delete = newDelete == null ? DELETE_EDEFAULT : newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignKeyName() {
		return foreignKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyName(String newForeignKeyName) {
		String oldForeignKeyName = foreignKeyName;
		foreignKeyName = newForeignKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationsPackage.RELATION__FOREIGN_KEY_NAME, oldForeignKeyName, foreignKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationsPackage.RELATION__TYPE:
				return basicSetType(null, msgs);
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
			case RelationsPackage.RELATION__LOCAL:
				if (resolve) return getLocal();
				return basicGetLocal();
			case RelationsPackage.RELATION__FOREIGN:
				if (resolve) return getForeign();
				return basicGetForeign();
			case RelationsPackage.RELATION__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case RelationsPackage.RELATION__FOREIGN_ALIAS:
				return getForeignAlias();
			case RelationsPackage.RELATION__OWNING_SIDE:
				return isOwningSide();
			case RelationsPackage.RELATION__TYPE:
				return getType();
			case RelationsPackage.RELATION__ON_DELETE:
				return getOnDelete();
			case RelationsPackage.RELATION__ON_UPDATE:
				return getOnUpdate();
			case RelationsPackage.RELATION__DELETE:
				return getDelete();
			case RelationsPackage.RELATION__FOREIGN_KEY_NAME:
				return getForeignKeyName();
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
			case RelationsPackage.RELATION__LOCAL:
				setLocal((IntegerColumn)newValue);
				return;
			case RelationsPackage.RELATION__FOREIGN:
				setForeign((IntegerColumn)newValue);
				return;
			case RelationsPackage.RELATION__CLASS:
				setClass((doctrine.Class.Class)newValue);
				return;
			case RelationsPackage.RELATION__FOREIGN_ALIAS:
				setForeignAlias((String)newValue);
				return;
			case RelationsPackage.RELATION__OWNING_SIDE:
				setOwningSide((Boolean)newValue);
				return;
			case RelationsPackage.RELATION__TYPE:
				setType((RelationType)newValue);
				return;
			case RelationsPackage.RELATION__ON_DELETE:
				setOnDelete((DATABASE_LEVEL_CASCADING)newValue);
				return;
			case RelationsPackage.RELATION__ON_UPDATE:
				setOnUpdate((DATABASE_LEVEL_CASCADING)newValue);
				return;
			case RelationsPackage.RELATION__DELETE:
				setDelete((APPLICATION_LEVEL_CASCADING)newValue);
				return;
			case RelationsPackage.RELATION__FOREIGN_KEY_NAME:
				setForeignKeyName((String)newValue);
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
			case RelationsPackage.RELATION__LOCAL:
				setLocal((IntegerColumn)null);
				return;
			case RelationsPackage.RELATION__FOREIGN:
				setForeign((IntegerColumn)null);
				return;
			case RelationsPackage.RELATION__CLASS:
				setClass((doctrine.Class.Class)null);
				return;
			case RelationsPackage.RELATION__FOREIGN_ALIAS:
				setForeignAlias(FOREIGN_ALIAS_EDEFAULT);
				return;
			case RelationsPackage.RELATION__OWNING_SIDE:
				setOwningSide(OWNING_SIDE_EDEFAULT);
				return;
			case RelationsPackage.RELATION__TYPE:
				setType((RelationType)null);
				return;
			case RelationsPackage.RELATION__ON_DELETE:
				setOnDelete(ON_DELETE_EDEFAULT);
				return;
			case RelationsPackage.RELATION__ON_UPDATE:
				setOnUpdate(ON_UPDATE_EDEFAULT);
				return;
			case RelationsPackage.RELATION__DELETE:
				setDelete(DELETE_EDEFAULT);
				return;
			case RelationsPackage.RELATION__FOREIGN_KEY_NAME:
				setForeignKeyName(FOREIGN_KEY_NAME_EDEFAULT);
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
			case RelationsPackage.RELATION__LOCAL:
				return local != null;
			case RelationsPackage.RELATION__FOREIGN:
				return foreign != null;
			case RelationsPackage.RELATION__CLASS:
				return class_ != null;
			case RelationsPackage.RELATION__FOREIGN_ALIAS:
				return FOREIGN_ALIAS_EDEFAULT == null ? foreignAlias != null : !FOREIGN_ALIAS_EDEFAULT.equals(foreignAlias);
			case RelationsPackage.RELATION__OWNING_SIDE:
				return owningSide != OWNING_SIDE_EDEFAULT;
			case RelationsPackage.RELATION__TYPE:
				return type != null;
			case RelationsPackage.RELATION__ON_DELETE:
				return onDelete != ON_DELETE_EDEFAULT;
			case RelationsPackage.RELATION__ON_UPDATE:
				return onUpdate != ON_UPDATE_EDEFAULT;
			case RelationsPackage.RELATION__DELETE:
				return delete != DELETE_EDEFAULT;
			case RelationsPackage.RELATION__FOREIGN_KEY_NAME:
				return FOREIGN_KEY_NAME_EDEFAULT == null ? foreignKeyName != null : !FOREIGN_KEY_NAME_EDEFAULT.equals(foreignKeyName);
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
		result.append(" (foreignAlias: ");
		result.append(foreignAlias);
		result.append(", owningSide: ");
		result.append(owningSide);
		result.append(", onDelete: ");
		result.append(onDelete);
		result.append(", onUpdate: ");
		result.append(onUpdate);
		result.append(", delete: ");
		result.append(delete);
		result.append(", foreignKeyName: ");
		result.append(foreignKeyName);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
