/**
 */
package us.coastalhacking.semiotics.model.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.DataFlowSource#getValue <em>Value</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.DataFlowSource#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getDataFlowSource()
 * @model
 * @generated
 */
public interface DataFlowSource extends DataFlow, FlowSource {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getDataFlowSource_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.flow.DataFlowSource#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.model.flow.DataSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.flow.DataSourceType
	 * @see #setSourceType(DataSourceType)
	 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getDataFlowSource_SourceType()
	 * @model unique="false"
	 * @generated
	 */
	DataSourceType getSourceType();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.flow.DataFlowSource#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.flow.DataSourceType
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(DataSourceType value);

} // DataFlowSource
