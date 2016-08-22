/**
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something factual or objective in nature
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Provable#getReviewers <em>Reviewers</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Provable#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getProvable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Provable extends Nameable {
	/**
	 * Returns the value of the '<em><b>Reviewers</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Reviewable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewers</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getProvable_Reviewers()
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable#getEvidence
	 * @model opposite="evidence"
	 * @generated
	 */
	EList<Reviewable> getReviewers();

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Traceable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Traceable#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getProvable_Traces()
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable#getEvidence
	 * @model opposite="evidence"
	 * @generated
	 */
	EList<Traceable> getTraces();

} // Provable
