/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.Reviewable;
import us.coastalhacking.semiotics.model.assessment.Search;
import us.coastalhacking.semiotics.model.assessment.SearchGroup;
import us.coastalhacking.semiotics.model.assessment.SearchPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.SearchImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.SearchImpl#getReviewers <em>Reviewers</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.SearchImpl#getSearchGroup <em>Search Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.SearchImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchImpl extends MinimalEObjectImpl.Container implements Search {
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
	 * The cached value of the '{@link #getReviewers() <em>Reviewers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewers()
	 * @generated
	 * @ordered
	 */
	protected Reviewable reviewers;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected SearchPattern pattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.SEARCH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SEARCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reviewable getReviewers() {
		if (reviewers != null && reviewers.eIsProxy()) {
			InternalEObject oldReviewers = (InternalEObject)reviewers;
			reviewers = (Reviewable)eResolveProxy(oldReviewers);
			if (reviewers != oldReviewers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessmentPackage.SEARCH__REVIEWERS, oldReviewers, reviewers));
			}
		}
		return reviewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reviewable basicGetReviewers() {
		return reviewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewers(Reviewable newReviewers, NotificationChain msgs) {
		Reviewable oldReviewers = reviewers;
		reviewers = newReviewers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.SEARCH__REVIEWERS, oldReviewers, newReviewers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewers(Reviewable newReviewers) {
		if (newReviewers != reviewers) {
			NotificationChain msgs = null;
			if (reviewers != null)
				msgs = ((InternalEObject)reviewers).eInverseRemove(this, AssessmentPackage.REVIEWABLE__SEARCHES, Reviewable.class, msgs);
			if (newReviewers != null)
				msgs = ((InternalEObject)newReviewers).eInverseAdd(this, AssessmentPackage.REVIEWABLE__SEARCHES, Reviewable.class, msgs);
			msgs = basicSetReviewers(newReviewers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SEARCH__REVIEWERS, newReviewers, newReviewers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchGroup getSearchGroup() {
		if (eContainerFeatureID() != AssessmentPackage.SEARCH__SEARCH_GROUP) return null;
		return (SearchGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchGroup basicGetSearchGroup() {
		if (eContainerFeatureID() != AssessmentPackage.SEARCH__SEARCH_GROUP) return null;
		return (SearchGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchGroup(SearchGroup newSearchGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSearchGroup, AssessmentPackage.SEARCH__SEARCH_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchGroup(SearchGroup newSearchGroup) {
		if (newSearchGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.SEARCH__SEARCH_GROUP && newSearchGroup != null)) {
			if (EcoreUtil.isAncestor(this, newSearchGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSearchGroup != null)
				msgs = ((InternalEObject)newSearchGroup).eInverseAdd(this, AssessmentPackage.SEARCH_GROUP__SEARCHES, SearchGroup.class, msgs);
			msgs = basicSetSearchGroup(newSearchGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SEARCH__SEARCH_GROUP, newSearchGroup, newSearchGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchPattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(SearchPattern newPattern, NotificationChain msgs) {
		SearchPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.SEARCH__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(SearchPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.SEARCH__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.SEARCH__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SEARCH__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.SEARCH__REVIEWERS:
				if (reviewers != null)
					msgs = ((InternalEObject)reviewers).eInverseRemove(this, AssessmentPackage.REVIEWABLE__SEARCHES, Reviewable.class, msgs);
				return basicSetReviewers((Reviewable)otherEnd, msgs);
			case AssessmentPackage.SEARCH__SEARCH_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSearchGroup((SearchGroup)otherEnd, msgs);
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
			case AssessmentPackage.SEARCH__REVIEWERS:
				return basicSetReviewers(null, msgs);
			case AssessmentPackage.SEARCH__SEARCH_GROUP:
				return basicSetSearchGroup(null, msgs);
			case AssessmentPackage.SEARCH__PATTERN:
				return basicSetPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AssessmentPackage.SEARCH__SEARCH_GROUP:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.SEARCH_GROUP__SEARCHES, SearchGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.SEARCH__NAME:
				return getName();
			case AssessmentPackage.SEARCH__REVIEWERS:
				if (resolve) return getReviewers();
				return basicGetReviewers();
			case AssessmentPackage.SEARCH__SEARCH_GROUP:
				if (resolve) return getSearchGroup();
				return basicGetSearchGroup();
			case AssessmentPackage.SEARCH__PATTERN:
				return getPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssessmentPackage.SEARCH__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.SEARCH__REVIEWERS:
				setReviewers((Reviewable)newValue);
				return;
			case AssessmentPackage.SEARCH__SEARCH_GROUP:
				setSearchGroup((SearchGroup)newValue);
				return;
			case AssessmentPackage.SEARCH__PATTERN:
				setPattern((SearchPattern)newValue);
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
			case AssessmentPackage.SEARCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.SEARCH__REVIEWERS:
				setReviewers((Reviewable)null);
				return;
			case AssessmentPackage.SEARCH__SEARCH_GROUP:
				setSearchGroup((SearchGroup)null);
				return;
			case AssessmentPackage.SEARCH__PATTERN:
				setPattern((SearchPattern)null);
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
			case AssessmentPackage.SEARCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.SEARCH__REVIEWERS:
				return reviewers != null;
			case AssessmentPackage.SEARCH__SEARCH_GROUP:
				return basicGetSearchGroup() != null;
			case AssessmentPackage.SEARCH__PATTERN:
				return pattern != null;
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
		result.append(')');
		return result.toString();
	}

} //SearchImpl
