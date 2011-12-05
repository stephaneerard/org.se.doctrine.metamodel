/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Indexes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see doctrine.Class.Indexes.IndexesFactory
 * @model kind="package"
 * @generated
 */
public interface IndexesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Indexes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.se/doctrine/Class/Indexes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "indexes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IndexesPackage eINSTANCE = doctrine.Class.Indexes.impl.IndexesPackageImpl.init();

	/**
	 * The meta object id for the '{@link doctrine.Class.Indexes.impl.IndexesImpl <em>Indexes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Indexes.impl.IndexesImpl
	 * @see doctrine.Class.Indexes.impl.IndexesPackageImpl#getIndexes()
	 * @generated
	 */
	int INDEXES = 0;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXES__INDEXES = 0;

	/**
	 * The number of structural features of the '<em>Indexes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link doctrine.Class.Indexes.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Indexes.impl.IndexImpl
	 * @see doctrine.Class.Indexes.impl.IndexesPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Sorting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__SORTING = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__PRIMARY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link doctrine.Class.Indexes.INDEX_SORTING <em>INDEX SORTING</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Indexes.INDEX_SORTING
	 * @see doctrine.Class.Indexes.impl.IndexesPackageImpl#getINDEX_SORTING()
	 * @generated
	 */
	int INDEX_SORTING = 2;

	/**
	 * The meta object id for the '{@link doctrine.Class.Indexes.INDEX_TYPE <em>INDEX TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doctrine.Class.Indexes.INDEX_TYPE
	 * @see doctrine.Class.Indexes.impl.IndexesPackageImpl#getINDEX_TYPE()
	 * @generated
	 */
	int INDEX_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link doctrine.Class.Indexes.Indexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexes</em>'.
	 * @see doctrine.Class.Indexes.Indexes
	 * @generated
	 */
	EClass getIndexes();

	/**
	 * Returns the meta object for the containment reference list '{@link doctrine.Class.Indexes.Indexes#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see doctrine.Class.Indexes.Indexes#getIndexes()
	 * @see #getIndexes()
	 * @generated
	 */
	EReference getIndexes_Indexes();

	/**
	 * Returns the meta object for class '{@link doctrine.Class.Indexes.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see doctrine.Class.Indexes.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the reference list '{@link doctrine.Class.Indexes.Index#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see doctrine.Class.Indexes.Index#getFields()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Fields();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Indexes.Index#getSorting <em>Sorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting</em>'.
	 * @see doctrine.Class.Indexes.Index#getSorting()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Sorting();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Indexes.Index#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see doctrine.Class.Indexes.Index#getLength()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Length();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Indexes.Index#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see doctrine.Class.Indexes.Index#isPrimary()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Primary();

	/**
	 * Returns the meta object for the attribute '{@link doctrine.Class.Indexes.Index#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see doctrine.Class.Indexes.Index#getType()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Type();

	/**
	 * Returns the meta object for enum '{@link doctrine.Class.Indexes.INDEX_SORTING <em>INDEX SORTING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>INDEX SORTING</em>'.
	 * @see doctrine.Class.Indexes.INDEX_SORTING
	 * @generated
	 */
	EEnum getINDEX_SORTING();

	/**
	 * Returns the meta object for enum '{@link doctrine.Class.Indexes.INDEX_TYPE <em>INDEX TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>INDEX TYPE</em>'.
	 * @see doctrine.Class.Indexes.INDEX_TYPE
	 * @generated
	 */
	EEnum getINDEX_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IndexesFactory getIndexesFactory();

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
		 * The meta object literal for the '{@link doctrine.Class.Indexes.impl.IndexesImpl <em>Indexes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Indexes.impl.IndexesImpl
		 * @see doctrine.Class.Indexes.impl.IndexesPackageImpl#getIndexes()
		 * @generated
		 */
		EClass INDEXES = eINSTANCE.getIndexes();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEXES__INDEXES = eINSTANCE.getIndexes_Indexes();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Indexes.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Indexes.impl.IndexImpl
		 * @see doctrine.Class.Indexes.impl.IndexesPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__FIELDS = eINSTANCE.getIndex_Fields();

		/**
		 * The meta object literal for the '<em><b>Sorting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__SORTING = eINSTANCE.getIndex_Sorting();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__LENGTH = eINSTANCE.getIndex_Length();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__PRIMARY = eINSTANCE.getIndex_Primary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__TYPE = eINSTANCE.getIndex_Type();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Indexes.INDEX_SORTING <em>INDEX SORTING</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Indexes.INDEX_SORTING
		 * @see doctrine.Class.Indexes.impl.IndexesPackageImpl#getINDEX_SORTING()
		 * @generated
		 */
		EEnum INDEX_SORTING = eINSTANCE.getINDEX_SORTING();

		/**
		 * The meta object literal for the '{@link doctrine.Class.Indexes.INDEX_TYPE <em>INDEX TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doctrine.Class.Indexes.INDEX_TYPE
		 * @see doctrine.Class.Indexes.impl.IndexesPackageImpl#getINDEX_TYPE()
		 * @generated
		 */
		EEnum INDEX_TYPE = eINSTANCE.getINDEX_TYPE();

	}

} //IndexesPackage
