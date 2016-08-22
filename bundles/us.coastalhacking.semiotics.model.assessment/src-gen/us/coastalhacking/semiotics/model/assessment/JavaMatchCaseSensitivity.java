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
 * A representation of the literals of the enumeration '<em><b>Java Match Case Sensitivity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getJavaMatchCaseSensitivity()
 * @model
 * @generated
 */
public enum JavaMatchCaseSensitivity implements Enumerator {
	/**
	 * The '<em><b>Case Insensitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASE_INSENSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CASE_INSENSITIVE(0, "CaseInsensitive", "CaseInsensitive"),

	/**
	 * The '<em><b>Case Sensitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASE_SENSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CASE_SENSITIVE(0, "CaseSensitive", "CaseSensitive");

	/**
	 * The '<em><b>Case Insensitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Case Insensitive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASE_INSENSITIVE
	 * @model name="CaseInsensitive"
	 * @generated
	 * @ordered
	 */
	public static final int CASE_INSENSITIVE_VALUE = 0;

	/**
	 * The '<em><b>Case Sensitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Case Sensitive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASE_SENSITIVE
	 * @model name="CaseSensitive"
	 * @generated
	 * @ordered
	 */
	public static final int CASE_SENSITIVE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Java Match Case Sensitivity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JavaMatchCaseSensitivity[] VALUES_ARRAY =
		new JavaMatchCaseSensitivity[] {
			CASE_INSENSITIVE,
			CASE_SENSITIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Java Match Case Sensitivity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JavaMatchCaseSensitivity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Java Match Case Sensitivity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaMatchCaseSensitivity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JavaMatchCaseSensitivity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Java Match Case Sensitivity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaMatchCaseSensitivity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JavaMatchCaseSensitivity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Java Match Case Sensitivity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaMatchCaseSensitivity get(int value) {
		switch (value) {
			case CASE_INSENSITIVE_VALUE: return CASE_INSENSITIVE;
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
	private JavaMatchCaseSensitivity(int value, String name, String literal) {
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
	
} //JavaMatchCaseSensitivity
