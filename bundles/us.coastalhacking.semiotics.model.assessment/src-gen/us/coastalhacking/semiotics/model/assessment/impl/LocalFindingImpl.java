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
import us.coastalhacking.semiotics.model.assessment.Describable;
import us.coastalhacking.semiotics.model.assessment.Examinable;
import us.coastalhacking.semiotics.model.assessment.Findable;
import us.coastalhacking.semiotics.model.assessment.Group;
import us.coastalhacking.semiotics.model.assessment.LocalFinding;
import us.coastalhacking.semiotics.model.assessment.LocalFindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl#getExaminees <em>Examinees</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl#getRemediation <em>Remediation</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl#getReproducer <em>Reproducer</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalFindingImpl extends MinimalEObjectImpl.Container implements LocalFinding {
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
	 * The cached value of the '{@link #getExaminees() <em>Examinees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExaminees()
	 * @generated
	 * @ordered
	 */
	protected EList<Examinable> examinees;

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
	 * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected String details = DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemediation() <em>Remediation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemediation()
	 * @generated
	 * @ordered
	 */
	protected static final String REMEDIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemediation() <em>Remediation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemediation()
	 * @generated
	 * @ordered
	 */
	protected String remediation = REMEDIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReproducer() <em>Reproducer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReproducer()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRODUCER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReproducer() <em>Reproducer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReproducer()
	 * @generated
	 * @ordered
	 */
	protected String reproducer = REPRODUCER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferences() <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected String references = REFERENCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.LOCAL_FINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCAL_FINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Group<LocalFindingType> getGroup() {
		if (eContainerFeatureID() != AssessmentPackage.LOCAL_FINDING__GROUP) return null;
		return (Group<LocalFindingType>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group<LocalFindingType> basicGetGroup() {
		if (eContainerFeatureID() != AssessmentPackage.LOCAL_FINDING__GROUP) return null;
		return (Group<LocalFindingType>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group<LocalFindingType> newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, AssessmentPackage.LOCAL_FINDING__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group<LocalFindingType> newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.LOCAL_FINDING__GROUP && newGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCAL_FINDING__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Examinable> getExaminees() {
		if (examinees == null) {
			examinees = new EObjectWithInverseResolvingEList.ManyInverse<Examinable>(Examinable.class, this, AssessmentPackage.LOCAL_FINDING__EXAMINEES, AssessmentPackage.EXAMINABLE__FINDINGS);
		}
		return examinees;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCAL_FINDING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(String newDetails) {
		String oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCAL_FINDING__DETAILS, oldDetails, details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemediation() {
		return remediation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemediation(String newRemediation) {
		String oldRemediation = remediation;
		remediation = newRemediation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCAL_FINDING__REMEDIATION, oldRemediation, remediation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReproducer() {
		return reproducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReproducer(String newReproducer) {
		String oldReproducer = reproducer;
		reproducer = newReproducer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCAL_FINDING__REPRODUCER, oldReproducer, reproducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(String newReferences) {
		String oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCAL_FINDING__REFERENCES, oldReferences, references));
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
			case AssessmentPackage.LOCAL_FINDING__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group<LocalFindingType>)otherEnd, msgs);
			case AssessmentPackage.LOCAL_FINDING__EXAMINEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExaminees()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.LOCAL_FINDING__GROUP:
				return basicSetGroup(null, msgs);
			case AssessmentPackage.LOCAL_FINDING__EXAMINEES:
				return ((InternalEList<?>)getExaminees()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.LOCAL_FINDING__GROUP:
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
			case AssessmentPackage.LOCAL_FINDING__NAME:
				return getName();
			case AssessmentPackage.LOCAL_FINDING__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case AssessmentPackage.LOCAL_FINDING__EXAMINEES:
				return getExaminees();
			case AssessmentPackage.LOCAL_FINDING__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.LOCAL_FINDING__DETAILS:
				return getDetails();
			case AssessmentPackage.LOCAL_FINDING__REMEDIATION:
				return getRemediation();
			case AssessmentPackage.LOCAL_FINDING__REPRODUCER:
				return getReproducer();
			case AssessmentPackage.LOCAL_FINDING__REFERENCES:
				return getReferences();
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
			case AssessmentPackage.LOCAL_FINDING__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.LOCAL_FINDING__GROUP:
				setGroup((Group<LocalFindingType>)newValue);
				return;
			case AssessmentPackage.LOCAL_FINDING__EXAMINEES:
				getExaminees().clear();
				getExaminees().addAll((Collection<? extends Examinable>)newValue);
				return;
			case AssessmentPackage.LOCAL_FINDING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.LOCAL_FINDING__DETAILS:
				setDetails((String)newValue);
				return;
			case AssessmentPackage.LOCAL_FINDING__REMEDIATION:
				setRemediation((String)newValue);
				return;
			case AssessmentPackage.LOCAL_FINDING__REPRODUCER:
				setReproducer((String)newValue);
				return;
			case AssessmentPackage.LOCAL_FINDING__REFERENCES:
				setReferences((String)newValue);
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
			case AssessmentPackage.LOCAL_FINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.LOCAL_FINDING__GROUP:
				setGroup((Group<LocalFindingType>)null);
				return;
			case AssessmentPackage.LOCAL_FINDING__EXAMINEES:
				getExaminees().clear();
				return;
			case AssessmentPackage.LOCAL_FINDING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.LOCAL_FINDING__DETAILS:
				setDetails(DETAILS_EDEFAULT);
				return;
			case AssessmentPackage.LOCAL_FINDING__REMEDIATION:
				setRemediation(REMEDIATION_EDEFAULT);
				return;
			case AssessmentPackage.LOCAL_FINDING__REPRODUCER:
				setReproducer(REPRODUCER_EDEFAULT);
				return;
			case AssessmentPackage.LOCAL_FINDING__REFERENCES:
				setReferences(REFERENCES_EDEFAULT);
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
			case AssessmentPackage.LOCAL_FINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.LOCAL_FINDING__GROUP:
				return basicGetGroup() != null;
			case AssessmentPackage.LOCAL_FINDING__EXAMINEES:
				return examinees != null && !examinees.isEmpty();
			case AssessmentPackage.LOCAL_FINDING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.LOCAL_FINDING__DETAILS:
				return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
			case AssessmentPackage.LOCAL_FINDING__REMEDIATION:
				return REMEDIATION_EDEFAULT == null ? remediation != null : !REMEDIATION_EDEFAULT.equals(remediation);
			case AssessmentPackage.LOCAL_FINDING__REPRODUCER:
				return REPRODUCER_EDEFAULT == null ? reproducer != null : !REPRODUCER_EDEFAULT.equals(reproducer);
			case AssessmentPackage.LOCAL_FINDING__REFERENCES:
				return REFERENCES_EDEFAULT == null ? references != null : !REFERENCES_EDEFAULT.equals(references);
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
		if (baseClass == Findable.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.LOCAL_FINDING__EXAMINEES: return AssessmentPackage.FINDABLE__EXAMINEES;
				default: return -1;
			}
		}
		if (baseClass == Describable.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.LOCAL_FINDING__DESCRIPTION: return AssessmentPackage.DESCRIBABLE__DESCRIPTION;
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
		if (baseClass == Findable.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.FINDABLE__EXAMINEES: return AssessmentPackage.LOCAL_FINDING__EXAMINEES;
				default: return -1;
			}
		}
		if (baseClass == Describable.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.DESCRIBABLE__DESCRIPTION: return AssessmentPackage.LOCAL_FINDING__DESCRIPTION;
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
		result.append(", details: ");
		result.append(details);
		result.append(", remediation: ");
		result.append(remediation);
		result.append(", reproducer: ");
		result.append(reproducer);
		result.append(", references: ");
		result.append(references);
		result.append(')');
		return result.toString();
	}

} //LocalFindingImpl
