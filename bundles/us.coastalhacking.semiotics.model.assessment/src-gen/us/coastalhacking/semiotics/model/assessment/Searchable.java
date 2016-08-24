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
 * <!-- begin-model-doc -->
 * *
 * Something that can be searched
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Searchable#getExaminees <em>Examinees</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Searchable extends Nameable {
	/**
	 * Returns the value of the '<em><b>Examinees</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Examinable#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examinees</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examinees</em>' reference.
	 * @see #setExaminees(Examinable)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchable_Examinees()
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable#getSearches
	 * @model opposite="searches"
	 * @generated
	 */
	Examinable getExaminees();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Searchable#getExaminees <em>Examinees</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examinees</em>' reference.
	 * @see #getExaminees()
	 * @generated
	 */
	void setExaminees(Examinable value);

} // Searchable
