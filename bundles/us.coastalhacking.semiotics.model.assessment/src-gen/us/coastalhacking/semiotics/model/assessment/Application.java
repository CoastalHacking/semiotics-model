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
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Application#getApplicationGroup <em>Application Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Application#getFlowGroups <em>Flow Groups</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Application#getControlGroups <em>Control Groups</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Application#getDataGroups <em>Data Groups</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Nameable {
	/**
	 * Returns the value of the '<em><b>Application Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Group</em>' container reference.
	 * @see #setApplicationGroup(ApplicationGroup)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getApplication_ApplicationGroup()
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getApplications
	 * @model opposite="applications" transient="false"
	 * @generated
	 */
	ApplicationGroup getApplicationGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Application#getApplicationGroup <em>Application Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Group</em>' container reference.
	 * @see #getApplicationGroup()
	 * @generated
	 */
	void setApplicationGroup(ApplicationGroup value);

	/**
	 * Returns the value of the '<em><b>Flow Groups</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.FlowGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Groups</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getApplication_FlowGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowGroup> getFlowGroups();

	/**
	 * Returns the value of the '<em><b>Control Groups</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.ControlGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Groups</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getApplication_ControlGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlGroup> getControlGroups();

	/**
	 * Returns the value of the '<em><b>Data Groups</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.DataGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Groups</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getApplication_DataGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataGroup> getDataGroups();

} // Application
