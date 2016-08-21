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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.model.surfacearea.SurfaceArea;
import us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup;
import us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Area Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaGroupImpl#getSurfaceAreas <em>Surface Areas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurfaceAreaGroupImpl extends MinimalEObjectImpl.Container implements SurfaceAreaGroup {
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
	 * The cached value of the '{@link #getSurfaceAreas() <em>Surface Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<SurfaceArea> surfaceAreas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceAreaGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurfaceareaPackage.Literals.SURFACE_AREA_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurfaceareaPackage.SURFACE_AREA_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurfaceArea> getSurfaceAreas() {
		if (surfaceAreas == null) {
			surfaceAreas = new EObjectContainmentWithInverseEList<SurfaceArea>(SurfaceArea.class, this, SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS, SurfaceareaPackage.SURFACE_AREA__SURFACE_AREA_GROUP);
		}
		return surfaceAreas;
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
			case SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSurfaceAreas()).basicAdd(otherEnd, msgs);
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
			case SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS:
				return ((InternalEList<?>)getSurfaceAreas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurfaceareaPackage.SURFACE_AREA_GROUP__NAME:
				return getName();
			case SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS:
				return getSurfaceAreas();
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
			case SurfaceareaPackage.SURFACE_AREA_GROUP__NAME:
				setName((String)newValue);
				return;
			case SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS:
				getSurfaceAreas().clear();
				getSurfaceAreas().addAll((Collection<? extends SurfaceArea>)newValue);
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
			case SurfaceareaPackage.SURFACE_AREA_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS:
				getSurfaceAreas().clear();
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
			case SurfaceareaPackage.SURFACE_AREA_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SurfaceareaPackage.SURFACE_AREA_GROUP__SURFACE_AREAS:
				return surfaceAreas != null && !surfaceAreas.isEmpty();
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

} //SurfaceAreaGroupImpl
