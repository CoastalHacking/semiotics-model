/**
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something that associates, connects, or relates evidence to reviewers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Traceable#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Traceable#getReviewers <em>Reviewers</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getTraceable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Traceable extends Nameable {
	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Provable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Provable#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getTraceable_Evidence()
	 * @see us.coastalhacking.semiotics.model.assessment.Provable#getTraces
	 * @model opposite="traces"
	 * @generated
	 */
	EList<Provable> getEvidence();

	/**
	 * Returns the value of the '<em><b>Reviewers</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Reviewable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewers</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getTraceable_Reviewers()
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable#getTraces
	 * @model opposite="traces"
	 * @generated
	 */
	EList<Reviewable> getReviewers();

} // Traceable
