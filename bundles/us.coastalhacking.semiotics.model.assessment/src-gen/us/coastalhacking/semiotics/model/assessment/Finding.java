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
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Finding#getDetails <em>Details</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Finding#getRemediation <em>Remediation</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Finding#getReproducer <em>Reproducer</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Finding#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFinding()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Finding<T extends FindingType> extends Member<T>, Findable, Describable {
	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFinding_Details()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Finding#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

	/**
	 * Returns the value of the '<em><b>Remediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remediation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remediation</em>' attribute.
	 * @see #setRemediation(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFinding_Remediation()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
	 * @generated
	 */
	String getRemediation();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Finding#getRemediation <em>Remediation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remediation</em>' attribute.
	 * @see #getRemediation()
	 * @generated
	 */
	void setRemediation(String value);

	/**
	 * Returns the value of the '<em><b>Reproducer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reproducer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reproducer</em>' attribute.
	 * @see #setReproducer(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFinding_Reproducer()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
	 * @generated
	 */
	String getReproducer();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Finding#getReproducer <em>Reproducer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reproducer</em>' attribute.
	 * @see #getReproducer()
	 * @generated
	 */
	void setReproducer(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute.
	 * @see #setReferences(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFinding_References()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
	 * @generated
	 */
	String getReferences();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Finding#getReferences <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' attribute.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(String value);

} // Finding
