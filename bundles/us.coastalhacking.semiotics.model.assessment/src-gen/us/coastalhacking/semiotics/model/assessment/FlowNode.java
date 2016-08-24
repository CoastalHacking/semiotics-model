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
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowFrom <em>Flow From</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowRoot <em>Flow Root</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowTo <em>Flow To</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlowNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FlowNode<T extends FlowType> extends Traceable {
	/**
	 * Returns the value of the '<em><b>Flow From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowTo <em>Flow To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow From</em>' container reference.
	 * @see #setFlowFrom(FlowNode)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlowNode_FlowFrom()
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowTo
	 * @model opposite="flowTo" transient="false"
	 * @generated
	 */
	FlowNode<? extends FlowType> getFlowFrom();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowFrom <em>Flow From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow From</em>' container reference.
	 * @see #getFlowFrom()
	 * @generated
	 */
	void setFlowFrom(FlowNode<? extends FlowType> value);

	/**
	 * Returns the value of the '<em><b>Flow Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Root</em>' container reference.
	 * @see #setFlowRoot(Flow)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlowNode_FlowRoot()
	 * @see us.coastalhacking.semiotics.model.assessment.Flow#getFlows
	 * @model opposite="flows" transient="false"
	 * @generated
	 */
	Flow<? extends FlowType> getFlowRoot();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowRoot <em>Flow Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Root</em>' container reference.
	 * @see #getFlowRoot()
	 * @generated
	 */
	void setFlowRoot(Flow<? extends FlowType> value);

	/**
	 * Returns the value of the '<em><b>Flow To</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.FlowNode}&lt;? extends us.coastalhacking.semiotics.model.assessment.FlowType>.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowFrom <em>Flow From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow To</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlowNode_FlowTo()
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowFrom
	 * @model opposite="flowFrom" containment="true"
	 * @generated
	 */
	EList<FlowNode<? extends FlowType>> getFlowTo();

} // FlowNode
