/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import us.coastalhacking.semiotics.model.assessment.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessmentFactoryImpl extends EFactoryImpl implements AssessmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssessmentFactory init() {
		try {
			AssessmentFactory theAssessmentFactory = (AssessmentFactory)EPackage.Registry.INSTANCE.getEFactory(AssessmentPackage.eNS_URI);
			if (theAssessmentFactory != null) {
				return theAssessmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssessmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssessmentPackage.CWE_GROUP: return createCWEGroup();
			case AssessmentPackage.CWE: return createCWE();
			case AssessmentPackage.AUTHENTICATION_GROUP: return createAuthenticationGroup();
			case AssessmentPackage.AUTHENTICATION: return createAuthentication();
			case AssessmentPackage.AUTHORIZATION_GROUP: return createAuthorizationGroup();
			case AssessmentPackage.AUTHORIZATION: return createAuthorization();
			case AssessmentPackage.ACCOUNT_GROUP: return createAccountGroup();
			case AssessmentPackage.ACCOUNT: return createAccount();
			case AssessmentPackage.CRYPTOGRAPHY_GROUP: return createCryptographyGroup();
			case AssessmentPackage.CRYPTOGRAPHY: return createCryptography();
			case AssessmentPackage.OUTPUT_ENCODING_GROUP: return createOutputEncodingGroup();
			case AssessmentPackage.OUTPUT_ENCODING: return createOutputEncoding();
			case AssessmentPackage.GENERIC_CONTROL: return createGenericControl();
			case AssessmentPackage.GENERIC_CONTROL_GROUP: return createGenericControlGroup();
			case AssessmentPackage.NETWORK_INGRESS: return createNetworkIngress();
			case AssessmentPackage.NETWORK_INGRESS_GROUP: return createNetworkIngressGroup();
			case AssessmentPackage.NETWORK_EGRESS: return createNetworkEgress();
			case AssessmentPackage.NETWORK_EGRESS_GROUP: return createNetworkEgressGroup();
			case AssessmentPackage.TEXT_SNIPPET: return createTextSnippet();
			case AssessmentPackage.FILE_TYPE: return createFileType();
			case AssessmentPackage.FILE: return createFile();
			case AssessmentPackage.FILE_GROUP: return createFileGroup();
			case AssessmentPackage.REQUEST_TYPE: return createRequestType();
			case AssessmentPackage.REQUEST: return createRequest();
			case AssessmentPackage.REQUEST_GROUP: return createRequestGroup();
			case AssessmentPackage.RESPONSE_TYPE: return createResponseType();
			case AssessmentPackage.RESPONSE: return createResponse();
			case AssessmentPackage.RESPONSE_GROUP: return createResponseGroup();
			case AssessmentPackage.DATA_FLOW: return createDataFlow();
			case AssessmentPackage.DATA_FLOW_NODE: return createDataFlowNode();
			case AssessmentPackage.DATA_FLOW_GROUP: return createDataFlowGroup();
			case AssessmentPackage.ENDS_WITH: return createEndsWith();
			case AssessmentPackage.STARTS_WITH: return createStartsWith();
			case AssessmentPackage.MATCHES: return createMatches();
			case AssessmentPackage.CONTAINS: return createContains();
			case AssessmentPackage.CASTED_TO: return createCastedTo();
			case AssessmentPackage.CONTROL_FLOW: return createControlFlow();
			case AssessmentPackage.CONTROL_FLOW_NODE: return createControlFlowNode();
			case AssessmentPackage.CONTROL_FLOW_GROUP: return createControlFlowGroup();
			case AssessmentPackage.APPLICATION_ASSESSMENT: return createApplicationAssessment();
			case AssessmentPackage.APPLICATION_ASSESSMENT_GROUP: return createApplicationAssessmentGroup();
			case AssessmentPackage.PROPERTY: return createProperty();
			case AssessmentPackage.WEB_APPLICATION: return createWebApplication();
			case AssessmentPackage.WEB_APPLICATION_GROUP: return createWebApplicationGroup();
			case AssessmentPackage.JAVA_SEARCH: return createJavaSearch();
			case AssessmentPackage.JAVA_SEARCH_GROUP: return createJavaSearchGroup();
			case AssessmentPackage.JAVA_SEARCH_PATTERN: return createJavaSearchPattern();
			case AssessmentPackage.LOCAL_TASK_GROUP: return createLocalTaskGroup();
			case AssessmentPackage.LOCAL_TASK: return createLocalTask();
			case AssessmentPackage.LOCAL_FINDING_GROUP: return createLocalFindingGroup();
			case AssessmentPackage.LOCAL_FINDING: return createLocalFinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AssessmentPackage.DATA_TAINT_TYPE:
				return createDataTaintTypeFromString(eDataType, initialValue);
			case AssessmentPackage.MATCHER_REGEX:
				return createMatcherRegexFromString(eDataType, initialValue);
			case AssessmentPackage.JAVA_SEARCH_PATTERN_TYPE:
				return createJavaSearchPatternTypeFromString(eDataType, initialValue);
			case AssessmentPackage.JAVA_SEARCH_FOR:
				return createJavaSearchForFromString(eDataType, initialValue);
			case AssessmentPackage.JAVA_LIMIT_TO:
				return createJavaLimitToFromString(eDataType, initialValue);
			case AssessmentPackage.JAVA_MATCH_RULE:
				return createJavaMatchRuleFromString(eDataType, initialValue);
			case AssessmentPackage.JAVA_MATCH_CASE_SENSITIVITY:
				return createJavaMatchCaseSensitivityFromString(eDataType, initialValue);
			case AssessmentPackage.TASK_STATUS:
				return createTaskStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AssessmentPackage.DATA_TAINT_TYPE:
				return convertDataTaintTypeToString(eDataType, instanceValue);
			case AssessmentPackage.MATCHER_REGEX:
				return convertMatcherRegexToString(eDataType, instanceValue);
			case AssessmentPackage.JAVA_SEARCH_PATTERN_TYPE:
				return convertJavaSearchPatternTypeToString(eDataType, instanceValue);
			case AssessmentPackage.JAVA_SEARCH_FOR:
				return convertJavaSearchForToString(eDataType, instanceValue);
			case AssessmentPackage.JAVA_LIMIT_TO:
				return convertJavaLimitToToString(eDataType, instanceValue);
			case AssessmentPackage.JAVA_MATCH_RULE:
				return convertJavaMatchRuleToString(eDataType, instanceValue);
			case AssessmentPackage.JAVA_MATCH_CASE_SENSITIVITY:
				return convertJavaMatchCaseSensitivityToString(eDataType, instanceValue);
			case AssessmentPackage.TASK_STATUS:
				return convertTaskStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWEGroup createCWEGroup() {
		CWEGroupImpl cweGroup = new CWEGroupImpl();
		return cweGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE createCWE() {
		CWEImpl cwe = new CWEImpl();
		return cwe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationGroup createAuthenticationGroup() {
		AuthenticationGroupImpl authenticationGroup = new AuthenticationGroupImpl();
		return authenticationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication createAuthentication() {
		AuthenticationImpl authentication = new AuthenticationImpl();
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationGroup createAuthorizationGroup() {
		AuthorizationGroupImpl authorizationGroup = new AuthorizationGroupImpl();
		return authorizationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorization createAuthorization() {
		AuthorizationImpl authorization = new AuthorizationImpl();
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountGroup createAccountGroup() {
		AccountGroupImpl accountGroup = new AccountGroupImpl();
		return accountGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptographyGroup createCryptographyGroup() {
		CryptographyGroupImpl cryptographyGroup = new CryptographyGroupImpl();
		return cryptographyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cryptography createCryptography() {
		CryptographyImpl cryptography = new CryptographyImpl();
		return cryptography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputEncodingGroup createOutputEncodingGroup() {
		OutputEncodingGroupImpl outputEncodingGroup = new OutputEncodingGroupImpl();
		return outputEncodingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputEncoding createOutputEncoding() {
		OutputEncodingImpl outputEncoding = new OutputEncodingImpl();
		return outputEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericControl createGenericControl() {
		GenericControlImpl genericControl = new GenericControlImpl();
		return genericControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericControlGroup createGenericControlGroup() {
		GenericControlGroupImpl genericControlGroup = new GenericControlGroupImpl();
		return genericControlGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkIngress createNetworkIngress() {
		NetworkIngressImpl networkIngress = new NetworkIngressImpl();
		return networkIngress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkIngressGroup createNetworkIngressGroup() {
		NetworkIngressGroupImpl networkIngressGroup = new NetworkIngressGroupImpl();
		return networkIngressGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEgress createNetworkEgress() {
		NetworkEgressImpl networkEgress = new NetworkEgressImpl();
		return networkEgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEgressGroup createNetworkEgressGroup() {
		NetworkEgressGroupImpl networkEgressGroup = new NetworkEgressGroupImpl();
		return networkEgressGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSnippet createTextSnippet() {
		TextSnippetImpl textSnippet = new TextSnippetImpl();
		return textSnippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileGroup createFileGroup() {
		FileGroupImpl fileGroup = new FileGroupImpl();
		return fileGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestType createRequestType() {
		RequestTypeImpl requestType = new RequestTypeImpl();
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroup createRequestGroup() {
		RequestGroupImpl requestGroup = new RequestGroupImpl();
		return requestGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseType() {
		ResponseTypeImpl responseType = new ResponseTypeImpl();
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseGroup createResponseGroup() {
		ResponseGroupImpl responseGroup = new ResponseGroupImpl();
		return responseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowNode createDataFlowNode() {
		DataFlowNodeImpl dataFlowNode = new DataFlowNodeImpl();
		return dataFlowNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowGroup createDataFlowGroup() {
		DataFlowGroupImpl dataFlowGroup = new DataFlowGroupImpl();
		return dataFlowGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndsWith createEndsWith() {
		EndsWithImpl endsWith = new EndsWithImpl();
		return endsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartsWith createStartsWith() {
		StartsWithImpl startsWith = new StartsWithImpl();
		return startsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matches createMatches() {
		MatchesImpl matches = new MatchesImpl();
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastedTo createCastedTo() {
		CastedToImpl castedTo = new CastedToImpl();
		return castedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowNode createControlFlowNode() {
		ControlFlowNodeImpl controlFlowNode = new ControlFlowNodeImpl();
		return controlFlowNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowGroup createControlFlowGroup() {
		ControlFlowGroupImpl controlFlowGroup = new ControlFlowGroupImpl();
		return controlFlowGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAssessment createApplicationAssessment() {
		ApplicationAssessmentImpl applicationAssessment = new ApplicationAssessmentImpl();
		return applicationAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAssessmentGroup createApplicationAssessmentGroup() {
		ApplicationAssessmentGroupImpl applicationAssessmentGroup = new ApplicationAssessmentGroupImpl();
		return applicationAssessmentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApplication createWebApplication() {
		WebApplicationImpl webApplication = new WebApplicationImpl();
		return webApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApplicationGroup createWebApplicationGroup() {
		WebApplicationGroupImpl webApplicationGroup = new WebApplicationGroupImpl();
		return webApplicationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSearch createJavaSearch() {
		JavaSearchImpl javaSearch = new JavaSearchImpl();
		return javaSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSearchGroup createJavaSearchGroup() {
		JavaSearchGroupImpl javaSearchGroup = new JavaSearchGroupImpl();
		return javaSearchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSearchPattern createJavaSearchPattern() {
		JavaSearchPatternImpl javaSearchPattern = new JavaSearchPatternImpl();
		return javaSearchPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalTaskGroup createLocalTaskGroup() {
		LocalTaskGroupImpl localTaskGroup = new LocalTaskGroupImpl();
		return localTaskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalTask createLocalTask() {
		LocalTaskImpl localTask = new LocalTaskImpl();
		return localTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFindingGroup createLocalFindingGroup() {
		LocalFindingGroupImpl localFindingGroup = new LocalFindingGroupImpl();
		return localFindingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFinding createLocalFinding() {
		LocalFindingImpl localFinding = new LocalFindingImpl();
		return localFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTaintType createDataTaintTypeFromString(EDataType eDataType, String initialValue) {
		DataTaintType result = DataTaintType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTaintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatcherRegex createMatcherRegexFromString(EDataType eDataType, String initialValue) {
		MatcherRegex result = MatcherRegex.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatcherRegexToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSearchPatternType createJavaSearchPatternTypeFromString(EDataType eDataType, String initialValue) {
		JavaSearchPatternType result = JavaSearchPatternType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaSearchPatternTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSearchFor createJavaSearchForFromString(EDataType eDataType, String initialValue) {
		JavaSearchFor result = JavaSearchFor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaSearchForToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaLimitTo createJavaLimitToFromString(EDataType eDataType, String initialValue) {
		JavaLimitTo result = JavaLimitTo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaLimitToToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMatchRule createJavaMatchRuleFromString(EDataType eDataType, String initialValue) {
		JavaMatchRule result = JavaMatchRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaMatchRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMatchCaseSensitivity createJavaMatchCaseSensitivityFromString(EDataType eDataType, String initialValue) {
		JavaMatchCaseSensitivity result = JavaMatchCaseSensitivity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaMatchCaseSensitivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatus createTaskStatusFromString(EDataType eDataType, String initialValue) {
		TaskStatus result = TaskStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentPackage getAssessmentPackage() {
		return (AssessmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssessmentPackage getPackage() {
		return AssessmentPackage.eINSTANCE;
	}

} //AssessmentFactoryImpl
