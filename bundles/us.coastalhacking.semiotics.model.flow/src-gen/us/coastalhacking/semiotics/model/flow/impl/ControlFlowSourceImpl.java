/**
 */
package us.coastalhacking.semiotics.model.flow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import us.coastalhacking.semiotics.model.flow.ControlFlowSource;
import us.coastalhacking.semiotics.model.flow.FlowGroup;
import us.coastalhacking.semiotics.model.flow.FlowPackage;
import us.coastalhacking.semiotics.model.flow.FlowSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.impl.ControlFlowSourceImpl#getFlowGroup <em>Flow Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlowSourceImpl extends ControlFlowImpl implements ControlFlowSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.CONTROL_FLOW_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowGroup getFlowGroup() {
		if (eContainerFeatureID() != FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP) return null;
		return (FlowGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowGroup basicGetFlowGroup() {
		if (eContainerFeatureID() != FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP) return null;
		return (FlowGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowGroup(FlowGroup newFlowGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlowGroup, FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowGroup(FlowGroup newFlowGroup) {
		if (newFlowGroup != eInternalContainer() || (eContainerFeatureID() != FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP && newFlowGroup != null)) {
			if (EcoreUtil.isAncestor(this, newFlowGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlowGroup != null)
				msgs = ((InternalEObject)newFlowGroup).eInverseAdd(this, FlowPackage.FLOW_GROUP__FLOW_SOURCES, FlowGroup.class, msgs);
			msgs = basicSetFlowGroup(newFlowGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP, newFlowGroup, newFlowGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlowGroup((FlowGroup)otherEnd, msgs);
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
			case FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP:
				return basicSetFlowGroup(null, msgs);
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
			case FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP:
				return eInternalContainer().eInverseRemove(this, FlowPackage.FLOW_GROUP__FLOW_SOURCES, FlowGroup.class, msgs);
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
			case FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP:
				if (resolve) return getFlowGroup();
				return basicGetFlowGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP:
				setFlowGroup((FlowGroup)newValue);
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
			case FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP:
				setFlowGroup((FlowGroup)null);
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
			case FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP:
				return basicGetFlowGroup() != null;
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
		if (baseClass == FlowSource.class) {
			switch (derivedFeatureID) {
				case FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP: return FlowPackage.FLOW_SOURCE__FLOW_GROUP;
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
		if (baseClass == FlowSource.class) {
			switch (baseFeatureID) {
				case FlowPackage.FLOW_SOURCE__FLOW_GROUP: return FlowPackage.CONTROL_FLOW_SOURCE__FLOW_GROUP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ControlFlowSourceImpl
