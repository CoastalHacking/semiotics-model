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
 * A representation of the model object '<em><b>Search Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearches <em>Searches</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearchResultDescription <em>Search Result Description</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearchResultCWEs <em>Search Result CW Es</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchGroup()
 * @model
 * @generated
 */
public interface SearchGroup extends Nameable {
	/**
	 * Returns the value of the '<em><b>Searches</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Search}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Search#getSearchGroup <em>Search Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Searches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searches</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchGroup_Searches()
	 * @see us.coastalhacking.semiotics.model.assessment.Search#getSearchGroup
	 * @model opposite="searchGroup" containment="true"
	 * @generated
	 */
	EList<Search> getSearches();

	/**
	 * Returns the value of the '<em><b>Search Result Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Result Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Result Description</em>' attribute.
	 * @see #setSearchResultDescription(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchGroup_SearchResultDescription()
	 * @model unique="false"
	 * @generated
	 */
	String getSearchResultDescription();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearchResultDescription <em>Search Result Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Result Description</em>' attribute.
	 * @see #getSearchResultDescription()
	 * @generated
	 */
	void setSearchResultDescription(String value);

	/**
	 * Returns the value of the '<em><b>Search Result CW Es</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.CWE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Result CW Es</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Result CW Es</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchGroup_SearchResultCWEs()
	 * @model
	 * @generated
	 */
	EList<CWE> getSearchResultCWEs();

} // SearchGroup
