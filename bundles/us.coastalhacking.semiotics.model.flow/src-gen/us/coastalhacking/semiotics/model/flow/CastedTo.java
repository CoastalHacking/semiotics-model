/**
 */
package us.coastalhacking.semiotics.model.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Casted To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.CastedTo#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getCastedTo()
 * @model
 * @generated
 */
public interface CastedTo extends DataFlowConstraint {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getCastedTo_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.flow.CastedTo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // CastedTo
