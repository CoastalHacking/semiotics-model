/**
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.FlowGroup#getFlowSources <em>Flow Sources</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlowGroup()
 * @model
 * @generated
 */
public interface FlowGroup extends Nameable {
	/**
	 * Returns the value of the '<em><b>Flow Sources</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.FlowSource}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.FlowSource#getFlowGroup <em>Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Sources</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getFlowGroup_FlowSources()
	 * @see us.coastalhacking.semiotics.model.assessment.FlowSource#getFlowGroup
	 * @model opposite="flowGroup" containment="true"
	 * @generated
	 */
	EList<FlowSource> getFlowSources();

} // FlowGroup
