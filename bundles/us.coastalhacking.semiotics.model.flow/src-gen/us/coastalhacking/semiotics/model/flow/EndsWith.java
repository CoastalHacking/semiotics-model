/**
 */
package us.coastalhacking.semiotics.model.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ends With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.EndsWith#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getEndsWith()
 * @model
 * @generated
 */
public interface EndsWith extends DataFlowConstraint {
	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getEndsWith_Suffix()
	 * @model unique="false"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.flow.EndsWith#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

} // EndsWith
