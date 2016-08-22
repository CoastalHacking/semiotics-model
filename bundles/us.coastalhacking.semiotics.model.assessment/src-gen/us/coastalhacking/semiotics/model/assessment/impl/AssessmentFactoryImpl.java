/**
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
			case AssessmentPackage.CONTROL_GROUP: return createControlGroup();
			case AssessmentPackage.CONTROL: return createControl();
			case AssessmentPackage.CWE_GROUP: return createCWEGroup();
			case AssessmentPackage.CWE: return createCWE();
			case AssessmentPackage.DATA: return createData();
			case AssessmentPackage.DATA_GROUP: return createDataGroup();
			case AssessmentPackage.SNIPPET: return createSnippet();
			case AssessmentPackage.FILE: return createFile();
			case AssessmentPackage.REQUEST: return createRequest();
			case AssessmentPackage.RESPONSE: return createResponse();
			case AssessmentPackage.FLOW: return createFlow();
			case AssessmentPackage.FLOW_SOURCE: return createFlowSource();
			case AssessmentPackage.FLOW_SINK: return createFlowSink();
			case AssessmentPackage.FLOW_GROUP: return createFlowGroup();
			case AssessmentPackage.DATA_FLOW: return createDataFlow();
			case AssessmentPackage.DATA_FLOW_SOURCE: return createDataFlowSource();
			case AssessmentPackage.DATA_FLOW_SINK: return createDataFlowSink();
			case AssessmentPackage.FLOW_CONSTRAINT: return createFlowConstraint();
			case AssessmentPackage.ENDS_WITH: return createEndsWith();
			case AssessmentPackage.STARTS_WITH: return createStartsWith();
			case AssessmentPackage.MATCHES: return createMatches();
			case AssessmentPackage.CONTAINS: return createContains();
			case AssessmentPackage.CASTED_TO: return createCastedTo();
			case AssessmentPackage.CONTROL_FLOW: return createControlFlow();
			case AssessmentPackage.CONTROL_FLOW_SOURCE: return createControlFlowSource();
			case AssessmentPackage.CONTROL_FLOW_SINK: return createControlFlowSink();
			case AssessmentPackage.ASSESSMENT: return createAssessment();
			case AssessmentPackage.PROPERTY: return createProperty();
			case AssessmentPackage.APPLICATION_GROUP: return createApplicationGroup();
			case AssessmentPackage.APPLICATION: return createApplication();
			case AssessmentPackage.SEARCH_GROUP: return createSearchGroup();
			case AssessmentPackage.SEARCH: return createSearch();
			case AssessmentPackage.JAVA_SEARCH_PATTERN: return createJavaSearchPattern();
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
			case AssessmentPackage.DATA_SOURCE_TYPE:
				return createDataSourceTypeFromString(eDataType, initialValue);
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
			case AssessmentPackage.DATA_SOURCE_TYPE:
				return convertDataSourceTypeToString(eDataType, instanceValue);
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
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlGroup createControlGroup() {
		ControlGroupImpl controlGroup = new ControlGroupImpl();
		return controlGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
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
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGroup createDataGroup() {
		DataGroupImpl dataGroup = new DataGroupImpl();
		return dataGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Snippet createSnippet() {
		SnippetImpl snippet = new SnippetImpl();
		return snippet;
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
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
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
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSource createFlowSource() {
		FlowSourceImpl flowSource = new FlowSourceImpl();
		return flowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSink createFlowSink() {
		FlowSinkImpl flowSink = new FlowSinkImpl();
		return flowSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowGroup createFlowGroup() {
		FlowGroupImpl flowGroup = new FlowGroupImpl();
		return flowGroup;
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
	public DataFlowSource createDataFlowSource() {
		DataFlowSourceImpl dataFlowSource = new DataFlowSourceImpl();
		return dataFlowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowSink createDataFlowSink() {
		DataFlowSinkImpl dataFlowSink = new DataFlowSinkImpl();
		return dataFlowSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowConstraint createFlowConstraint() {
		FlowConstraintImpl flowConstraint = new FlowConstraintImpl();
		return flowConstraint;
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
	public ControlFlowSource createControlFlowSource() {
		ControlFlowSourceImpl controlFlowSource = new ControlFlowSourceImpl();
		return controlFlowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowSink createControlFlowSink() {
		ControlFlowSinkImpl controlFlowSink = new ControlFlowSinkImpl();
		return controlFlowSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment createAssessment() {
		AssessmentImpl assessment = new AssessmentImpl();
		return assessment;
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
	public ApplicationGroup createApplicationGroup() {
		ApplicationGroupImpl applicationGroup = new ApplicationGroupImpl();
		return applicationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchGroup createSearchGroup() {
		SearchGroupImpl searchGroup = new SearchGroupImpl();
		return searchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search createSearch() {
		SearchImpl search = new SearchImpl();
		return search;
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
	public DataSourceType createDataSourceTypeFromString(EDataType eDataType, String initialValue) {
		DataSourceType result = DataSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSourceTypeToString(EDataType eDataType, Object instanceValue) {
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
