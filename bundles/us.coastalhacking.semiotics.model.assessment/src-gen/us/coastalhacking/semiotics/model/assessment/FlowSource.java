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
 * A representation of the model object '<em><b>Flow Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.FlowSource#getFlowGroup <em>Flow Group</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlowSource()
 * @model
 * @generated
 */
public interface FlowSource extends Flow {
	/**
	 * Returns the value of the '<em><b>Flow Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.FlowGroup#getFlowSources <em>Flow Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Group</em>' container reference.
	 * @see #setFlowGroup(FlowGroup)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlowSource_FlowGroup()
	 * @see us.coastalhacking.semiotics.model.assessment.FlowGroup#getFlowSources
	 * @model opposite="flowSources" transient="false"
	 * @generated
	 */
	FlowGroup getFlowGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.FlowSource#getFlowGroup <em>Flow Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Group</em>' container reference.
	 * @see #getFlowGroup()
	 * @generated
	 */
	void setFlowGroup(FlowGroup value);

} // FlowSource
