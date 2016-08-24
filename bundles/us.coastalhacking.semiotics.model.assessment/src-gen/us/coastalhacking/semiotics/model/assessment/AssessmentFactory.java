/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage
 * @generated
 */
public interface AssessmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssessmentFactory eINSTANCE = us.coastalhacking.semiotics.model.assessment.impl.AssessmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CWE Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CWE Group</em>'.
	 * @generated
	 */
	CWEGroup createCWEGroup();

	/**
	 * Returns a new object of class '<em>CWE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CWE</em>'.
	 * @generated
	 */
	CWE createCWE();

	/**
	 * Returns a new object of class '<em>Authentication Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Group</em>'.
	 * @generated
	 */
	AuthenticationGroup createAuthenticationGroup();

	/**
	 * Returns a new object of class '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication</em>'.
	 * @generated
	 */
	Authentication createAuthentication();

	/**
	 * Returns a new object of class '<em>Authorization Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Group</em>'.
	 * @generated
	 */
	AuthorizationGroup createAuthorizationGroup();

	/**
	 * Returns a new object of class '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization</em>'.
	 * @generated
	 */
	Authorization createAuthorization();

	/**
	 * Returns a new object of class '<em>Account Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Group</em>'.
	 * @generated
	 */
	AccountGroup createAccountGroup();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Cryptography Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cryptography Group</em>'.
	 * @generated
	 */
	CryptographyGroup createCryptographyGroup();

	/**
	 * Returns a new object of class '<em>Cryptography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cryptography</em>'.
	 * @generated
	 */
	Cryptography createCryptography();

	/**
	 * Returns a new object of class '<em>Output Encoding Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Encoding Group</em>'.
	 * @generated
	 */
	OutputEncodingGroup createOutputEncodingGroup();

	/**
	 * Returns a new object of class '<em>Output Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Encoding</em>'.
	 * @generated
	 */
	OutputEncoding createOutputEncoding();

	/**
	 * Returns a new object of class '<em>Generic Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Control</em>'.
	 * @generated
	 */
	GenericControl createGenericControl();

	/**
	 * Returns a new object of class '<em>Generic Control Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Control Group</em>'.
	 * @generated
	 */
	GenericControlGroup createGenericControlGroup();

	/**
	 * Returns a new object of class '<em>Network Ingress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Ingress</em>'.
	 * @generated
	 */
	NetworkIngress createNetworkIngress();

	/**
	 * Returns a new object of class '<em>Network Ingress Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Ingress Group</em>'.
	 * @generated
	 */
	NetworkIngressGroup createNetworkIngressGroup();

	/**
	 * Returns a new object of class '<em>Network Egress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Egress</em>'.
	 * @generated
	 */
	NetworkEgress createNetworkEgress();

	/**
	 * Returns a new object of class '<em>Network Egress Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Egress Group</em>'.
	 * @generated
	 */
	NetworkEgressGroup createNetworkEgressGroup();

	/**
	 * Returns a new object of class '<em>Text Snippet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Snippet</em>'.
	 * @generated
	 */
	TextSnippet createTextSnippet();

	/**
	 * Returns a new object of class '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Type</em>'.
	 * @generated
	 */
	FileType createFileType();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>File Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Group</em>'.
	 * @generated
	 */
	FileGroup createFileGroup();

	/**
	 * Returns a new object of class '<em>Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Type</em>'.
	 * @generated
	 */
	RequestType createRequestType();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Request Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Group</em>'.
	 * @generated
	 */
	RequestGroup createRequestGroup();

	/**
	 * Returns a new object of class '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Type</em>'.
	 * @generated
	 */
	ResponseType createResponseType();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Response Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Group</em>'.
	 * @generated
	 */
	ResponseGroup createResponseGroup();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Data Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow Node</em>'.
	 * @generated
	 */
	DataFlowNode createDataFlowNode();

	/**
	 * Returns a new object of class '<em>Data Flow Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow Group</em>'.
	 * @generated
	 */
	DataFlowGroup createDataFlowGroup();

	/**
	 * Returns a new object of class '<em>Ends With</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ends With</em>'.
	 * @generated
	 */
	EndsWith createEndsWith();

	/**
	 * Returns a new object of class '<em>Starts With</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Starts With</em>'.
	 * @generated
	 */
	StartsWith createStartsWith();

	/**
	 * Returns a new object of class '<em>Matches</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matches</em>'.
	 * @generated
	 */
	Matches createMatches();

	/**
	 * Returns a new object of class '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains</em>'.
	 * @generated
	 */
	Contains createContains();

	/**
	 * Returns a new object of class '<em>Casted To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Casted To</em>'.
	 * @generated
	 */
	CastedTo createCastedTo();

	/**
	 * Returns a new object of class '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow</em>'.
	 * @generated
	 */
	ControlFlow createControlFlow();

	/**
	 * Returns a new object of class '<em>Control Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Node</em>'.
	 * @generated
	 */
	ControlFlowNode createControlFlowNode();

	/**
	 * Returns a new object of class '<em>Control Flow Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Group</em>'.
	 * @generated
	 */
	ControlFlowGroup createControlFlowGroup();

	/**
	 * Returns a new object of class '<em>Application Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Assessment</em>'.
	 * @generated
	 */
	ApplicationAssessment createApplicationAssessment();

	/**
	 * Returns a new object of class '<em>Application Assessment Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Assessment Group</em>'.
	 * @generated
	 */
	ApplicationAssessmentGroup createApplicationAssessmentGroup();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Application</em>'.
	 * @generated
	 */
	WebApplication createWebApplication();

	/**
	 * Returns a new object of class '<em>Web Application Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Application Group</em>'.
	 * @generated
	 */
	WebApplicationGroup createWebApplicationGroup();

	/**
	 * Returns a new object of class '<em>Java Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Search</em>'.
	 * @generated
	 */
	JavaSearch createJavaSearch();

	/**
	 * Returns a new object of class '<em>Java Search Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Search Group</em>'.
	 * @generated
	 */
	JavaSearchGroup createJavaSearchGroup();

	/**
	 * Returns a new object of class '<em>Java Search Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Search Pattern</em>'.
	 * @generated
	 */
	JavaSearchPattern createJavaSearchPattern();

	/**
	 * Returns a new object of class '<em>Local Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Task Group</em>'.
	 * @generated
	 */
	LocalTaskGroup createLocalTaskGroup();

	/**
	 * Returns a new object of class '<em>Local Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Task</em>'.
	 * @generated
	 */
	LocalTask createLocalTask();

	/**
	 * Returns a new object of class '<em>Local Finding Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Finding Group</em>'.
	 * @generated
	 */
	LocalFindingGroup createLocalFindingGroup();

	/**
	 * Returns a new object of class '<em>Local Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Finding</em>'.
	 * @generated
	 */
	LocalFinding createLocalFinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssessmentPackage getAssessmentPackage();

} //AssessmentFactory
