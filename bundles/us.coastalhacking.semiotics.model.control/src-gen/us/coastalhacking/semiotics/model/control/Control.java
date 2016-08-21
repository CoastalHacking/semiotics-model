/**
 */
package us.coastalhacking.semiotics.model.control;

import us.coastalhacking.semiotics.model.base.Reviewable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.control.Control#getControlGroup <em>Control Group</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.control.ControlPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends Reviewable {
	/**
	 * Returns the value of the '<em><b>Control Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.control.ControlGroup#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Group</em>' container reference.
	 * @see #setControlGroup(ControlGroup)
	 * @see us.coastalhacking.semiotics.model.control.ControlPackage#getControl_ControlGroup()
	 * @see us.coastalhacking.semiotics.model.control.ControlGroup#getControls
	 * @model opposite="controls" transient="false"
	 * @generated
	 */
	ControlGroup getControlGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.control.Control#getControlGroup <em>Control Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Group</em>' container reference.
	 * @see #getControlGroup()
	 * @generated
	 */
	void setControlGroup(ControlGroup value);

} // Control
