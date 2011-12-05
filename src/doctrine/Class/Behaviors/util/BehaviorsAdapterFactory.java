/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors.util;

import doctrine.Class.Behaviors.*;

import doctrine.Common.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Behaviors.BehaviorsPackage
 * @generated
 */
public class BehaviorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviorsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorsSwitch<Adapter> modelSwitch =
		new BehaviorsSwitch<Adapter>() {
			@Override
			public Adapter caseBehaviors(Behaviors object) {
				return createBehaviorsAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseLeafOption(LeafOption object) {
				return createLeafOptionAdapter();
			}
			@Override
			public Adapter caseIntermediateOption(IntermediateOption object) {
				return createIntermediateOptionAdapter();
			}
			@Override
			public Adapter caseIntegerOption(IntegerOption object) {
				return createIntegerOptionAdapter();
			}
			@Override
			public Adapter caseArrayOption(ArrayOption object) {
				return createArrayOptionAdapter();
			}
			@Override
			public Adapter caseArrayValue(ArrayValue object) {
				return createArrayValueAdapter();
			}
			@Override
			public Adapter caseStringOption(StringOption object) {
				return createStringOptionAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.Behaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.Behaviors
	 * @generated
	 */
	public Adapter createBehaviorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.LeafOption <em>Leaf Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.LeafOption
	 * @generated
	 */
	public Adapter createLeafOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.IntermediateOption <em>Intermediate Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.IntermediateOption
	 * @generated
	 */
	public Adapter createIntermediateOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.IntegerOption <em>Integer Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.IntegerOption
	 * @generated
	 */
	public Adapter createIntegerOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.ArrayOption <em>Array Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.ArrayOption
	 * @generated
	 */
	public Adapter createArrayOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.ArrayValue
	 * @generated
	 */
	public Adapter createArrayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Behaviors.StringOption <em>String Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Behaviors.StringOption
	 * @generated
	 */
	public Adapter createStringOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Common.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Common.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BehaviorsAdapterFactory
