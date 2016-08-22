/**
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.model.assessment.Application;
import us.coastalhacking.semiotics.model.assessment.ApplicationGroup;
import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.ControlGroup;
import us.coastalhacking.semiotics.model.assessment.DataGroup;
import us.coastalhacking.semiotics.model.assessment.FlowGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl#getApplicationGroup <em>Application Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl#getFlowGroups <em>Flow Groups</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl#getControlGroups <em>Control Groups</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl#getDataGroups <em>Data Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
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
	 * The cached value of the '{@link #getFlowGroups() <em>Flow Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowGroup> flowGroups;

	/**
	 * The cached value of the '{@link #getControlGroups() <em>Control Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlGroup> controlGroups;

	/**
	 * The cached value of the '{@link #getDataGroups() <em>Data Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<DataGroup> dataGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationGroup getApplicationGroup() {
		if (eContainerFeatureID() != AssessmentPackage.APPLICATION__APPLICATION_GROUP) return null;
		return (ApplicationGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationGroup basicGetApplicationGroup() {
		if (eContainerFeatureID() != AssessmentPackage.APPLICATION__APPLICATION_GROUP) return null;
		return (ApplicationGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationGroup(ApplicationGroup newApplicationGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplicationGroup, AssessmentPackage.APPLICATION__APPLICATION_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationGroup(ApplicationGroup newApplicationGroup) {
		if (newApplicationGroup != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.APPLICATION__APPLICATION_GROUP && newApplicationGroup != null)) {
			if (EcoreUtil.isAncestor(this, newApplicationGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplicationGroup != null)
				msgs = ((InternalEObject)newApplicationGroup).eInverseAdd(this, AssessmentPackage.APPLICATION_GROUP__APPLICATIONS, ApplicationGroup.class, msgs);
			msgs = basicSetApplicationGroup(newApplicationGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__APPLICATION_GROUP, newApplicationGroup, newApplicationGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowGroup> getFlowGroups() {
		if (flowGroups == null) {
			flowGroups = new EObjectContainmentEList<FlowGroup>(FlowGroup.class, this, AssessmentPackage.APPLICATION__FLOW_GROUPS);
		}
		return flowGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlGroup> getControlGroups() {
		if (controlGroups == null) {
			controlGroups = new EObjectContainmentEList<ControlGroup>(ControlGroup.class, this, AssessmentPackage.APPLICATION__CONTROL_GROUPS);
		}
		return controlGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataGroup> getDataGroups() {
		if (dataGroups == null) {
			dataGroups = new EObjectContainmentEList<DataGroup>(DataGroup.class, this, AssessmentPackage.APPLICATION__DATA_GROUPS);
		}
		return dataGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.APPLICATION__APPLICATION_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplicationGroup((ApplicationGroup)otherEnd, msgs);
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
			case AssessmentPackage.APPLICATION__APPLICATION_GROUP:
				return basicSetApplicationGroup(null, msgs);
			case AssessmentPackage.APPLICATION__FLOW_GROUPS:
				return ((InternalEList<?>)getFlowGroups()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__CONTROL_GROUPS:
				return ((InternalEList<?>)getControlGroups()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__DATA_GROUPS:
				return ((InternalEList<?>)getDataGroups()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.APPLICATION__APPLICATION_GROUP:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.APPLICATION_GROUP__APPLICATIONS, ApplicationGroup.class, msgs);
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
			case AssessmentPackage.APPLICATION__NAME:
				return getName();
			case AssessmentPackage.APPLICATION__APPLICATION_GROUP:
				if (resolve) return getApplicationGroup();
				return basicGetApplicationGroup();
			case AssessmentPackage.APPLICATION__FLOW_GROUPS:
				return getFlowGroups();
			case AssessmentPackage.APPLICATION__CONTROL_GROUPS:
				return getControlGroups();
			case AssessmentPackage.APPLICATION__DATA_GROUPS:
				return getDataGroups();
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
			case AssessmentPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.APPLICATION__APPLICATION_GROUP:
				setApplicationGroup((ApplicationGroup)newValue);
				return;
			case AssessmentPackage.APPLICATION__FLOW_GROUPS:
				getFlowGroups().clear();
				getFlowGroups().addAll((Collection<? extends FlowGroup>)newValue);
				return;
			case AssessmentPackage.APPLICATION__CONTROL_GROUPS:
				getControlGroups().clear();
				getControlGroups().addAll((Collection<? extends ControlGroup>)newValue);
				return;
			case AssessmentPackage.APPLICATION__DATA_GROUPS:
				getDataGroups().clear();
				getDataGroups().addAll((Collection<? extends DataGroup>)newValue);
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
			case AssessmentPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.APPLICATION__APPLICATION_GROUP:
				setApplicationGroup((ApplicationGroup)null);
				return;
			case AssessmentPackage.APPLICATION__FLOW_GROUPS:
				getFlowGroups().clear();
				return;
			case AssessmentPackage.APPLICATION__CONTROL_GROUPS:
				getControlGroups().clear();
				return;
			case AssessmentPackage.APPLICATION__DATA_GROUPS:
				getDataGroups().clear();
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
			case AssessmentPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.APPLICATION__APPLICATION_GROUP:
				return basicGetApplicationGroup() != null;
			case AssessmentPackage.APPLICATION__FLOW_GROUPS:
				return flowGroups != null && !flowGroups.isEmpty();
			case AssessmentPackage.APPLICATION__CONTROL_GROUPS:
				return controlGroups != null && !controlGroups.isEmpty();
			case AssessmentPackage.APPLICATION__DATA_GROUPS:
				return dataGroups != null && !dataGroups.isEmpty();
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

} //ApplicationImpl
