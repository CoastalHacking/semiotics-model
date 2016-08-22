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
 * A representation of the model object '<em><b>Searchable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Searchable#getReviewers <em>Reviewers</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Searchable extends Nameable {
	/**
	 * Returns the value of the '<em><b>Reviewers</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewers</em>' reference.
	 * @see #setReviewers(Reviewable)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchable_Reviewers()
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable#getSearches
	 * @model opposite="searches"
	 * @generated
	 */
	Reviewable getReviewers();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Searchable#getReviewers <em>Reviewers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewers</em>' reference.
	 * @see #getReviewers()
	 * @generated
	 */
	void setReviewers(Reviewable value);

} // Searchable
