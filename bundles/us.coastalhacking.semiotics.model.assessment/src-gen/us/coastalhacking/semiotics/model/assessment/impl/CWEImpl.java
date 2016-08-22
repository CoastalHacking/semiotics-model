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
import us.coastalhacking.semiotics.model.assessment.CWEGroup;
import us.coastalhacking.semiotics.model.assessment.Control;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CWE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CWEImpl#getCweGroup <em>Cwe Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CWEImpl#getId <em>Id</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CWEImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CWEImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.CWEImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CWEImpl extends MinimalEObjectImpl.Container implements CWE {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CWEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.CWE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWEGroup getCweGroup() {
		if (eContainerFeatureID() != AssessmentPackage.CWE__CWE_GROUP) return null;
		return (CWEGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWEGroup basicGetCweGroup() {
		if (eContainerFeatureID() != AssessmentPackage.CWE__CWE_GROUP) return null;
		return (CWEGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCweGroup(CWEGroup newCweGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCweGroup, AssessmentPackage.CWE__CWE_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCweGroup(CWEGroup newCweGroup) {
		if (newCweGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.CWE__CWE_GROUP && newCweGroup != null)) {
			if (EcoreUtil.isAncestor(this, newCweGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCweGroup != null)
				msgs = ((InternalEObject)newCweGroup).eInverseAdd(this, AssessmentPackage.CWE_GROUP__CWES, CWEGroup.class, msgs);
			msgs = basicSetCweGroup(newCweGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CWE__CWE_GROUP, newCweGroup, newCweGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CWE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CWE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.CWE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectWithInverseResolvingEList.ManyInverse<Control>(Control.class, this, AssessmentPackage.CWE__CONTROLS, AssessmentPackage.CONTROL__CWES);
		}
		return controls;
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
			case AssessmentPackage.CWE__CWE_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCweGroup((CWEGroup)otherEnd, msgs);
			case AssessmentPackage.CWE__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.CWE__CWE_GROUP:
				return basicSetCweGroup(null, msgs);
			case AssessmentPackage.CWE__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.CWE__CWE_GROUP:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.CWE_GROUP__CWES, CWEGroup.class, msgs);
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
			case AssessmentPackage.CWE__CWE_GROUP:
				if (resolve) return getCweGroup();
				return basicGetCweGroup();
			case AssessmentPackage.CWE__ID:
				return getId();
			case AssessmentPackage.CWE__TITLE:
				return getTitle();
			case AssessmentPackage.CWE__URL:
				return getUrl();
			case AssessmentPackage.CWE__CONTROLS:
				return getControls();
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
			case AssessmentPackage.CWE__CWE_GROUP:
				setCweGroup((CWEGroup)newValue);
				return;
			case AssessmentPackage.CWE__ID:
				setId((Integer)newValue);
				return;
			case AssessmentPackage.CWE__TITLE:
				setTitle((String)newValue);
				return;
			case AssessmentPackage.CWE__URL:
				setUrl((String)newValue);
				return;
			case AssessmentPackage.CWE__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
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
			case AssessmentPackage.CWE__CWE_GROUP:
				setCweGroup((CWEGroup)null);
				return;
			case AssessmentPackage.CWE__ID:
				setId(ID_EDEFAULT);
				return;
			case AssessmentPackage.CWE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AssessmentPackage.CWE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case AssessmentPackage.CWE__CONTROLS:
				getControls().clear();
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
			case AssessmentPackage.CWE__CWE_GROUP:
				return basicGetCweGroup() != null;
			case AssessmentPackage.CWE__ID:
				return id != ID_EDEFAULT;
			case AssessmentPackage.CWE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AssessmentPackage.CWE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case AssessmentPackage.CWE__CONTROLS:
				return controls != null && !controls.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //CWEImpl
