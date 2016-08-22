/**
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.ControlGroup#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getControlGroup()
 * @model
 * @generated
 */
public interface ControlGroup extends Nameable {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Control}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Control#getControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getControlGroup_Controls()
	 * @see us.coastalhacking.semiotics.model.assessment.Control#getControlGroup
	 * @model opposite="controlGroup" containment="true"
	 * @generated
	 */
	EList<Control> getControls();

} // ControlGroup
