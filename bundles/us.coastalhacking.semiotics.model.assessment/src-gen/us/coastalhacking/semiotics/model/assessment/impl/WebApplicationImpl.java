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

import us.coastalhacking.semiotics.model.assessment.Applicational;
import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.Group;
import us.coastalhacking.semiotics.model.assessment.Member;
import us.coastalhacking.semiotics.model.assessment.WebApplication;
import us.coastalhacking.semiotics.model.assessment.WebApplicationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl#getInternalURL <em>Internal URL</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl#getExternalURL <em>External URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebApplicationImpl extends MinimalEObjectImpl.Container implements WebApplication {
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
	protected EList<Member<Applicational>> members;

	/**
	 * The default value of the '{@link #getInternalURL() <em>Internal URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalURL()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalURL() <em>Internal URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalURL()
	 * @generated
	 * @ordered
	 */
	protected String internalURL = INTERNAL_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalURL() <em>External URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalURL()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalURL() <em>External URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalURL()
	 * @generated
	 * @ordered
	 */
	protected String externalURL = EXTERNAL_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.WEB_APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.WEB_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Group<WebApplicationType> getGroup() {
		if (eContainerFeatureID() != AssessmentPackage.WEB_APPLICATION__GROUP) return null;
		return (Group<WebApplicationType>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group<WebApplicationType> basicGetGroup() {
		if (eContainerFeatureID() != AssessmentPackage.WEB_APPLICATION__GROUP) return null;
		return (Group<WebApplicationType>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group<WebApplicationType> newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, AssessmentPackage.WEB_APPLICATION__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group<WebApplicationType> newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.WEB_APPLICATION__GROUP && newGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.WEB_APPLICATION__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member<Applicational>> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<Member<Applicational>>(Member.class, this, AssessmentPackage.WEB_APPLICATION__MEMBERS, AssessmentPackage.MEMBER__GROUP);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalURL() {
		return internalURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalURL(String newInternalURL) {
		String oldInternalURL = internalURL;
		internalURL = newInternalURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.WEB_APPLICATION__INTERNAL_URL, oldInternalURL, internalURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalURL() {
		return externalURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalURL(String newExternalURL) {
		String oldExternalURL = externalURL;
		externalURL = newExternalURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.WEB_APPLICATION__EXTERNAL_URL, oldExternalURL, externalURL));
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
			case AssessmentPackage.WEB_APPLICATION__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group<WebApplicationType>)otherEnd, msgs);
			case AssessmentPackage.WEB_APPLICATION__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.WEB_APPLICATION__GROUP:
				return basicSetGroup(null, msgs);
			case AssessmentPackage.WEB_APPLICATION__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.WEB_APPLICATION__GROUP:
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
			case AssessmentPackage.WEB_APPLICATION__NAME:
				return getName();
			case AssessmentPackage.WEB_APPLICATION__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case AssessmentPackage.WEB_APPLICATION__MEMBERS:
				return getMembers();
			case AssessmentPackage.WEB_APPLICATION__INTERNAL_URL:
				return getInternalURL();
			case AssessmentPackage.WEB_APPLICATION__EXTERNAL_URL:
				return getExternalURL();
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
			case AssessmentPackage.WEB_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.WEB_APPLICATION__GROUP:
				setGroup((Group<WebApplicationType>)newValue);
				return;
			case AssessmentPackage.WEB_APPLICATION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member<Applicational>>)newValue);
				return;
			case AssessmentPackage.WEB_APPLICATION__INTERNAL_URL:
				setInternalURL((String)newValue);
				return;
			case AssessmentPackage.WEB_APPLICATION__EXTERNAL_URL:
				setExternalURL((String)newValue);
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
			case AssessmentPackage.WEB_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.WEB_APPLICATION__GROUP:
				setGroup((Group<WebApplicationType>)null);
				return;
			case AssessmentPackage.WEB_APPLICATION__MEMBERS:
				getMembers().clear();
				return;
			case AssessmentPackage.WEB_APPLICATION__INTERNAL_URL:
				setInternalURL(INTERNAL_URL_EDEFAULT);
				return;
			case AssessmentPackage.WEB_APPLICATION__EXTERNAL_URL:
				setExternalURL(EXTERNAL_URL_EDEFAULT);
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
			case AssessmentPackage.WEB_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.WEB_APPLICATION__GROUP:
				return basicGetGroup() != null;
			case AssessmentPackage.WEB_APPLICATION__MEMBERS:
				return members != null && !members.isEmpty();
			case AssessmentPackage.WEB_APPLICATION__INTERNAL_URL:
				return INTERNAL_URL_EDEFAULT == null ? internalURL != null : !INTERNAL_URL_EDEFAULT.equals(internalURL);
			case AssessmentPackage.WEB_APPLICATION__EXTERNAL_URL:
				return EXTERNAL_URL_EDEFAULT == null ? externalURL != null : !EXTERNAL_URL_EDEFAULT.equals(externalURL);
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
		if (baseClass == Group.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.WEB_APPLICATION__MEMBERS: return AssessmentPackage.GROUP__MEMBERS;
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
		if (baseClass == Group.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.GROUP__MEMBERS: return AssessmentPackage.WEB_APPLICATION__MEMBERS;
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
		result.append(", internalURL: ");
		result.append(internalURL);
		result.append(", externalURL: ");
		result.append(externalURL);
		result.append(')');
		return result.toString();
	}

} //WebApplicationImpl
