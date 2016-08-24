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
 * A representation of the model object '<em><b>Examinable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something suitable for further review, examination, or analysis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Examinable#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Examinable#getTraces <em>Traces</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Examinable#getSearches <em>Searches</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Examinable#getTasks <em>Tasks</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Examinable#getFindings <em>Findings</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getExaminable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Examinable extends Nameable {
	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Provable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Provable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Evidence identifying why this element should be reviewed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getExaminable_Evidence()
	 * @see us.coastalhacking.semiotics.model.assessment.Provable#getExaminees
	 * @model opposite="examinees"
	 * @generated
	 */
	EList<Provable> getEvidence();

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Traceable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Traceable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Traces identifying attributes or information related to this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traces</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getExaminable_Traces()
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable#getExaminees
	 * @model opposite="examinees"
	 * @generated
	 */
	EList<Traceable> getTraces();

	/**
	 * Returns the value of the '<em><b>Searches</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Searchable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Searchable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Searches related to this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Searches</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getExaminable_Searches()
	 * @see us.coastalhacking.semiotics.model.assessment.Searchable#getExaminees
	 * @model opposite="examinees"
	 * @generated
	 */
	EList<Searchable> getSearches();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Taskable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Taskable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Tasks related to this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getExaminable_Tasks()
	 * @see us.coastalhacking.semiotics.model.assessment.Taskable#getExaminees
	 * @model opposite="examinees"
	 * @generated
	 */
	EList<Taskable> getTasks();

	/**
	 * Returns the value of the '<em><b>Findings</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Findable}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Findable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Reports related to this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Findings</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getExaminable_Findings()
	 * @see us.coastalhacking.semiotics.model.assessment.Findable#getExaminees
	 * @model opposite="examinees"
	 * @generated
	 */
	EList<Findable> getFindings();

} // Examinable
