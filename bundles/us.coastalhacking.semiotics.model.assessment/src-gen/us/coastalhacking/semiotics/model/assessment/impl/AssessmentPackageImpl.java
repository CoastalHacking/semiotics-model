/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.coastalhacking.semiotics.model.assessment.Application;
import us.coastalhacking.semiotics.model.assessment.ApplicationGroup;
import us.coastalhacking.semiotics.model.assessment.Assessment;
import us.coastalhacking.semiotics.model.assessment.AssessmentFactory;
import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.CWEGroup;
import us.coastalhacking.semiotics.model.assessment.CastedTo;
import us.coastalhacking.semiotics.model.assessment.Contains;
import us.coastalhacking.semiotics.model.assessment.Control;
import us.coastalhacking.semiotics.model.assessment.ControlFlow;
import us.coastalhacking.semiotics.model.assessment.ControlFlowSink;
import us.coastalhacking.semiotics.model.assessment.ControlFlowSource;
import us.coastalhacking.semiotics.model.assessment.ControlGroup;
import us.coastalhacking.semiotics.model.assessment.Data;
import us.coastalhacking.semiotics.model.assessment.DataFlow;
import us.coastalhacking.semiotics.model.assessment.DataFlowConstraint;
import us.coastalhacking.semiotics.model.assessment.DataFlowSink;
import us.coastalhacking.semiotics.model.assessment.DataFlowSource;
import us.coastalhacking.semiotics.model.assessment.DataGroup;
import us.coastalhacking.semiotics.model.assessment.DataSourceType;
import us.coastalhacking.semiotics.model.assessment.EndsWith;
import us.coastalhacking.semiotics.model.assessment.File;
import us.coastalhacking.semiotics.model.assessment.Flow;
import us.coastalhacking.semiotics.model.assessment.FlowConstraint;
import us.coastalhacking.semiotics.model.assessment.FlowGroup;
import us.coastalhacking.semiotics.model.assessment.FlowSink;
import us.coastalhacking.semiotics.model.assessment.FlowSource;
import us.coastalhacking.semiotics.model.assessment.JavaLimitTo;
import us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity;
import us.coastalhacking.semiotics.model.assessment.JavaMatchRule;
import us.coastalhacking.semiotics.model.assessment.JavaSearchFor;
import us.coastalhacking.semiotics.model.assessment.JavaSearchPattern;
import us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType;
import us.coastalhacking.semiotics.model.assessment.MatcherRegex;
import us.coastalhacking.semiotics.model.assessment.Matches;
import us.coastalhacking.semiotics.model.assessment.Nameable;
import us.coastalhacking.semiotics.model.assessment.Property;
import us.coastalhacking.semiotics.model.assessment.Provable;
import us.coastalhacking.semiotics.model.assessment.Request;
import us.coastalhacking.semiotics.model.assessment.Response;
import us.coastalhacking.semiotics.model.assessment.Reviewable;
import us.coastalhacking.semiotics.model.assessment.Search;
import us.coastalhacking.semiotics.model.assessment.SearchGroup;
import us.coastalhacking.semiotics.model.assessment.SearchPattern;
import us.coastalhacking.semiotics.model.assessment.Searchable;
import us.coastalhacking.semiotics.model.assessment.Snippet;
import us.coastalhacking.semiotics.model.assessment.StartsWith;
import us.coastalhacking.semiotics.model.assessment.Traceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessmentPackageImpl extends EPackageImpl implements AssessmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cweGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cweEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snippetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

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
	private EClass assessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaSearchPatternEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum javaSearchPatternTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum javaSearchForEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum javaLimitToEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum javaMatchRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum javaMatchCaseSensitivityEEnum = null;

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
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssessmentPackageImpl() {
		super(eNS_URI, AssessmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssessmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssessmentPackage init() {
		if (isInited) return (AssessmentPackage)EPackage.Registry.INSTANCE.getEPackage(AssessmentPackage.eNS_URI);

		// Obtain or create and register package
		AssessmentPackageImpl theAssessmentPackage = (AssessmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssessmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssessmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAssessmentPackage.createPackageContents();

		// Initialize created meta-data
		theAssessmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssessmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssessmentPackage.eNS_URI, theAssessmentPackage);
		return theAssessmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameable() {
		return nameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameable_Name() {
		return (EAttribute)nameableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewable() {
		return reviewableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReviewable_Evidence() {
		return (EReference)reviewableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReviewable_Traces() {
		return (EReference)reviewableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReviewable_Searches() {
		return (EReference)reviewableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvable() {
		return provableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvable_Reviewers() {
		return (EReference)provableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvable_Traces() {
		return (EReference)provableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceable() {
		return traceableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceable_Evidence() {
		return (EReference)traceableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceable_Reviewers() {
		return (EReference)traceableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchable() {
		return searchableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchable_Reviewers() {
		return (EReference)searchableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlGroup() {
		return controlGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlGroup_Controls() {
		return (EReference)controlGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_ControlGroup() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_Cwes() {
		return (EReference)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCWEGroup() {
		return cweGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWEGroup_Cwes() {
		return (EReference)cweGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCWE() {
		return cweEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWE_CweGroup() {
		return (EReference)cweEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCWE_Id() {
		return (EAttribute)cweEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCWE_Title() {
		return (EAttribute)cweEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCWE_Url() {
		return (EAttribute)cweEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWE_Controls() {
		return (EReference)cweEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Snippets() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_DataGroup() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataGroup() {
		return dataGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataGroup_Data() {
		return (EReference)dataGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSnippet() {
		return snippetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSnippet_Data() {
		return (EReference)snippetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnippet_Row() {
		return (EAttribute)snippetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnippet_Column() {
		return (EAttribute)snippetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnippet_Length() {
		return (EAttribute)snippetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_FullPath() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Contents() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Response() {
		return (EReference)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_Request() {
		return (EReference)responseEClass.getEStructuralFeatures().get(0);
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
	public EClass getAssessment() {
		return assessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessment_ApplicationGroups() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessment_Properties() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationGroup() {
		return applicationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationGroup_Applications() {
		return (EReference)applicationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationGroup_Assessment() {
		return (EReference)applicationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationGroup() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_FlowGroups() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ControlGroups() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_DataGroups() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchGroup() {
		return searchGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchGroup_Searches() {
		return (EReference)searchGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchGroup_SearchResultDescription() {
		return (EAttribute)searchGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchGroup_SearchResultCWEs() {
		return (EReference)searchGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearch() {
		return searchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearch_SearchGroup() {
		return (EReference)searchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearch_Pattern() {
		return (EReference)searchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchPattern() {
		return searchPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchPattern_Pattern() {
		return (EAttribute)searchPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaSearchPattern() {
		return javaSearchPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaSearchPattern_PatternType() {
		return (EAttribute)javaSearchPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaSearchPattern_SearchFor() {
		return (EAttribute)javaSearchPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaSearchPattern_LimitTo() {
		return (EAttribute)javaSearchPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaSearchPattern_MatchRule() {
		return (EAttribute)javaSearchPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaSearchPattern_CaseSensitivity() {
		return (EAttribute)javaSearchPatternEClass.getEStructuralFeatures().get(4);
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
	public EEnum getJavaSearchPatternType() {
		return javaSearchPatternTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJavaSearchFor() {
		return javaSearchForEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJavaLimitTo() {
		return javaLimitToEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJavaMatchRule() {
		return javaMatchRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJavaMatchCaseSensitivity() {
		return javaMatchCaseSensitivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentFactory getAssessmentFactory() {
		return (AssessmentFactory)getEFactoryInstance();
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
		nameableEClass = createEClass(NAMEABLE);
		createEAttribute(nameableEClass, NAMEABLE__NAME);

		reviewableEClass = createEClass(REVIEWABLE);
		createEReference(reviewableEClass, REVIEWABLE__EVIDENCE);
		createEReference(reviewableEClass, REVIEWABLE__TRACES);
		createEReference(reviewableEClass, REVIEWABLE__SEARCHES);

		provableEClass = createEClass(PROVABLE);
		createEReference(provableEClass, PROVABLE__REVIEWERS);
		createEReference(provableEClass, PROVABLE__TRACES);

		traceableEClass = createEClass(TRACEABLE);
		createEReference(traceableEClass, TRACEABLE__EVIDENCE);
		createEReference(traceableEClass, TRACEABLE__REVIEWERS);

		searchableEClass = createEClass(SEARCHABLE);
		createEReference(searchableEClass, SEARCHABLE__REVIEWERS);

		controlGroupEClass = createEClass(CONTROL_GROUP);
		createEReference(controlGroupEClass, CONTROL_GROUP__CONTROLS);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__CONTROL_GROUP);
		createEReference(controlEClass, CONTROL__CWES);

		cweGroupEClass = createEClass(CWE_GROUP);
		createEReference(cweGroupEClass, CWE_GROUP__CWES);

		cweEClass = createEClass(CWE);
		createEReference(cweEClass, CWE__CWE_GROUP);
		createEAttribute(cweEClass, CWE__ID);
		createEAttribute(cweEClass, CWE__TITLE);
		createEAttribute(cweEClass, CWE__URL);
		createEReference(cweEClass, CWE__CONTROLS);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__SNIPPETS);
		createEReference(dataEClass, DATA__DATA_GROUP);

		dataGroupEClass = createEClass(DATA_GROUP);
		createEReference(dataGroupEClass, DATA_GROUP__DATA);

		snippetEClass = createEClass(SNIPPET);
		createEReference(snippetEClass, SNIPPET__DATA);
		createEAttribute(snippetEClass, SNIPPET__ROW);
		createEAttribute(snippetEClass, SNIPPET__COLUMN);
		createEAttribute(snippetEClass, SNIPPET__LENGTH);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__FULL_PATH);
		createEAttribute(fileEClass, FILE__CONTENTS);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__RESPONSE);

		responseEClass = createEClass(RESPONSE);
		createEReference(responseEClass, RESPONSE__REQUEST);

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

		assessmentEClass = createEClass(ASSESSMENT);
		createEReference(assessmentEClass, ASSESSMENT__APPLICATION_GROUPS);
		createEReference(assessmentEClass, ASSESSMENT__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		applicationGroupEClass = createEClass(APPLICATION_GROUP);
		createEReference(applicationGroupEClass, APPLICATION_GROUP__APPLICATIONS);
		createEReference(applicationGroupEClass, APPLICATION_GROUP__ASSESSMENT);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__APPLICATION_GROUP);
		createEReference(applicationEClass, APPLICATION__FLOW_GROUPS);
		createEReference(applicationEClass, APPLICATION__CONTROL_GROUPS);
		createEReference(applicationEClass, APPLICATION__DATA_GROUPS);

		searchGroupEClass = createEClass(SEARCH_GROUP);
		createEReference(searchGroupEClass, SEARCH_GROUP__SEARCHES);
		createEAttribute(searchGroupEClass, SEARCH_GROUP__SEARCH_RESULT_DESCRIPTION);
		createEReference(searchGroupEClass, SEARCH_GROUP__SEARCH_RESULT_CW_ES);

		searchEClass = createEClass(SEARCH);
		createEReference(searchEClass, SEARCH__SEARCH_GROUP);
		createEReference(searchEClass, SEARCH__PATTERN);

		searchPatternEClass = createEClass(SEARCH_PATTERN);
		createEAttribute(searchPatternEClass, SEARCH_PATTERN__PATTERN);

		javaSearchPatternEClass = createEClass(JAVA_SEARCH_PATTERN);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__PATTERN_TYPE);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__SEARCH_FOR);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__LIMIT_TO);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__MATCH_RULE);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__CASE_SENSITIVITY);

		// Create enums
		dataSourceTypeEEnum = createEEnum(DATA_SOURCE_TYPE);
		matcherRegexEEnum = createEEnum(MATCHER_REGEX);
		javaSearchPatternTypeEEnum = createEEnum(JAVA_SEARCH_PATTERN_TYPE);
		javaSearchForEEnum = createEEnum(JAVA_SEARCH_FOR);
		javaLimitToEEnum = createEEnum(JAVA_LIMIT_TO);
		javaMatchRuleEEnum = createEEnum(JAVA_MATCH_RULE);
		javaMatchCaseSensitivityEEnum = createEEnum(JAVA_MATCH_CASE_SENSITIVITY);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reviewableEClass.getESuperTypes().add(this.getNameable());
		provableEClass.getESuperTypes().add(this.getNameable());
		traceableEClass.getESuperTypes().add(this.getNameable());
		searchableEClass.getESuperTypes().add(this.getNameable());
		controlGroupEClass.getESuperTypes().add(this.getNameable());
		controlEClass.getESuperTypes().add(this.getReviewable());
		dataEClass.getESuperTypes().add(this.getNameable());
		dataGroupEClass.getESuperTypes().add(this.getNameable());
		snippetEClass.getESuperTypes().add(this.getProvable());
		fileEClass.getESuperTypes().add(this.getData());
		requestEClass.getESuperTypes().add(this.getData());
		responseEClass.getESuperTypes().add(this.getData());
		flowEClass.getESuperTypes().add(this.getTraceable());
		flowSourceEClass.getESuperTypes().add(this.getFlow());
		flowSinkEClass.getESuperTypes().add(this.getFlow());
		flowGroupEClass.getESuperTypes().add(this.getNameable());
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
		applicationGroupEClass.getESuperTypes().add(this.getNameable());
		applicationEClass.getESuperTypes().add(this.getNameable());
		searchGroupEClass.getESuperTypes().add(this.getNameable());
		searchEClass.getESuperTypes().add(this.getSearchable());
		javaSearchPatternEClass.getESuperTypes().add(this.getSearchPattern());

		// Initialize classes, features, and operations; add parameters
		initEClass(nameableEClass, Nameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Nameable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reviewableEClass, Reviewable.class, "Reviewable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReviewable_Evidence(), this.getProvable(), this.getProvable_Reviewers(), "evidence", null, 0, -1, Reviewable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReviewable_Traces(), this.getTraceable(), this.getTraceable_Reviewers(), "traces", null, 0, -1, Reviewable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReviewable_Searches(), this.getSearchable(), this.getSearchable_Reviewers(), "searches", null, 0, -1, Reviewable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provableEClass, Provable.class, "Provable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvable_Reviewers(), this.getReviewable(), this.getReviewable_Evidence(), "reviewers", null, 0, -1, Provable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvable_Traces(), this.getTraceable(), this.getTraceable_Evidence(), "traces", null, 0, -1, Provable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceableEClass, Traceable.class, "Traceable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceable_Evidence(), this.getProvable(), this.getProvable_Traces(), "evidence", null, 0, -1, Traceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceable_Reviewers(), this.getReviewable(), this.getReviewable_Traces(), "reviewers", null, 0, -1, Traceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchableEClass, Searchable.class, "Searchable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchable_Reviewers(), this.getReviewable(), this.getReviewable_Searches(), "reviewers", null, 0, 1, Searchable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlGroupEClass, ControlGroup.class, "ControlGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlGroup_Controls(), this.getControl(), this.getControl_ControlGroup(), "controls", null, 0, -1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_ControlGroup(), this.getControlGroup(), this.getControlGroup_Controls(), "controlGroup", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Cwes(), this.getCWE(), this.getCWE_Controls(), "cwes", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cweGroupEClass, CWEGroup.class, "CWEGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCWEGroup_Cwes(), this.getCWE(), this.getCWE_CweGroup(), "cwes", null, 0, -1, CWEGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cweEClass, us.coastalhacking.semiotics.model.assessment.CWE.class, "CWE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCWE_CweGroup(), this.getCWEGroup(), this.getCWEGroup_Cwes(), "cweGroup", null, 0, 1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCWE_Id(), theEcorePackage.getEInt(), "id", null, 0, 1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCWE_Title(), theEcorePackage.getEString(), "title", null, 0, 1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCWE_Url(), theEcorePackage.getEString(), "url", null, 0, 1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWE_Controls(), this.getControl(), this.getControl_Cwes(), "controls", null, 0, -1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Snippets(), this.getSnippet(), this.getSnippet_Data(), "snippets", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_DataGroup(), this.getDataGroup(), this.getDataGroup_Data(), "dataGroup", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataGroupEClass, DataGroup.class, "DataGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataGroup_Data(), this.getData(), this.getData_DataGroup(), "data", null, 0, -1, DataGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snippetEClass, Snippet.class, "Snippet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSnippet_Data(), this.getData(), this.getData_Snippets(), "data", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnippet_Row(), theEcorePackage.getEInt(), "row", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnippet_Column(), theEcorePackage.getEInt(), "column", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnippet_Length(), theEcorePackage.getEInt(), "length", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_FullPath(), theEcorePackage.getEString(), "fullPath", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Contents(), theEcorePackage.getEString(), "contents", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Response(), this.getResponse(), this.getResponse_Request(), "response", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_Request(), this.getRequest(), this.getRequest_Response(), "request", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(assessmentEClass, Assessment.class, "Assessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssessment_ApplicationGroups(), this.getApplicationGroup(), this.getApplicationGroup_Assessment(), "applicationGroups", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssessment_Properties(), this.getProperty(), null, "properties", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationGroupEClass, ApplicationGroup.class, "ApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationGroup_Applications(), this.getApplication(), this.getApplication_ApplicationGroup(), "applications", null, 0, -1, ApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationGroup_Assessment(), this.getAssessment(), this.getAssessment_ApplicationGroups(), "assessment", null, 0, 1, ApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_ApplicationGroup(), this.getApplicationGroup(), this.getApplicationGroup_Applications(), "applicationGroup", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_FlowGroups(), this.getFlowGroup(), null, "flowGroups", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ControlGroups(), this.getControlGroup(), null, "controlGroups", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_DataGroups(), this.getDataGroup(), null, "dataGroups", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchGroupEClass, SearchGroup.class, "SearchGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchGroup_Searches(), this.getSearch(), this.getSearch_SearchGroup(), "searches", null, 0, -1, SearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchGroup_SearchResultDescription(), theEcorePackage.getEString(), "searchResultDescription", null, 0, 1, SearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchGroup_SearchResultCWEs(), this.getCWE(), null, "searchResultCWEs", null, 0, -1, SearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearch_SearchGroup(), this.getSearchGroup(), this.getSearchGroup_Searches(), "searchGroup", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearch_Pattern(), this.getSearchPattern(), null, "pattern", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchPatternEClass, SearchPattern.class, "SearchPattern", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchPattern_Pattern(), theEcorePackage.getEString(), "pattern", null, 0, 1, SearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaSearchPatternEClass, JavaSearchPattern.class, "JavaSearchPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaSearchPattern_PatternType(), this.getJavaSearchPatternType(), "patternType", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaSearchPattern_SearchFor(), this.getJavaSearchFor(), "searchFor", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaSearchPattern_LimitTo(), this.getJavaLimitTo(), "limitTo", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaSearchPattern_MatchRule(), this.getJavaMatchRule(), "matchRule", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaSearchPattern_CaseSensitivity(), this.getJavaMatchCaseSensitivity(), "caseSensitivity", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(javaSearchPatternTypeEEnum, JavaSearchPatternType.class, "JavaSearchPatternType");
		addEEnumLiteral(javaSearchPatternTypeEEnum, JavaSearchPatternType.ECLIPSE);

		initEEnum(javaSearchForEEnum, JavaSearchFor.class, "JavaSearchFor");
		addEEnumLiteral(javaSearchForEEnum, JavaSearchFor.CLASS_OR_INTERFACE);
		addEEnumLiteral(javaSearchForEEnum, JavaSearchFor.CLASS);
		addEEnumLiteral(javaSearchForEEnum, JavaSearchFor.INTERFACE);
		addEEnumLiteral(javaSearchForEEnum, JavaSearchFor.ANNOTATION);
		addEEnumLiteral(javaSearchForEEnum, JavaSearchFor.METHOD);
		addEEnumLiteral(javaSearchForEEnum, JavaSearchFor.PACKAGE);

		initEEnum(javaLimitToEEnum, JavaLimitTo.class, "JavaLimitTo");
		addEEnumLiteral(javaLimitToEEnum, JavaLimitTo.ANY_OCCURRENCES);
		addEEnumLiteral(javaLimitToEEnum, JavaLimitTo.DECLARATION);
		addEEnumLiteral(javaLimitToEEnum, JavaLimitTo.REFERENCES);
		addEEnumLiteral(javaLimitToEEnum, JavaLimitTo.ANY_EXTENDERS_OR_IMPLEMENTORS);

		initEEnum(javaMatchRuleEEnum, JavaMatchRule.class, "JavaMatchRule");
		addEEnumLiteral(javaMatchRuleEEnum, JavaMatchRule.WILDCARD);
		addEEnumLiteral(javaMatchRuleEEnum, JavaMatchRule.EXACT);

		initEEnum(javaMatchCaseSensitivityEEnum, JavaMatchCaseSensitivity.class, "JavaMatchCaseSensitivity");
		addEEnumLiteral(javaMatchCaseSensitivityEEnum, JavaMatchCaseSensitivity.CASE_INSENSITIVE);
		addEEnumLiteral(javaMatchCaseSensitivityEEnum, JavaMatchCaseSensitivity.CASE_SENSITIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //AssessmentPackageImpl
