/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Behaviors.util;

import doctrine.Class.Behaviors.*;

import doctrine.Common.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Behaviors.BehaviorsPackage
 * @generated
 */
public class BehaviorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorsSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BehaviorsPackage.BEHAVIORS: {
				Behaviors behaviors = (Behaviors)theEObject;
				T result = caseBehaviors(behaviors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorsPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseNamedElement(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorsPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = caseNamedElement(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorsPackage.LEAF_OPTION: {
				LeafOption leafOption = (LeafOption)theEObject;
				T result = caseLeafOption(leafOption);
				if (result == null) result = caseOption(leafOption);
				if (result == null) result = caseNamedElement(leafOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorsPackage.INTERMEDIATE_OPTION: {
				IntermediateOption intermediateOption = (IntermediateOption)theEObject;
				T result = caseIntermediateOption(intermediateOption);
				if (result == null) result = caseOption(intermediateOption);
				if (result == null) result = caseNamedElement(intermediateOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorsPackage.INTEGER_OPTION: {
				IntegerOption integerOption = (IntegerOption)theEObject;
				T result = caseIntegerOption(integerOption);
				if (result == null) result = caseLeafOption(integerOption);
				if (result == null) result = caseOption(integerOption);
				if (result == null) result = caseNamedElement(integerOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorsPackage.ARRAY_OPTION: {
				ArrayOption arrayOption = (ArrayOption)theEObject;
				T result = caseArrayOption(arrayOption);
				if (result == null) result = caseLeafOption(arrayOption);
				if (result == null) result = caseOption(arrayOption);
				if (result == null) result = caseNamedElement(arrayOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorsPackage.ARRAY_VALUE: {
				ArrayValue arrayValue = (ArrayValue)theEObject;
				T result = caseArrayValue(arrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorsPackage.STRING_OPTION: {
				StringOption stringOption = (StringOption)theEObject;
				T result = caseStringOption(stringOption);
				if (result == null) result = caseLeafOption(stringOption);
				if (result == null) result = caseOption(stringOption);
				if (result == null) result = caseNamedElement(stringOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviors(Behaviors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafOption(LeafOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateOption(IntermediateOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerOption(IntegerOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayOption(ArrayOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValue(ArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringOption(StringOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviorsSwitch
