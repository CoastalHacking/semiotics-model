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
 * A representation of the model object '<em><b>Snippet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Snippet#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSnippet()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Snippet<T extends SnippetType> extends Provable {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Data#getSnippets <em>Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' container reference.
	 * @see #setData(Data)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSnippet_Data()
	 * @see us.coastalhacking.semiotics.model.assessment.Data#getSnippets
	 * @model opposite="snippets" transient="false"
	 * @generated
	 */
	Data<? extends DataType> getData();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Snippet#getData <em>Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' container reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data<? extends DataType> value);

} // Snippet
