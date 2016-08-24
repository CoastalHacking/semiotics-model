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
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Data#getSnippets <em>Snippets</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Data#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getData()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Data<T extends DataType> extends Member<T>, Provable {
	/**
	 * Returns the value of the '<em><b>Snippets</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Snippet}&lt;? extends us.coastalhacking.semiotics.model.assessment.SnippetType>.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Snippet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippets</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getData_Snippets()
	 * @see us.coastalhacking.semiotics.model.assessment.Snippet#getData
	 * @model opposite="data" containment="true"
	 * @generated
	 */
	EList<Snippet<? extends SnippetType>> getSnippets();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getData_Data()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Data#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // Data
