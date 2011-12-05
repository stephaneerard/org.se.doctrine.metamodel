/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Scheme.impl;

import doctrine.Class.Behaviors.Behaviors;

import doctrine.Connection.Connection;

import doctrine.Scheme.Globals;
import doctrine.Scheme.Option;
import doctrine.Scheme.SchemePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Globals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Scheme.impl.GlobalsImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link doctrine.Scheme.impl.GlobalsImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link doctrine.Scheme.impl.GlobalsImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link doctrine.Scheme.impl.GlobalsImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link doctrine.Scheme.impl.GlobalsImpl#isDetect_relations <em>Detect relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalsImpl extends EObjectImpl implements Globals {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected Behaviors behaviors;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected doctrine.Package.Package package_;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * The default value of the '{@link #isDetect_relations() <em>Detect relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetect_relations()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETECT_RELATIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDetect_relations() <em>Detect relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetect_relations()
	 * @generated
	 * @ordered
	 */
	protected boolean detect_relations = DETECT_RELATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemePackage.Literals.GLOBALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (Connection)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemePackage.GLOBALS__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Connection newConnection) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.GLOBALS__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviors getBehaviors() {
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviors(Behaviors newBehaviors, NotificationChain msgs) {
		Behaviors oldBehaviors = behaviors;
		behaviors = newBehaviors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemePackage.GLOBALS__BEHAVIORS, oldBehaviors, newBehaviors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviors(Behaviors newBehaviors) {
		if (newBehaviors != behaviors) {
			NotificationChain msgs = null;
			if (behaviors != null)
				msgs = ((InternalEObject)behaviors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemePackage.GLOBALS__BEHAVIORS, null, msgs);
			if (newBehaviors != null)
				msgs = ((InternalEObject)newBehaviors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemePackage.GLOBALS__BEHAVIORS, null, msgs);
			msgs = basicSetBehaviors(newBehaviors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.GLOBALS__BEHAVIORS, newBehaviors, newBehaviors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctrine.Package.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (doctrine.Package.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemePackage.GLOBALS__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctrine.Package.Package basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(doctrine.Package.Package newPackage) {
		doctrine.Package.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.GLOBALS__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, SchemePackage.GLOBALS__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDetect_relations() {
		return detect_relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetect_relations(boolean newDetect_relations) {
		boolean oldDetect_relations = detect_relations;
		detect_relations = newDetect_relations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemePackage.GLOBALS__DETECT_RELATIONS, oldDetect_relations, detect_relations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemePackage.GLOBALS__BEHAVIORS:
				return basicSetBehaviors(null, msgs);
			case SchemePackage.GLOBALS__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case SchemePackage.GLOBALS__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
			case SchemePackage.GLOBALS__BEHAVIORS:
				return getBehaviors();
			case SchemePackage.GLOBALS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case SchemePackage.GLOBALS__OPTIONS:
				return getOptions();
			case SchemePackage.GLOBALS__DETECT_RELATIONS:
				return isDetect_relations();
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
			case SchemePackage.GLOBALS__CONNECTION:
				setConnection((Connection)newValue);
				return;
			case SchemePackage.GLOBALS__BEHAVIORS:
				setBehaviors((Behaviors)newValue);
				return;
			case SchemePackage.GLOBALS__PACKAGE:
				setPackage((doctrine.Package.Package)newValue);
				return;
			case SchemePackage.GLOBALS__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case SchemePackage.GLOBALS__DETECT_RELATIONS:
				setDetect_relations((Boolean)newValue);
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
			case SchemePackage.GLOBALS__CONNECTION:
				setConnection((Connection)null);
				return;
			case SchemePackage.GLOBALS__BEHAVIORS:
				setBehaviors((Behaviors)null);
				return;
			case SchemePackage.GLOBALS__PACKAGE:
				setPackage((doctrine.Package.Package)null);
				return;
			case SchemePackage.GLOBALS__OPTIONS:
				getOptions().clear();
				return;
			case SchemePackage.GLOBALS__DETECT_RELATIONS:
				setDetect_relations(DETECT_RELATIONS_EDEFAULT);
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
			case SchemePackage.GLOBALS__CONNECTION:
				return connection != null;
			case SchemePackage.GLOBALS__BEHAVIORS:
				return behaviors != null;
			case SchemePackage.GLOBALS__PACKAGE:
				return package_ != null;
			case SchemePackage.GLOBALS__OPTIONS:
				return options != null && !options.isEmpty();
			case SchemePackage.GLOBALS__DETECT_RELATIONS:
				return detect_relations != DETECT_RELATIONS_EDEFAULT;
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
		result.append(" (detect_relations: ");
		result.append(detect_relations);
		result.append(')');
		return result.toString();
	}

} //GlobalsImpl
