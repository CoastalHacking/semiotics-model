/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Java Limit To</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getJavaLimitTo()
 * @model
 * @generated
 */
public enum JavaLimitTo implements Enumerator {
	/**
	 * The '<em><b>Any Occurrences</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OCCURRENCES_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_OCCURRENCES(0, "AnyOccurrences", "AnyOccurrences"),

	/**
	 * The '<em><b>Declaration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATION_VALUE
	 * @generated
	 * @ordered
	 */
	DECLARATION(0, "Declaration", "Declaration"),

	/**
	 * The '<em><b>References</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCES_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCES(0, "References", "References"),

	/**
	 * The '<em><b>Any Extenders Or Implementors</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_EXTENDERS_OR_IMPLEMENTORS_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_EXTENDERS_OR_IMPLEMENTORS(0, "AnyExtendersOrImplementors", "AnyExtendersOrImplementors");

	/**
	 * The '<em><b>Any Occurrences</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Occurrences</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_OCCURRENCES
	 * @model name="AnyOccurrences"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_OCCURRENCES_VALUE = 0;

	/**
	 * The '<em><b>Declaration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Declaration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECLARATION
	 * @model name="Declaration"
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_VALUE = 0;

	/**
	 * The '<em><b>References</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>References</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCES
	 * @model name="References"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCES_VALUE = 0;

	/**
	 * The '<em><b>Any Extenders Or Implementors</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Extenders Or Implementors</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_EXTENDERS_OR_IMPLEMENTORS
	 * @model name="AnyExtendersOrImplementors"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_EXTENDERS_OR_IMPLEMENTORS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Java Limit To</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JavaLimitTo[] VALUES_ARRAY =
		new JavaLimitTo[] {
			ANY_OCCURRENCES,
			DECLARATION,
			REFERENCES,
			ANY_EXTENDERS_OR_IMPLEMENTORS,
		};

	/**
	 * A public read-only list of all the '<em><b>Java Limit To</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JavaLimitTo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Java Limit To</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaLimitTo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JavaLimitTo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Java Limit To</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaLimitTo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JavaLimitTo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Java Limit To</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaLimitTo get(int value) {
		switch (value) {
			case ANY_OCCURRENCES_VALUE: return ANY_OCCURRENCES;
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
	private JavaLimitTo(int value, String name, String literal) {
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
	
} //JavaLimitTo
