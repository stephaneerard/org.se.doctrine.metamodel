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
 * A representation of the literals of the enumeration '<em><b>INDEX TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Indexes.IndexesPackage#getINDEX_TYPE()
 * @model
 * @generated
 */
public enum INDEX_TYPE implements Enumerator {
	/**
	 * The '<em><b>FULLTEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	FULLTEXT(0, "FULLTEXT", "FULLTEXT"),

	/**
	 * The '<em><b>UNIQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE(1, "UNIQUE", "UNIQUE"),

	/**
	 * The '<em><b>GIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIST_VALUE
	 * @generated
	 * @ordered
	 */
	GIST(2, "GIST", "GIST"),

	/**
	 * The '<em><b>GIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIN_VALUE
	 * @generated
	 * @ordered
	 */
	GIN(3, "GIN", "GIN");

	/**
	 * The '<em><b>FULLTEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FULLTEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULLTEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULLTEXT_VALUE = 0;

	/**
	 * The '<em><b>UNIQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIQUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIQUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_VALUE = 1;

	/**
	 * The '<em><b>GIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIST_VALUE = 2;

	/**
	 * The '<em><b>GIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>INDEX TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final INDEX_TYPE[] VALUES_ARRAY =
		new INDEX_TYPE[] {
			FULLTEXT,
			UNIQUE,
			GIST,
			GIN,
		};

	/**
	 * A public read-only list of all the '<em><b>INDEX TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<INDEX_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>INDEX TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			INDEX_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>INDEX TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			INDEX_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>INDEX TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_TYPE get(int value) {
		switch (value) {
			case FULLTEXT_VALUE: return FULLTEXT;
			case UNIQUE_VALUE: return UNIQUE;
			case GIST_VALUE: return GIST;
			case GIN_VALUE: return GIN;
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
	private INDEX_TYPE(int value, String name, String literal) {
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
	
} //INDEX_TYPE
