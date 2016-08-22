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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.CWE;
import us.coastalhacking.semiotics.model.assessment.Control;
import us.coastalhacking.semiotics.model.assessment.ControlGroup;
import us.coastalhacking.semiotics.model.assessment.Provable;
import us.coastalhacking.semiotics.model.assessment.Searchable;
import us.coastalhacking.semiotics.model.assessment.Traceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ControlImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ControlImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ControlImpl#getSearches <em>Searches</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ControlImpl#getControlGroup <em>Control Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ControlImpl#getCwes <em>Cwes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends MinimalEObjectImpl.Container implements Control {
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
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> traces;

	/**
	 * The cached value of the '{@link #getSearches() <em>Searches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearches()
	 * @generated
	 * @ordered
	 */
	protected EList<Searchable> searches;

	/**
	 * The cached value of the '{@link #getCwes() <em>Cwes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCwes()
	 * @generated
	 * @ordered
	 */
	protected EList<CWE> cwes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provable> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectWithInverseResolvingEList.ManyInverse<Provable>(Provable.class, this, AssessmentPackage.CONTROL__EVIDENCE, AssessmentPackage.PROVABLE__REVIEWERS);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTraces() {
		if (traces == null) {
			traces = new EObjectWithInverseResolvingEList.ManyInverse<Traceable>(Traceable.class, this, AssessmentPackage.CONTROL__TRACES, AssessmentPackage.TRACEABLE__REVIEWERS);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Searchable> getSearches() {
		if (searches == null) {
			searches = new EObjectWithInverseResolvingEList<Searchable>(Searchable.class, this, AssessmentPackage.CONTROL__SEARCHES, AssessmentPackage.SEARCHABLE__REVIEWERS);
		}
		return searches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlGroup getControlGroup() {
		if (eContainerFeatureID() != AssessmentPackage.CONTROL__CONTROL_GROUP) return null;
		return (ControlGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlGroup basicGetControlGroup() {
		if (eContainerFeatureID() != AssessmentPackage.CONTROL__CONTROL_GROUP) return null;
		return (ControlGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlGroup(ControlGroup newControlGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newControlGroup, AssessmentPackage.CONTROL__CONTROL_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlGroup(ControlGroup newControlGroup) {
		if (newControlGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.CONTROL__CONTROL_GROUP && newControlGroup != null)) {
			if (EcoreUtil.isAncestor(this, newControlGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newControlGroup != null)
				msgs = ((InternalEObject)newControlGroup).eInverseAdd(this, AssessmentPackage.CONTROL_GROUP__CONTROLS, ControlGroup.class, msgs);
			msgs = basicSetControlGroup(newControlGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CONTROL__CONTROL_GROUP, newControlGroup, newControlGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWE> getCwes() {
		if (cwes == null) {
			cwes = new EObjectWithInverseResolvingEList.ManyInverse<CWE>(CWE.class, this, AssessmentPackage.CONTROL__CWES, AssessmentPackage.CWE__CONTROLS);
		}
		return cwes;
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
			case AssessmentPackage.CONTROL__EVIDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvidence()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.CONTROL__TRACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraces()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.CONTROL__SEARCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSearches()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.CONTROL__CONTROL_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetControlGroup((ControlGroup)otherEnd, msgs);
			case AssessmentPackage.CONTROL__CWES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCwes()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.CONTROL__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.CONTROL__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.CONTROL__SEARCHES:
				return ((InternalEList<?>)getSearches()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.CONTROL__CONTROL_GROUP:
				return basicSetControlGroup(null, msgs);
			case AssessmentPackage.CONTROL__CWES:
				return ((InternalEList<?>)getCwes()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.CONTROL__CONTROL_GROUP:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.CONTROL_GROUP__CONTROLS, ControlGroup.class, msgs);
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
			case AssessmentPackage.CONTROL__NAME:
				return getName();
			case AssessmentPackage.CONTROL__EVIDENCE:
				return getEvidence();
			case AssessmentPackage.CONTROL__TRACES:
				return getTraces();
			case AssessmentPackage.CONTROL__SEARCHES:
				return getSearches();
			case AssessmentPackage.CONTROL__CONTROL_GROUP:
				if (resolve) return getControlGroup();
				return basicGetControlGroup();
			case AssessmentPackage.CONTROL__CWES:
				return getCwes();
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
			case AssessmentPackage.CONTROL__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.CONTROL__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Provable>)newValue);
				return;
			case AssessmentPackage.CONTROL__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Traceable>)newValue);
				return;
			case AssessmentPackage.CONTROL__SEARCHES:
				getSearches().clear();
				getSearches().addAll((Collection<? extends Searchable>)newValue);
				return;
			case AssessmentPackage.CONTROL__CONTROL_GROUP:
				setControlGroup((ControlGroup)newValue);
				return;
			case AssessmentPackage.CONTROL__CWES:
				getCwes().clear();
				getCwes().addAll((Collection<? extends CWE>)newValue);
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
			case AssessmentPackage.CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.CONTROL__EVIDENCE:
				getEvidence().clear();
				return;
			case AssessmentPackage.CONTROL__TRACES:
				getTraces().clear();
				return;
			case AssessmentPackage.CONTROL__SEARCHES:
				getSearches().clear();
				return;
			case AssessmentPackage.CONTROL__CONTROL_GROUP:
				setControlGroup((ControlGroup)null);
				return;
			case AssessmentPackage.CONTROL__CWES:
				getCwes().clear();
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
			case AssessmentPackage.CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.CONTROL__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case AssessmentPackage.CONTROL__TRACES:
				return traces != null && !traces.isEmpty();
			case AssessmentPackage.CONTROL__SEARCHES:
				return searches != null && !searches.isEmpty();
			case AssessmentPackage.CONTROL__CONTROL_GROUP:
				return basicGetControlGroup() != null;
			case AssessmentPackage.CONTROL__CWES:
				return cwes != null && !cwes.isEmpty();
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

} //ControlImpl
