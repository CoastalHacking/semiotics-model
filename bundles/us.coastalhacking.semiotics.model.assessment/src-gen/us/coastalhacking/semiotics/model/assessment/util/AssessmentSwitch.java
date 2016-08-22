/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import us.coastalhacking.semiotics.model.assessment.*;

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
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage
 * @generated
 */
public class AssessmentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssessmentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSwitch() {
		if (modelPackage == null) {
			modelPackage = AssessmentPackage.eINSTANCE;
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
			case AssessmentPackage.NAMEABLE: {
				Nameable nameable = (Nameable)theEObject;
				T result = caseNameable(nameable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.REVIEWABLE: {
				Reviewable reviewable = (Reviewable)theEObject;
				T result = caseReviewable(reviewable);
				if (result == null) result = caseNameable(reviewable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.PROVABLE: {
				Provable provable = (Provable)theEObject;
				T result = caseProvable(provable);
				if (result == null) result = caseNameable(provable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.TRACEABLE: {
				Traceable traceable = (Traceable)theEObject;
				T result = caseTraceable(traceable);
				if (result == null) result = caseNameable(traceable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCHABLE: {
				Searchable searchable = (Searchable)theEObject;
				T result = caseSearchable(searchable);
				if (result == null) result = caseNameable(searchable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL_GROUP: {
				ControlGroup controlGroup = (ControlGroup)theEObject;
				T result = caseControlGroup(controlGroup);
				if (result == null) result = caseNameable(controlGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseReviewable(control);
				if (result == null) result = caseNameable(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CWE_GROUP: {
				CWEGroup cweGroup = (CWEGroup)theEObject;
				T result = caseCWEGroup(cweGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CWE: {
				CWE cwe = (CWE)theEObject;
				T result = caseCWE(cwe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseNameable(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_GROUP: {
				DataGroup dataGroup = (DataGroup)theEObject;
				T result = caseDataGroup(dataGroup);
				if (result == null) result = caseNameable(dataGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SNIPPET: {
				Snippet snippet = (Snippet)theEObject;
				T result = caseSnippet(snippet);
				if (result == null) result = caseProvable(snippet);
				if (result == null) result = caseNameable(snippet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseData(file);
				if (result == null) result = caseNameable(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.REQUEST: {
				Request request = (Request)theEObject;
				T result = caseRequest(request);
				if (result == null) result = caseData(request);
				if (result == null) result = caseNameable(request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = caseData(response);
				if (result == null) result = caseNameable(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseTraceable(flow);
				if (result == null) result = caseNameable(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FLOW_SOURCE: {
				FlowSource flowSource = (FlowSource)theEObject;
				T result = caseFlowSource(flowSource);
				if (result == null) result = caseFlow(flowSource);
				if (result == null) result = caseTraceable(flowSource);
				if (result == null) result = caseNameable(flowSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FLOW_SINK: {
				FlowSink flowSink = (FlowSink)theEObject;
				T result = caseFlowSink(flowSink);
				if (result == null) result = caseFlow(flowSink);
				if (result == null) result = caseTraceable(flowSink);
				if (result == null) result = caseNameable(flowSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FLOW_GROUP: {
				FlowGroup flowGroup = (FlowGroup)theEObject;
				T result = caseFlowGroup(flowGroup);
				if (result == null) result = caseNameable(flowGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = caseFlow(dataFlow);
				if (result == null) result = caseTraceable(dataFlow);
				if (result == null) result = caseNameable(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_FLOW_SOURCE: {
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
			case AssessmentPackage.DATA_FLOW_SINK: {
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
			case AssessmentPackage.FLOW_CONSTRAINT: {
				FlowConstraint flowConstraint = (FlowConstraint)theEObject;
				T result = caseFlowConstraint(flowConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_FLOW_CONSTRAINT: {
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
			case AssessmentPackage.ENDS_WITH: {
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
			case AssessmentPackage.STARTS_WITH: {
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
			case AssessmentPackage.MATCHES: {
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
			case AssessmentPackage.CONTAINS: {
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
			case AssessmentPackage.CASTED_TO: {
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
			case AssessmentPackage.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T result = caseControlFlow(controlFlow);
				if (result == null) result = caseFlow(controlFlow);
				if (result == null) result = caseTraceable(controlFlow);
				if (result == null) result = caseNameable(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL_FLOW_SOURCE: {
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
			case AssessmentPackage.CONTROL_FLOW_SINK: {
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
			case AssessmentPackage.ASSESSMENT: {
				Assessment assessment = (Assessment)theEObject;
				T result = caseAssessment(assessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATION_GROUP: {
				ApplicationGroup applicationGroup = (ApplicationGroup)theEObject;
				T result = caseApplicationGroup(applicationGroup);
				if (result == null) result = caseNameable(applicationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseNameable(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCH_GROUP: {
				SearchGroup searchGroup = (SearchGroup)theEObject;
				T result = caseSearchGroup(searchGroup);
				if (result == null) result = caseNameable(searchGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCH: {
				Search search = (Search)theEObject;
				T result = caseSearch(search);
				if (result == null) result = caseSearchable(search);
				if (result == null) result = caseNameable(search);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCH_PATTERN: {
				SearchPattern searchPattern = (SearchPattern)theEObject;
				T result = caseSearchPattern(searchPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.JAVA_SEARCH_PATTERN: {
				JavaSearchPattern javaSearchPattern = (JavaSearchPattern)theEObject;
				T result = caseJavaSearchPattern(javaSearchPattern);
				if (result == null) result = caseSearchPattern(javaSearchPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Reviewable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reviewable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewable(Reviewable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvable(Provable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Searchable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Searchable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchable(Searchable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlGroup(ControlGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWE Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWE Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCWEGroup(CWEGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCWE(CWE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataGroup(DataGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snippet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snippet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnippet(Snippet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Flow Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowSource(FlowSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowSink(FlowSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Group</em>'.
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
	 * Returns the result of interpreting the object as an instance of '<em>Flow Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Constraint</em>'.
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
	 * Returns the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessment(Assessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationGroup(ApplicationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchGroup(SearchGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearch(Search object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchPattern(SearchPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Search Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Search Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaSearchPattern(JavaSearchPattern object) {
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

} //AssessmentSwitch
