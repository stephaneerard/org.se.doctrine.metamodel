/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations.impl;

import doctrine.Class.Relations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class RelationsFactoryImpl extends EFactoryImpl implements RelationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationsFactory init() {
		try {
			RelationsFactory theRelationsFactory = (RelationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.se/doctrine/Class/Relations"); 
			if (theRelationsFactory != null) {
				return theRelationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationsFactoryImpl() {
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
			case RelationsPackage.RELATIONS: return createRelations();
			case RelationsPackage.RELATION: return createRelation();
			case RelationsPackage.ONE_TO_MANY_RELATION_TYPE: return createOneToManyRelationType();
			case RelationsPackage.ONE_TO_ONE_RELATION_TYPE: return createOneToOneRelationType();
			case RelationsPackage.MANY_TO_MANY_RELATION_TYPE: return createManyToManyRelationType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RelationsPackage.DATABASE_LEVEL_CASCADING:
				return createDATABASE_LEVEL_CASCADINGFromString(eDataType, initialValue);
			case RelationsPackage.APPLICATION_LEVEL_CASCADING:
				return createAPPLICATION_LEVEL_CASCADINGFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RelationsPackage.DATABASE_LEVEL_CASCADING:
				return convertDATABASE_LEVEL_CASCADINGToString(eDataType, instanceValue);
			case RelationsPackage.APPLICATION_LEVEL_CASCADING:
				return convertAPPLICATION_LEVEL_CASCADINGToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations createRelations() {
		RelationsImpl relations = new RelationsImpl();
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToManyRelationType createOneToManyRelationType() {
		OneToManyRelationTypeImpl oneToManyRelationType = new OneToManyRelationTypeImpl();
		return oneToManyRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToOneRelationType createOneToOneRelationType() {
		OneToOneRelationTypeImpl oneToOneRelationType = new OneToOneRelationTypeImpl();
		return oneToOneRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToManyRelationType createManyToManyRelationType() {
		ManyToManyRelationTypeImpl manyToManyRelationType = new ManyToManyRelationTypeImpl();
		return manyToManyRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATABASE_LEVEL_CASCADING createDATABASE_LEVEL_CASCADINGFromString(EDataType eDataType, String initialValue) {
		DATABASE_LEVEL_CASCADING result = DATABASE_LEVEL_CASCADING.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDATABASE_LEVEL_CASCADINGToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APPLICATION_LEVEL_CASCADING createAPPLICATION_LEVEL_CASCADINGFromString(EDataType eDataType, String initialValue) {
		APPLICATION_LEVEL_CASCADING result = APPLICATION_LEVEL_CASCADING.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAPPLICATION_LEVEL_CASCADINGToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationsPackage getRelationsPackage() {
		return (RelationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationsPackage getPackage() {
		return RelationsPackage.eINSTANCE;
	}

} //RelationsFactoryImpl
