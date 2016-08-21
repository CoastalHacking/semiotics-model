/**
 */
package us.coastalhacking.semiotics.model.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Starts With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.StartsWith#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getStartsWith()
 * @model
 * @generated
 */
public interface StartsWith extends DataFlowConstraint {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getStartsWith_Prefix()
	 * @model unique="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.flow.StartsWith#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // StartsWith
