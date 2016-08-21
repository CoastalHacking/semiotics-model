/**
 */
package us.coastalhacking.semiotics.model.data;

import org.eclipse.emf.common.util.EList;

import us.coastalhacking.semiotics.model.base.Nameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.data.Data#getSnippets <em>Snippets</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.Data#getDataGroup <em>Data Group</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.data.DataPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Nameable {
	/**
	 * Returns the value of the '<em><b>Snippets</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.data.Snippet}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.data.Snippet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippets</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.data.DataPackage#getData_Snippets()
	 * @see us.coastalhacking.semiotics.model.data.Snippet#getData
	 * @model opposite="data" containment="true"
	 * @generated
	 */
	EList<Snippet> getSnippets();

	/**
	 * Returns the value of the '<em><b>Data Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.data.DataGroup#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Group</em>' container reference.
	 * @see #setDataGroup(DataGroup)
	 * @see us.coastalhacking.semiotics.model.data.DataPackage#getData_DataGroup()
	 * @see us.coastalhacking.semiotics.model.data.DataGroup#getData
	 * @model opposite="data" transient="false"
	 * @generated
	 */
	DataGroup getDataGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.data.Data#getDataGroup <em>Data Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Group</em>' container reference.
	 * @see #getDataGroup()
	 * @generated
	 */
	void setDataGroup(DataGroup value);

} // Data
