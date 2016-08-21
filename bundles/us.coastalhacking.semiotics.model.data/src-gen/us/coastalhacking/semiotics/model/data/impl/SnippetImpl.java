/**
 */
package us.coastalhacking.semiotics.model.data.impl;

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

import us.coastalhacking.semiotics.model.base.BasePackage;
import us.coastalhacking.semiotics.model.base.Reviewable;
import us.coastalhacking.semiotics.model.base.Traceable;

import us.coastalhacking.semiotics.model.data.Data;
import us.coastalhacking.semiotics.model.data.DataPackage;
import us.coastalhacking.semiotics.model.data.Snippet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snippet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl#getReviewers <em>Reviewers</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl#getData <em>Data</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl#getRow <em>Row</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnippetImpl extends MinimalEObjectImpl.Container implements Snippet {
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
	 * The cached value of the '{@link #getReviewers() <em>Reviewers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reviewable> reviewers;

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
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnippetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.SNIPPET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SNIPPET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reviewable> getReviewers() {
		if (reviewers == null) {
			reviewers = new EObjectWithInverseResolvingEList.ManyInverse<Reviewable>(Reviewable.class, this, DataPackage.SNIPPET__REVIEWERS, BasePackage.REVIEWABLE__EVIDENCE);
		}
		return reviewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTraces() {
		if (traces == null) {
			traces = new EObjectWithInverseResolvingEList.ManyInverse<Traceable>(Traceable.class, this, DataPackage.SNIPPET__TRACES, BasePackage.TRACEABLE__EVIDENCE);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (eContainerFeatureID() != DataPackage.SNIPPET__DATA) return null;
		return (Data)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		if (eContainerFeatureID() != DataPackage.SNIPPET__DATA) return null;
		return (Data)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Data newData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newData, DataPackage.SNIPPET__DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		if (newData != eInternalContainer() || (eContainerFeatureID() != DataPackage.SNIPPET__DATA && newData != null)) {
			if (EcoreUtil.isAncestor(this, newData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, DataPackage.DATA__SNIPPETS, Data.class, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SNIPPET__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SNIPPET__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SNIPPET__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SNIPPET__LENGTH, oldLength, length));
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
			case DataPackage.SNIPPET__REVIEWERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReviewers()).basicAdd(otherEnd, msgs);
			case DataPackage.SNIPPET__TRACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraces()).basicAdd(otherEnd, msgs);
			case DataPackage.SNIPPET__DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetData((Data)otherEnd, msgs);
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
			case DataPackage.SNIPPET__REVIEWERS:
				return ((InternalEList<?>)getReviewers()).basicRemove(otherEnd, msgs);
			case DataPackage.SNIPPET__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
			case DataPackage.SNIPPET__DATA:
				return basicSetData(null, msgs);
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
			case DataPackage.SNIPPET__DATA:
				return eInternalContainer().eInverseRemove(this, DataPackage.DATA__SNIPPETS, Data.class, msgs);
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
			case DataPackage.SNIPPET__NAME:
				return getName();
			case DataPackage.SNIPPET__REVIEWERS:
				return getReviewers();
			case DataPackage.SNIPPET__TRACES:
				return getTraces();
			case DataPackage.SNIPPET__DATA:
				if (resolve) return getData();
				return basicGetData();
			case DataPackage.SNIPPET__ROW:
				return getRow();
			case DataPackage.SNIPPET__COLUMN:
				return getColumn();
			case DataPackage.SNIPPET__LENGTH:
				return getLength();
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
			case DataPackage.SNIPPET__NAME:
				setName((String)newValue);
				return;
			case DataPackage.SNIPPET__REVIEWERS:
				getReviewers().clear();
				getReviewers().addAll((Collection<? extends Reviewable>)newValue);
				return;
			case DataPackage.SNIPPET__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Traceable>)newValue);
				return;
			case DataPackage.SNIPPET__DATA:
				setData((Data)newValue);
				return;
			case DataPackage.SNIPPET__ROW:
				setRow((Integer)newValue);
				return;
			case DataPackage.SNIPPET__COLUMN:
				setColumn((Integer)newValue);
				return;
			case DataPackage.SNIPPET__LENGTH:
				setLength((Integer)newValue);
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
			case DataPackage.SNIPPET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.SNIPPET__REVIEWERS:
				getReviewers().clear();
				return;
			case DataPackage.SNIPPET__TRACES:
				getTraces().clear();
				return;
			case DataPackage.SNIPPET__DATA:
				setData((Data)null);
				return;
			case DataPackage.SNIPPET__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case DataPackage.SNIPPET__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case DataPackage.SNIPPET__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case DataPackage.SNIPPET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.SNIPPET__REVIEWERS:
				return reviewers != null && !reviewers.isEmpty();
			case DataPackage.SNIPPET__TRACES:
				return traces != null && !traces.isEmpty();
			case DataPackage.SNIPPET__DATA:
				return basicGetData() != null;
			case DataPackage.SNIPPET__ROW:
				return row != ROW_EDEFAULT;
			case DataPackage.SNIPPET__COLUMN:
				return column != COLUMN_EDEFAULT;
			case DataPackage.SNIPPET__LENGTH:
				return length != LENGTH_EDEFAULT;
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
		result.append(", row: ");
		result.append(row);
		result.append(", column: ");
		result.append(column);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //SnippetImpl
