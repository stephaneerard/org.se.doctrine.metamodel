/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Package.impl;

import doctrine.Class.ClassPackage;

import doctrine.Package.AbstractContainer;
import doctrine.Package.PackagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Package.impl.AbstractContainerImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link doctrine.Package.impl.AbstractContainerImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractContainerImpl extends EObjectImpl implements AbstractContainer {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagePackage.Literals.ABSTRACT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<doctrine.Package.Package> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<doctrine.Package.Package>(doctrine.Package.Package.class, this, PackagePackage.ABSTRACT_CONTAINER__CHILDREN, PackagePackage.PACKAGE__PARENT);
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
			classes = new EObjectContainmentWithInverseEList<doctrine.Class.Class>(doctrine.Class.Class.class, this, PackagePackage.ABSTRACT_CONTAINER__CLASSES, ClassPackage.CLASS__PACKAGE);
		}
		return classes;
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
			case PackagePackage.ABSTRACT_CONTAINER__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case PackagePackage.ABSTRACT_CONTAINER__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
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
			case PackagePackage.ABSTRACT_CONTAINER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case PackagePackage.ABSTRACT_CONTAINER__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case PackagePackage.ABSTRACT_CONTAINER__CHILDREN:
				return getChildren();
			case PackagePackage.ABSTRACT_CONTAINER__CLASSES:
				return getClasses();
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
			case PackagePackage.ABSTRACT_CONTAINER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends doctrine.Package.Package>)newValue);
				return;
			case PackagePackage.ABSTRACT_CONTAINER__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends doctrine.Class.Class>)newValue);
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
			case PackagePackage.ABSTRACT_CONTAINER__CHILDREN:
				getChildren().clear();
				return;
			case PackagePackage.ABSTRACT_CONTAINER__CLASSES:
				getClasses().clear();
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
			case PackagePackage.ABSTRACT_CONTAINER__CHILDREN:
				return children != null && !children.isEmpty();
			case PackagePackage.ABSTRACT_CONTAINER__CLASSES:
				return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractContainerImpl
