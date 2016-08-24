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
 * A representation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.WebApplication#getInternalURL <em>Internal URL</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.WebApplication#getExternalURL <em>External URL</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getWebApplication()
 * @model
 * @generated
 */
public interface WebApplication extends Application<WebApplicationType> {
	/**
	 * Returns the value of the '<em><b>Internal URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal URL</em>' attribute.
	 * @see #setInternalURL(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getWebApplication_InternalURL()
	 * @model unique="false"
	 * @generated
	 */
	String getInternalURL();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.WebApplication#getInternalURL <em>Internal URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal URL</em>' attribute.
	 * @see #getInternalURL()
	 * @generated
	 */
	void setInternalURL(String value);

	/**
	 * Returns the value of the '<em><b>External URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External URL</em>' attribute.
	 * @see #setExternalURL(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getWebApplication_ExternalURL()
	 * @model unique="false"
	 * @generated
	 */
	String getExternalURL();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.WebApplication#getExternalURL <em>External URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External URL</em>' attribute.
	 * @see #getExternalURL()
	 * @generated
	 */
	void setExternalURL(String value);

} // WebApplication
