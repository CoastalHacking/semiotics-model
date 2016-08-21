/**
 */
package us.coastalhacking.semiotics.model.flow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import us.coastalhacking.semiotics.model.flow.DataFlowSource;
import us.coastalhacking.semiotics.model.flow.DataSourceType;
import us.coastalhacking.semiotics.model.flow.FlowGroup;
import us.coastalhacking.semiotics.model.flow.FlowPackage;
import us.coastalhacking.semiotics.model.flow.FlowSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowSourceImpl#getFlowGroup <em>Flow Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowSourceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowSourceImpl#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowSourceImpl extends DataFlowImpl implements DataFlowSource {
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
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final DataSourceType SOURCE_TYPE_EDEFAULT = DataSourceType.HTTP;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected DataSourceType sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.DATA_FLOW_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowGroup getFlowGroup() {
		if (eContainerFeatureID() != FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP) return null;
		return (FlowGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowGroup basicGetFlowGroup() {
		if (eContainerFeatureID() != FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP) return null;
		return (FlowGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowGroup(FlowGroup newFlowGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlowGroup, FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowGroup(FlowGroup newFlowGroup) {
		if (newFlowGroup != eInternalContainer() || (eContainerFeatureID() != FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP && newFlowGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP, newFlowGroup, newFlowGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.DATA_FLOW_SOURCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceType getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(DataSourceType newSourceType) {
		DataSourceType oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.DATA_FLOW_SOURCE__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP:
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
			case FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP:
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
			case FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP:
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
			case FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP:
				if (resolve) return getFlowGroup();
				return basicGetFlowGroup();
			case FlowPackage.DATA_FLOW_SOURCE__VALUE:
				return getValue();
			case FlowPackage.DATA_FLOW_SOURCE__SOURCE_TYPE:
				return getSourceType();
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
			case FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP:
				setFlowGroup((FlowGroup)newValue);
				return;
			case FlowPackage.DATA_FLOW_SOURCE__VALUE:
				setValue((String)newValue);
				return;
			case FlowPackage.DATA_FLOW_SOURCE__SOURCE_TYPE:
				setSourceType((DataSourceType)newValue);
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
			case FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP:
				setFlowGroup((FlowGroup)null);
				return;
			case FlowPackage.DATA_FLOW_SOURCE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FlowPackage.DATA_FLOW_SOURCE__SOURCE_TYPE:
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
			case FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP:
				return basicGetFlowGroup() != null;
			case FlowPackage.DATA_FLOW_SOURCE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case FlowPackage.DATA_FLOW_SOURCE__SOURCE_TYPE:
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
		if (baseClass == FlowSource.class) {
			switch (derivedFeatureID) {
				case FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP: return FlowPackage.FLOW_SOURCE__FLOW_GROUP;
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
				case FlowPackage.FLOW_SOURCE__FLOW_GROUP: return FlowPackage.DATA_FLOW_SOURCE__FLOW_GROUP;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", sourceType: ");
		result.append(sourceType);
		result.append(')');
		return result.toString();
	}

} //DataFlowSourceImpl
