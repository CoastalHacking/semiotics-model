/**
 */
package us.coastalhacking.semiotics.model.assessment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Matches#getPattern <em>Pattern</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Matches#getRegexType <em>Regex Type</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getMatches()
 * @model
 * @generated
 */
public interface Matches extends DataFlowConstraint {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getMatches_Pattern()
	 * @model unique="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Matches#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Regex Type</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.model.assessment.MatcherRegex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex Type</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.MatcherRegex
	 * @see #setRegexType(MatcherRegex)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getMatches_RegexType()
	 * @model unique="false"
	 * @generated
	 */
	MatcherRegex getRegexType();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Matches#getRegexType <em>Regex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex Type</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.MatcherRegex
	 * @see #getRegexType()
	 * @generated
	 */
	void setRegexType(MatcherRegex value);

} // Matches
