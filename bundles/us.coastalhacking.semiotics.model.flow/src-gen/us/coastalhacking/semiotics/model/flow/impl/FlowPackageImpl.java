/**
 */
package us.coastalhacking.semiotics.model.flow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.coastalhacking.semiotics.model.base.BasePackage;

import us.coastalhacking.semiotics.model.flow.CastedTo;
import us.coastalhacking.semiotics.model.flow.Contains;
import us.coastalhacking.semiotics.model.flow.ControlFlow;
import us.coastalhacking.semiotics.model.flow.ControlFlowSink;
import us.coastalhacking.semiotics.model.flow.ControlFlowSource;
import us.coastalhacking.semiotics.model.flow.DataFlow;
import us.coastalhacking.semiotics.model.flow.DataFlowConstraint;
import us.coastalhacking.semiotics.model.flow.DataFlowSink;
import us.coastalhacking.semiotics.model.flow.DataFlowSource;
import us.coastalhacking.semiotics.model.flow.DataSourceType;
import us.coastalhacking.semiotics.model.flow.EndsWith;
import us.coastalhacking.semiotics.model.flow.Flow;
import us.coastalhacking.semiotics.model.flow.FlowConstraint;
import us.coastalhacking.semiotics.model.flow.FlowFactory;
import us.coastalhacking.semiotics.model.flow.FlowGroup;
import us.coastalhacking.semiotics.model.flow.FlowPackage;
import us.coastalhacking.semiotics.model.flow.FlowSink;
import us.coastalhacking.semiotics.model.flow.FlowSource;
import us.coastalhacking.semiotics.model.flow.MatcherRegex;
import us.coastalhacking.semiotics.model.flow.Matches;
import us.coastalhacking.semiotics.model.flow.StartsWith;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowPackageImpl extends EPackageImpl implements FlowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endsWithEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startsWithEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castedToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matcherRegexEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see us.coastalhacking.semiotics.model.flow.FlowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlowPackageImpl() {
		super(eNS_URI, FlowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FlowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlowPackage init() {
		if (isInited) return (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

		// Obtain or create and register package
		FlowPackageImpl theFlowPackage = (FlowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FlowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FlowPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFlowPackage.createPackageContents();

		// Initialize created meta-data
		theFlowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlowPackage.eNS_URI, theFlowPackage);
		return theFlowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_FlowFrom() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_FlowTo() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSource() {
		return flowSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSource_FlowGroup() {
		return (EReference)flowSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSink() {
		return flowSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowGroup() {
		return flowGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowGroup_FlowSources() {
		return (EReference)flowGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowSource() {
		return dataFlowSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlowSource_Value() {
		return (EAttribute)dataFlowSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlowSource_SourceType() {
		return (EAttribute)dataFlowSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowSink() {
		return dataFlowSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowConstraint() {
		return flowConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowConstraint() {
		return dataFlowConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndsWith() {
		return endsWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndsWith_Suffix() {
		return (EAttribute)endsWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartsWith() {
		return startsWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartsWith_Prefix() {
		return (EAttribute)startsWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatches() {
		return matchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatches_Pattern() {
		return (EAttribute)matchesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatches_RegexType() {
		return (EAttribute)matchesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContains_Contents() {
		return (EAttribute)containsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCastedTo() {
		return castedToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCastedTo_Type() {
		return (EAttribute)castedToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_Description() {
		return (EAttribute)controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowSource() {
		return controlFlowSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowSink() {
		return controlFlowSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSourceType() {
		return dataSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMatcherRegex() {
		return matcherRegexEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFactory getFlowFactory() {
		return (FlowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__FLOW_FROM);
		createEReference(flowEClass, FLOW__FLOW_TO);

		flowSourceEClass = createEClass(FLOW_SOURCE);
		createEReference(flowSourceEClass, FLOW_SOURCE__FLOW_GROUP);

		flowSinkEClass = createEClass(FLOW_SINK);

		flowGroupEClass = createEClass(FLOW_GROUP);
		createEReference(flowGroupEClass, FLOW_GROUP__FLOW_SOURCES);

		dataFlowEClass = createEClass(DATA_FLOW);

		dataFlowSourceEClass = createEClass(DATA_FLOW_SOURCE);
		createEAttribute(dataFlowSourceEClass, DATA_FLOW_SOURCE__VALUE);
		createEAttribute(dataFlowSourceEClass, DATA_FLOW_SOURCE__SOURCE_TYPE);

		dataFlowSinkEClass = createEClass(DATA_FLOW_SINK);

		flowConstraintEClass = createEClass(FLOW_CONSTRAINT);

		dataFlowConstraintEClass = createEClass(DATA_FLOW_CONSTRAINT);

		endsWithEClass = createEClass(ENDS_WITH);
		createEAttribute(endsWithEClass, ENDS_WITH__SUFFIX);

		startsWithEClass = createEClass(STARTS_WITH);
		createEAttribute(startsWithEClass, STARTS_WITH__PREFIX);

		matchesEClass = createEClass(MATCHES);
		createEAttribute(matchesEClass, MATCHES__PATTERN);
		createEAttribute(matchesEClass, MATCHES__REGEX_TYPE);

		containsEClass = createEClass(CONTAINS);
		createEAttribute(containsEClass, CONTAINS__CONTENTS);

		castedToEClass = createEClass(CASTED_TO);
		createEAttribute(castedToEClass, CASTED_TO__TYPE);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__DESCRIPTION);

		controlFlowSourceEClass = createEClass(CONTROL_FLOW_SOURCE);

		controlFlowSinkEClass = createEClass(CONTROL_FLOW_SINK);

		// Create enums
		dataSourceTypeEEnum = createEEnum(DATA_SOURCE_TYPE);
		matcherRegexEEnum = createEEnum(MATCHER_REGEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flowEClass.getESuperTypes().add(theBasePackage.getTraceable());
		flowSourceEClass.getESuperTypes().add(this.getFlow());
		flowSinkEClass.getESuperTypes().add(this.getFlow());
		flowGroupEClass.getESuperTypes().add(theBasePackage.getNameable());
		dataFlowEClass.getESuperTypes().add(this.getFlow());
		dataFlowSourceEClass.getESuperTypes().add(this.getDataFlow());
		dataFlowSourceEClass.getESuperTypes().add(this.getFlowSource());
		dataFlowSinkEClass.getESuperTypes().add(this.getDataFlow());
		dataFlowSinkEClass.getESuperTypes().add(this.getFlowSink());
		dataFlowConstraintEClass.getESuperTypes().add(this.getDataFlow());
		dataFlowConstraintEClass.getESuperTypes().add(this.getFlowConstraint());
		endsWithEClass.getESuperTypes().add(this.getDataFlowConstraint());
		startsWithEClass.getESuperTypes().add(this.getDataFlowConstraint());
		matchesEClass.getESuperTypes().add(this.getDataFlowConstraint());
		containsEClass.getESuperTypes().add(this.getDataFlowConstraint());
		castedToEClass.getESuperTypes().add(this.getDataFlowConstraint());
		controlFlowEClass.getESuperTypes().add(this.getFlow());
		controlFlowSourceEClass.getESuperTypes().add(this.getControlFlow());
		controlFlowSourceEClass.getESuperTypes().add(this.getFlowSource());
		controlFlowSinkEClass.getESuperTypes().add(this.getControlFlow());
		controlFlowSinkEClass.getESuperTypes().add(this.getFlowSink());

		// Initialize classes, features, and operations; add parameters
		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_FlowFrom(), this.getFlow(), this.getFlow_FlowTo(), "flowFrom", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_FlowTo(), this.getFlow(), this.getFlow_FlowFrom(), "flowTo", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowSourceEClass, FlowSource.class, "FlowSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowSource_FlowGroup(), this.getFlowGroup(), this.getFlowGroup_FlowSources(), "flowGroup", null, 0, 1, FlowSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowSinkEClass, FlowSink.class, "FlowSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowGroupEClass, FlowGroup.class, "FlowGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowGroup_FlowSources(), this.getFlowSource(), this.getFlowSource_FlowGroup(), "flowSources", null, 0, -1, FlowGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowSourceEClass, DataFlowSource.class, "DataFlowSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFlowSource_Value(), theEcorePackage.getEString(), "value", null, 0, 1, DataFlowSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFlowSource_SourceType(), this.getDataSourceType(), "sourceType", null, 0, 1, DataFlowSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowSinkEClass, DataFlowSink.class, "DataFlowSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowConstraintEClass, FlowConstraint.class, "FlowConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowConstraintEClass, DataFlowConstraint.class, "DataFlowConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endsWithEClass, EndsWith.class, "EndsWith", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndsWith_Suffix(), theEcorePackage.getEString(), "suffix", null, 0, 1, EndsWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startsWithEClass, StartsWith.class, "StartsWith", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartsWith_Prefix(), theEcorePackage.getEString(), "prefix", null, 0, 1, StartsWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchesEClass, Matches.class, "Matches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatches_Pattern(), theEcorePackage.getEString(), "pattern", null, 0, 1, Matches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatches_RegexType(), this.getMatcherRegex(), "regexType", null, 0, 1, Matches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContains_Contents(), theEcorePackage.getEString(), "contents", null, 0, 1, Contains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(castedToEClass, CastedTo.class, "CastedTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCastedTo_Type(), theEcorePackage.getEString(), "type", null, 0, 1, CastedTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlow_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowSourceEClass, ControlFlowSource.class, "ControlFlowSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlFlowSinkEClass, ControlFlowSink.class, "ControlFlowSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dataSourceTypeEEnum, DataSourceType.class, "DataSourceType");
		addEEnumLiteral(dataSourceTypeEEnum, DataSourceType.HTTP);
		addEEnumLiteral(dataSourceTypeEEnum, DataSourceType.HTTPS);
		addEEnumLiteral(dataSourceTypeEEnum, DataSourceType.GENERIC_NETWORK);
		addEEnumLiteral(dataSourceTypeEEnum, DataSourceType.FILE);
		addEEnumLiteral(dataSourceTypeEEnum, DataSourceType.CONSOLE);
		addEEnumLiteral(dataSourceTypeEEnum, DataSourceType.OTHER);

		initEEnum(matcherRegexEEnum, MatcherRegex.class, "MatcherRegex");
		addEEnumLiteral(matcherRegexEEnum, MatcherRegex.JAVA);
		addEEnumLiteral(matcherRegexEEnum, MatcherRegex.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //FlowPackageImpl
