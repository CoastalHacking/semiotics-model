/**
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CWE Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.CWEGroup#getCwes <em>Cwes</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getCWEGroup()
 * @model
 * @generated
 */
public interface CWEGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Cwes</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.CWE}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.CWE#getCweGroup <em>Cwe Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cwes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwes</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getCWEGroup_Cwes()
	 * @see us.coastalhacking.semiotics.model.assessment.CWE#getCweGroup
	 * @model opposite="cweGroup" containment="true"
	 * @generated
	 */
	EList<CWE> getCwes();

} // CWEGroup
