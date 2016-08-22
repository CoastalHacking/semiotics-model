/**
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Control#getControlGroup <em>Control Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Control#getCwes <em>Cwes</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends Reviewable {
	/**
	 * Returns the value of the '<em><b>Control Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.ControlGroup#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Group</em>' container reference.
	 * @see #setControlGroup(ControlGroup)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getControl_ControlGroup()
	 * @see us.coastalhacking.semiotics.model.assessment.ControlGroup#getControls
	 * @model opposite="controls" transient="false"
	 * @generated
	 */
	ControlGroup getControlGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Control#getControlGroup <em>Control Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Group</em>' container reference.
	 * @see #getControlGroup()
	 * @generated
	 */
	void setControlGroup(ControlGroup value);

	/**
	 * Returns the value of the '<em><b>Cwes</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.CWE}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.CWE#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cwes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwes</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getControl_Cwes()
	 * @see us.coastalhacking.semiotics.model.assessment.CWE#getControls
	 * @model opposite="controls"
	 * @generated
	 */
	EList<CWE> getCwes();

} // Control
