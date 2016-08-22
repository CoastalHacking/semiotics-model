/**
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.DataGroup#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getDataGroup()
 * @model
 * @generated
 */
public interface DataGroup extends Nameable {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Data}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Data#getDataGroup <em>Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getDataGroup_Data()
	 * @see us.coastalhacking.semiotics.model.assessment.Data#getDataGroup
	 * @model opposite="dataGroup" containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // DataGroup
