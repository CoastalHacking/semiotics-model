/**
 */
package us.coastalhacking.semiotics.model.application;

import org.eclipse.emf.common.util.EList;

import us.coastalhacking.semiotics.model.base.Nameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.application.ApplicationGroup#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.application.ApplicationPackage#getApplicationGroup()
 * @model
 * @generated
 */
public interface ApplicationGroup extends Nameable {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.application.Application}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.application.Application#getApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.application.ApplicationPackage#getApplicationGroup_Applications()
	 * @see us.coastalhacking.semiotics.model.application.Application#getApplicationGroup
	 * @model opposite="applicationGroup" containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

} // ApplicationGroup
