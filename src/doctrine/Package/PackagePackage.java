/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Package;

import doctrine.Connection.ConnectionPackage;

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
 * @see doctrine.Package.PackageFactory
 * @model kind="package"
 * @generated
 */
public interface PackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Package";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Package";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "package";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagePackage eINSTANCE = doctrine.Package.impl.PackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Package.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Package.impl.PackageImpl
	 * @see doctrine.Package.impl.PackagePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONNNECTION = ConnectionPackage.CONNECTABLE_ELEMENT__CONNNECTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ConnectionPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CHILDREN = ConnectionPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASSES = ConnectionPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Custom path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CUSTOM_PATH = ConnectionPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARENT = ConnectionPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ConnectionPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link doctrine.Package.impl.AbstractContainerImpl <em>Abstract Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Package.impl.AbstractContainerImpl
	 * @see doctrine.Package.impl.PackagePackageImpl#getAbstractContainer()
	 * @generated
	 */
	int ABSTRACT_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER__CLASSES = 1;

	/**
	 * The number of structural features of the '<em>Abstract Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link doctrine.Package.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see doctrine.Package.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Package.Package#getCustom_path <em>Custom path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom path</em>'.
	 * @see doctrine.Package.Package#getCustom_path()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Custom_path();

	/**
	 * Returns the meta object for the container reference '{@link doctrine.Package.Package#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see doctrine.Package.Package#getParent()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Parent();

	/**
	 * Returns the meta object for class '{@link doctrine.Package.AbstractContainer <em>Abstract Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Container</em>'.
	 * @see doctrine.Package.AbstractContainer
	 * @generated
	 */
	EClass getAbstractContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Package.AbstractContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see doctrine.Package.AbstractContainer#getChildren()
	 * @see #getAbstractContainer()
	 * @generated
	 */
	EReference getAbstractContainer_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Package.AbstractContainer#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see doctrine.Package.AbstractContainer#getClasses()
	 * @see #getAbstractContainer()
	 * @generated
	 */
	EReference getAbstractContainer_Classes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackageFactory getPackageFactory();

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
		 * The meta object literal for the '{@link doctrine.Package.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Package.impl.PackageImpl
		 * @see doctrine.Package.impl.PackagePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Custom path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CUSTOM_PATH = eINSTANCE.getPackage_Custom_path();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PARENT = eINSTANCE.getPackage_Parent();

		/**
		 * The meta object literal for the '{@link doctrine.Package.impl.AbstractContainerImpl <em>Abstract Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Package.impl.AbstractContainerImpl
		 * @see doctrine.Package.impl.PackagePackageImpl#getAbstractContainer()
		 * @generated
		 */
		EClass ABSTRACT_CONTAINER = eINSTANCE.getAbstractContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTAINER__CHILDREN = eINSTANCE.getAbstractContainer_Children();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTAINER__CLASSES = eINSTANCE.getAbstractContainer_Classes();

	}

} //PackagePackage
