/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Inheritance.impl;

import doctrine.Class.Inheritance.*;

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
public class InheritanceFactoryImpl extends EFactoryImpl implements InheritanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InheritanceFactory init() {
		try {
			InheritanceFactory theInheritanceFactory = (InheritanceFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.se/doctrine/Class/Inheritance"); 
			if (theInheritanceFactory != null) {
				return theInheritanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InheritanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceFactoryImpl() {
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
			case InheritancePackage.INHERITANCE: return createInheritance();
			case InheritancePackage.SIMPLE_INHERITANCE: return createSimpleInheritance();
			case InheritancePackage.CONCRETE_INHERITANCE: return createConcreteInheritance();
			case InheritancePackage.COLUMN_AGGREGATION_INHERITANCE: return createColumnAggregationInheritance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleInheritance createSimpleInheritance() {
		SimpleInheritanceImpl simpleInheritance = new SimpleInheritanceImpl();
		return simpleInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteInheritance createConcreteInheritance() {
		ConcreteInheritanceImpl concreteInheritance = new ConcreteInheritanceImpl();
		return concreteInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnAggregationInheritance createColumnAggregationInheritance() {
		ColumnAggregationInheritanceImpl columnAggregationInheritance = new ColumnAggregationInheritanceImpl();
		return columnAggregationInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritancePackage getInheritancePackage() {
		return (InheritancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InheritancePackage getPackage() {
		return InheritancePackage.eINSTANCE;
	}

} //InheritanceFactoryImpl
