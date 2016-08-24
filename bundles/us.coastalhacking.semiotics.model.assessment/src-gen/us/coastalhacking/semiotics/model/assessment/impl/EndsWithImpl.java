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
import us.coastalhacking.semiotics.model.assessment.EndsWith;
import us.coastalhacking.semiotics.model.assessment.Examinable;
import us.coastalhacking.semiotics.model.assessment.Flow;
import us.coastalhacking.semiotics.model.assessment.FlowNode;
import us.coastalhacking.semiotics.model.assessment.FlowType;
import us.coastalhacking.semiotics.model.assessment.Provable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ends With</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl#getExaminees <em>Examinees</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl#getFlowFrom <em>Flow From</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl#getFlowRoot <em>Flow Root</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl#getFlowTo <em>Flow To</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndsWithImpl extends MinimalEObjectImpl.Container implements EndsWith {
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
	 * The cached value of the '{@link #getExaminees() <em>Examinees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExaminees()
	 * @generated
	 * @ordered
	 */
	protected EList<Examinable> examinees;

	/**
	 * The cached value of the '{@link #getFlowTo() <em>Flow To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowTo()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowNode<? extends FlowType>> flowTo;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndsWithImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.ENDS_WITH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ENDS_WITH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provable> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectWithInverseResolvingEList.ManyInverse<Provable>(Provable.class, this, AssessmentPackage.ENDS_WITH__EVIDENCE, AssessmentPackage.PROVABLE__TRACES);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Examinable> getExaminees() {
		if (examinees == null) {
			examinees = new EObjectWithInverseResolvingEList.ManyInverse<Examinable>(Examinable.class, this, AssessmentPackage.ENDS_WITH__EXAMINEES, AssessmentPackage.EXAMINABLE__TRACES);
		}
		return examinees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public FlowNode<? extends FlowType> getFlowFrom() {
		if (eContainerFeatureID() != AssessmentPackage.ENDS_WITH__FLOW_FROM) return null;
		return (FlowNode<? extends FlowType>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode<? extends FlowType> basicGetFlowFrom() {
		if (eContainerFeatureID() != AssessmentPackage.ENDS_WITH__FLOW_FROM) return null;
		return (FlowNode<? extends FlowType>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowFrom(FlowNode<? extends FlowType> newFlowFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlowFrom, AssessmentPackage.ENDS_WITH__FLOW_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowFrom(FlowNode<? extends FlowType> newFlowFrom) {
		if (newFlowFrom != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.ENDS_WITH__FLOW_FROM && newFlowFrom != null)) {
			if (EcoreUtil.isAncestor(this, newFlowFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlowFrom != null)
				msgs = ((InternalEObject)newFlowFrom).eInverseAdd(this, AssessmentPackage.FLOW_NODE__FLOW_TO, FlowNode.class, msgs);
			msgs = basicSetFlowFrom(newFlowFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ENDS_WITH__FLOW_FROM, newFlowFrom, newFlowFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Flow<? extends FlowType> getFlowRoot() {
		if (eContainerFeatureID() != AssessmentPackage.ENDS_WITH__FLOW_ROOT) return null;
		return (Flow<? extends FlowType>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow<? extends FlowType> basicGetFlowRoot() {
		if (eContainerFeatureID() != AssessmentPackage.ENDS_WITH__FLOW_ROOT) return null;
		return (Flow<? extends FlowType>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowRoot(Flow<? extends FlowType> newFlowRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlowRoot, AssessmentPackage.ENDS_WITH__FLOW_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowRoot(Flow<? extends FlowType> newFlowRoot) {
		if (newFlowRoot != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.ENDS_WITH__FLOW_ROOT && newFlowRoot != null)) {
			if (EcoreUtil.isAncestor(this, newFlowRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlowRoot != null)
				msgs = ((InternalEObject)newFlowRoot).eInverseAdd(this, AssessmentPackage.FLOW__FLOWS, Flow.class, msgs);
			msgs = basicSetFlowRoot(newFlowRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ENDS_WITH__FLOW_ROOT, newFlowRoot, newFlowRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowNode<? extends FlowType>> getFlowTo() {
		if (flowTo == null) {
			flowTo = new EObjectContainmentWithInverseEList<FlowNode<? extends FlowType>>(FlowNode.class, this, AssessmentPackage.ENDS_WITH__FLOW_TO, AssessmentPackage.FLOW_NODE__FLOW_FROM);
		}
		return flowTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ENDS_WITH__SUFFIX, oldSuffix, suffix));
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
			case AssessmentPackage.ENDS_WITH__EVIDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvidence()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.ENDS_WITH__EXAMINEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExaminees()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.ENDS_WITH__FLOW_FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlowFrom((FlowNode<? extends FlowType>)otherEnd, msgs);
			case AssessmentPackage.ENDS_WITH__FLOW_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlowRoot((Flow<? extends FlowType>)otherEnd, msgs);
			case AssessmentPackage.ENDS_WITH__FLOW_TO:
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
			case AssessmentPackage.ENDS_WITH__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.ENDS_WITH__EXAMINEES:
				return ((InternalEList<?>)getExaminees()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.ENDS_WITH__FLOW_FROM:
				return basicSetFlowFrom(null, msgs);
			case AssessmentPackage.ENDS_WITH__FLOW_ROOT:
				return basicSetFlowRoot(null, msgs);
			case AssessmentPackage.ENDS_WITH__FLOW_TO:
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
			case AssessmentPackage.ENDS_WITH__FLOW_FROM:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.FLOW_NODE__FLOW_TO, FlowNode.class, msgs);
			case AssessmentPackage.ENDS_WITH__FLOW_ROOT:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.FLOW__FLOWS, Flow.class, msgs);
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
			case AssessmentPackage.ENDS_WITH__NAME:
				return getName();
			case AssessmentPackage.ENDS_WITH__EVIDENCE:
				return getEvidence();
			case AssessmentPackage.ENDS_WITH__EXAMINEES:
				return getExaminees();
			case AssessmentPackage.ENDS_WITH__FLOW_FROM:
				if (resolve) return getFlowFrom();
				return basicGetFlowFrom();
			case AssessmentPackage.ENDS_WITH__FLOW_ROOT:
				if (resolve) return getFlowRoot();
				return basicGetFlowRoot();
			case AssessmentPackage.ENDS_WITH__FLOW_TO:
				return getFlowTo();
			case AssessmentPackage.ENDS_WITH__SUFFIX:
				return getSuffix();
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
			case AssessmentPackage.ENDS_WITH__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.ENDS_WITH__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Provable>)newValue);
				return;
			case AssessmentPackage.ENDS_WITH__EXAMINEES:
				getExaminees().clear();
				getExaminees().addAll((Collection<? extends Examinable>)newValue);
				return;
			case AssessmentPackage.ENDS_WITH__FLOW_FROM:
				setFlowFrom((FlowNode<? extends FlowType>)newValue);
				return;
			case AssessmentPackage.ENDS_WITH__FLOW_ROOT:
				setFlowRoot((Flow<? extends FlowType>)newValue);
				return;
			case AssessmentPackage.ENDS_WITH__FLOW_TO:
				getFlowTo().clear();
				getFlowTo().addAll((Collection<? extends FlowNode<? extends FlowType>>)newValue);
				return;
			case AssessmentPackage.ENDS_WITH__SUFFIX:
				setSuffix((String)newValue);
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
			case AssessmentPackage.ENDS_WITH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.ENDS_WITH__EVIDENCE:
				getEvidence().clear();
				return;
			case AssessmentPackage.ENDS_WITH__EXAMINEES:
				getExaminees().clear();
				return;
			case AssessmentPackage.ENDS_WITH__FLOW_FROM:
				setFlowFrom((FlowNode<? extends FlowType>)null);
				return;
			case AssessmentPackage.ENDS_WITH__FLOW_ROOT:
				setFlowRoot((Flow<? extends FlowType>)null);
				return;
			case AssessmentPackage.ENDS_WITH__FLOW_TO:
				getFlowTo().clear();
				return;
			case AssessmentPackage.ENDS_WITH__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
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
			case AssessmentPackage.ENDS_WITH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.ENDS_WITH__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case AssessmentPackage.ENDS_WITH__EXAMINEES:
				return examinees != null && !examinees.isEmpty();
			case AssessmentPackage.ENDS_WITH__FLOW_FROM:
				return basicGetFlowFrom() != null;
			case AssessmentPackage.ENDS_WITH__FLOW_ROOT:
				return basicGetFlowRoot() != null;
			case AssessmentPackage.ENDS_WITH__FLOW_TO:
				return flowTo != null && !flowTo.isEmpty();
			case AssessmentPackage.ENDS_WITH__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
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
		result.append(", suffix: ");
		result.append(suffix);
		result.append(')');
		return result.toString();
	}

} //EndsWithImpl
