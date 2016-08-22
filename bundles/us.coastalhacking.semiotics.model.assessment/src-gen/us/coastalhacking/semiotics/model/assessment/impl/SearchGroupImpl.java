/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.CWE;
import us.coastalhacking.semiotics.model.assessment.Search;
import us.coastalhacking.semiotics.model.assessment.SearchGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.SearchGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.SearchGroupImpl#getSearches <em>Searches</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.SearchGroupImpl#getSearchResultDescription <em>Search Result Description</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.SearchGroupImpl#getSearchResultCWEs <em>Search Result CW Es</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchGroupImpl extends MinimalEObjectImpl.Container implements SearchGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSearches() <em>Searches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearches()
	 * @generated
	 * @ordered
	 */
	protected EList<Search> searches;

	/**
	 * The default value of the '{@link #getSearchResultDescription() <em>Search Result Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchResultDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_RESULT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchResultDescription() <em>Search Result Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchResultDescription()
	 * @generated
	 * @ordered
	 */
	protected String searchResultDescription = SEARCH_RESULT_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSearchResultCWEs() <em>Search Result CW Es</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchResultCWEs()
	 * @generated
	 * @ordered
	 */
	protected EList<CWE> searchResultCWEs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.SEARCH_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SEARCH_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Search> getSearches() {
		if (searches == null) {
			searches = new EObjectContainmentWithInverseEList<Search>(Search.class, this, AssessmentPackage.SEARCH_GROUP__SEARCHES, AssessmentPackage.SEARCH__SEARCH_GROUP);
		}
		return searches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearchResultDescription() {
		return searchResultDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchResultDescription(String newSearchResultDescription) {
		String oldSearchResultDescription = searchResultDescription;
		searchResultDescription = newSearchResultDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_DESCRIPTION, oldSearchResultDescription, searchResultDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWE> getSearchResultCWEs() {
		if (searchResultCWEs == null) {
			searchResultCWEs = new EObjectResolvingEList<CWE>(CWE.class, this, AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_CW_ES);
		}
		return searchResultCWEs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.SEARCH_GROUP__SEARCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSearches()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.SEARCH_GROUP__SEARCHES:
				return ((InternalEList<?>)getSearches()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.SEARCH_GROUP__NAME:
				return getName();
			case AssessmentPackage.SEARCH_GROUP__SEARCHES:
				return getSearches();
			case AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_DESCRIPTION:
				return getSearchResultDescription();
			case AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_CW_ES:
				return getSearchResultCWEs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssessmentPackage.SEARCH_GROUP__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.SEARCH_GROUP__SEARCHES:
				getSearches().clear();
				getSearches().addAll((Collection<? extends Search>)newValue);
				return;
			case AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_DESCRIPTION:
				setSearchResultDescription((String)newValue);
				return;
			case AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_CW_ES:
				getSearchResultCWEs().clear();
				getSearchResultCWEs().addAll((Collection<? extends CWE>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssessmentPackage.SEARCH_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.SEARCH_GROUP__SEARCHES:
				getSearches().clear();
				return;
			case AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_DESCRIPTION:
				setSearchResultDescription(SEARCH_RESULT_DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_CW_ES:
				getSearchResultCWEs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssessmentPackage.SEARCH_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.SEARCH_GROUP__SEARCHES:
				return searches != null && !searches.isEmpty();
			case AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_DESCRIPTION:
				return SEARCH_RESULT_DESCRIPTION_EDEFAULT == null ? searchResultDescription != null : !SEARCH_RESULT_DESCRIPTION_EDEFAULT.equals(searchResultDescription);
			case AssessmentPackage.SEARCH_GROUP__SEARCH_RESULT_CW_ES:
				return searchResultCWEs != null && !searchResultCWEs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", searchResultDescription: ");
		result.append(searchResultDescription);
		result.append(')');
		return result.toString();
	}

} //SearchGroupImpl
