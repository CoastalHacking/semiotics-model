/**
 */
package us.coastalhacking.semiotics.model.flow;

import org.eclipse.emf.common.util.EList;

import us.coastalhacking.semiotics.model.base.Traceable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.Flow#getFlowFrom <em>Flow From</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.flow.Flow#getFlowTo <em>Flow To</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends Traceable {
	/**
	 * Returns the value of the '<em><b>Flow From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.flow.Flow#getFlowTo <em>Flow To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow From</em>' container reference.
	 * @see #setFlowFrom(Flow)
	 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getFlow_FlowFrom()
	 * @see us.coastalhacking.semiotics.model.flow.Flow#getFlowTo
	 * @model opposite="flowTo" transient="false"
	 * @generated
	 */
	Flow getFlowFrom();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.flow.Flow#getFlowFrom <em>Flow From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow From</em>' container reference.
	 * @see #getFlowFrom()
	 * @generated
	 */
	void setFlowFrom(Flow value);

	/**
	 * Returns the value of the '<em><b>Flow To</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.flow.Flow}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.flow.Flow#getFlowFrom <em>Flow From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow To</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#getFlow_FlowTo()
	 * @see us.coastalhacking.semiotics.model.flow.Flow#getFlowFrom
	 * @model opposite="flowFrom" containment="true"
	 * @generated
	 */
	EList<Flow> getFlowTo();

} // Flow
