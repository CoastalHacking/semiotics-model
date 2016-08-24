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
import us.coastalhacking.semiotics.model.assessment.Examinable;
import us.coastalhacking.semiotics.model.assessment.File;
import us.coastalhacking.semiotics.model.assessment.FileType;
import us.coastalhacking.semiotics.model.assessment.Group;
import us.coastalhacking.semiotics.model.assessment.Provable;
import us.coastalhacking.semiotics.model.assessment.Snippet;
import us.coastalhacking.semiotics.model.assessment.SnippetType;
import us.coastalhacking.semiotics.model.assessment.Traceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl#getExaminees <em>Examinees</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl#getSnippets <em>Snippets</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl#getData <em>Data</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl#getFullPath <em>Full Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File {
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
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> traces;

	/**
	 * The cached value of the '{@link #getSnippets() <em>Snippets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippets()
	 * @generated
	 * @ordered
	 */
	protected EList<Snippet<? extends SnippetType>> snippets;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullPath() <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullPath() <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPath()
	 * @generated
	 * @ordered
	 */
	protected String fullPath = FULL_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.FILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Group<FileType> getGroup() {
		if (eContainerFeatureID() != AssessmentPackage.FILE__GROUP) return null;
		return (Group<FileType>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group<FileType> basicGetGroup() {
		if (eContainerFeatureID() != AssessmentPackage.FILE__GROUP) return null;
		return (Group<FileType>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group<FileType> newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, AssessmentPackage.FILE__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group<FileType> newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.FILE__GROUP && newGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FILE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Examinable> getExaminees() {
		if (examinees == null) {
			examinees = new EObjectWithInverseResolvingEList.ManyInverse<Examinable>(Examinable.class, this, AssessmentPackage.FILE__EXAMINEES, AssessmentPackage.EXAMINABLE__EVIDENCE);
		}
		return examinees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTraces() {
		if (traces == null) {
			traces = new EObjectWithInverseResolvingEList.ManyInverse<Traceable>(Traceable.class, this, AssessmentPackage.FILE__TRACES, AssessmentPackage.TRACEABLE__EVIDENCE);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Snippet<? extends SnippetType>> getSnippets() {
		if (snippets == null) {
			snippets = new EObjectContainmentWithInverseEList<Snippet<? extends SnippetType>>(Snippet.class, this, AssessmentPackage.FILE__SNIPPETS, AssessmentPackage.SNIPPET__DATA);
		}
		return snippets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FILE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullPath() {
		return fullPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullPath(String newFullPath) {
		String oldFullPath = fullPath;
		fullPath = newFullPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FILE__FULL_PATH, oldFullPath, fullPath));
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
			case AssessmentPackage.FILE__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group<FileType>)otherEnd, msgs);
			case AssessmentPackage.FILE__EXAMINEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExaminees()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.FILE__TRACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraces()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.FILE__SNIPPETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSnippets()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.FILE__GROUP:
				return basicSetGroup(null, msgs);
			case AssessmentPackage.FILE__EXAMINEES:
				return ((InternalEList<?>)getExaminees()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.FILE__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.FILE__SNIPPETS:
				return ((InternalEList<?>)getSnippets()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.FILE__GROUP:
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
			case AssessmentPackage.FILE__NAME:
				return getName();
			case AssessmentPackage.FILE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case AssessmentPackage.FILE__EXAMINEES:
				return getExaminees();
			case AssessmentPackage.FILE__TRACES:
				return getTraces();
			case AssessmentPackage.FILE__SNIPPETS:
				return getSnippets();
			case AssessmentPackage.FILE__DATA:
				return getData();
			case AssessmentPackage.FILE__FULL_PATH:
				return getFullPath();
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
			case AssessmentPackage.FILE__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.FILE__GROUP:
				setGroup((Group<FileType>)newValue);
				return;
			case AssessmentPackage.FILE__EXAMINEES:
				getExaminees().clear();
				getExaminees().addAll((Collection<? extends Examinable>)newValue);
				return;
			case AssessmentPackage.FILE__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Traceable>)newValue);
				return;
			case AssessmentPackage.FILE__SNIPPETS:
				getSnippets().clear();
				getSnippets().addAll((Collection<? extends Snippet<? extends SnippetType>>)newValue);
				return;
			case AssessmentPackage.FILE__DATA:
				setData((String)newValue);
				return;
			case AssessmentPackage.FILE__FULL_PATH:
				setFullPath((String)newValue);
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
			case AssessmentPackage.FILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.FILE__GROUP:
				setGroup((Group<FileType>)null);
				return;
			case AssessmentPackage.FILE__EXAMINEES:
				getExaminees().clear();
				return;
			case AssessmentPackage.FILE__TRACES:
				getTraces().clear();
				return;
			case AssessmentPackage.FILE__SNIPPETS:
				getSnippets().clear();
				return;
			case AssessmentPackage.FILE__DATA:
				setData(DATA_EDEFAULT);
				return;
			case AssessmentPackage.FILE__FULL_PATH:
				setFullPath(FULL_PATH_EDEFAULT);
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
			case AssessmentPackage.FILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.FILE__GROUP:
				return basicGetGroup() != null;
			case AssessmentPackage.FILE__EXAMINEES:
				return examinees != null && !examinees.isEmpty();
			case AssessmentPackage.FILE__TRACES:
				return traces != null && !traces.isEmpty();
			case AssessmentPackage.FILE__SNIPPETS:
				return snippets != null && !snippets.isEmpty();
			case AssessmentPackage.FILE__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case AssessmentPackage.FILE__FULL_PATH:
				return FULL_PATH_EDEFAULT == null ? fullPath != null : !FULL_PATH_EDEFAULT.equals(fullPath);
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
		if (baseClass == Provable.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.FILE__EXAMINEES: return AssessmentPackage.PROVABLE__EXAMINEES;
				case AssessmentPackage.FILE__TRACES: return AssessmentPackage.PROVABLE__TRACES;
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
		if (baseClass == Provable.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.PROVABLE__EXAMINEES: return AssessmentPackage.FILE__EXAMINEES;
				case AssessmentPackage.PROVABLE__TRACES: return AssessmentPackage.FILE__TRACES;
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
		result.append(", data: ");
		result.append(data);
		result.append(", fullPath: ");
		result.append(fullPath);
		result.append(')');
		return result.toString();
	}

} //FileImpl
