/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Scheme.impl;

import doctrine.Class.ClassPackage;

import doctrine.Common.impl.NamedElementImpl;

import doctrine.Connection.Connections;

import doctrine.Package.AbstractContainer;
import doctrine.Package.PackagePackage;

import doctrine.Scheme.Globals;
import doctrine.Scheme.Scheme;
import doctrine.Scheme.SchemePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Scheme.impl.SchemeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link doctrine.Scheme.impl.SchemeImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link doctrine.Scheme.impl.SchemeImpl#getGlobals <em>Globals</em>}</li>
 *   <li>{@link doctrine.Scheme.impl.SchemeImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemeImpl extends NamedElementImpl implements Scheme {
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
	 * The cached value of the '{@link #getGlobals() <em>Globals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobals()
	 * @generated
	 * @ordered
	 */
	protected Globals globals;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected Connections connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemePackage.Literals.SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<doctrine.Package.Package> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<doctrine.Package.Package>(doctrine.Package.Package.class, this, SchemePackage.SCHEME__CHILDREN, PackagePackage.PACKAGE__PARENT);
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
			classes = new EObjectContainmentWithInverseEList<doctrine.Class.Class>(doctrine.Class.Class.class, this, SchemePackage.SCHEME__CLASSES, ClassPackage.CLASS__PACKAGE);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Globals getGlobals() {
		return globals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobals(Globals newGlobals, NotificationChain msgs) {
		Globals oldGlobals = globals;
		globals = newGlobals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemePackage.SCHEME__GLOBALS, oldGlobals, newGlobals);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobals(Globals newGlobals) {
		if (newGlobals != globals) {
			NotificationChain msgs = null;
			if (globals != null)
				msgs = ((InternalEObject)globals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemePackage.SCHEME__GLOBALS, null, msgs);
			if (newGlobals != null)
				msgs = ((InternalEObject)newGlobals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemePackage.SCHEME__GLOBALS, null, msgs);
			msgs = basicSetGlobals(newGlobals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.SCHEME__GLOBALS, newGlobals, newGlobals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connections getConnections() {
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnections(Connections newConnections, NotificationChain msgs) {
		Connections oldConnections = connections;
		connections = newConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemePackage.SCHEME__CONNECTIONS, oldConnections, newConnections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnections(Connections newConnections) {
		if (newConnections != connections) {
			NotificationChain msgs = null;
			if (connections != null)
				msgs = ((InternalEObject)connections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemePackage.SCHEME__CONNECTIONS, null, msgs);
			if (newConnections != null)
				msgs = ((InternalEObject)newConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemePackage.SCHEME__CONNECTIONS, null, msgs);
			msgs = basicSetConnections(newConnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.SCHEME__CONNECTIONS, newConnections, newConnections));
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
			case SchemePackage.SCHEME__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case SchemePackage.SCHEME__CLASSES:
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
			case SchemePackage.SCHEME__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case SchemePackage.SCHEME__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case SchemePackage.SCHEME__GLOBALS:
				return basicSetGlobals(null, msgs);
			case SchemePackage.SCHEME__CONNECTIONS:
				return basicSetConnections(null, msgs);
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
			case SchemePackage.SCHEME__CHILDREN:
				return getChildren();
			case SchemePackage.SCHEME__CLASSES:
				return getClasses();
			case SchemePackage.SCHEME__GLOBALS:
				return getGlobals();
			case SchemePackage.SCHEME__CONNECTIONS:
				return getConnections();
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
			case SchemePackage.SCHEME__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends doctrine.Package.Package>)newValue);
				return;
			case SchemePackage.SCHEME__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends doctrine.Class.Class>)newValue);
				return;
			case SchemePackage.SCHEME__GLOBALS:
				setGlobals((Globals)newValue);
				return;
			case SchemePackage.SCHEME__CONNECTIONS:
				setConnections((Connections)newValue);
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
			case SchemePackage.SCHEME__CHILDREN:
				getChildren().clear();
				return;
			case SchemePackage.SCHEME__CLASSES:
				getClasses().clear();
				return;
			case SchemePackage.SCHEME__GLOBALS:
				setGlobals((Globals)null);
				return;
			case SchemePackage.SCHEME__CONNECTIONS:
				setConnections((Connections)null);
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
			case SchemePackage.SCHEME__CHILDREN:
				return children != null && !children.isEmpty();
			case SchemePackage.SCHEME__CLASSES:
				return classes != null && !classes.isEmpty();
			case SchemePackage.SCHEME__GLOBALS:
				return globals != null;
			case SchemePackage.SCHEME__CONNECTIONS:
				return connections != null;
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
		if (baseClass == AbstractContainer.class) {
			switch (derivedFeatureID) {
				case SchemePackage.SCHEME__CHILDREN: return PackagePackage.ABSTRACT_CONTAINER__CHILDREN;
				case SchemePackage.SCHEME__CLASSES: return PackagePackage.ABSTRACT_CONTAINER__CLASSES;
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
		if (baseClass == AbstractContainer.class) {
			switch (baseFeatureID) {
				case PackagePackage.ABSTRACT_CONTAINER__CHILDREN: return SchemePackage.SCHEME__CHILDREN;
				case PackagePackage.ABSTRACT_CONTAINER__CLASSES: return SchemePackage.SCHEME__CLASSES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SchemeImpl
