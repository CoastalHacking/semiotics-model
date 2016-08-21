/**
 */
package us.coastalhacking.semiotics.model.flow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import us.coastalhacking.semiotics.model.base.Nameable;
import us.coastalhacking.semiotics.model.base.Traceable;

import us.coastalhacking.semiotics.model.flow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.flow.FlowPackage
 * @generated
 */
public class FlowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSwitch() {
		if (modelPackage == null) {
			modelPackage = FlowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FlowPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseTraceable(flow);
				if (result == null) result = caseNameable(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_SOURCE: {
				FlowSource flowSource = (FlowSource)theEObject;
				T result = caseFlowSource(flowSource);
				if (result == null) result = caseFlow(flowSource);
				if (result == null) result = caseTraceable(flowSource);
				if (result == null) result = caseNameable(flowSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_SINK: {
				FlowSink flowSink = (FlowSink)theEObject;
				T result = caseFlowSink(flowSink);
				if (result == null) result = caseFlow(flowSink);
				if (result == null) result = caseTraceable(flowSink);
				if (result == null) result = caseNameable(flowSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_GROUP: {
				FlowGroup flowGroup = (FlowGroup)theEObject;
				T result = caseFlowGroup(flowGroup);
				if (result == null) result = caseNameable(flowGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = caseFlow(dataFlow);
				if (result == null) result = caseTraceable(dataFlow);
				if (result == null) result = caseNameable(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_FLOW_SOURCE: {
				DataFlowSource dataFlowSource = (DataFlowSource)theEObject;
				T result = caseDataFlowSource(dataFlowSource);
				if (result == null) result = caseDataFlow(dataFlowSource);
				if (result == null) result = caseFlowSource(dataFlowSource);
				if (result == null) result = caseFlow(dataFlowSource);
				if (result == null) result = caseTraceable(dataFlowSource);
				if (result == null) result = caseNameable(dataFlowSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_FLOW_SINK: {
				DataFlowSink dataFlowSink = (DataFlowSink)theEObject;
				T result = caseDataFlowSink(dataFlowSink);
				if (result == null) result = caseDataFlow(dataFlowSink);
				if (result == null) result = caseFlowSink(dataFlowSink);
				if (result == null) result = caseFlow(dataFlowSink);
				if (result == null) result = caseTraceable(dataFlowSink);
				if (result == null) result = caseNameable(dataFlowSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_CONSTRAINT: {
				FlowConstraint flowConstraint = (FlowConstraint)theEObject;
				T result = caseFlowConstraint(flowConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_FLOW_CONSTRAINT: {
				DataFlowConstraint dataFlowConstraint = (DataFlowConstraint)theEObject;
				T result = caseDataFlowConstraint(dataFlowConstraint);
				if (result == null) result = caseDataFlow(dataFlowConstraint);
				if (result == null) result = caseFlowConstraint(dataFlowConstraint);
				if (result == null) result = caseFlow(dataFlowConstraint);
				if (result == null) result = caseTraceable(dataFlowConstraint);
				if (result == null) result = caseNameable(dataFlowConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ENDS_WITH: {
				EndsWith endsWith = (EndsWith)theEObject;
				T result = caseEndsWith(endsWith);
				if (result == null) result = caseDataFlowConstraint(endsWith);
				if (result == null) result = caseDataFlow(endsWith);
				if (result == null) result = caseFlowConstraint(endsWith);
				if (result == null) result = caseFlow(endsWith);
				if (result == null) result = caseTraceable(endsWith);
				if (result == null) result = caseNameable(endsWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.STARTS_WITH: {
				StartsWith startsWith = (StartsWith)theEObject;
				T result = caseStartsWith(startsWith);
				if (result == null) result = caseDataFlowConstraint(startsWith);
				if (result == null) result = caseDataFlow(startsWith);
				if (result == null) result = caseFlowConstraint(startsWith);
				if (result == null) result = caseFlow(startsWith);
				if (result == null) result = caseTraceable(startsWith);
				if (result == null) result = caseNameable(startsWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.MATCHES: {
				Matches matches = (Matches)theEObject;
				T result = caseMatches(matches);
				if (result == null) result = caseDataFlowConstraint(matches);
				if (result == null) result = caseDataFlow(matches);
				if (result == null) result = caseFlowConstraint(matches);
				if (result == null) result = caseFlow(matches);
				if (result == null) result = caseTraceable(matches);
				if (result == null) result = caseNameable(matches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CONTAINS: {
				Contains contains = (Contains)theEObject;
				T result = caseContains(contains);
				if (result == null) result = caseDataFlowConstraint(contains);
				if (result == null) result = caseDataFlow(contains);
				if (result == null) result = caseFlowConstraint(contains);
				if (result == null) result = caseFlow(contains);
				if (result == null) result = caseTraceable(contains);
				if (result == null) result = caseNameable(contains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CASTED_TO: {
				CastedTo castedTo = (CastedTo)theEObject;
				T result = caseCastedTo(castedTo);
				if (result == null) result = caseDataFlowConstraint(castedTo);
				if (result == null) result = caseDataFlow(castedTo);
				if (result == null) result = caseFlowConstraint(castedTo);
				if (result == null) result = caseFlow(castedTo);
				if (result == null) result = caseTraceable(castedTo);
				if (result == null) result = caseNameable(castedTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T result = caseControlFlow(controlFlow);
				if (result == null) result = caseFlow(controlFlow);
				if (result == null) result = caseTraceable(controlFlow);
				if (result == null) result = caseNameable(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CONTROL_FLOW_SOURCE: {
				ControlFlowSource controlFlowSource = (ControlFlowSource)theEObject;
				T result = caseControlFlowSource(controlFlowSource);
				if (result == null) result = caseControlFlow(controlFlowSource);
				if (result == null) result = caseFlowSource(controlFlowSource);
				if (result == null) result = caseFlow(controlFlowSource);
				if (result == null) result = caseTraceable(controlFlowSource);
				if (result == null) result = caseNameable(controlFlowSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CONTROL_FLOW_SINK: {
				ControlFlowSink controlFlowSink = (ControlFlowSink)theEObject;
				T result = caseControlFlowSink(controlFlowSink);
				if (result == null) result = caseControlFlow(controlFlowSink);
				if (result == null) result = caseFlowSink(controlFlowSink);
				if (result == null) result = caseFlow(controlFlowSink);
				if (result == null) result = caseTraceable(controlFlowSink);
				if (result == null) result = caseNameable(controlFlowSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowSource(FlowSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowSink(FlowSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowGroup(FlowGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowSource(DataFlowSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowSink(DataFlowSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowConstraint(FlowConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowConstraint(DataFlowConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ends With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ends With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndsWith(EndsWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Starts With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Starts With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartsWith(StartsWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatches(Matches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Casted To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Casted To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastedTo(CastedTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlowSource(ControlFlowSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlowSink(ControlFlowSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceable(Traceable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FlowSwitch
