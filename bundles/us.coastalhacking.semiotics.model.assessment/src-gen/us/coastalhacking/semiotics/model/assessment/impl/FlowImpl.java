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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.Flow;
import us.coastalhacking.semiotics.model.assessment.Provable;
import us.coastalhacking.semiotics.model.assessment.Reviewable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FlowImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FlowImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FlowImpl#getReviewers <em>Reviewers</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FlowImpl#getFlowFrom <em>Flow From</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FlowImpl#getFlowTo <em>Flow To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends MinimalEObjectImpl.Container implements Flow {
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
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Provable> evidence;

	/**
	 * The cached value of the '{@link #getReviewers() <em>Reviewers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reviewable> reviewers;

	/**
	 * The cached value of the '{@link #getFlowTo() <em>Flow To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> flowTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.FLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provable> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectWithInverseResolvingEList.ManyInverse<Provable>(Provable.class, this, AssessmentPackage.FLOW__EVIDENCE, AssessmentPackage.PROVABLE__TRACES);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reviewable> getReviewers() {
		if (reviewers == null) {
			reviewers = new EObjectWithInverseResolvingEList.ManyInverse<Reviewable>(Reviewable.class, this, AssessmentPackage.FLOW__REVIEWERS, AssessmentPackage.REVIEWABLE__TRACES);
		}
		return reviewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getFlowFrom() {
		if (eContainerFeatureID() != AssessmentPackage.FLOW__FLOW_FROM) return null;
		return (Flow)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow basicGetFlowFrom() {
		if (eContainerFeatureID() != AssessmentPackage.FLOW__FLOW_FROM) return null;
		return (Flow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowFrom(Flow newFlowFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlowFrom, AssessmentPackage.FLOW__FLOW_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowFrom(Flow newFlowFrom) {
		if (newFlowFrom != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.FLOW__FLOW_FROM && newFlowFrom != null)) {
			if (EcoreUtil.isAncestor(this, newFlowFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlowFrom != null)
				msgs = ((InternalEObject)newFlowFrom).eInverseAdd(this, AssessmentPackage.FLOW__FLOW_TO, Flow.class, msgs);
			msgs = basicSetFlowFrom(newFlowFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FLOW__FLOW_FROM, newFlowFrom, newFlowFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlowTo() {
		if (flowTo == null) {
			flowTo = new EObjectContainmentWithInverseEList<Flow>(Flow.class, this, AssessmentPackage.FLOW__FLOW_TO, AssessmentPackage.FLOW__FLOW_FROM);
		}
		return flowTo;
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
			case AssessmentPackage.FLOW__EVIDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvidence()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.FLOW__REVIEWERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReviewers()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.FLOW__FLOW_FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlowFrom((Flow)otherEnd, msgs);
			case AssessmentPackage.FLOW__FLOW_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowTo()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.FLOW__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.FLOW__REVIEWERS:
				return ((InternalEList<?>)getReviewers()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.FLOW__FLOW_FROM:
				return basicSetFlowFrom(null, msgs);
			case AssessmentPackage.FLOW__FLOW_TO:
				return ((InternalEList<?>)getFlowTo()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.FLOW__FLOW_FROM:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.FLOW__FLOW_TO, Flow.class, msgs);
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
			case AssessmentPackage.FLOW__NAME:
				return getName();
			case AssessmentPackage.FLOW__EVIDENCE:
				return getEvidence();
			case AssessmentPackage.FLOW__REVIEWERS:
				return getReviewers();
			case AssessmentPackage.FLOW__FLOW_FROM:
				if (resolve) return getFlowFrom();
				return basicGetFlowFrom();
			case AssessmentPackage.FLOW__FLOW_TO:
				return getFlowTo();
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
			case AssessmentPackage.FLOW__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.FLOW__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Provable>)newValue);
				return;
			case AssessmentPackage.FLOW__REVIEWERS:
				getReviewers().clear();
				getReviewers().addAll((Collection<? extends Reviewable>)newValue);
				return;
			case AssessmentPackage.FLOW__FLOW_FROM:
				setFlowFrom((Flow)newValue);
				return;
			case AssessmentPackage.FLOW__FLOW_TO:
				getFlowTo().clear();
				getFlowTo().addAll((Collection<? extends Flow>)newValue);
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
			case AssessmentPackage.FLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.FLOW__EVIDENCE:
				getEvidence().clear();
				return;
			case AssessmentPackage.FLOW__REVIEWERS:
				getReviewers().clear();
				return;
			case AssessmentPackage.FLOW__FLOW_FROM:
				setFlowFrom((Flow)null);
				return;
			case AssessmentPackage.FLOW__FLOW_TO:
				getFlowTo().clear();
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
			case AssessmentPackage.FLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.FLOW__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case AssessmentPackage.FLOW__REVIEWERS:
				return reviewers != null && !reviewers.isEmpty();
			case AssessmentPackage.FLOW__FLOW_FROM:
				return basicGetFlowFrom() != null;
			case AssessmentPackage.FLOW__FLOW_TO:
				return flowTo != null && !flowTo.isEmpty();
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

} //FlowImpl
