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
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Flow#getValue <em>Value</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlow()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Flow<T extends FlowType> extends Member<T>, Traceable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlow_Value()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Flow#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowRoot <em>Flow Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference.
	 * @see #setFlows(FlowNode)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlow_Flows()
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowRoot
	 * @model opposite="flowRoot" containment="true"
	 * @generated
	 */
	FlowNode<? extends FlowType> getFlows();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlows <em>Flows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flows</em>' containment reference.
	 * @see #getFlows()
	 * @generated
	 */
	void setFlows(FlowNode<? extends FlowType> value);

} // Flow
