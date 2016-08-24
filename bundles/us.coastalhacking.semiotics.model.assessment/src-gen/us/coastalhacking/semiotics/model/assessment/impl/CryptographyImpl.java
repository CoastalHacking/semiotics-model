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
import us.coastalhacking.semiotics.model.assessment.Cryptography;
import us.coastalhacking.semiotics.model.assessment.CryptographyControlType;
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
 * An implementation of the model object '<em><b>Cryptography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getSearches <em>Searches</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl#getCwes <em>Cwes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CryptographyImpl extends MinimalEObjectImpl.Container implements Cryptography {
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
	protected CryptographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.CRYPTOGRAPHY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CRYPTOGRAPHY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Group<CryptographyControlType> getGroup() {
		if (eContainerFeatureID() != AssessmentPackage.CRYPTOGRAPHY__GROUP) return null;
		return (Group<CryptographyControlType>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group<CryptographyControlType> basicGetGroup() {
		if (eContainerFeatureID() != AssessmentPackage.CRYPTOGRAPHY__GROUP) return null;
		return (Group<CryptographyControlType>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group<CryptographyControlType> newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, AssessmentPackage.CRYPTOGRAPHY__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group<CryptographyControlType> newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.CRYPTOGRAPHY__GROUP && newGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CRYPTOGRAPHY__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provable> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectWithInverseResolvingEList.ManyInverse<Provable>(Provable.class, this, AssessmentPackage.CRYPTOGRAPHY__EVIDENCE, AssessmentPackage.PROVABLE__EXAMINEES);
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
			traces = new EObjectWithInverseResolvingEList.ManyInverse<Traceable>(Traceable.class, this, AssessmentPackage.CRYPTOGRAPHY__TRACES, AssessmentPackage.TRACEABLE__EXAMINEES);
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
			searches = new EObjectWithInverseResolvingEList<Searchable>(Searchable.class, this, AssessmentPackage.CRYPTOGRAPHY__SEARCHES, AssessmentPackage.SEARCHABLE__EXAMINEES);
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
			tasks = new EObjectWithInverseResolvingEList.ManyInverse<Taskable>(Taskable.class, this, AssessmentPackage.CRYPTOGRAPHY__TASKS, AssessmentPackage.TASKABLE__EXAMINEES);
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
			findings = new EObjectWithInverseResolvingEList.ManyInverse<Findable>(Findable.class, this, AssessmentPackage.CRYPTOGRAPHY__FINDINGS, AssessmentPackage.FINDABLE__EXAMINEES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CRYPTOGRAPHY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWE> getCwes() {
		if (cwes == null) {
			cwes = new EObjectWithInverseResolvingEList.ManyInverse<CWE>(CWE.class, this, AssessmentPackage.CRYPTOGRAPHY__CWES, AssessmentPackage.CWE__CONTROLS);
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
			case AssessmentPackage.CRYPTOGRAPHY__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group<CryptographyControlType>)otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__EVIDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvidence()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__TRACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraces()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__SEARCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSearches()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__FINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFindings()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__CWES:
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
			case AssessmentPackage.CRYPTOGRAPHY__GROUP:
				return basicSetGroup(null, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__SEARCHES:
				return ((InternalEList<?>)getSearches()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__FINDINGS:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.CRYPTOGRAPHY__CWES:
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
			case AssessmentPackage.CRYPTOGRAPHY__GROUP:
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
			case AssessmentPackage.CRYPTOGRAPHY__NAME:
				return getName();
			case AssessmentPackage.CRYPTOGRAPHY__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case AssessmentPackage.CRYPTOGRAPHY__EVIDENCE:
				return getEvidence();
			case AssessmentPackage.CRYPTOGRAPHY__TRACES:
				return getTraces();
			case AssessmentPackage.CRYPTOGRAPHY__SEARCHES:
				return getSearches();
			case AssessmentPackage.CRYPTOGRAPHY__TASKS:
				return getTasks();
			case AssessmentPackage.CRYPTOGRAPHY__FINDINGS:
				return getFindings();
			case AssessmentPackage.CRYPTOGRAPHY__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.CRYPTOGRAPHY__CWES:
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
			case AssessmentPackage.CRYPTOGRAPHY__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__GROUP:
				setGroup((Group<CryptographyControlType>)newValue);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Provable>)newValue);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Traceable>)newValue);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__SEARCHES:
				getSearches().clear();
				getSearches().addAll((Collection<? extends Searchable>)newValue);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Taskable>)newValue);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__FINDINGS:
				getFindings().clear();
				getFindings().addAll((Collection<? extends Findable>)newValue);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__CWES:
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
			case AssessmentPackage.CRYPTOGRAPHY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__GROUP:
				setGroup((Group<CryptographyControlType>)null);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__EVIDENCE:
				getEvidence().clear();
				return;
			case AssessmentPackage.CRYPTOGRAPHY__TRACES:
				getTraces().clear();
				return;
			case AssessmentPackage.CRYPTOGRAPHY__SEARCHES:
				getSearches().clear();
				return;
			case AssessmentPackage.CRYPTOGRAPHY__TASKS:
				getTasks().clear();
				return;
			case AssessmentPackage.CRYPTOGRAPHY__FINDINGS:
				getFindings().clear();
				return;
			case AssessmentPackage.CRYPTOGRAPHY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.CRYPTOGRAPHY__CWES:
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
			case AssessmentPackage.CRYPTOGRAPHY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.CRYPTOGRAPHY__GROUP:
				return basicGetGroup() != null;
			case AssessmentPackage.CRYPTOGRAPHY__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case AssessmentPackage.CRYPTOGRAPHY__TRACES:
				return traces != null && !traces.isEmpty();
			case AssessmentPackage.CRYPTOGRAPHY__SEARCHES:
				return searches != null && !searches.isEmpty();
			case AssessmentPackage.CRYPTOGRAPHY__TASKS:
				return tasks != null && !tasks.isEmpty();
			case AssessmentPackage.CRYPTOGRAPHY__FINDINGS:
				return findings != null && !findings.isEmpty();
			case AssessmentPackage.CRYPTOGRAPHY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.CRYPTOGRAPHY__CWES:
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
				case AssessmentPackage.CRYPTOGRAPHY__EVIDENCE: return AssessmentPackage.EXAMINABLE__EVIDENCE;
				case AssessmentPackage.CRYPTOGRAPHY__TRACES: return AssessmentPackage.EXAMINABLE__TRACES;
				case AssessmentPackage.CRYPTOGRAPHY__SEARCHES: return AssessmentPackage.EXAMINABLE__SEARCHES;
				case AssessmentPackage.CRYPTOGRAPHY__TASKS: return AssessmentPackage.EXAMINABLE__TASKS;
				case AssessmentPackage.CRYPTOGRAPHY__FINDINGS: return AssessmentPackage.EXAMINABLE__FINDINGS;
				default: return -1;
			}
		}
		if (baseClass == Describable.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.CRYPTOGRAPHY__DESCRIPTION: return AssessmentPackage.DESCRIBABLE__DESCRIPTION;
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
				case AssessmentPackage.EXAMINABLE__EVIDENCE: return AssessmentPackage.CRYPTOGRAPHY__EVIDENCE;
				case AssessmentPackage.EXAMINABLE__TRACES: return AssessmentPackage.CRYPTOGRAPHY__TRACES;
				case AssessmentPackage.EXAMINABLE__SEARCHES: return AssessmentPackage.CRYPTOGRAPHY__SEARCHES;
				case AssessmentPackage.EXAMINABLE__TASKS: return AssessmentPackage.CRYPTOGRAPHY__TASKS;
				case AssessmentPackage.EXAMINABLE__FINDINGS: return AssessmentPackage.CRYPTOGRAPHY__FINDINGS;
				default: return -1;
			}
		}
		if (baseClass == Describable.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.DESCRIBABLE__DESCRIPTION: return AssessmentPackage.CRYPTOGRAPHY__DESCRIPTION;
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

} //CryptographyImpl
