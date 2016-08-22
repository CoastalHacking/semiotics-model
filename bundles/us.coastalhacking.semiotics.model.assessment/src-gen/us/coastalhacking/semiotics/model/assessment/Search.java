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
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Search#getSearchGroup <em>Search Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Search#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends Searchable {
	/**
	 * Returns the value of the '<em><b>Search Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Group</em>' container reference.
	 * @see #setSearchGroup(SearchGroup)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearch_SearchGroup()
	 * @see us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearches
	 * @model opposite="searches" transient="false"
	 * @generated
	 */
	SearchGroup getSearchGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Search#getSearchGroup <em>Search Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Group</em>' container reference.
	 * @see #getSearchGroup()
	 * @generated
	 */
	void setSearchGroup(SearchGroup value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(SearchPattern)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearch_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	SearchPattern getPattern();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Search#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(SearchPattern value);

} // Search
