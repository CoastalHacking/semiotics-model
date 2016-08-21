/**
 */
package us.coastalhacking.semiotics.model.surfacearea;

import org.eclipse.emf.common.util.EList;

import us.coastalhacking.semiotics.model.base.Reviewable;

import us.coastalhacking.semiotics.model.control.Control;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getSurfaceAreaGroup <em>Surface Area Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage#getSurfaceArea()
 * @model
 * @generated
 */
public interface SurfaceArea extends Reviewable {
	/**
	 * Returns the value of the '<em><b>Surface Area Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup#getSurfaceAreas <em>Surface Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Area Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Area Group</em>' container reference.
	 * @see #setSurfaceAreaGroup(SurfaceAreaGroup)
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage#getSurfaceArea_SurfaceAreaGroup()
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup#getSurfaceAreas
	 * @model opposite="surfaceAreas" transient="false"
	 * @generated
	 */
	SurfaceAreaGroup getSurfaceAreaGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getSurfaceAreaGroup <em>Surface Area Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Area Group</em>' container reference.
	 * @see #getSurfaceAreaGroup()
	 * @generated
	 */
	void setSurfaceAreaGroup(SurfaceAreaGroup value);

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.control.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage#getSurfaceArea_Controls()
	 * @model
	 * @generated
	 */
	EList<Control> getControls();

} // SurfaceArea
