/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors;

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
 * @see doctrine.Class.Behaviors.BehaviorsFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Behaviors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Class/Behaviors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorsPackage eINSTANCE = doctrine.Class.Behaviors.impl.BehaviorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.BehaviorsImpl <em>Behaviors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.BehaviorsImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getBehaviors()
	 * @generated
	 */
	int BEHAVIORS = 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORS__BEHAVIORS = 0;

	/**
	 * The number of structural features of the '<em>Behaviors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.BehaviorImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OPTIONS = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.OptionImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.LeafOptionImpl <em>Leaf Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.LeafOptionImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getLeafOption()
	 * @generated
	 */
	int LEAF_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OPTION__NAME = OPTION__NAME;

	/**
	 * The number of structural features of the '<em>Leaf Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.IntermediateOptionImpl <em>Intermediate Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.IntermediateOptionImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getIntermediateOption()
	 * @generated
	 */
	int INTERMEDIATE_OPTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_OPTION__NAME = OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_OPTION__CHILDREN = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intermediate Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.IntegerOptionImpl <em>Integer Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.IntegerOptionImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getIntegerOption()
	 * @generated
	 */
	int INTEGER_OPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPTION__NAME = LEAF_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPTION__VALUE = LEAF_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPTION_FEATURE_COUNT = LEAF_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.ArrayOptionImpl <em>Array Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.ArrayOptionImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getArrayOption()
	 * @generated
	 */
	int ARRAY_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPTION__NAME = LEAF_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPTION__VALUES = LEAF_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPTION_FEATURE_COUNT = LEAF_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.ArrayValueImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Behaviors.impl.StringOptionImpl <em>String Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Behaviors.impl.StringOptionImpl
	 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getStringOption()
	 * @generated
	 */
	int STRING_OPTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION__NAME = LEAF_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION__VALUE = LEAF_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION_FEATURE_COUNT = LEAF_OPTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.Behaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviors</em>'.
	 * @see doctrine.Class.Behaviors.Behaviors
	 * @generated
	 */
	EClass getBehaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Behaviors.Behaviors#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see doctrine.Class.Behaviors.Behaviors#getBehaviors()
	 * @see #getBehaviors()
	 * @generated
	 */
	EReference getBehaviors_Behaviors();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see doctrine.Class.Behaviors.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Behaviors.Behavior#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see doctrine.Class.Behaviors.Behavior#getOptions()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Options();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see doctrine.Class.Behaviors.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.LeafOption <em>Leaf Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Option</em>'.
	 * @see doctrine.Class.Behaviors.LeafOption
	 * @generated
	 */
	EClass getLeafOption();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.IntermediateOption <em>Intermediate Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Option</em>'.
	 * @see doctrine.Class.Behaviors.IntermediateOption
	 * @generated
	 */
	EClass getIntermediateOption();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Behaviors.IntermediateOption#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see doctrine.Class.Behaviors.IntermediateOption#getChildren()
	 * @see #getIntermediateOption()
	 * @generated
	 */
	EReference getIntermediateOption_Children();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.IntegerOption <em>Integer Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Option</em>'.
	 * @see doctrine.Class.Behaviors.IntegerOption
	 * @generated
	 */
	EClass getIntegerOption();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Behaviors.IntegerOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see doctrine.Class.Behaviors.IntegerOption#getValue()
	 * @see #getIntegerOption()
	 * @generated
	 */
	EAttribute getIntegerOption_Value();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.ArrayOption <em>Array Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Option</em>'.
	 * @see doctrine.Class.Behaviors.ArrayOption
	 * @generated
	 */
	EClass getArrayOption();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Behaviors.ArrayOption#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see doctrine.Class.Behaviors.ArrayOption#getValues()
	 * @see #getArrayOption()
	 * @generated
	 */
	EReference getArrayOption_Values();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see doctrine.Class.Behaviors.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Behaviors.ArrayValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see doctrine.Class.Behaviors.ArrayValue#getValue()
	 * @see #getArrayValue()
	 * @generated
	 */
	EAttribute getArrayValue_Value();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Behaviors.StringOption <em>String Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Option</em>'.
	 * @see doctrine.Class.Behaviors.StringOption
	 * @generated
	 */
	EClass getStringOption();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Behaviors.StringOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see doctrine.Class.Behaviors.StringOption#getValue()
	 * @see #getStringOption()
	 * @generated
	 */
	EAttribute getStringOption_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorsFactory getBehaviorsFactory();

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
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.BehaviorsImpl <em>Behaviors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.BehaviorsImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getBehaviors()
		 * @generated
		 */
		EClass BEHAVIORS = eINSTANCE.getBehaviors();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORS__BEHAVIORS = eINSTANCE.getBehaviors_Behaviors();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.BehaviorImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__OPTIONS = eINSTANCE.getBehavior_Options();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.OptionImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.LeafOptionImpl <em>Leaf Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.LeafOptionImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getLeafOption()
		 * @generated
		 */
		EClass LEAF_OPTION = eINSTANCE.getLeafOption();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.IntermediateOptionImpl <em>Intermediate Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.IntermediateOptionImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getIntermediateOption()
		 * @generated
		 */
		EClass INTERMEDIATE_OPTION = eINSTANCE.getIntermediateOption();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_OPTION__CHILDREN = eINSTANCE.getIntermediateOption_Children();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.IntegerOptionImpl <em>Integer Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.IntegerOptionImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getIntegerOption()
		 * @generated
		 */
		EClass INTEGER_OPTION = eINSTANCE.getIntegerOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_OPTION__VALUE = eINSTANCE.getIntegerOption_Value();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.ArrayOptionImpl <em>Array Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.ArrayOptionImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getArrayOption()
		 * @generated
		 */
		EClass ARRAY_OPTION = eINSTANCE.getArrayOption();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_OPTION__VALUES = eINSTANCE.getArrayOption_Values();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.ArrayValueImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_VALUE__VALUE = eINSTANCE.getArrayValue_Value();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Behaviors.impl.StringOptionImpl <em>String Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Behaviors.impl.StringOptionImpl
		 * @see doctrine.Class.Behaviors.impl.BehaviorsPackageImpl#getStringOption()
		 * @generated
		 */
		EClass STRING_OPTION = eINSTANCE.getStringOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_OPTION__VALUE = eINSTANCE.getStringOption_Value();

	}

} //BehaviorsPackage
