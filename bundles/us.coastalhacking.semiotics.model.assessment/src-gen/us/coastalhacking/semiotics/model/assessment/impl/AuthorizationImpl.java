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
import us.coastalhacking.semiotics.model.assessment.Authorization;
import us.coastalhacking.semiotics.model.assessment.AuthorizationControlType;
import us.coastalhacking.semiotics.model.assessment.CWE;
import us.coastalhacking.semiotics.model.assessment.Describable;
import us.coastalhacking.semiotics.model.assessment.Examinable;
import us.coastalhacking.semiotics.model.assessment.Findable;
import us.coastalhacking.semiotics.model.assessment.Group;
import us.coastalhacking.semiotics.model.assessment.Provable;
import us.coastalhacking.semiotics.model.assessment.Searchable;
import us.coastalhacking.semiotics.model.assessment.Taskable;
import us.coastalhacking.semiotics.model.assessment.Traceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getSearches <em>Searches</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl#getCwes <em>Cwes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationImpl extends MinimalEObjectImpl.Container implements Authorization {
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
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Taskable> tasks;

	/**
	 * The cached value of the '{@link #getFindings() <em>Findings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Findable> findings;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected AuthorizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.AUTHORIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.AUTHORIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Group<AuthorizationControlType> getGroup() {
		if (eContainerFeatureID() != AssessmentPackage.AUTHORIZATION__GROUP) return null;
		return (Group<AuthorizationControlType>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group<AuthorizationControlType> basicGetGroup() {
		if (eContainerFeatureID() != AssessmentPackage.AUTHORIZATION__GROUP) return null;
		return (Group<AuthorizationControlType>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group<AuthorizationControlType> newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, AssessmentPackage.AUTHORIZATION__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group<AuthorizationControlType> newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.AUTHORIZATION__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, AssessmentPackage.GROUP__MEMBERS, Group.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.AUTHORIZATION__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provable> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectWithInverseResolvingEList.ManyInverse<Provable>(Provable.class, this, AssessmentPackage.AUTHORIZATION__EVIDENCE, AssessmentPackage.PROVABLE__EXAMINEES);
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
			traces = new EObjectWithInverseResolvingEList.ManyInverse<Traceable>(Traceable.class, this, AssessmentPackage.AUTHORIZATION__TRACES, AssessmentPackage.TRACEABLE__EXAMINEES);
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
			searches = new EObjectWithInverseResolvingEList<Searchable>(Searchable.class, this, AssessmentPackage.AUTHORIZATION__SEARCHES, AssessmentPackage.SEARCHABLE__EXAMINEES);
		}
		return searches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Taskable> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList.ManyInverse<Taskable>(Taskable.class, this, AssessmentPackage.AUTHORIZATION__TASKS, AssessmentPackage.TASKABLE__EXAMINEES);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Findable> getFindings() {
		if (findings == null) {
			findings = new EObjectWithInverseResolvingEList.ManyInverse<Findable>(Findable.class, this, AssessmentPackage.AUTHORIZATION__FINDINGS, AssessmentPackage.FINDABLE__EXAMINEES);
		}
		return findings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.AUTHORIZATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWE> getCwes() {
		if (cwes == null) {
			cwes = new EObjectWithInverseResolvingEList.ManyInverse<CWE>(CWE.class, this, AssessmentPackage.AUTHORIZATION__CWES, AssessmentPackage.CWE__CONTROLS);
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
			case AssessmentPackage.AUTHORIZATION__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group<AuthorizationControlType>)otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__EVIDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvidence()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__TRACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraces()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__SEARCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSearches()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__FINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFindings()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__CWES:
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
			case AssessmentPackage.AUTHORIZATION__GROUP:
				return basicSetGroup(null, msgs);
			case AssessmentPackage.AUTHORIZATION__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__SEARCHES:
				return ((InternalEList<?>)getSearches()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__FINDINGS:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.AUTHORIZATION__CWES:
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
			case AssessmentPackage.AUTHORIZATION__GROUP:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.GROUP__MEMBERS, Group.class, msgs);
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
			case AssessmentPackage.AUTHORIZATION__NAME:
				return getName();
			case AssessmentPackage.AUTHORIZATION__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case AssessmentPackage.AUTHORIZATION__EVIDENCE:
				return getEvidence();
			case AssessmentPackage.AUTHORIZATION__TRACES:
				return getTraces();
			case AssessmentPackage.AUTHORIZATION__SEARCHES:
				return getSearches();
			case AssessmentPackage.AUTHORIZATION__TASKS:
				return getTasks();
			case AssessmentPackage.AUTHORIZATION__FINDINGS:
				return getFindings();
			case AssessmentPackage.AUTHORIZATION__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.AUTHORIZATION__CWES:
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
			case AssessmentPackage.AUTHORIZATION__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.AUTHORIZATION__GROUP:
				setGroup((Group<AuthorizationControlType>)newValue);
				return;
			case AssessmentPackage.AUTHORIZATION__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Provable>)newValue);
				return;
			case AssessmentPackage.AUTHORIZATION__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Traceable>)newValue);
				return;
			case AssessmentPackage.AUTHORIZATION__SEARCHES:
				getSearches().clear();
				getSearches().addAll((Collection<? extends Searchable>)newValue);
				return;
			case AssessmentPackage.AUTHORIZATION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Taskable>)newValue);
				return;
			case AssessmentPackage.AUTHORIZATION__FINDINGS:
				getFindings().clear();
				getFindings().addAll((Collection<? extends Findable>)newValue);
				return;
			case AssessmentPackage.AUTHORIZATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.AUTHORIZATION__CWES:
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
			case AssessmentPackage.AUTHORIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.AUTHORIZATION__GROUP:
				setGroup((Group<AuthorizationControlType>)null);
				return;
			case AssessmentPackage.AUTHORIZATION__EVIDENCE:
				getEvidence().clear();
				return;
			case AssessmentPackage.AUTHORIZATION__TRACES:
				getTraces().clear();
				return;
			case AssessmentPackage.AUTHORIZATION__SEARCHES:
				getSearches().clear();
				return;
			case AssessmentPackage.AUTHORIZATION__TASKS:
				getTasks().clear();
				return;
			case AssessmentPackage.AUTHORIZATION__FINDINGS:
				getFindings().clear();
				return;
			case AssessmentPackage.AUTHORIZATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.AUTHORIZATION__CWES:
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
			case AssessmentPackage.AUTHORIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.AUTHORIZATION__GROUP:
				return basicGetGroup() != null;
			case AssessmentPackage.AUTHORIZATION__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case AssessmentPackage.AUTHORIZATION__TRACES:
				return traces != null && !traces.isEmpty();
			case AssessmentPackage.AUTHORIZATION__SEARCHES:
				return searches != null && !searches.isEmpty();
			case AssessmentPackage.AUTHORIZATION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case AssessmentPackage.AUTHORIZATION__FINDINGS:
				return findings != null && !findings.isEmpty();
			case AssessmentPackage.AUTHORIZATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.AUTHORIZATION__CWES:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Examinable.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.AUTHORIZATION__EVIDENCE: return AssessmentPackage.EXAMINABLE__EVIDENCE;
				case AssessmentPackage.AUTHORIZATION__TRACES: return AssessmentPackage.EXAMINABLE__TRACES;
				case AssessmentPackage.AUTHORIZATION__SEARCHES: return AssessmentPackage.EXAMINABLE__SEARCHES;
				case AssessmentPackage.AUTHORIZATION__TASKS: return AssessmentPackage.EXAMINABLE__TASKS;
				case AssessmentPackage.AUTHORIZATION__FINDINGS: return AssessmentPackage.EXAMINABLE__FINDINGS;
				default: return -1;
			}
		}
		if (baseClass == Describable.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.AUTHORIZATION__DESCRIPTION: return AssessmentPackage.DESCRIBABLE__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Examinable.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.EXAMINABLE__EVIDENCE: return AssessmentPackage.AUTHORIZATION__EVIDENCE;
				case AssessmentPackage.EXAMINABLE__TRACES: return AssessmentPackage.AUTHORIZATION__TRACES;
				case AssessmentPackage.EXAMINABLE__SEARCHES: return AssessmentPackage.AUTHORIZATION__SEARCHES;
				case AssessmentPackage.EXAMINABLE__TASKS: return AssessmentPackage.AUTHORIZATION__TASKS;
				case AssessmentPackage.EXAMINABLE__FINDINGS: return AssessmentPackage.AUTHORIZATION__FINDINGS;
				default: return -1;
			}
		}
		if (baseClass == Describable.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.DESCRIBABLE__DESCRIPTION: return AssessmentPackage.AUTHORIZATION__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AuthorizationImpl
