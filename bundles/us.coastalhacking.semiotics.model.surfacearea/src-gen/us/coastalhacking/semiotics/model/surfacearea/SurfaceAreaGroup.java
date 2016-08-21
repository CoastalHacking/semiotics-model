/**
 */
package us.coastalhacking.semiotics.model.surfacearea;

import org.eclipse.emf.common.util.EList;

import us.coastalhacking.semiotics.model.base.Nameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Area Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup#getSurfaceAreas <em>Surface Areas</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage#getSurfaceAreaGroup()
 * @model
 * @generated
 */
public interface SurfaceAreaGroup extends Nameable {
	/**
	 * Returns the value of the '<em><b>Surface Areas</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.surfacearea.SurfaceArea}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getSurfaceAreaGroup <em>Surface Area Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Areas</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage#getSurfaceAreaGroup_SurfaceAreas()
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getSurfaceAreaGroup
	 * @model opposite="surfaceAreaGroup" containment="true"
	 * @generated
	 */
	EList<SurfaceArea> getSurfaceAreas();

} // SurfaceAreaGroup
