/**
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CWE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.CWE#getCweGroup <em>Cwe Group</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.CWE#getId <em>Id</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.CWE#getTitle <em>Title</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.CWE#getUrl <em>Url</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.CWE#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getCWE()
 * @model
 * @generated
 */
public interface CWE extends EObject {
	/**
	 * Returns the value of the '<em><b>Cwe Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.CWEGroup#getCwes <em>Cwes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cwe Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwe Group</em>' container reference.
	 * @see #setCweGroup(CWEGroup)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getCWE_CweGroup()
	 * @see us.coastalhacking.semiotics.model.assessment.CWEGroup#getCwes
	 * @model opposite="cwes" transient="false"
	 * @generated
	 */
	CWEGroup getCweGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.CWE#getCweGroup <em>Cwe Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cwe Group</em>' container reference.
	 * @see #getCweGroup()
	 * @generated
	 */
	void setCweGroup(CWEGroup value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getCWE_Id()
	 * @model unique="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.CWE#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getCWE_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.CWE#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getCWE_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.CWE#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.Control}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.Control#getCwes <em>Cwes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getCWE_Controls()
	 * @see us.coastalhacking.semiotics.model.assessment.Control#getCwes
	 * @model opposite="cwes"
	 * @generated
	 */
	EList<Control> getControls();

} // CWE
