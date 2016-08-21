/**
 */
package us.coastalhacking.semiotics.model.flow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import us.coastalhacking.semiotics.model.flow.FlowPackage;
import us.coastalhacking.semiotics.model.flow.MatcherRegex;
import us.coastalhacking.semiotics.model.flow.Matches;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matches</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.impl.MatchesImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.impl.MatchesImpl#getRegexType <em>Regex Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchesImpl extends DataFlowConstraintImpl implements Matches {
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
	 * The default value of the '{@link #getRegexType() <em>Regex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexType()
	 * @generated
	 * @ordered
	 */
	protected static final MatcherRegex REGEX_TYPE_EDEFAULT = MatcherRegex.JAVA;

	/**
	 * The cached value of the '{@link #getRegexType() <em>Regex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexType()
	 * @generated
	 * @ordered
	 */
	protected MatcherRegex regexType = REGEX_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.MATCHES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.MATCHES__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatcherRegex getRegexType() {
		return regexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexType(MatcherRegex newRegexType) {
		MatcherRegex oldRegexType = regexType;
		regexType = newRegexType == null ? REGEX_TYPE_EDEFAULT : newRegexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.MATCHES__REGEX_TYPE, oldRegexType, regexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.MATCHES__PATTERN:
				return getPattern();
			case FlowPackage.MATCHES__REGEX_TYPE:
				return getRegexType();
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
			case FlowPackage.MATCHES__PATTERN:
				setPattern((String)newValue);
				return;
			case FlowPackage.MATCHES__REGEX_TYPE:
				setRegexType((MatcherRegex)newValue);
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
			case FlowPackage.MATCHES__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case FlowPackage.MATCHES__REGEX_TYPE:
				setRegexType(REGEX_TYPE_EDEFAULT);
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
			case FlowPackage.MATCHES__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case FlowPackage.MATCHES__REGEX_TYPE:
				return regexType != REGEX_TYPE_EDEFAULT;
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
		result.append(", regexType: ");
		result.append(regexType);
		result.append(')');
		return result.toString();
	}

} //MatchesImpl
