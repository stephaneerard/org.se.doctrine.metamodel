/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors.impl;

import doctrine.Class.Behaviors.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorsFactoryImpl extends EFactoryImpl implements BehaviorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorsFactory init() {
		try {
			BehaviorsFactory theBehaviorsFactory = (BehaviorsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.se/doctrine/Class/Behaviors"); 
			if (theBehaviorsFactory != null) {
				return theBehaviorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviorsPackage.BEHAVIORS: return createBehaviors();
			case BehaviorsPackage.BEHAVIOR: return createBehavior();
			case BehaviorsPackage.INTERMEDIATE_OPTION: return createIntermediateOption();
			case BehaviorsPackage.INTEGER_OPTION: return createIntegerOption();
			case BehaviorsPackage.ARRAY_OPTION: return createArrayOption();
			case BehaviorsPackage.ARRAY_VALUE: return createArrayValue();
			case BehaviorsPackage.STRING_OPTION: return createStringOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviors createBehaviors() {
		BehaviorsImpl behaviors = new BehaviorsImpl();
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior() {
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateOption createIntermediateOption() {
		IntermediateOptionImpl intermediateOption = new IntermediateOptionImpl();
		return intermediateOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerOption createIntegerOption() {
		IntegerOptionImpl integerOption = new IntegerOptionImpl();
		return integerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayOption createArrayOption() {
		ArrayOptionImpl arrayOption = new ArrayOptionImpl();
		return arrayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValue createArrayValue() {
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOption createStringOption() {
		StringOptionImpl stringOption = new StringOptionImpl();
		return stringOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorsPackage getBehaviorsPackage() {
		return (BehaviorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorsPackage getPackage() {
		return BehaviorsPackage.eINSTANCE;
	}

} //BehaviorsFactoryImpl
