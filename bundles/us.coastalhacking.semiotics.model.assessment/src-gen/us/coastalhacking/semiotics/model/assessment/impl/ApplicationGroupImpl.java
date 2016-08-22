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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.model.assessment.Application;
import us.coastalhacking.semiotics.model.assessment.ApplicationGroup;
import us.coastalhacking.semiotics.model.assessment.Assessment;
import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationGroupImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationGroupImpl#getAssessment <em>Assessment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationGroupImpl extends MinimalEObjectImpl.Container implements ApplicationGroup {
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
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.APPLICATION_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentWithInverseEList<Application>(Application.class, this, AssessmentPackage.APPLICATION_GROUP__APPLICATIONS, AssessmentPackage.APPLICATION__APPLICATION_GROUP);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment getAssessment() {
		if (eContainerFeatureID() != AssessmentPackage.APPLICATION_GROUP__ASSESSMENT) return null;
		return (Assessment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment basicGetAssessment() {
		if (eContainerFeatureID() != AssessmentPackage.APPLICATION_GROUP__ASSESSMENT) return null;
		return (Assessment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessment(Assessment newAssessment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssessment, AssessmentPackage.APPLICATION_GROUP__ASSESSMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessment(Assessment newAssessment) {
		if (newAssessment != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.APPLICATION_GROUP__ASSESSMENT && newAssessment != null)) {
			if (EcoreUtil.isAncestor(this, newAssessment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssessment != null)
				msgs = ((InternalEObject)newAssessment).eInverseAdd(this, AssessmentPackage.ASSESSMENT__APPLICATION_GROUPS, Assessment.class, msgs);
			msgs = basicSetAssessment(newAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION_GROUP__ASSESSMENT, newAssessment, newAssessment));
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
			case AssessmentPackage.APPLICATION_GROUP__APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplications()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.APPLICATION_GROUP__ASSESSMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssessment((Assessment)otherEnd, msgs);
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
			case AssessmentPackage.APPLICATION_GROUP__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION_GROUP__ASSESSMENT:
				return basicSetAssessment(null, msgs);
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
			case AssessmentPackage.APPLICATION_GROUP__ASSESSMENT:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.ASSESSMENT__APPLICATION_GROUPS, Assessment.class, msgs);
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
			case AssessmentPackage.APPLICATION_GROUP__NAME:
				return getName();
			case AssessmentPackage.APPLICATION_GROUP__APPLICATIONS:
				return getApplications();
			case AssessmentPackage.APPLICATION_GROUP__ASSESSMENT:
				if (resolve) return getAssessment();
				return basicGetAssessment();
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
			case AssessmentPackage.APPLICATION_GROUP__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.APPLICATION_GROUP__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case AssessmentPackage.APPLICATION_GROUP__ASSESSMENT:
				setAssessment((Assessment)newValue);
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
			case AssessmentPackage.APPLICATION_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.APPLICATION_GROUP__APPLICATIONS:
				getApplications().clear();
				return;
			case AssessmentPackage.APPLICATION_GROUP__ASSESSMENT:
				setAssessment((Assessment)null);
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
			case AssessmentPackage.APPLICATION_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.APPLICATION_GROUP__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case AssessmentPackage.APPLICATION_GROUP__ASSESSMENT:
				return basicGetAssessment() != null;
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

} //ApplicationGroupImpl
