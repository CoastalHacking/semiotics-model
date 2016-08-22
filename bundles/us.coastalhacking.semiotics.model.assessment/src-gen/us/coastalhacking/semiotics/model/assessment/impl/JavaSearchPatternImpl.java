/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.JavaLimitTo;
import us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity;
import us.coastalhacking.semiotics.model.assessment.JavaMatchRule;
import us.coastalhacking.semiotics.model.assessment.JavaSearchFor;
import us.coastalhacking.semiotics.model.assessment.JavaSearchPattern;
import us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Search Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl#getPatternType <em>Pattern Type</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl#getSearchFor <em>Search For</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl#getLimitTo <em>Limit To</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl#getMatchRule <em>Match Rule</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl#getCaseSensitivity <em>Case Sensitivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaSearchPatternImpl extends MinimalEObjectImpl.Container implements JavaSearchPattern {
	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatternType() <em>Pattern Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternType()
	 * @generated
	 * @ordered
	 */
	protected static final JavaSearchPatternType PATTERN_TYPE_EDEFAULT = JavaSearchPatternType.ECLIPSE;

	/**
	 * The cached value of the '{@link #getPatternType() <em>Pattern Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternType()
	 * @generated
	 * @ordered
	 */
	protected JavaSearchPatternType patternType = PATTERN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchFor() <em>Search For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchFor()
	 * @generated
	 * @ordered
	 */
	protected static final JavaSearchFor SEARCH_FOR_EDEFAULT = JavaSearchFor.CLASS_OR_INTERFACE;

	/**
	 * The cached value of the '{@link #getSearchFor() <em>Search For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchFor()
	 * @generated
	 * @ordered
	 */
	protected JavaSearchFor searchFor = SEARCH_FOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitTo() <em>Limit To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitTo()
	 * @generated
	 * @ordered
	 */
	protected static final JavaLimitTo LIMIT_TO_EDEFAULT = JavaLimitTo.ANY_OCCURRENCES;

	/**
	 * The cached value of the '{@link #getLimitTo() <em>Limit To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitTo()
	 * @generated
	 * @ordered
	 */
	protected JavaLimitTo limitTo = LIMIT_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchRule() <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected static final JavaMatchRule MATCH_RULE_EDEFAULT = JavaMatchRule.WILDCARD;

	/**
	 * The cached value of the '{@link #getMatchRule() <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected JavaMatchRule matchRule = MATCH_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaseSensitivity() <em>Case Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitivity()
	 * @generated
	 * @ordered
	 */
	protected static final JavaMatchCaseSensitivity CASE_SENSITIVITY_EDEFAULT = JavaMatchCaseSensitivity.CASE_INSENSITIVE;

	/**
	 * The cached value of the '{@link #getCaseSensitivity() <em>Case Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitivity()
	 * @generated
	 * @ordered
	 */
	protected JavaMatchCaseSensitivity caseSensitivity = CASE_SENSITIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaSearchPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.JAVA_SEARCH_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSearchPatternType getPatternType() {
		return patternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternType(JavaSearchPatternType newPatternType) {
		JavaSearchPatternType oldPatternType = patternType;
		patternType = newPatternType == null ? PATTERN_TYPE_EDEFAULT : newPatternType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN_TYPE, oldPatternType, patternType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSearchFor getSearchFor() {
		return searchFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchFor(JavaSearchFor newSearchFor) {
		JavaSearchFor oldSearchFor = searchFor;
		searchFor = newSearchFor == null ? SEARCH_FOR_EDEFAULT : newSearchFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.JAVA_SEARCH_PATTERN__SEARCH_FOR, oldSearchFor, searchFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaLimitTo getLimitTo() {
		return limitTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitTo(JavaLimitTo newLimitTo) {
		JavaLimitTo oldLimitTo = limitTo;
		limitTo = newLimitTo == null ? LIMIT_TO_EDEFAULT : newLimitTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.JAVA_SEARCH_PATTERN__LIMIT_TO, oldLimitTo, limitTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMatchRule getMatchRule() {
		return matchRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchRule(JavaMatchRule newMatchRule) {
		JavaMatchRule oldMatchRule = matchRule;
		matchRule = newMatchRule == null ? MATCH_RULE_EDEFAULT : newMatchRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.JAVA_SEARCH_PATTERN__MATCH_RULE, oldMatchRule, matchRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMatchCaseSensitivity getCaseSensitivity() {
		return caseSensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseSensitivity(JavaMatchCaseSensitivity newCaseSensitivity) {
		JavaMatchCaseSensitivity oldCaseSensitivity = caseSensitivity;
		caseSensitivity = newCaseSensitivity == null ? CASE_SENSITIVITY_EDEFAULT : newCaseSensitivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.JAVA_SEARCH_PATTERN__CASE_SENSITIVITY, oldCaseSensitivity, caseSensitivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN:
				return getPattern();
			case AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN_TYPE:
				return getPatternType();
			case AssessmentPackage.JAVA_SEARCH_PATTERN__SEARCH_FOR:
				return getSearchFor();
			case AssessmentPackage.JAVA_SEARCH_PATTERN__LIMIT_TO:
				return getLimitTo();
			case AssessmentPackage.JAVA_SEARCH_PATTERN__MATCH_RULE:
				return getMatchRule();
			case AssessmentPackage.JAVA_SEARCH_PATTERN__CASE_SENSITIVITY:
				return getCaseSensitivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN:
				setPattern((String)newValue);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN_TYPE:
				setPatternType((JavaSearchPatternType)newValue);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__SEARCH_FOR:
				setSearchFor((JavaSearchFor)newValue);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__LIMIT_TO:
				setLimitTo((JavaLimitTo)newValue);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__MATCH_RULE:
				setMatchRule((JavaMatchRule)newValue);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__CASE_SENSITIVITY:
				setCaseSensitivity((JavaMatchCaseSensitivity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN_TYPE:
				setPatternType(PATTERN_TYPE_EDEFAULT);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__SEARCH_FOR:
				setSearchFor(SEARCH_FOR_EDEFAULT);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__LIMIT_TO:
				setLimitTo(LIMIT_TO_EDEFAULT);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__MATCH_RULE:
				setMatchRule(MATCH_RULE_EDEFAULT);
				return;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__CASE_SENSITIVITY:
				setCaseSensitivity(CASE_SENSITIVITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case AssessmentPackage.JAVA_SEARCH_PATTERN__PATTERN_TYPE:
				return patternType != PATTERN_TYPE_EDEFAULT;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__SEARCH_FOR:
				return searchFor != SEARCH_FOR_EDEFAULT;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__LIMIT_TO:
				return limitTo != LIMIT_TO_EDEFAULT;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__MATCH_RULE:
				return matchRule != MATCH_RULE_EDEFAULT;
			case AssessmentPackage.JAVA_SEARCH_PATTERN__CASE_SENSITIVITY:
				return caseSensitivity != CASE_SENSITIVITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(", patternType: ");
		result.append(patternType);
		result.append(", searchFor: ");
		result.append(searchFor);
		result.append(", limitTo: ");
		result.append(limitTo);
		result.append(", matchRule: ");
		result.append(matchRule);
		result.append(", caseSensitivity: ");
		result.append(caseSensitivity);
		result.append(')');
		return result.toString();
	}

} //JavaSearchPatternImpl
