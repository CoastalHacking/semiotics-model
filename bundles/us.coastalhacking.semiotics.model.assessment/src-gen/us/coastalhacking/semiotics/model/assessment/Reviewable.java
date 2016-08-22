/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reviewable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something suitable for further examination or analysis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getTraces <em>Traces</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getSearches <em>Searches</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getReviewable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Reviewable extends Nameable {
	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Provable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Provable#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Evidence identifying why this element should be reviewed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getReviewable_Evidence()
	 * @see us.coastalhacking.semiotics.model.assessment.Provable#getReviewers
	 * @model opposite="reviewers"
	 * @generated
	 */
	EList<Provable> getEvidence();

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Traceable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Traceable#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Traces identifying attributes or information related to this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traces</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getReviewable_Traces()
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable#getReviewers
	 * @model opposite="reviewers"
	 * @generated
	 */
	EList<Traceable> getTraces();

	/**
	 * Returns the value of the '<em><b>Searches</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Searchable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Searchable#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Searches related to this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Searches</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getReviewable_Searches()
	 * @see us.coastalhacking.semiotics.model.assessment.Searchable#getReviewers
	 * @model opposite="reviewers"
	 * @generated
	 */
	EList<Searchable> getSearches();

} // Reviewable
