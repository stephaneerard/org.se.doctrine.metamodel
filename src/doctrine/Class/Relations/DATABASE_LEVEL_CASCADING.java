/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package doctrine.Class.Relations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DATABASE LEVEL CASCADING</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see doctrine.Class.Relations.RelationsPackage#getDATABASE_LEVEL_CASCADING()
 * @model
 * @generated
 */
public enum DATABASE_LEVEL_CASCADING implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(5, "NONE", "NONE"),

	/**
	 * The '<em><b>CASCADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASCADE_VALUE
	 * @generated
	 * @ordered
	 */
	CASCADE(0, "CASCADE", "CASCADE"),

	/**
	 * The '<em><b>SET NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_NULL_VALUE
	 * @generated
	 * @ordered
	 */
	SET_NULL(2, "SET_NULL", "SET_NULL"),

	/**
	 * The '<em><b>NO ACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ACTION(1, "NO_ACTION", "NO_ACTION"),

	/**
	 * The '<em><b>RESTRICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICT_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICT(3, "RESTRICT", "RESTRICT"),

	/**
	 * The '<em><b>SET DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	SET_DEFAULT(4, "SET_DEFAULT", "SET_DEFAULT");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 5;

	/**
	 * The '<em><b>CASCADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASCADE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASCADE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_VALUE = 0;

	/**
	 * The '<em><b>SET NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_NULL_VALUE = 2;

	/**
	 * The '<em><b>NO ACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO ACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_ACTION_VALUE = 1;

	/**
	 * The '<em><b>RESTRICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESTRICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTRICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICT_VALUE = 3;

	/**
	 * The '<em><b>SET DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_DEFAULT_VALUE = 4;

	/**
	 * An array of all the '<em><b>DATABASE LEVEL CASCADING</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DATABASE_LEVEL_CASCADING[] VALUES_ARRAY =
		new DATABASE_LEVEL_CASCADING[] {
			NONE,
			CASCADE,
			SET_NULL,
			NO_ACTION,
			RESTRICT,
			SET_DEFAULT,
		};

	/**
	 * A public read-only list of all the '<em><b>DATABASE LEVEL CASCADING</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DATABASE_LEVEL_CASCADING> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DATABASE LEVEL CASCADING</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DATABASE_LEVEL_CASCADING get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DATABASE_LEVEL_CASCADING result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DATABASE LEVEL CASCADING</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DATABASE_LEVEL_CASCADING getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DATABASE_LEVEL_CASCADING result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DATABASE LEVEL CASCADING</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DATABASE_LEVEL_CASCADING get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case CASCADE_VALUE: return CASCADE;
			case SET_NULL_VALUE: return SET_NULL;
			case NO_ACTION_VALUE: return NO_ACTION;
			case RESTRICT_VALUE: return RESTRICT;
			case SET_DEFAULT_VALUE: return SET_DEFAULT;
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
	private DATABASE_LEVEL_CASCADING(int value, String name, String literal) {
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
	
} //DATABASE_LEVEL_CASCADING
