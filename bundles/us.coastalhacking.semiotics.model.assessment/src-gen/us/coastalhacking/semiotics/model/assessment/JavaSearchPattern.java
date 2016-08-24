/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Search Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getPatternType <em>Pattern Type</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getSearchFor <em>Search For</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getLimitTo <em>Limit To</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getMatchRule <em>Match Rule</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getCaseSensitivity <em>Case Sensitivity</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getJavaSearchPattern()
 * @model
 * @generated
 */
public interface JavaSearchPattern extends SearchPattern<JavaSearchType> {
	/**
	 * Returns the value of the '<em><b>Pattern Type</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Type</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType
	 * @see #setPatternType(JavaSearchPatternType)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getJavaSearchPattern_PatternType()
	 * @model unique="false"
	 * @generated
	 */
	JavaSearchPatternType getPatternType();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getPatternType <em>Pattern Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Type</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType
	 * @see #getPatternType()
	 * @generated
	 */
	void setPatternType(JavaSearchPatternType value);

	/**
	 * Returns the value of the '<em><b>Search For</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.model.assessment.JavaSearchFor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search For</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search For</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchFor
	 * @see #setSearchFor(JavaSearchFor)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getJavaSearchPattern_SearchFor()
	 * @model unique="false"
	 * @generated
	 */
	JavaSearchFor getSearchFor();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getSearchFor <em>Search For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search For</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchFor
	 * @see #getSearchFor()
	 * @generated
	 */
	void setSearchFor(JavaSearchFor value);

	/**
	 * Returns the value of the '<em><b>Limit To</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.model.assessment.JavaLimitTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit To</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaLimitTo
	 * @see #setLimitTo(JavaLimitTo)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getJavaSearchPattern_LimitTo()
	 * @model unique="false"
	 * @generated
	 */
	JavaLimitTo getLimitTo();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getLimitTo <em>Limit To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit To</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaLimitTo
	 * @see #getLimitTo()
	 * @generated
	 */
	void setLimitTo(JavaLimitTo value);

	/**
	 * Returns the value of the '<em><b>Match Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.model.assessment.JavaMatchRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Rule</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchRule
	 * @see #setMatchRule(JavaMatchRule)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getJavaSearchPattern_MatchRule()
	 * @model unique="false"
	 * @generated
	 */
	JavaMatchRule getMatchRule();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getMatchRule <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Rule</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchRule
	 * @see #getMatchRule()
	 * @generated
	 */
	void setMatchRule(JavaMatchRule value);

	/**
	 * Returns the value of the '<em><b>Case Sensitivity</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Sensitivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitivity</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity
	 * @see #setCaseSensitivity(JavaMatchCaseSensitivity)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getJavaSearchPattern_CaseSensitivity()
	 * @model unique="false"
	 * @generated
	 */
	JavaMatchCaseSensitivity getCaseSensitivity();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getCaseSensitivity <em>Case Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitivity</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity
	 * @see #getCaseSensitivity()
	 * @generated
	 */
	void setCaseSensitivity(JavaMatchCaseSensitivity value);

} // JavaSearchPattern
