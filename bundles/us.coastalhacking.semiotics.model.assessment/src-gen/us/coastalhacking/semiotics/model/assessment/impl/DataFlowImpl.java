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
import us.coastalhacking.semiotics.model.assessment.DataFlow;
import us.coastalhacking.semiotics.model.assessment.DataFlowType;
import us.coastalhacking.semiotics.model.assessment.DataTaintType;
import us.coastalhacking.semiotics.model.assessment.Examinable;
import us.coastalhacking.semiotics.model.assessment.FlowNode;
import us.coastalhacking.semiotics.model.assessment.FlowType;
import us.coastalhacking.semiotics.model.assessment.Group;
import us.coastalhacking.semiotics.model.assessment.Provable;
import us.coastalhacking.semiotics.model.assessment.Traceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl#getExaminees <em>Examinees</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl#getValue <em>Value</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowImpl extends MinimalEObjectImpl.Container implements DataFlow {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected FlowNode<? extends FlowType> flows;

	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTaintType SOURCE_TYPE_EDEFAULT = DataTaintType.HTTP;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected DataTaintType sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.DATA_FLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.DATA_FLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Group<DataFlowType> getGroup() {
		if (eContainerFeatureID() != AssessmentPackage.DATA_FLOW__GROUP) return null;
		return (Group<DataFlowType>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group<DataFlowType> basicGetGroup() {
		if (eContainerFeatureID() != AssessmentPackage.DATA_FLOW__GROUP) return null;
		return (Group<DataFlowType>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group<DataFlowType> newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, AssessmentPackage.DATA_FLOW__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group<DataFlowType> newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.DATA_FLOW__GROUP && newGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.DATA_FLOW__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provable> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectWithInverseResolvingEList.ManyInverse<Provable>(Provable.class, this, AssessmentPackage.DATA_FLOW__EVIDENCE, AssessmentPackage.PROVABLE__TRACES);
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
			examinees = new EObjectWithInverseResolvingEList.ManyInverse<Examinable>(Examinable.class, this, AssessmentPackage.DATA_FLOW__EXAMINEES, AssessmentPackage.EXAMINABLE__TRACES);
		}
		return examinees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.DATA_FLOW__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode<? extends FlowType> getFlows() {
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlows(FlowNode<? extends FlowType> newFlows, NotificationChain msgs) {
		FlowNode<? extends FlowType> oldFlows = flows;
		flows = newFlows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.DATA_FLOW__FLOWS, oldFlows, newFlows);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlows(FlowNode<? extends FlowType> newFlows) {
		if (newFlows != flows) {
			NotificationChain msgs = null;
			if (flows != null)
				msgs = ((InternalEObject)flows).eInverseRemove(this, AssessmentPackage.FLOW_NODE__FLOW_ROOT, FlowNode.class, msgs);
			if (newFlows != null)
				msgs = ((InternalEObject)newFlows).eInverseAdd(this, AssessmentPackage.FLOW_NODE__FLOW_ROOT, FlowNode.class, msgs);
			msgs = basicSetFlows(newFlows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.DATA_FLOW__FLOWS, newFlows, newFlows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTaintType getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(DataTaintType newSourceType) {
		DataTaintType oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.DATA_FLOW__SOURCE_TYPE, oldSourceType, sourceType));
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
			case AssessmentPackage.DATA_FLOW__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group<DataFlowType>)otherEnd, msgs);
			case AssessmentPackage.DATA_FLOW__EVIDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvidence()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.DATA_FLOW__EXAMINEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExaminees()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.DATA_FLOW__FLOWS:
				if (flows != null)
					msgs = ((InternalEObject)flows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.DATA_FLOW__FLOWS, null, msgs);
				return basicSetFlows((FlowNode<? extends FlowType>)otherEnd, msgs);
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
			case AssessmentPackage.DATA_FLOW__GROUP:
				return basicSetGroup(null, msgs);
			case AssessmentPackage.DATA_FLOW__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.DATA_FLOW__EXAMINEES:
				return ((InternalEList<?>)getExaminees()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.DATA_FLOW__FLOWS:
				return basicSetFlows(null, msgs);
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
			case AssessmentPackage.DATA_FLOW__GROUP:
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
			case AssessmentPackage.DATA_FLOW__NAME:
				return getName();
			case AssessmentPackage.DATA_FLOW__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case AssessmentPackage.DATA_FLOW__EVIDENCE:
				return getEvidence();
			case AssessmentPackage.DATA_FLOW__EXAMINEES:
				return getExaminees();
			case AssessmentPackage.DATA_FLOW__VALUE:
				return getValue();
			case AssessmentPackage.DATA_FLOW__FLOWS:
				return getFlows();
			case AssessmentPackage.DATA_FLOW__SOURCE_TYPE:
				return getSourceType();
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
			case AssessmentPackage.DATA_FLOW__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.DATA_FLOW__GROUP:
				setGroup((Group<DataFlowType>)newValue);
				return;
			case AssessmentPackage.DATA_FLOW__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Provable>)newValue);
				return;
			case AssessmentPackage.DATA_FLOW__EXAMINEES:
				getExaminees().clear();
				getExaminees().addAll((Collection<? extends Examinable>)newValue);
				return;
			case AssessmentPackage.DATA_FLOW__VALUE:
				setValue((String)newValue);
				return;
			case AssessmentPackage.DATA_FLOW__FLOWS:
				setFlows((FlowNode<? extends FlowType>)newValue);
				return;
			case AssessmentPackage.DATA_FLOW__SOURCE_TYPE:
				setSourceType((DataTaintType)newValue);
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
			case AssessmentPackage.DATA_FLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.DATA_FLOW__GROUP:
				setGroup((Group<DataFlowType>)null);
				return;
			case AssessmentPackage.DATA_FLOW__EVIDENCE:
				getEvidence().clear();
				return;
			case AssessmentPackage.DATA_FLOW__EXAMINEES:
				getExaminees().clear();
				return;
			case AssessmentPackage.DATA_FLOW__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AssessmentPackage.DATA_FLOW__FLOWS:
				setFlows((FlowNode<? extends FlowType>)null);
				return;
			case AssessmentPackage.DATA_FLOW__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
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
			case AssessmentPackage.DATA_FLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.DATA_FLOW__GROUP:
				return basicGetGroup() != null;
			case AssessmentPackage.DATA_FLOW__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case AssessmentPackage.DATA_FLOW__EXAMINEES:
				return examinees != null && !examinees.isEmpty();
			case AssessmentPackage.DATA_FLOW__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AssessmentPackage.DATA_FLOW__FLOWS:
				return flows != null;
			case AssessmentPackage.DATA_FLOW__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
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
		if (baseClass == Traceable.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.DATA_FLOW__EVIDENCE: return AssessmentPackage.TRACEABLE__EVIDENCE;
				case AssessmentPackage.DATA_FLOW__EXAMINEES: return AssessmentPackage.TRACEABLE__EXAMINEES;
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
		if (baseClass == Traceable.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.TRACEABLE__EVIDENCE: return AssessmentPackage.DATA_FLOW__EVIDENCE;
				case AssessmentPackage.TRACEABLE__EXAMINEES: return AssessmentPackage.DATA_FLOW__EXAMINEES;
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
		result.append(", value: ");
		result.append(value);
		result.append(", sourceType: ");
		result.append(sourceType);
		result.append(')');
		return result.toString();
	}

} //DataFlowImpl
