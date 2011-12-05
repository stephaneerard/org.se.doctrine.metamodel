/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Indexes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>INDEX SORTING</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Indexes.IndexesPackage#getINDEX_SORTING()
 * @model
 * @generated
 */
public enum INDEX_SORTING implements Enumerator {
	/**
	 * The '<em><b>ASC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASC_VALUE
	 * @generated
	 * @ordered
	 */
	ASC(0, "ASC", "ASC"),

	/**
	 * The '<em><b>DESC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESC_VALUE
	 * @generated
	 * @ordered
	 */
	DESC(1, "DESC", "DESC");

	/**
	 * The '<em><b>ASC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASC_VALUE = 0;

	/**
	 * The '<em><b>DESC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESC_VALUE = 1;

	/**
	 * An array of all the '<em><b>INDEX SORTING</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final INDEX_SORTING[] VALUES_ARRAY =
		new INDEX_SORTING[] {
			ASC,
			DESC,
		};

	/**
	 * A public read-only list of all the '<em><b>INDEX SORTING</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<INDEX_SORTING> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>INDEX SORTING</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_SORTING get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			INDEX_SORTING result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>INDEX SORTING</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_SORTING getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			INDEX_SORTING result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>INDEX SORTING</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_SORTING get(int value) {
		switch (value) {
			case ASC_VALUE: return ASC;
			case DESC_VALUE: return DESC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private INDEX_SORTING(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //INDEX_SORTING
