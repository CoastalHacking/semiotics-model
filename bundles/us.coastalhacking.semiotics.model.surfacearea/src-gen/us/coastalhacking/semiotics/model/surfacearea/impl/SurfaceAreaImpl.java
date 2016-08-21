/**
 */
package us.coastalhacking.semiotics.model.surfacearea.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.model.base.BasePackage;
import us.coastalhacking.semiotics.model.base.Provable;
import us.coastalhacking.semiotics.model.base.Traceable;

import us.coastalhacking.semiotics.model.control.Control;

import us.coastalhacking.semiotics.model.surfacearea.SurfaceArea;
import us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup;
import us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl#getSurfaceAreaGroup <em>Surface Area Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurfaceAreaImpl extends MinimalEObjectImpl.Container implements SurfaceArea {
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
	protected SurfaceAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurfaceareaPackage.Literals.SURFACE_AREA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurfaceareaPackage.SURFACE_AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provable> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectWithInverseResolvingEList.ManyInverse<Provable>(Provable.class, this, SurfaceareaPackage.SURFACE_AREA__EVIDENCE, BasePackage.PROVABLE__REVIEWERS);
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
			traces = new EObjectWithInverseResolvingEList.ManyInverse<Traceable>(Traceable.class, this, SurfaceareaPackage.SURFACE_AREA__TRACES, BasePackage.TRACEABLE__REVIEWERS);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceAreaGroup getSurfaceAreaGroup() {
		if (eContainerFeatureID() != SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP) return null;
		return (SurfaceAreaGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceAreaGroup basicGetSurfaceAreaGroup() {
		if (eContainerFeatureID() != SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP) return null;
		return (SurfaceAreaGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceAreaGroup(SurfaceAreaGroup newSurfaceAreaGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSurfaceAreaGroup, SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceAreaGroup(SurfaceAreaGroup newSurfaceAreaGroup) {
		if (newSurfaceAreaGroup != eInternalContainer() || (eContainerFeatureID() != SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP && newSurfaceAreaGroup != null)) {
			if (EcoreUtil.isAncestor(this, newSurfaceAreaGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSurfaceAreaGroup != null)
				msgs = ((InternalEObject)newSurfaceAreaGroup).eInverseAdd(this, SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS, SurfaceAreaGroup.class, msgs);
			msgs = basicSetSurfaceAreaGroup(newSurfaceAreaGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP, newSurfaceAreaGroup, newSurfaceAreaGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectResolvingEList<Control>(Control.class, this, SurfaceareaPackage.SURFACE_AREA__CONTROLS);
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
			case SurfaceareaPackage.SURFACE_AREA__EVIDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvidence()).basicAdd(otherEnd, msgs);
			case SurfaceareaPackage.SURFACE_AREA__TRACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraces()).basicAdd(otherEnd, msgs);
			case SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSurfaceAreaGroup((SurfaceAreaGroup)otherEnd, msgs);
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
			case SurfaceareaPackage.SURFACE_AREA__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case SurfaceareaPackage.SURFACE_AREA__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
			case SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP:
				return basicSetSurfaceAreaGroup(null, msgs);
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
			case SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP:
				return eInternalContainer().eInverseRemove(this, SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS, SurfaceAreaGroup.class, msgs);
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
			case SurfaceareaPackage.SURFACE_AREA__NAME:
				return getName();
			case SurfaceareaPackage.SURFACE_AREA__EVIDENCE:
				return getEvidence();
			case SurfaceareaPackage.SURFACE_AREA__TRACES:
				return getTraces();
			case SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP:
				if (resolve) return getSurfaceAreaGroup();
				return basicGetSurfaceAreaGroup();
			case SurfaceareaPackage.SURFACE_AREA__CONTROLS:
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
			case SurfaceareaPackage.SURFACE_AREA__NAME:
				setName((String)newValue);
				return;
			case SurfaceareaPackage.SURFACE_AREA__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Provable>)newValue);
				return;
			case SurfaceareaPackage.SURFACE_AREA__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Traceable>)newValue);
				return;
			case SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP:
				setSurfaceAreaGroup((SurfaceAreaGroup)newValue);
				return;
			case SurfaceareaPackage.SURFACE_AREA__CONTROLS:
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
			case SurfaceareaPackage.SURFACE_AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SurfaceareaPackage.SURFACE_AREA__EVIDENCE:
				getEvidence().clear();
				return;
			case SurfaceareaPackage.SURFACE_AREA__TRACES:
				getTraces().clear();
				return;
			case SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP:
				setSurfaceAreaGroup((SurfaceAreaGroup)null);
				return;
			case SurfaceareaPackage.SURFACE_AREA__CONTROLS:
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
			case SurfaceareaPackage.SURFACE_AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SurfaceareaPackage.SURFACE_AREA__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case SurfaceareaPackage.SURFACE_AREA__TRACES:
				return traces != null && !traces.isEmpty();
			case SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP:
				return basicGetSurfaceAreaGroup() != null;
			case SurfaceareaPackage.SURFACE_AREA__CONTROLS:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SurfaceAreaImpl
