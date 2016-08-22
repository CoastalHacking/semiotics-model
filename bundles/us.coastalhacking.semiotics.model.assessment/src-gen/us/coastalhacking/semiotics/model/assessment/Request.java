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
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Request#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends Data {
	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Response#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(Response)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getRequest_Response()
	 * @see us.coastalhacking.semiotics.model.assessment.Response#getRequest
	 * @model opposite="request"
	 * @generated
	 */
	Response getResponse();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Request#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Response value);

} // Request
