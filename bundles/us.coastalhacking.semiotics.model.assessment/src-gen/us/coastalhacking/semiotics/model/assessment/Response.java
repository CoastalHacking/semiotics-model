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
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Response#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends Data {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Request#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Request)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getResponse_Request()
	 * @see us.coastalhacking.semiotics.model.assessment.Request#getResponse
	 * @model opposite="response"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Response#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

} // Response
