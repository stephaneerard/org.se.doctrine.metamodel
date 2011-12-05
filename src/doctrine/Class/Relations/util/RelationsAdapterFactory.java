/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations.util;

import doctrine.Class.Relations.*;

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
 * @see doctrine.Class.Relations.RelationsPackage
 * @generated
 */
public class RelationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RelationsPackage.eINSTANCE;
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
	protected RelationsSwitch<Adapter> modelSwitch =
		new RelationsSwitch<Adapter>() {
			@Override
			public Adapter caseRelations(Relations object) {
				return createRelationsAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseOneToManyRelationType(OneToManyRelationType object) {
				return createOneToManyRelationTypeAdapter();
			}
			@Override
			public Adapter caseOneToOneRelationType(OneToOneRelationType object) {
				return createOneToOneRelationTypeAdapter();
			}
			@Override
			public Adapter caseManyToManyRelationType(ManyToManyRelationType object) {
				return createManyToManyRelationTypeAdapter();
			}
			@Override
			public Adapter caseRelationType(RelationType object) {
				return createRelationTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Relations.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Relations.Relations
	 * @generated
	 */
	public Adapter createRelationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Relations.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Relations.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Relations.OneToManyRelationType <em>One To Many Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Relations.OneToManyRelationType
	 * @generated
	 */
	public Adapter createOneToManyRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Relations.OneToOneRelationType <em>One To One Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Relations.OneToOneRelationType
	 * @generated
	 */
	public Adapter createOneToOneRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Relations.ManyToManyRelationType <em>Many To Many Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Relations.ManyToManyRelationType
	 * @generated
	 */
	public Adapter createManyToManyRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Relations.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Relations.RelationType
	 * @generated
	 */
	public Adapter createRelationTypeAdapter() {
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

} //RelationsAdapterFactory
