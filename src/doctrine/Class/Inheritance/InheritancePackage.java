/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Inheritance;

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
 * @see doctrine.Class.Inheritance.InheritanceFactory
 * @model kind="package"
 * @generated
 */
public interface InheritancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Inheritance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Class/Inheritance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inheritance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InheritancePackage eINSTANCE = doctrine.Class.Inheritance.impl.InheritancePackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Class.Inheritance.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Inheritance.impl.InheritanceImpl
	 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link doctrine.Class.Inheritance.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Inheritance.impl.TypeImpl
	 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Inheritance.impl.SimpleInheritanceImpl <em>Simple Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Inheritance.impl.SimpleInheritanceImpl
	 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getSimpleInheritance()
	 * @generated
	 */
	int SIMPLE_INHERITANCE = 2;

	/**
	 * The number of structural features of the '<em>Simple Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INHERITANCE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Inheritance.impl.ConcreteInheritanceImpl <em>Concrete Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Inheritance.impl.ConcreteInheritanceImpl
	 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getConcreteInheritance()
	 * @generated
	 */
	int CONCRETE_INHERITANCE = 3;

	/**
	 * The number of structural features of the '<em>Concrete Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_INHERITANCE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Inheritance.impl.ColumnAggregationInheritanceImpl <em>Column Aggregation Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Inheritance.impl.ColumnAggregationInheritanceImpl
	 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getColumnAggregationInheritance()
	 * @generated
	 */
	int COLUMN_AGGREGATION_INHERITANCE = 4;

	/**
	 * The feature id for the '<em><b>Key Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_AGGREGATION_INHERITANCE__KEY_FIELD = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_AGGREGATION_INHERITANCE__KEY_VALUE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column Aggregation Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_AGGREGATION_INHERITANCE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link doctrine.Class.Inheritance.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see doctrine.Class.Inheritance.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the reference '{@link doctrine.Class.Inheritance.Inheritance#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see doctrine.Class.Inheritance.Inheritance#getClass_()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Class();

	/**
	 * Returns the meta object for the containment reference '{@link doctrine.Class.Inheritance.Inheritance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see doctrine.Class.Inheritance.Inheritance#getType()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Type();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Inheritance.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see doctrine.Class.Inheritance.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Inheritance.SimpleInheritance <em>Simple Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Inheritance</em>'.
	 * @see doctrine.Class.Inheritance.SimpleInheritance
	 * @generated
	 */
	EClass getSimpleInheritance();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Inheritance.ConcreteInheritance <em>Concrete Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Inheritance</em>'.
	 * @see doctrine.Class.Inheritance.ConcreteInheritance
	 * @generated
	 */
	EClass getConcreteInheritance();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Inheritance.ColumnAggregationInheritance <em>Column Aggregation Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Aggregation Inheritance</em>'.
	 * @see doctrine.Class.Inheritance.ColumnAggregationInheritance
	 * @generated
	 */
	EClass getColumnAggregationInheritance();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Inheritance.ColumnAggregationInheritance#getKeyField <em>Key Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Field</em>'.
	 * @see doctrine.Class.Inheritance.ColumnAggregationInheritance#getKeyField()
	 * @see #getColumnAggregationInheritance()
	 * @generated
	 */
	EAttribute getColumnAggregationInheritance_KeyField();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Inheritance.ColumnAggregationInheritance#getKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Value</em>'.
	 * @see doctrine.Class.Inheritance.ColumnAggregationInheritance#getKeyValue()
	 * @see #getColumnAggregationInheritance()
	 * @generated
	 */
	EAttribute getColumnAggregationInheritance_KeyValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InheritanceFactory getInheritanceFactory();

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
		 * The meta object literal for the '{@link doctrine.Class.Inheritance.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Inheritance.impl.InheritanceImpl
		 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__CLASS = eINSTANCE.getInheritance_Class();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__TYPE = eINSTANCE.getInheritance_Type();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Inheritance.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Inheritance.impl.TypeImpl
		 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Inheritance.impl.SimpleInheritanceImpl <em>Simple Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Inheritance.impl.SimpleInheritanceImpl
		 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getSimpleInheritance()
		 * @generated
		 */
		EClass SIMPLE_INHERITANCE = eINSTANCE.getSimpleInheritance();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Inheritance.impl.ConcreteInheritanceImpl <em>Concrete Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Inheritance.impl.ConcreteInheritanceImpl
		 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getConcreteInheritance()
		 * @generated
		 */
		EClass CONCRETE_INHERITANCE = eINSTANCE.getConcreteInheritance();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Inheritance.impl.ColumnAggregationInheritanceImpl <em>Column Aggregation Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Inheritance.impl.ColumnAggregationInheritanceImpl
		 * @see doctrine.Class.Inheritance.impl.InheritancePackageImpl#getColumnAggregationInheritance()
		 * @generated
		 */
		EClass COLUMN_AGGREGATION_INHERITANCE = eINSTANCE.getColumnAggregationInheritance();

		/**
		 * The meta object literal for the '<em><b>Key Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_AGGREGATION_INHERITANCE__KEY_FIELD = eINSTANCE.getColumnAggregationInheritance_KeyField();

		/**
		 * The meta object literal for the '<em><b>Key Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_AGGREGATION_INHERITANCE__KEY_VALUE = eINSTANCE.getColumnAggregationInheritance_KeyValue();

	}

} //InheritancePackage
