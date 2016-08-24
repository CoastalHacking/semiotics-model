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
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearchResultCWEs <em>Search Result CW Es</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getSearchGroup()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SearchGroup<T extends SearchType> extends GroupableMembered<T, Applicational>, Describable {
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
