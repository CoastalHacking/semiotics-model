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

import us.coastalhacking.semiotics.model.assessment.Assessable;
import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.Group;
import us.coastalhacking.semiotics.model.assessment.Member;
import us.coastalhacking.semiotics.model.assessment.WebApplicationGroup;
import us.coastalhacking.semiotics.model.assessment.WebApplicationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Application Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationGroupImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationGroupImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebApplicationGroupImpl extends MinimalEObjectImpl.Container implements WebApplicationGroup {
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
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member<WebApplicationType>> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApplicationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.WEB_APPLICATION_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.WEB_APPLICATION_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member<WebApplicationType>> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<Member<WebApplicationType>>(Member.class, this, AssessmentPackage.WEB_APPLICATION_GROUP__MEMBERS, AssessmentPackage.MEMBER__GROUP);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Group<Assessable> getGroup() {
		if (eContainerFeatureID() != AssessmentPackage.WEB_APPLICATION_GROUP__GROUP) return null;
		return (Group<Assessable>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group<Assessable> basicGetGroup() {
		if (eContainerFeatureID() != AssessmentPackage.WEB_APPLICATION_GROUP__GROUP) return null;
		return (Group<Assessable>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group<Assessable> newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, AssessmentPackage.WEB_APPLICATION_GROUP__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group<Assessable> newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.WEB_APPLICATION_GROUP__GROUP && newGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.WEB_APPLICATION_GROUP__GROUP, newGroup, newGroup));
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
			case AssessmentPackage.WEB_APPLICATION_GROUP__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.WEB_APPLICATION_GROUP__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group<Assessable>)otherEnd, msgs);
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
			case AssessmentPackage.WEB_APPLICATION_GROUP__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.WEB_APPLICATION_GROUP__GROUP:
				return basicSetGroup(null, msgs);
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
			case AssessmentPackage.WEB_APPLICATION_GROUP__GROUP:
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
			case AssessmentPackage.WEB_APPLICATION_GROUP__NAME:
				return getName();
			case AssessmentPackage.WEB_APPLICATION_GROUP__MEMBERS:
				return getMembers();
			case AssessmentPackage.WEB_APPLICATION_GROUP__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case AssessmentPackage.WEB_APPLICATION_GROUP__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.WEB_APPLICATION_GROUP__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member<WebApplicationType>>)newValue);
				return;
			case AssessmentPackage.WEB_APPLICATION_GROUP__GROUP:
				setGroup((Group<Assessable>)newValue);
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
			case AssessmentPackage.WEB_APPLICATION_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.WEB_APPLICATION_GROUP__MEMBERS:
				getMembers().clear();
				return;
			case AssessmentPackage.WEB_APPLICATION_GROUP__GROUP:
				setGroup((Group<Assessable>)null);
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
			case AssessmentPackage.WEB_APPLICATION_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.WEB_APPLICATION_GROUP__MEMBERS:
				return members != null && !members.isEmpty();
			case AssessmentPackage.WEB_APPLICATION_GROUP__GROUP:
				return basicGetGroup() != null;
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
		if (baseClass == Member.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.WEB_APPLICATION_GROUP__GROUP: return AssessmentPackage.MEMBER__GROUP;
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
		if (baseClass == Member.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.MEMBER__GROUP: return AssessmentPackage.WEB_APPLICATION_GROUP__GROUP;
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
		result.append(')');
		return result.toString();
	}

} //WebApplicationGroupImpl
