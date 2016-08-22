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
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlowFrom <em>Flow From</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlowTo <em>Flow To</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends Traceable {
	/**
	 * Returns the value of the '<em><b>Flow From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlowTo <em>Flow To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow From</em>' container reference.
	 * @see #setFlowFrom(Flow)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlow_FlowFrom()
	 * @see us.coastalhacking.semiotics.model.assessment.Flow#getFlowTo
	 * @model opposite="flowTo" transient="false"
	 * @generated
	 */
	Flow getFlowFrom();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlowFrom <em>Flow From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow From</em>' container reference.
	 * @see #getFlowFrom()
	 * @generated
	 */
	void setFlowFrom(Flow value);

	/**
	 * Returns the value of the '<em><b>Flow To</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Flow}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlowFrom <em>Flow From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow To</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlow_FlowTo()
	 * @see us.coastalhacking.semiotics.model.assessment.Flow#getFlowFrom
	 * @model opposite="flowFrom" containment="true"
	 * @generated
	 */
	EList<Flow> getFlowTo();

} // Flow
