/**
 */
package us.coastalhacking.semiotics.model.application;

import org.eclipse.emf.common.util.EList;

import us.coastalhacking.semiotics.model.base.Nameable;

import us.coastalhacking.semiotics.model.control.ControlGroup;

import us.coastalhacking.semiotics.model.data.DataGroup;

import us.coastalhacking.semiotics.model.flow.FlowGroup;

import us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.application.Application#getApplicationGroup <em>Application Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.application.Application#getFlowGroups <em>Flow Groups</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.application.Application#getControlGroups <em>Control Groups</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.application.Application#getSurfaceAreaGroups <em>Surface Area Groups</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.application.Application#getDataGroups <em>Data Groups</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.application.ApplicationPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Nameable {
	/**
	 * Returns the value of the '<em><b>Application Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.application.ApplicationGroup#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Group</em>' container reference.
	 * @see #setApplicationGroup(ApplicationGroup)
	 * @see us.coastalhacking.semiotics.model.application.ApplicationPackage#getApplication_ApplicationGroup()
	 * @see us.coastalhacking.semiotics.model.application.ApplicationGroup#getApplications
	 * @model opposite="applications" transient="false"
	 * @generated
	 */
	ApplicationGroup getApplicationGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.application.Application#getApplicationGroup <em>Application Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Group</em>' container reference.
	 * @see #getApplicationGroup()
	 * @generated
	 */
	void setApplicationGroup(ApplicationGroup value);

	/**
	 * Returns the value of the '<em><b>Flow Groups</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.flow.FlowGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Groups</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.application.ApplicationPackage#getApplication_FlowGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowGroup> getFlowGroups();

	/**
	 * Returns the value of the '<em><b>Control Groups</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.control.ControlGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Groups</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.application.ApplicationPackage#getApplication_ControlGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlGroup> getControlGroups();

	/**
	 * Returns the value of the '<em><b>Surface Area Groups</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Area Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Area Groups</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.application.ApplicationPackage#getApplication_SurfaceAreaGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<SurfaceAreaGroup> getSurfaceAreaGroups();

	/**
	 * Returns the value of the '<em><b>Data Groups</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.data.DataGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Groups</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.application.ApplicationPackage#getApplication_DataGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataGroup> getDataGroups();

} // Application
