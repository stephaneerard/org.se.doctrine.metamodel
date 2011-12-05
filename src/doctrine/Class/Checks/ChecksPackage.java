/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Checks;

import doctrine.Common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see doctrine.Class.Checks.ChecksFactory
 * @model kind="package"
 * @generated
 */
public interface ChecksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Checks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Class/Checks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "checks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChecksPackage eINSTANCE = doctrine.Class.Checks.impl.ChecksPackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Class.Checks.impl.ChecksImpl <em>Checks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Checks.impl.ChecksImpl
	 * @see doctrine.Class.Checks.impl.ChecksPackageImpl#getChecks()
	 * @generated
	 */
	int CHECKS = 0;

	/**
	 * The feature id for the '<em><b>Checks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKS__CHECKS = 0;

	/**
	 * The number of structural features of the '<em>Checks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Checks.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Checks.impl.CheckImpl
	 * @see doctrine.Class.Checks.impl.ChecksPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CONDITION = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link doctrine.Class.Checks.Checks <em>Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checks</em>'.
	 * @see doctrine.Class.Checks.Checks
	 * @generated
	 */
	EClass getChecks();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Checks.Checks#getChecks <em>Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checks</em>'.
	 * @see doctrine.Class.Checks.Checks#getChecks()
	 * @see #getChecks()
	 * @generated
	 */
	EReference getChecks_Checks();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Checks.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see doctrine.Class.Checks.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Checks.Check#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see doctrine.Class.Checks.Check#getCondition()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChecksFactory getChecksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link doctrine.Class.Checks.impl.ChecksImpl <em>Checks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Checks.impl.ChecksImpl
		 * @see doctrine.Class.Checks.impl.ChecksPackageImpl#getChecks()
		 * @generated
		 */
		EClass CHECKS = eINSTANCE.getChecks();

		/**
		 * The meta object literal for the '<em><b>Checks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKS__CHECKS = eINSTANCE.getChecks_Checks();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Checks.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Checks.impl.CheckImpl
		 * @see doctrine.Class.Checks.impl.ChecksPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__CONDITION = eINSTANCE.getCheck_Condition();

	}

} //ChecksPackage
