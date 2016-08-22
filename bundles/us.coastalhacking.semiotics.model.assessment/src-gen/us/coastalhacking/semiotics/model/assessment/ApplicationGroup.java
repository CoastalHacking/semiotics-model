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
 * A representation of the model object '<em><b>Application Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getApplications <em>Applications</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getAssessment <em>Assessment</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getApplicationGroup()
 * @model
 * @generated
 */
public interface ApplicationGroup extends Nameable {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Application}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Application#getApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getApplicationGroup_Applications()
	 * @see us.coastalhacking.semiotics.model.assessment.Application#getApplicationGroup
	 * @model opposite="applicationGroup" containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Assessment#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' container reference.
	 * @see #setAssessment(Assessment)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getApplicationGroup_Assessment()
	 * @see us.coastalhacking.semiotics.model.assessment.Assessment#getApplicationGroups
	 * @model opposite="applicationGroups" transient="false"
	 * @generated
	 */
	Assessment getAssessment();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getAssessment <em>Assessment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' container reference.
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(Assessment value);

} // ApplicationGroup
