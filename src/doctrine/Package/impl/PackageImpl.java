/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Package.impl;

import doctrine.Class.ClassPackage;

import doctrine.Common.CommonPackage;
import doctrine.Common.NamedElement;

import doctrine.Connection.impl.ConnectableElementImpl;

import doctrine.Package.AbstractContainer;
import doctrine.Package.PackagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Package.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link doctrine.Package.impl.PackageImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link doctrine.Package.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link doctrine.Package.impl.PackageImpl#getCustom_path <em>Custom path</em>}</li>
 *   <li>{@link doctrine.Package.impl.PackageImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends ConnectableElementImpl implements doctrine.Package.Package {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<doctrine.Package.Package> children;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<doctrine.Class.Class> classes;

	/**
	 * The default value of the '{@link #getCustom_path() <em>Custom path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom_path()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom_path() <em>Custom path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom_path()
	 * @generated
	 * @ordered
	 */
	protected String custom_path = CUSTOM_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagePackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<doctrine.Package.Package> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<doctrine.Package.Package>(doctrine.Package.Package.class, this, PackagePackage.PACKAGE__CHILDREN, PackagePackage.PACKAGE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<doctrine.Class.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<doctrine.Class.Class>(doctrine.Class.Class.class, this, PackagePackage.PACKAGE__CLASSES, ClassPackage.CLASS__PACKAGE);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustom_path() {
		return custom_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom_path(String newCustom_path) {
		String oldCustom_path = custom_path;
		custom_path = newCustom_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__CUSTOM_PATH, oldCustom_path, custom_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractContainer getParent() {
		if (eContainerFeatureID() != PackagePackage.PACKAGE__PARENT) return null;
		return (AbstractContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AbstractContainer newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, PackagePackage.PACKAGE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AbstractContainer newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != PackagePackage.PACKAGE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, PackagePackage.ABSTRACT_CONTAINER__CHILDREN, AbstractContainer.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagePackage.PACKAGE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case PackagePackage.PACKAGE__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case PackagePackage.PACKAGE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AbstractContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagePackage.PACKAGE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case PackagePackage.PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case PackagePackage.PACKAGE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PackagePackage.PACKAGE__PARENT:
				return eInternalContainer().eInverseRemove(this, PackagePackage.ABSTRACT_CONTAINER__CHILDREN, AbstractContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagePackage.PACKAGE__NAME:
				return getName();
			case PackagePackage.PACKAGE__CHILDREN:
				return getChildren();
			case PackagePackage.PACKAGE__CLASSES:
				return getClasses();
			case PackagePackage.PACKAGE__CUSTOM_PATH:
				return getCustom_path();
			case PackagePackage.PACKAGE__PARENT:
				return getParent();
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
			case PackagePackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case PackagePackage.PACKAGE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends doctrine.Package.Package>)newValue);
				return;
			case PackagePackage.PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends doctrine.Class.Class>)newValue);
				return;
			case PackagePackage.PACKAGE__CUSTOM_PATH:
				setCustom_path((String)newValue);
				return;
			case PackagePackage.PACKAGE__PARENT:
				setParent((AbstractContainer)newValue);
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
			case PackagePackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__CHILDREN:
				getChildren().clear();
				return;
			case PackagePackage.PACKAGE__CLASSES:
				getClasses().clear();
				return;
			case PackagePackage.PACKAGE__CUSTOM_PATH:
				setCustom_path(CUSTOM_PATH_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__PARENT:
				setParent((AbstractContainer)null);
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
			case PackagePackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PackagePackage.PACKAGE__CHILDREN:
				return children != null && !children.isEmpty();
			case PackagePackage.PACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case PackagePackage.PACKAGE__CUSTOM_PATH:
				return CUSTOM_PATH_EDEFAULT == null ? custom_path != null : !CUSTOM_PATH_EDEFAULT.equals(custom_path);
			case PackagePackage.PACKAGE__PARENT:
				return getParent() != null;
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case PackagePackage.PACKAGE__NAME: return CommonPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == AbstractContainer.class) {
			switch (derivedFeatureID) {
				case PackagePackage.PACKAGE__CHILDREN: return PackagePackage.ABSTRACT_CONTAINER__CHILDREN;
				case PackagePackage.PACKAGE__CLASSES: return PackagePackage.ABSTRACT_CONTAINER__CLASSES;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CommonPackage.NAMED_ELEMENT__NAME: return PackagePackage.PACKAGE__NAME;
				default: return -1;
			}
		}
		if (baseClass == AbstractContainer.class) {
			switch (baseFeatureID) {
				case PackagePackage.ABSTRACT_CONTAINER__CHILDREN: return PackagePackage.PACKAGE__CHILDREN;
				case PackagePackage.ABSTRACT_CONTAINER__CLASSES: return PackagePackage.PACKAGE__CLASSES;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", custom_path: ");
		result.append(custom_path);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
