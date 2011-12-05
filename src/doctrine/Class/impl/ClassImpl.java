/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.impl;

import doctrine.Class.Behaviors.Behaviors;

import doctrine.Class.Checks.Checks;

import doctrine.Class.ClassPackage;

import doctrine.Class.Columns.Columns;

import doctrine.Class.Indexes.Indexes;

import doctrine.Class.Inheritance.Inheritance;
import doctrine.Class.Inheritance.InheritancePackage;

import doctrine.Class.Listeners.Listeners;

import doctrine.Class.Options.Options;

import doctrine.Class.Relations.Relations;

import doctrine.Common.impl.NamedElementImpl;

import doctrine.Connection.ConnectableElement;
import doctrine.Connection.Connection;
import doctrine.Connection.ConnectionPackage;

import doctrine.Package.AbstractContainer;
import doctrine.Package.PackagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getConnnection <em>Connnection</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getExtendedBy <em>Extended By</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getChecks <em>Checks</em>}</li>
 *   <li>{@link doctrine.Class.impl.ClassImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends NamedElementImpl implements doctrine.Class.Class {
	/**
	 * The cached value of the '{@link #getConnnection() <em>Connnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connnection;

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
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected Columns columns;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Options options;

	/**
	 * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected Listeners listeners;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected Inheritance inheritance;

	/**
	 * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexes()
	 * @generated
	 * @ordered
	 */
	protected Indexes indexes;

	/**
	 * The cached value of the '{@link #getExtendedBy() <em>Extended By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Inheritance> extendedBy;

	/**
	 * The cached value of the '{@link #getChecks() <em>Checks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected Checks checks;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected Relations relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnnection() {
		if (connnection != null && connnection.eIsProxy()) {
			InternalEObject oldConnnection = (InternalEObject)connnection;
			connnection = (Connection)eResolveProxy(oldConnnection);
			if (connnection != oldConnnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassPackage.CLASS__CONNNECTION, oldConnnection, connnection));
			}
		}
		return connnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnnection() {
		return connnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnnection(Connection newConnnection) {
		Connection oldConnnection = connnection;
		connnection = newConnnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__CONNNECTION, oldConnnection, connnection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__BEHAVIORS, oldBehaviors, newBehaviors);
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
				msgs = ((InternalEObject)behaviors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__BEHAVIORS, null, msgs);
			if (newBehaviors != null)
				msgs = ((InternalEObject)newBehaviors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__BEHAVIORS, null, msgs);
			msgs = basicSetBehaviors(newBehaviors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__BEHAVIORS, newBehaviors, newBehaviors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columns getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(Columns newColumns, NotificationChain msgs) {
		Columns oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(Columns newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__COLUMNS, newColumns, newColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractContainer getPackage() {
		if (eContainerFeatureID() != ClassPackage.CLASS__PACKAGE) return null;
		return (AbstractContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(AbstractContainer newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, ClassPackage.CLASS__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(AbstractContainer newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != ClassPackage.CLASS__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, PackagePackage.ABSTRACT_CONTAINER__CLASSES, AbstractContainer.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Options newOptions, NotificationChain msgs) {
		Options oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Options newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listeners getListeners() {
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListeners(Listeners newListeners, NotificationChain msgs) {
		Listeners oldListeners = listeners;
		listeners = newListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__LISTENERS, oldListeners, newListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListeners(Listeners newListeners) {
		if (newListeners != listeners) {
			NotificationChain msgs = null;
			if (listeners != null)
				msgs = ((InternalEObject)listeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__LISTENERS, null, msgs);
			if (newListeners != null)
				msgs = ((InternalEObject)newListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__LISTENERS, null, msgs);
			msgs = basicSetListeners(newListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__LISTENERS, newListeners, newListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance getInheritance() {
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInheritance(Inheritance newInheritance, NotificationChain msgs) {
		Inheritance oldInheritance = inheritance;
		inheritance = newInheritance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__INHERITANCE, oldInheritance, newInheritance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritance(Inheritance newInheritance) {
		if (newInheritance != inheritance) {
			NotificationChain msgs = null;
			if (inheritance != null)
				msgs = ((InternalEObject)inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__INHERITANCE, null, msgs);
			if (newInheritance != null)
				msgs = ((InternalEObject)newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__INHERITANCE, null, msgs);
			msgs = basicSetInheritance(newInheritance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__INHERITANCE, newInheritance, newInheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indexes getIndexes() {
		return indexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexes(Indexes newIndexes, NotificationChain msgs) {
		Indexes oldIndexes = indexes;
		indexes = newIndexes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__INDEXES, oldIndexes, newIndexes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexes(Indexes newIndexes) {
		if (newIndexes != indexes) {
			NotificationChain msgs = null;
			if (indexes != null)
				msgs = ((InternalEObject)indexes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__INDEXES, null, msgs);
			if (newIndexes != null)
				msgs = ((InternalEObject)newIndexes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__INDEXES, null, msgs);
			msgs = basicSetIndexes(newIndexes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__INDEXES, newIndexes, newIndexes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inheritance> getExtendedBy() {
		if (extendedBy == null) {
			extendedBy = new EObjectWithInverseResolvingEList<Inheritance>(Inheritance.class, this, ClassPackage.CLASS__EXTENDED_BY, InheritancePackage.INHERITANCE__CLASS);
		}
		return extendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checks getChecks() {
		return checks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChecks(Checks newChecks, NotificationChain msgs) {
		Checks oldChecks = checks;
		checks = newChecks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__CHECKS, oldChecks, newChecks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecks(Checks newChecks) {
		if (newChecks != checks) {
			NotificationChain msgs = null;
			if (checks != null)
				msgs = ((InternalEObject)checks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__CHECKS, null, msgs);
			if (newChecks != null)
				msgs = ((InternalEObject)newChecks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__CHECKS, null, msgs);
			msgs = basicSetChecks(newChecks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__CHECKS, newChecks, newChecks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations getRelations() {
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelations(Relations newRelations, NotificationChain msgs) {
		Relations oldRelations = relations;
		relations = newRelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__RELATIONS, oldRelations, newRelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelations(Relations newRelations) {
		if (newRelations != relations) {
			NotificationChain msgs = null;
			if (relations != null)
				msgs = ((InternalEObject)relations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__RELATIONS, null, msgs);
			if (newRelations != null)
				msgs = ((InternalEObject)newRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassPackage.CLASS__RELATIONS, null, msgs);
			msgs = basicSetRelations(newRelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassPackage.CLASS__RELATIONS, newRelations, newRelations));
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
			case ClassPackage.CLASS__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((AbstractContainer)otherEnd, msgs);
			case ClassPackage.CLASS__EXTENDED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendedBy()).basicAdd(otherEnd, msgs);
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
			case ClassPackage.CLASS__BEHAVIORS:
				return basicSetBehaviors(null, msgs);
			case ClassPackage.CLASS__COLUMNS:
				return basicSetColumns(null, msgs);
			case ClassPackage.CLASS__PACKAGE:
				return basicSetPackage(null, msgs);
			case ClassPackage.CLASS__OPTIONS:
				return basicSetOptions(null, msgs);
			case ClassPackage.CLASS__LISTENERS:
				return basicSetListeners(null, msgs);
			case ClassPackage.CLASS__INHERITANCE:
				return basicSetInheritance(null, msgs);
			case ClassPackage.CLASS__INDEXES:
				return basicSetIndexes(null, msgs);
			case ClassPackage.CLASS__EXTENDED_BY:
				return ((InternalEList<?>)getExtendedBy()).basicRemove(otherEnd, msgs);
			case ClassPackage.CLASS__CHECKS:
				return basicSetChecks(null, msgs);
			case ClassPackage.CLASS__RELATIONS:
				return basicSetRelations(null, msgs);
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
			case ClassPackage.CLASS__PACKAGE:
				return eInternalContainer().eInverseRemove(this, PackagePackage.ABSTRACT_CONTAINER__CLASSES, AbstractContainer.class, msgs);
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
			case ClassPackage.CLASS__CONNNECTION:
				if (resolve) return getConnnection();
				return basicGetConnnection();
			case ClassPackage.CLASS__BEHAVIORS:
				return getBehaviors();
			case ClassPackage.CLASS__COLUMNS:
				return getColumns();
			case ClassPackage.CLASS__TABLE_NAME:
				return getTableName();
			case ClassPackage.CLASS__PACKAGE:
				return getPackage();
			case ClassPackage.CLASS__OPTIONS:
				return getOptions();
			case ClassPackage.CLASS__LISTENERS:
				return getListeners();
			case ClassPackage.CLASS__INHERITANCE:
				return getInheritance();
			case ClassPackage.CLASS__INDEXES:
				return getIndexes();
			case ClassPackage.CLASS__EXTENDED_BY:
				return getExtendedBy();
			case ClassPackage.CLASS__CHECKS:
				return getChecks();
			case ClassPackage.CLASS__RELATIONS:
				return getRelations();
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
			case ClassPackage.CLASS__CONNNECTION:
				setConnnection((Connection)newValue);
				return;
			case ClassPackage.CLASS__BEHAVIORS:
				setBehaviors((Behaviors)newValue);
				return;
			case ClassPackage.CLASS__COLUMNS:
				setColumns((Columns)newValue);
				return;
			case ClassPackage.CLASS__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case ClassPackage.CLASS__PACKAGE:
				setPackage((AbstractContainer)newValue);
				return;
			case ClassPackage.CLASS__OPTIONS:
				setOptions((Options)newValue);
				return;
			case ClassPackage.CLASS__LISTENERS:
				setListeners((Listeners)newValue);
				return;
			case ClassPackage.CLASS__INHERITANCE:
				setInheritance((Inheritance)newValue);
				return;
			case ClassPackage.CLASS__INDEXES:
				setIndexes((Indexes)newValue);
				return;
			case ClassPackage.CLASS__EXTENDED_BY:
				getExtendedBy().clear();
				getExtendedBy().addAll((Collection<? extends Inheritance>)newValue);
				return;
			case ClassPackage.CLASS__CHECKS:
				setChecks((Checks)newValue);
				return;
			case ClassPackage.CLASS__RELATIONS:
				setRelations((Relations)newValue);
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
			case ClassPackage.CLASS__CONNNECTION:
				setConnnection((Connection)null);
				return;
			case ClassPackage.CLASS__BEHAVIORS:
				setBehaviors((Behaviors)null);
				return;
			case ClassPackage.CLASS__COLUMNS:
				setColumns((Columns)null);
				return;
			case ClassPackage.CLASS__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case ClassPackage.CLASS__PACKAGE:
				setPackage((AbstractContainer)null);
				return;
			case ClassPackage.CLASS__OPTIONS:
				setOptions((Options)null);
				return;
			case ClassPackage.CLASS__LISTENERS:
				setListeners((Listeners)null);
				return;
			case ClassPackage.CLASS__INHERITANCE:
				setInheritance((Inheritance)null);
				return;
			case ClassPackage.CLASS__INDEXES:
				setIndexes((Indexes)null);
				return;
			case ClassPackage.CLASS__EXTENDED_BY:
				getExtendedBy().clear();
				return;
			case ClassPackage.CLASS__CHECKS:
				setChecks((Checks)null);
				return;
			case ClassPackage.CLASS__RELATIONS:
				setRelations((Relations)null);
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
			case ClassPackage.CLASS__CONNNECTION:
				return connnection != null;
			case ClassPackage.CLASS__BEHAVIORS:
				return behaviors != null;
			case ClassPackage.CLASS__COLUMNS:
				return columns != null;
			case ClassPackage.CLASS__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case ClassPackage.CLASS__PACKAGE:
				return getPackage() != null;
			case ClassPackage.CLASS__OPTIONS:
				return options != null;
			case ClassPackage.CLASS__LISTENERS:
				return listeners != null;
			case ClassPackage.CLASS__INHERITANCE:
				return inheritance != null;
			case ClassPackage.CLASS__INDEXES:
				return indexes != null;
			case ClassPackage.CLASS__EXTENDED_BY:
				return extendedBy != null && !extendedBy.isEmpty();
			case ClassPackage.CLASS__CHECKS:
				return checks != null;
			case ClassPackage.CLASS__RELATIONS:
				return relations != null;
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
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
				case ClassPackage.CLASS__CONNNECTION: return ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION;
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
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
				case ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION: return ClassPackage.CLASS__CONNNECTION;
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
		result.append(" (tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
