/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Columns.util;

import doctrine.Class.Columns.*;

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
 * @see doctrine.Class.Columns.ColumnsPackage
 * @generated
 */
public class ColumnsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ColumnsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ColumnsPackage.eINSTANCE;
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
	protected ColumnsSwitch<Adapter> modelSwitch =
		new ColumnsSwitch<Adapter>() {
			@Override
			public Adapter caseColumns(Columns object) {
				return createColumnsAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseColumnType(ColumnType object) {
				return createColumnTypeAdapter();
			}
			@Override
			public Adapter caseBooleanColumn(BooleanColumn object) {
				return createBooleanColumnAdapter();
			}
			@Override
			public Adapter caseIntegerColumn(IntegerColumn object) {
				return createIntegerColumnAdapter();
			}
			@Override
			public Adapter caseFloatColumn(FloatColumn object) {
				return createFloatColumnAdapter();
			}
			@Override
			public Adapter caseArrayColumn(ArrayColumn object) {
				return createArrayColumnAdapter();
			}
			@Override
			public Adapter caseDecimalColumn(DecimalColumn object) {
				return createDecimalColumnAdapter();
			}
			@Override
			public Adapter caseStringColumn(StringColumn object) {
				return createStringColumnAdapter();
			}
			@Override
			public Adapter caseSerializedColumn(SerializedColumn object) {
				return createSerializedColumnAdapter();
			}
			@Override
			public Adapter caseBlobColumn(BlobColumn object) {
				return createBlobColumnAdapter();
			}
			@Override
			public Adapter caseClobColumn(ClobColumn object) {
				return createClobColumnAdapter();
			}
			@Override
			public Adapter caseTimestampColumn(TimestampColumn object) {
				return createTimestampColumnAdapter();
			}
			@Override
			public Adapter caseTimeColumn(TimeColumn object) {
				return createTimeColumnAdapter();
			}
			@Override
			public Adapter caseDateColumn(DateColumn object) {
				return createDateColumnAdapter();
			}
			@Override
			public Adapter caseEnumColumn(EnumColumn object) {
				return createEnumColumnAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object) {
				return createEnumValueAdapter();
			}
			@Override
			public Adapter caseGzipColumn(GzipColumn object) {
				return createGzipColumnAdapter();
			}
			@Override
			public Adapter caseObjectColumn(ObjectColumn object) {
				return createObjectColumnAdapter();
			}
			@Override
			public Adapter caseLengthColumn(LengthColumn object) {
				return createLengthColumnAdapter();
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
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.Columns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.Columns
	 * @generated
	 */
	public Adapter createColumnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.ColumnType
	 * @generated
	 */
	public Adapter createColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.BooleanColumn <em>Boolean Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.BooleanColumn
	 * @generated
	 */
	public Adapter createBooleanColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.IntegerColumn <em>Integer Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.IntegerColumn
	 * @generated
	 */
	public Adapter createIntegerColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.FloatColumn <em>Float Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.FloatColumn
	 * @generated
	 */
	public Adapter createFloatColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.ArrayColumn <em>Array Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.ArrayColumn
	 * @generated
	 */
	public Adapter createArrayColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.DecimalColumn <em>Decimal Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.DecimalColumn
	 * @generated
	 */
	public Adapter createDecimalColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.StringColumn <em>String Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.StringColumn
	 * @generated
	 */
	public Adapter createStringColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.SerializedColumn <em>Serialized Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.SerializedColumn
	 * @generated
	 */
	public Adapter createSerializedColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.BlobColumn <em>Blob Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.BlobColumn
	 * @generated
	 */
	public Adapter createBlobColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.ClobColumn <em>Clob Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.ClobColumn
	 * @generated
	 */
	public Adapter createClobColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.TimestampColumn <em>Timestamp Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.TimestampColumn
	 * @generated
	 */
	public Adapter createTimestampColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.TimeColumn <em>Time Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.TimeColumn
	 * @generated
	 */
	public Adapter createTimeColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.DateColumn <em>Date Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.DateColumn
	 * @generated
	 */
	public Adapter createDateColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.EnumColumn <em>Enum Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.EnumColumn
	 * @generated
	 */
	public Adapter createEnumColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.GzipColumn <em>Gzip Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.GzipColumn
	 * @generated
	 */
	public Adapter createGzipColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.ObjectColumn <em>Object Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.ObjectColumn
	 * @generated
	 */
	public Adapter createObjectColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link doctrine.Class.Columns.LengthColumn <em>Length Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see doctrine.Class.Columns.LengthColumn
	 * @generated
	 */
	public Adapter createLengthColumnAdapter() {
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

} //ColumnsAdapterFactory
