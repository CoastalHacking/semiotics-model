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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.coastalhacking.semiotics.model.assessment.Account;
import us.coastalhacking.semiotics.model.assessment.AccountControlType;
import us.coastalhacking.semiotics.model.assessment.AccountGroup;
import us.coastalhacking.semiotics.model.assessment.Application;
import us.coastalhacking.semiotics.model.assessment.ApplicationAssessment;
import us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentGroup;
import us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType;
import us.coastalhacking.semiotics.model.assessment.ApplicationGroup;
import us.coastalhacking.semiotics.model.assessment.ApplicationType;
import us.coastalhacking.semiotics.model.assessment.Applicational;
import us.coastalhacking.semiotics.model.assessment.Assessable;
import us.coastalhacking.semiotics.model.assessment.Assessment;
import us.coastalhacking.semiotics.model.assessment.AssessmentFactory;
import us.coastalhacking.semiotics.model.assessment.AssessmentGroup;
import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.AssessmentType;
import us.coastalhacking.semiotics.model.assessment.Authentication;
import us.coastalhacking.semiotics.model.assessment.AuthenticationControlType;
import us.coastalhacking.semiotics.model.assessment.AuthenticationGroup;
import us.coastalhacking.semiotics.model.assessment.Authorization;
import us.coastalhacking.semiotics.model.assessment.AuthorizationControlType;
import us.coastalhacking.semiotics.model.assessment.AuthorizationGroup;
import us.coastalhacking.semiotics.model.assessment.CWEGroup;
import us.coastalhacking.semiotics.model.assessment.CastedTo;
import us.coastalhacking.semiotics.model.assessment.Contains;
import us.coastalhacking.semiotics.model.assessment.Control;
import us.coastalhacking.semiotics.model.assessment.ControlFlow;
import us.coastalhacking.semiotics.model.assessment.ControlFlowGroup;
import us.coastalhacking.semiotics.model.assessment.ControlFlowNode;
import us.coastalhacking.semiotics.model.assessment.ControlFlowType;
import us.coastalhacking.semiotics.model.assessment.ControlGroup;
import us.coastalhacking.semiotics.model.assessment.ControlType;
import us.coastalhacking.semiotics.model.assessment.Cryptography;
import us.coastalhacking.semiotics.model.assessment.CryptographyControlType;
import us.coastalhacking.semiotics.model.assessment.CryptographyGroup;
import us.coastalhacking.semiotics.model.assessment.Data;
import us.coastalhacking.semiotics.model.assessment.DataFlow;
import us.coastalhacking.semiotics.model.assessment.DataFlowConstraint;
import us.coastalhacking.semiotics.model.assessment.DataFlowGroup;
import us.coastalhacking.semiotics.model.assessment.DataFlowNode;
import us.coastalhacking.semiotics.model.assessment.DataFlowType;
import us.coastalhacking.semiotics.model.assessment.DataGroup;
import us.coastalhacking.semiotics.model.assessment.DataTaintType;
import us.coastalhacking.semiotics.model.assessment.DataType;
import us.coastalhacking.semiotics.model.assessment.Describable;
import us.coastalhacking.semiotics.model.assessment.EndsWith;
import us.coastalhacking.semiotics.model.assessment.Examinable;
import us.coastalhacking.semiotics.model.assessment.File;
import us.coastalhacking.semiotics.model.assessment.FileGroup;
import us.coastalhacking.semiotics.model.assessment.FileType;
import us.coastalhacking.semiotics.model.assessment.Findable;
import us.coastalhacking.semiotics.model.assessment.Finding;
import us.coastalhacking.semiotics.model.assessment.FindingGroup;
import us.coastalhacking.semiotics.model.assessment.FindingType;
import us.coastalhacking.semiotics.model.assessment.Flow;
import us.coastalhacking.semiotics.model.assessment.FlowGroup;
import us.coastalhacking.semiotics.model.assessment.FlowNode;
import us.coastalhacking.semiotics.model.assessment.FlowType;
import us.coastalhacking.semiotics.model.assessment.GenericControl;
import us.coastalhacking.semiotics.model.assessment.GenericControlGroup;
import us.coastalhacking.semiotics.model.assessment.GenericControlType;
import us.coastalhacking.semiotics.model.assessment.Group;
import us.coastalhacking.semiotics.model.assessment.Groupable;
import us.coastalhacking.semiotics.model.assessment.GroupableMembered;
import us.coastalhacking.semiotics.model.assessment.JavaLimitTo;
import us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity;
import us.coastalhacking.semiotics.model.assessment.JavaMatchRule;
import us.coastalhacking.semiotics.model.assessment.JavaSearch;
import us.coastalhacking.semiotics.model.assessment.JavaSearchFor;
import us.coastalhacking.semiotics.model.assessment.JavaSearchGroup;
import us.coastalhacking.semiotics.model.assessment.JavaSearchPattern;
import us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType;
import us.coastalhacking.semiotics.model.assessment.JavaSearchType;
import us.coastalhacking.semiotics.model.assessment.LocalFinding;
import us.coastalhacking.semiotics.model.assessment.LocalFindingGroup;
import us.coastalhacking.semiotics.model.assessment.LocalFindingType;
import us.coastalhacking.semiotics.model.assessment.LocalTask;
import us.coastalhacking.semiotics.model.assessment.LocalTaskGroup;
import us.coastalhacking.semiotics.model.assessment.LocalTaskType;
import us.coastalhacking.semiotics.model.assessment.MatcherRegex;
import us.coastalhacking.semiotics.model.assessment.Matches;
import us.coastalhacking.semiotics.model.assessment.Member;
import us.coastalhacking.semiotics.model.assessment.Membered;
import us.coastalhacking.semiotics.model.assessment.MemberedGroupable;
import us.coastalhacking.semiotics.model.assessment.Nameable;
import us.coastalhacking.semiotics.model.assessment.NetworkEgress;
import us.coastalhacking.semiotics.model.assessment.NetworkEgressGroup;
import us.coastalhacking.semiotics.model.assessment.NetworkEgressType;
import us.coastalhacking.semiotics.model.assessment.NetworkIngress;
import us.coastalhacking.semiotics.model.assessment.NetworkIngressGroup;
import us.coastalhacking.semiotics.model.assessment.NetworkIngressType;
import us.coastalhacking.semiotics.model.assessment.OutputEncoding;
import us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType;
import us.coastalhacking.semiotics.model.assessment.OutputEncodingGroup;
import us.coastalhacking.semiotics.model.assessment.Property;
import us.coastalhacking.semiotics.model.assessment.Provable;
import us.coastalhacking.semiotics.model.assessment.Request;
import us.coastalhacking.semiotics.model.assessment.RequestGroup;
import us.coastalhacking.semiotics.model.assessment.RequestType;
import us.coastalhacking.semiotics.model.assessment.Response;
import us.coastalhacking.semiotics.model.assessment.ResponseGroup;
import us.coastalhacking.semiotics.model.assessment.ResponseType;
import us.coastalhacking.semiotics.model.assessment.Search;
import us.coastalhacking.semiotics.model.assessment.SearchGroup;
import us.coastalhacking.semiotics.model.assessment.SearchPattern;
import us.coastalhacking.semiotics.model.assessment.SearchType;
import us.coastalhacking.semiotics.model.assessment.Searchable;
import us.coastalhacking.semiotics.model.assessment.Snippet;
import us.coastalhacking.semiotics.model.assessment.SnippetType;
import us.coastalhacking.semiotics.model.assessment.StartsWith;
import us.coastalhacking.semiotics.model.assessment.SurfaceArea;
import us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup;
import us.coastalhacking.semiotics.model.assessment.SurfaceAreaType;
import us.coastalhacking.semiotics.model.assessment.Task;
import us.coastalhacking.semiotics.model.assessment.TaskGroup;
import us.coastalhacking.semiotics.model.assessment.TaskStatus;
import us.coastalhacking.semiotics.model.assessment.TaskType;
import us.coastalhacking.semiotics.model.assessment.Taskable;
import us.coastalhacking.semiotics.model.assessment.TextSnippet;
import us.coastalhacking.semiotics.model.assessment.TextSnippetType;
import us.coastalhacking.semiotics.model.assessment.Traceable;
import us.coastalhacking.semiotics.model.assessment.WebApplication;
import us.coastalhacking.semiotics.model.assessment.WebApplicationGroup;
import us.coastalhacking.semiotics.model.assessment.WebApplicationType;

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
	private EClass describableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examinableEClass = null;

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
	private EClass taskableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupableMemberedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberedGroupableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTypeEClass = null;

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
	private EClass authenticationControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptographyControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptographyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEncodingControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEncodingGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEncodingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericControlGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceAreaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceAreaGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkIngressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkIngressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkIngressGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEgressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEgressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEgressGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

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
	private EClass snippetTypeEClass = null;

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
	private EClass textSnippetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSnippetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTypeEClass = null;

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
	private EClass fileGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestTypeEClass = null;

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
	private EClass requestGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseTypeEClass = null;

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
	private EClass responseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowTypeEClass = null;

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
	private EClass flowGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowTypeEClass = null;

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
	private EClass dataFlowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowGroupEClass = null;

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
	private EClass controlFlowTypeEClass = null;

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
	private EClass controlFlowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessableEClass = null;

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
	private EClass assessmentGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAssessmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAssessmentGroupEClass = null;

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
	private EClass applicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationalEClass = null;

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
	private EClass applicationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webApplicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webApplicationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchTypeEClass = null;

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
	private EClass javaSearchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaSearchGroupEClass = null;

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
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTaskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTaskGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localFindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localFindingGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localFindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTaintTypeEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskStatusEEnum = null;

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
	public EClass getDescribable() {
		return describableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribable_Description() {
		return (EAttribute)describableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExaminable() {
		return examinableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminable_Evidence() {
		return (EReference)examinableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminable_Traces() {
		return (EReference)examinableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminable_Searches() {
		return (EReference)examinableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminable_Tasks() {
		return (EReference)examinableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminable_Findings() {
		return (EReference)examinableEClass.getEStructuralFeatures().get(4);
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
	public EReference getProvable_Examinees() {
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
	public EReference getTraceable_Examinees() {
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
	public EReference getSearchable_Examinees() {
		return (EReference)searchableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskable() {
		return taskableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskable_Examinees() {
		return (EReference)taskableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindable() {
		return findableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindable_Examinees() {
		return (EReference)findableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupable() {
		return groupableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMembered() {
		return memberedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Members() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Group() {
		return (EReference)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupableMembered() {
		return groupableMemberedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberedGroupable() {
		return memberedGroupableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlType() {
		return controlTypeEClass;
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
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_Cwes() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
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
	public EClass getAuthenticationControlType() {
		return authenticationControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationGroup() {
		return authenticationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationControlType() {
		return authorizationControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationGroup() {
		return authorizationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorization() {
		return authorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountControlType() {
		return accountControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountGroup() {
		return accountGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Username() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Password() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCryptographyControlType() {
		return cryptographyControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCryptographyGroup() {
		return cryptographyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCryptography() {
		return cryptographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputEncodingControlType() {
		return outputEncodingControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputEncodingGroup() {
		return outputEncodingGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputEncoding() {
		return outputEncodingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericControlType() {
		return genericControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericControl() {
		return genericControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericControlGroup() {
		return genericControlGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceAreaType() {
		return surfaceAreaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceAreaGroup() {
		return surfaceAreaGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceArea() {
		return surfaceAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkIngressType() {
		return networkIngressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkIngress() {
		return networkIngressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkIngressGroup() {
		return networkIngressGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkEgressType() {
		return networkEgressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkEgress() {
		return networkEgressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkEgressGroup() {
		return networkEgressGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
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
	public EAttribute getData_Data() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
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
	public EClass getSnippetType() {
		return snippetTypeEClass;
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
	public EClass getTextSnippetType() {
		return textSnippetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextSnippet() {
		return textSnippetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSnippet_Offset() {
		return (EAttribute)textSnippetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSnippet_Length() {
		return (EAttribute)textSnippetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSnippet_Text() {
		return (EAttribute)textSnippetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileType() {
		return fileTypeEClass;
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
	public EClass getFileGroup() {
		return fileGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestType() {
		return requestTypeEClass;
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
	public EClass getRequestGroup() {
		return requestGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseType() {
		return responseTypeEClass;
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
	public EClass getResponseGroup() {
		return responseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowType() {
		return flowTypeEClass;
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
	public EAttribute getFlow_Value() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Flows() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
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
	public EClass getFlowNode() {
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_FlowFrom() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_FlowRoot() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_FlowTo() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowType() {
		return dataFlowTypeEClass;
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
	public EAttribute getDataFlow_SourceType() {
		return (EAttribute)dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowNode() {
		return dataFlowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowGroup() {
		return dataFlowGroupEClass;
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
	public EClass getControlFlowType() {
		return controlFlowTypeEClass;
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
	public EClass getControlFlowNode() {
		return controlFlowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowGroup() {
		return controlFlowGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentType() {
		return assessmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessable() {
		return assessableEClass;
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
	public EReference getAssessment_Properties() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentGroup() {
		return assessmentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAssessmentType() {
		return applicationAssessmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAssessment() {
		return applicationAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAssessmentGroup() {
		return applicationAssessmentGroupEClass;
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
	public EClass getApplicationType() {
		return applicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicational() {
		return applicationalEClass;
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
	public EClass getApplicationGroup() {
		return applicationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebApplicationType() {
		return webApplicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebApplication() {
		return webApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplication_InternalURL() {
		return (EAttribute)webApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApplication_ExternalURL() {
		return (EAttribute)webApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebApplicationGroup() {
		return webApplicationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchType() {
		return searchTypeEClass;
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
	public EReference getSearchGroup_SearchResultCWEs() {
		return (EReference)searchGroupEClass.getEStructuralFeatures().get(0);
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
	public EReference getSearch_Pattern() {
		return (EReference)searchEClass.getEStructuralFeatures().get(0);
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
	public EClass getJavaSearchType() {
		return javaSearchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaSearch() {
		return javaSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaSearchGroup() {
		return javaSearchGroupEClass;
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
	public EClass getTaskType() {
		return taskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskGroup() {
		return taskGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TaskStatus() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalTaskType() {
		return localTaskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalTaskGroup() {
		return localTaskGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalTask() {
		return localTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindingType() {
		return findingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindingGroup() {
		return findingGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinding() {
		return findingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinding_Details() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinding_Remediation() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinding_Reproducer() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinding_References() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalFindingType() {
		return localFindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalFindingGroup() {
		return localFindingGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalFinding() {
		return localFindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTaintType() {
		return dataTaintTypeEEnum;
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
	public EEnum getTaskStatus() {
		return taskStatusEEnum;
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

		describableEClass = createEClass(DESCRIBABLE);
		createEAttribute(describableEClass, DESCRIBABLE__DESCRIPTION);

		examinableEClass = createEClass(EXAMINABLE);
		createEReference(examinableEClass, EXAMINABLE__EVIDENCE);
		createEReference(examinableEClass, EXAMINABLE__TRACES);
		createEReference(examinableEClass, EXAMINABLE__SEARCHES);
		createEReference(examinableEClass, EXAMINABLE__TASKS);
		createEReference(examinableEClass, EXAMINABLE__FINDINGS);

		provableEClass = createEClass(PROVABLE);
		createEReference(provableEClass, PROVABLE__EXAMINEES);
		createEReference(provableEClass, PROVABLE__TRACES);

		traceableEClass = createEClass(TRACEABLE);
		createEReference(traceableEClass, TRACEABLE__EVIDENCE);
		createEReference(traceableEClass, TRACEABLE__EXAMINEES);

		searchableEClass = createEClass(SEARCHABLE);
		createEReference(searchableEClass, SEARCHABLE__EXAMINEES);

		taskableEClass = createEClass(TASKABLE);
		createEReference(taskableEClass, TASKABLE__EXAMINEES);

		findableEClass = createEClass(FINDABLE);
		createEReference(findableEClass, FINDABLE__EXAMINEES);

		groupableEClass = createEClass(GROUPABLE);

		memberedEClass = createEClass(MEMBERED);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__MEMBERS);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__GROUP);

		groupableMemberedEClass = createEClass(GROUPABLE_MEMBERED);

		memberedGroupableEClass = createEClass(MEMBERED_GROUPABLE);

		controlTypeEClass = createEClass(CONTROL_TYPE);

		controlGroupEClass = createEClass(CONTROL_GROUP);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__CWES);

		cweGroupEClass = createEClass(CWE_GROUP);
		createEReference(cweGroupEClass, CWE_GROUP__CWES);

		cweEClass = createEClass(CWE);
		createEReference(cweEClass, CWE__CWE_GROUP);
		createEAttribute(cweEClass, CWE__ID);
		createEAttribute(cweEClass, CWE__TITLE);
		createEAttribute(cweEClass, CWE__URL);
		createEReference(cweEClass, CWE__CONTROLS);

		authenticationControlTypeEClass = createEClass(AUTHENTICATION_CONTROL_TYPE);

		authenticationGroupEClass = createEClass(AUTHENTICATION_GROUP);

		authenticationEClass = createEClass(AUTHENTICATION);

		authorizationControlTypeEClass = createEClass(AUTHORIZATION_CONTROL_TYPE);

		authorizationGroupEClass = createEClass(AUTHORIZATION_GROUP);

		authorizationEClass = createEClass(AUTHORIZATION);

		accountControlTypeEClass = createEClass(ACCOUNT_CONTROL_TYPE);

		accountGroupEClass = createEClass(ACCOUNT_GROUP);

		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__USERNAME);
		createEAttribute(accountEClass, ACCOUNT__PASSWORD);

		cryptographyControlTypeEClass = createEClass(CRYPTOGRAPHY_CONTROL_TYPE);

		cryptographyGroupEClass = createEClass(CRYPTOGRAPHY_GROUP);

		cryptographyEClass = createEClass(CRYPTOGRAPHY);

		outputEncodingControlTypeEClass = createEClass(OUTPUT_ENCODING_CONTROL_TYPE);

		outputEncodingGroupEClass = createEClass(OUTPUT_ENCODING_GROUP);

		outputEncodingEClass = createEClass(OUTPUT_ENCODING);

		genericControlTypeEClass = createEClass(GENERIC_CONTROL_TYPE);

		genericControlEClass = createEClass(GENERIC_CONTROL);

		genericControlGroupEClass = createEClass(GENERIC_CONTROL_GROUP);

		surfaceAreaTypeEClass = createEClass(SURFACE_AREA_TYPE);

		surfaceAreaGroupEClass = createEClass(SURFACE_AREA_GROUP);

		surfaceAreaEClass = createEClass(SURFACE_AREA);

		networkIngressTypeEClass = createEClass(NETWORK_INGRESS_TYPE);

		networkIngressEClass = createEClass(NETWORK_INGRESS);

		networkIngressGroupEClass = createEClass(NETWORK_INGRESS_GROUP);

		networkEgressTypeEClass = createEClass(NETWORK_EGRESS_TYPE);

		networkEgressEClass = createEClass(NETWORK_EGRESS);

		networkEgressGroupEClass = createEClass(NETWORK_EGRESS_GROUP);

		dataTypeEClass = createEClass(DATA_TYPE);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__SNIPPETS);
		createEAttribute(dataEClass, DATA__DATA);

		dataGroupEClass = createEClass(DATA_GROUP);

		snippetTypeEClass = createEClass(SNIPPET_TYPE);

		snippetEClass = createEClass(SNIPPET);
		createEReference(snippetEClass, SNIPPET__DATA);

		textSnippetTypeEClass = createEClass(TEXT_SNIPPET_TYPE);

		textSnippetEClass = createEClass(TEXT_SNIPPET);
		createEAttribute(textSnippetEClass, TEXT_SNIPPET__OFFSET);
		createEAttribute(textSnippetEClass, TEXT_SNIPPET__LENGTH);
		createEAttribute(textSnippetEClass, TEXT_SNIPPET__TEXT);

		fileTypeEClass = createEClass(FILE_TYPE);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__FULL_PATH);

		fileGroupEClass = createEClass(FILE_GROUP);

		requestTypeEClass = createEClass(REQUEST_TYPE);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__RESPONSE);

		requestGroupEClass = createEClass(REQUEST_GROUP);

		responseTypeEClass = createEClass(RESPONSE_TYPE);

		responseEClass = createEClass(RESPONSE);
		createEReference(responseEClass, RESPONSE__REQUEST);

		responseGroupEClass = createEClass(RESPONSE_GROUP);

		flowTypeEClass = createEClass(FLOW_TYPE);

		flowEClass = createEClass(FLOW);
		createEAttribute(flowEClass, FLOW__VALUE);
		createEReference(flowEClass, FLOW__FLOWS);

		flowGroupEClass = createEClass(FLOW_GROUP);

		flowNodeEClass = createEClass(FLOW_NODE);
		createEReference(flowNodeEClass, FLOW_NODE__FLOW_FROM);
		createEReference(flowNodeEClass, FLOW_NODE__FLOW_ROOT);
		createEReference(flowNodeEClass, FLOW_NODE__FLOW_TO);

		dataFlowTypeEClass = createEClass(DATA_FLOW_TYPE);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEAttribute(dataFlowEClass, DATA_FLOW__SOURCE_TYPE);

		dataFlowNodeEClass = createEClass(DATA_FLOW_NODE);

		dataFlowGroupEClass = createEClass(DATA_FLOW_GROUP);

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

		controlFlowTypeEClass = createEClass(CONTROL_FLOW_TYPE);

		controlFlowEClass = createEClass(CONTROL_FLOW);

		controlFlowNodeEClass = createEClass(CONTROL_FLOW_NODE);

		controlFlowGroupEClass = createEClass(CONTROL_FLOW_GROUP);

		assessmentTypeEClass = createEClass(ASSESSMENT_TYPE);

		assessableEClass = createEClass(ASSESSABLE);

		assessmentEClass = createEClass(ASSESSMENT);
		createEReference(assessmentEClass, ASSESSMENT__PROPERTIES);

		assessmentGroupEClass = createEClass(ASSESSMENT_GROUP);

		applicationAssessmentTypeEClass = createEClass(APPLICATION_ASSESSMENT_TYPE);

		applicationAssessmentEClass = createEClass(APPLICATION_ASSESSMENT);

		applicationAssessmentGroupEClass = createEClass(APPLICATION_ASSESSMENT_GROUP);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		applicationTypeEClass = createEClass(APPLICATION_TYPE);

		applicationalEClass = createEClass(APPLICATIONAL);

		applicationEClass = createEClass(APPLICATION);

		applicationGroupEClass = createEClass(APPLICATION_GROUP);

		webApplicationTypeEClass = createEClass(WEB_APPLICATION_TYPE);

		webApplicationEClass = createEClass(WEB_APPLICATION);
		createEAttribute(webApplicationEClass, WEB_APPLICATION__INTERNAL_URL);
		createEAttribute(webApplicationEClass, WEB_APPLICATION__EXTERNAL_URL);

		webApplicationGroupEClass = createEClass(WEB_APPLICATION_GROUP);

		searchTypeEClass = createEClass(SEARCH_TYPE);

		searchGroupEClass = createEClass(SEARCH_GROUP);
		createEReference(searchGroupEClass, SEARCH_GROUP__SEARCH_RESULT_CW_ES);

		searchEClass = createEClass(SEARCH);
		createEReference(searchEClass, SEARCH__PATTERN);

		searchPatternEClass = createEClass(SEARCH_PATTERN);
		createEAttribute(searchPatternEClass, SEARCH_PATTERN__PATTERN);

		javaSearchTypeEClass = createEClass(JAVA_SEARCH_TYPE);

		javaSearchEClass = createEClass(JAVA_SEARCH);

		javaSearchGroupEClass = createEClass(JAVA_SEARCH_GROUP);

		javaSearchPatternEClass = createEClass(JAVA_SEARCH_PATTERN);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__PATTERN_TYPE);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__SEARCH_FOR);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__LIMIT_TO);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__MATCH_RULE);
		createEAttribute(javaSearchPatternEClass, JAVA_SEARCH_PATTERN__CASE_SENSITIVITY);

		taskTypeEClass = createEClass(TASK_TYPE);

		taskGroupEClass = createEClass(TASK_GROUP);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__TASK_STATUS);

		localTaskTypeEClass = createEClass(LOCAL_TASK_TYPE);

		localTaskGroupEClass = createEClass(LOCAL_TASK_GROUP);

		localTaskEClass = createEClass(LOCAL_TASK);

		findingTypeEClass = createEClass(FINDING_TYPE);

		findingGroupEClass = createEClass(FINDING_GROUP);

		findingEClass = createEClass(FINDING);
		createEAttribute(findingEClass, FINDING__DETAILS);
		createEAttribute(findingEClass, FINDING__REMEDIATION);
		createEAttribute(findingEClass, FINDING__REPRODUCER);
		createEAttribute(findingEClass, FINDING__REFERENCES);

		localFindingTypeEClass = createEClass(LOCAL_FINDING_TYPE);

		localFindingGroupEClass = createEClass(LOCAL_FINDING_GROUP);

		localFindingEClass = createEClass(LOCAL_FINDING);

		// Create enums
		dataTaintTypeEEnum = createEEnum(DATA_TAINT_TYPE);
		matcherRegexEEnum = createEEnum(MATCHER_REGEX);
		javaSearchPatternTypeEEnum = createEEnum(JAVA_SEARCH_PATTERN_TYPE);
		javaSearchForEEnum = createEEnum(JAVA_SEARCH_FOR);
		javaLimitToEEnum = createEEnum(JAVA_LIMIT_TO);
		javaMatchRuleEEnum = createEEnum(JAVA_MATCH_RULE);
		javaMatchCaseSensitivityEEnum = createEEnum(JAVA_MATCH_CASE_SENSITIVITY);
		taskStatusEEnum = createEEnum(TASK_STATUS);
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
		ETypeParameter groupEClass_T = addETypeParameter(groupEClass, "T");
		ETypeParameter memberEClass_T = addETypeParameter(memberEClass, "T");
		ETypeParameter groupableMemberedEClass_G = addETypeParameter(groupableMemberedEClass, "G");
		ETypeParameter groupableMemberedEClass_M = addETypeParameter(groupableMemberedEClass, "M");
		ETypeParameter memberedGroupableEClass_G = addETypeParameter(memberedGroupableEClass, "G");
		ETypeParameter memberedGroupableEClass_M = addETypeParameter(memberedGroupableEClass, "M");
		ETypeParameter controlGroupEClass_T = addETypeParameter(controlGroupEClass, "T");
		ETypeParameter controlEClass_T = addETypeParameter(controlEClass, "T");
		ETypeParameter surfaceAreaGroupEClass_T = addETypeParameter(surfaceAreaGroupEClass, "T");
		ETypeParameter surfaceAreaEClass_T = addETypeParameter(surfaceAreaEClass, "T");
		ETypeParameter dataEClass_T = addETypeParameter(dataEClass, "T");
		ETypeParameter dataGroupEClass_T = addETypeParameter(dataGroupEClass, "T");
		ETypeParameter snippetEClass_T = addETypeParameter(snippetEClass, "T");
		ETypeParameter flowEClass_T = addETypeParameter(flowEClass, "T");
		ETypeParameter flowGroupEClass_T = addETypeParameter(flowGroupEClass, "T");
		ETypeParameter flowNodeEClass_T = addETypeParameter(flowNodeEClass, "T");
		ETypeParameter assessmentEClass_T = addETypeParameter(assessmentEClass, "T");
		ETypeParameter assessmentGroupEClass_T = addETypeParameter(assessmentGroupEClass, "T");
		ETypeParameter applicationEClass_T = addETypeParameter(applicationEClass, "T");
		ETypeParameter applicationGroupEClass_T = addETypeParameter(applicationGroupEClass, "T");
		ETypeParameter searchGroupEClass_T = addETypeParameter(searchGroupEClass, "T");
		ETypeParameter searchEClass_T = addETypeParameter(searchEClass, "T");
		ETypeParameter searchPatternEClass_T = addETypeParameter(searchPatternEClass, "T");
		ETypeParameter taskGroupEClass_T = addETypeParameter(taskGroupEClass, "T");
		ETypeParameter taskEClass_T = addETypeParameter(taskEClass, "T");
		ETypeParameter findingGroupEClass_T = addETypeParameter(findingGroupEClass, "T");
		ETypeParameter findingEClass_T = addETypeParameter(findingEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getGroupable());
		groupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getGroupable());
		memberEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getGroupable());
		groupableMemberedEClass_G.getEBounds().add(g1);
		g1 = createEGenericType(this.getMembered());
		groupableMemberedEClass_M.getEBounds().add(g1);
		g1 = createEGenericType(this.getGroupable());
		memberedGroupableEClass_G.getEBounds().add(g1);
		g1 = createEGenericType(this.getMembered());
		memberedGroupableEClass_M.getEBounds().add(g1);
		g1 = createEGenericType(this.getControlType());
		controlGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getControlType());
		controlEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSurfaceAreaType());
		surfaceAreaGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSurfaceAreaType());
		surfaceAreaEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getDataType());
		dataEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getDataType());
		dataGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSnippetType());
		snippetEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getFlowType());
		flowEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getFlowType());
		flowGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getFlowType());
		flowNodeEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getAssessmentType());
		assessmentEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getAssessmentType());
		assessmentGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getApplicationType());
		applicationEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getApplicationType());
		applicationGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSearchType());
		searchGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSearchType());
		searchEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSearchType());
		searchPatternEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getTaskType());
		taskGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getTaskType());
		taskEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getFindingType());
		findingGroupEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getFindingType());
		findingEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		examinableEClass.getESuperTypes().add(this.getNameable());
		provableEClass.getESuperTypes().add(this.getNameable());
		traceableEClass.getESuperTypes().add(this.getNameable());
		searchableEClass.getESuperTypes().add(this.getNameable());
		taskableEClass.getESuperTypes().add(this.getNameable());
		findableEClass.getESuperTypes().add(this.getNameable());
		memberedEClass.getESuperTypes().add(this.getGroupable());
		groupEClass.getESuperTypes().add(this.getNameable());
		memberEClass.getESuperTypes().add(this.getNameable());
		g1 = createEGenericType(this.getGroup());
		EGenericType g2 = createEGenericType(groupableMemberedEClass_G);
		g1.getETypeArguments().add(g2);
		groupableMemberedEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(groupableMemberedEClass_M);
		g1.getETypeArguments().add(g2);
		groupableMemberedEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(memberedGroupableEClass_G);
		g1.getETypeArguments().add(g2);
		memberedGroupableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGroup());
		g2 = createEGenericType(memberedGroupableEClass_M);
		g1.getETypeArguments().add(g2);
		memberedGroupableEClass.getEGenericSuperTypes().add(g1);
		controlTypeEClass.getESuperTypes().add(this.getGroupable());
		g1 = createEGenericType(this.getGroupableMembered());
		g2 = createEGenericType(controlGroupEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getApplicational());
		g1.getETypeArguments().add(g2);
		controlGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(controlEClass_T);
		g1.getETypeArguments().add(g2);
		controlEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExaminable());
		controlEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDescribable());
		controlEClass.getEGenericSuperTypes().add(g1);
		authenticationControlTypeEClass.getESuperTypes().add(this.getControlType());
		g1 = createEGenericType(this.getControlGroup());
		g2 = createEGenericType(this.getAuthenticationControlType());
		g1.getETypeArguments().add(g2);
		authenticationGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControl());
		g2 = createEGenericType(this.getAuthenticationControlType());
		g1.getETypeArguments().add(g2);
		authenticationEClass.getEGenericSuperTypes().add(g1);
		authorizationControlTypeEClass.getESuperTypes().add(this.getControlType());
		g1 = createEGenericType(this.getControlGroup());
		g2 = createEGenericType(this.getAuthorizationControlType());
		g1.getETypeArguments().add(g2);
		authorizationGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControl());
		g2 = createEGenericType(this.getAuthorizationControlType());
		g1.getETypeArguments().add(g2);
		authorizationEClass.getEGenericSuperTypes().add(g1);
		accountControlTypeEClass.getESuperTypes().add(this.getControlType());
		g1 = createEGenericType(this.getControlGroup());
		g2 = createEGenericType(this.getAccountControlType());
		g1.getETypeArguments().add(g2);
		accountGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControl());
		g2 = createEGenericType(this.getAccountControlType());
		g1.getETypeArguments().add(g2);
		accountEClass.getEGenericSuperTypes().add(g1);
		cryptographyControlTypeEClass.getESuperTypes().add(this.getControlType());
		g1 = createEGenericType(this.getControlGroup());
		g2 = createEGenericType(this.getCryptographyControlType());
		g1.getETypeArguments().add(g2);
		cryptographyGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControl());
		g2 = createEGenericType(this.getCryptographyControlType());
		g1.getETypeArguments().add(g2);
		cryptographyEClass.getEGenericSuperTypes().add(g1);
		outputEncodingControlTypeEClass.getESuperTypes().add(this.getControlType());
		g1 = createEGenericType(this.getControlGroup());
		g2 = createEGenericType(this.getOutputEncodingControlType());
		g1.getETypeArguments().add(g2);
		outputEncodingGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControl());
		g2 = createEGenericType(this.getOutputEncodingControlType());
		g1.getETypeArguments().add(g2);
		outputEncodingEClass.getEGenericSuperTypes().add(g1);
		genericControlTypeEClass.getESuperTypes().add(this.getControlType());
		g1 = createEGenericType(this.getControl());
		g2 = createEGenericType(this.getGenericControlType());
		g1.getETypeArguments().add(g2);
		genericControlEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getControlGroup());
		g2 = createEGenericType(this.getGenericControlType());
		g1.getETypeArguments().add(g2);
		genericControlGroupEClass.getEGenericSuperTypes().add(g1);
		surfaceAreaTypeEClass.getESuperTypes().add(this.getGroupable());
		g1 = createEGenericType(this.getGroupableMembered());
		g2 = createEGenericType(surfaceAreaGroupEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getApplicational());
		g1.getETypeArguments().add(g2);
		surfaceAreaGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(surfaceAreaEClass_T);
		g1.getETypeArguments().add(g2);
		surfaceAreaEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExaminable());
		surfaceAreaEClass.getEGenericSuperTypes().add(g1);
		networkIngressTypeEClass.getESuperTypes().add(this.getSurfaceAreaType());
		g1 = createEGenericType(this.getSurfaceArea());
		g2 = createEGenericType(this.getNetworkIngressType());
		g1.getETypeArguments().add(g2);
		networkIngressEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSurfaceAreaGroup());
		g2 = createEGenericType(this.getNetworkIngressType());
		g1.getETypeArguments().add(g2);
		networkIngressGroupEClass.getEGenericSuperTypes().add(g1);
		networkEgressTypeEClass.getESuperTypes().add(this.getSurfaceAreaType());
		g1 = createEGenericType(this.getSurfaceArea());
		g2 = createEGenericType(this.getNetworkEgressType());
		g1.getETypeArguments().add(g2);
		networkEgressEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSurfaceAreaGroup());
		g2 = createEGenericType(this.getNetworkEgressType());
		g1.getETypeArguments().add(g2);
		networkEgressGroupEClass.getEGenericSuperTypes().add(g1);
		dataTypeEClass.getESuperTypes().add(this.getGroupable());
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(dataEClass_T);
		g1.getETypeArguments().add(g2);
		dataEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getProvable());
		dataEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGroupableMembered());
		g2 = createEGenericType(dataGroupEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getApplicational());
		g1.getETypeArguments().add(g2);
		dataGroupEClass.getEGenericSuperTypes().add(g1);
		snippetEClass.getESuperTypes().add(this.getProvable());
		textSnippetTypeEClass.getESuperTypes().add(this.getSnippetType());
		g1 = createEGenericType(this.getSnippet());
		g2 = createEGenericType(this.getTextSnippetType());
		g1.getETypeArguments().add(g2);
		textSnippetEClass.getEGenericSuperTypes().add(g1);
		fileTypeEClass.getESuperTypes().add(this.getDataType());
		g1 = createEGenericType(this.getData());
		g2 = createEGenericType(this.getFileType());
		g1.getETypeArguments().add(g2);
		fileEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataGroup());
		g2 = createEGenericType(this.getFileType());
		g1.getETypeArguments().add(g2);
		fileGroupEClass.getEGenericSuperTypes().add(g1);
		requestTypeEClass.getESuperTypes().add(this.getDataType());
		g1 = createEGenericType(this.getData());
		g2 = createEGenericType(this.getRequestType());
		g1.getETypeArguments().add(g2);
		requestEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataGroup());
		g2 = createEGenericType(this.getRequestType());
		g1.getETypeArguments().add(g2);
		requestGroupEClass.getEGenericSuperTypes().add(g1);
		responseTypeEClass.getESuperTypes().add(this.getDataType());
		g1 = createEGenericType(this.getData());
		g2 = createEGenericType(this.getResponseType());
		g1.getETypeArguments().add(g2);
		responseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataGroup());
		g2 = createEGenericType(this.getResponseType());
		g1.getETypeArguments().add(g2);
		responseGroupEClass.getEGenericSuperTypes().add(g1);
		flowTypeEClass.getESuperTypes().add(this.getGroupable());
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(flowEClass_T);
		g1.getETypeArguments().add(g2);
		flowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceable());
		flowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGroupableMembered());
		g2 = createEGenericType(flowGroupEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getApplicational());
		g1.getETypeArguments().add(g2);
		flowGroupEClass.getEGenericSuperTypes().add(g1);
		flowNodeEClass.getESuperTypes().add(this.getTraceable());
		dataFlowTypeEClass.getESuperTypes().add(this.getFlowType());
		g1 = createEGenericType(this.getFlow());
		g2 = createEGenericType(this.getDataFlowType());
		g1.getETypeArguments().add(g2);
		dataFlowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType(this.getDataFlowType());
		g1.getETypeArguments().add(g2);
		dataFlowNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowGroup());
		g2 = createEGenericType(this.getDataFlowType());
		g1.getETypeArguments().add(g2);
		dataFlowGroupEClass.getEGenericSuperTypes().add(g1);
		dataFlowConstraintEClass.getESuperTypes().add(this.getDataFlowType());
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType(this.getDataFlowConstraint());
		g1.getETypeArguments().add(g2);
		endsWithEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType(this.getDataFlowConstraint());
		g1.getETypeArguments().add(g2);
		startsWithEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType(this.getDataFlowConstraint());
		g1.getETypeArguments().add(g2);
		matchesEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType(this.getDataFlowConstraint());
		g1.getETypeArguments().add(g2);
		containsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType(this.getDataFlowConstraint());
		g1.getETypeArguments().add(g2);
		castedToEClass.getEGenericSuperTypes().add(g1);
		controlFlowTypeEClass.getESuperTypes().add(this.getFlowType());
		g1 = createEGenericType(this.getFlow());
		g2 = createEGenericType(this.getControlFlowType());
		g1.getETypeArguments().add(g2);
		controlFlowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType(this.getControlFlowType());
		g1.getETypeArguments().add(g2);
		controlFlowNodeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowGroup());
		g2 = createEGenericType(this.getControlFlowType());
		g1.getETypeArguments().add(g2);
		controlFlowGroupEClass.getEGenericSuperTypes().add(g1);
		assessmentTypeEClass.getESuperTypes().add(this.getGroupable());
		assessableEClass.getESuperTypes().add(this.getMembered());
		g1 = createEGenericType(this.getMemberedGroupable());
		g2 = createEGenericType(assessmentEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getAssessable());
		g1.getETypeArguments().add(g2);
		assessmentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGroup());
		g2 = createEGenericType(assessmentGroupEClass_T);
		g1.getETypeArguments().add(g2);
		assessmentGroupEClass.getEGenericSuperTypes().add(g1);
		applicationAssessmentTypeEClass.getESuperTypes().add(this.getAssessmentType());
		g1 = createEGenericType(this.getAssessment());
		g2 = createEGenericType(this.getApplicationAssessmentType());
		g1.getETypeArguments().add(g2);
		applicationAssessmentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAssessmentGroup());
		g2 = createEGenericType(this.getApplicationAssessmentType());
		g1.getETypeArguments().add(g2);
		applicationAssessmentGroupEClass.getEGenericSuperTypes().add(g1);
		applicationTypeEClass.getESuperTypes().add(this.getGroupable());
		applicationalEClass.getESuperTypes().add(this.getMembered());
		g1 = createEGenericType(this.getMemberedGroupable());
		g2 = createEGenericType(applicationEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getApplicational());
		g1.getETypeArguments().add(g2);
		applicationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGroupableMembered());
		g2 = createEGenericType(applicationGroupEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getAssessable());
		g1.getETypeArguments().add(g2);
		applicationGroupEClass.getEGenericSuperTypes().add(g1);
		webApplicationTypeEClass.getESuperTypes().add(this.getApplicationType());
		g1 = createEGenericType(this.getApplication());
		g2 = createEGenericType(this.getWebApplicationType());
		g1.getETypeArguments().add(g2);
		webApplicationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getApplicationGroup());
		g2 = createEGenericType(this.getWebApplicationType());
		g1.getETypeArguments().add(g2);
		webApplicationGroupEClass.getEGenericSuperTypes().add(g1);
		searchTypeEClass.getESuperTypes().add(this.getGroupable());
		g1 = createEGenericType(this.getGroupableMembered());
		g2 = createEGenericType(searchGroupEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getApplicational());
		g1.getETypeArguments().add(g2);
		searchGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDescribable());
		searchGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(searchEClass_T);
		g1.getETypeArguments().add(g2);
		searchEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSearchable());
		searchEClass.getEGenericSuperTypes().add(g1);
		javaSearchTypeEClass.getESuperTypes().add(this.getSearchType());
		g1 = createEGenericType(this.getSearch());
		g2 = createEGenericType(this.getJavaSearchType());
		g1.getETypeArguments().add(g2);
		javaSearchEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSearchGroup());
		g2 = createEGenericType(this.getJavaSearchType());
		g1.getETypeArguments().add(g2);
		javaSearchGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSearchPattern());
		g2 = createEGenericType(this.getJavaSearchType());
		g1.getETypeArguments().add(g2);
		javaSearchPatternEClass.getEGenericSuperTypes().add(g1);
		taskTypeEClass.getESuperTypes().add(this.getGroupable());
		g1 = createEGenericType(this.getGroupableMembered());
		g2 = createEGenericType(taskGroupEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getAssessable());
		g1.getETypeArguments().add(g2);
		taskGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(taskEClass_T);
		g1.getETypeArguments().add(g2);
		taskEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTaskable());
		taskEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDescribable());
		taskEClass.getEGenericSuperTypes().add(g1);
		localTaskTypeEClass.getESuperTypes().add(this.getTaskType());
		g1 = createEGenericType(this.getTaskGroup());
		g2 = createEGenericType(this.getLocalTaskType());
		g1.getETypeArguments().add(g2);
		localTaskGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTask());
		g2 = createEGenericType(this.getLocalTaskType());
		g1.getETypeArguments().add(g2);
		localTaskEClass.getEGenericSuperTypes().add(g1);
		findingTypeEClass.getESuperTypes().add(this.getGroupable());
		g1 = createEGenericType(this.getGroupableMembered());
		g2 = createEGenericType(findingGroupEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getAssessable());
		g1.getETypeArguments().add(g2);
		findingGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(findingEClass_T);
		g1.getETypeArguments().add(g2);
		findingEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFindable());
		findingEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDescribable());
		findingEClass.getEGenericSuperTypes().add(g1);
		localFindingTypeEClass.getESuperTypes().add(this.getFindingType());
		g1 = createEGenericType(this.getFindingGroup());
		g2 = createEGenericType(this.getLocalFindingType());
		g1.getETypeArguments().add(g2);
		localFindingGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFinding());
		g2 = createEGenericType(this.getLocalFindingType());
		g1.getETypeArguments().add(g2);
		localFindingEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(nameableEClass, Nameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Nameable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describableEClass, Describable.class, "Describable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribable_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Describable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examinableEClass, Examinable.class, "Examinable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExaminable_Evidence(), this.getProvable(), this.getProvable_Examinees(), "evidence", null, 0, -1, Examinable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminable_Traces(), this.getTraceable(), this.getTraceable_Examinees(), "traces", null, 0, -1, Examinable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminable_Searches(), this.getSearchable(), this.getSearchable_Examinees(), "searches", null, 0, -1, Examinable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminable_Tasks(), this.getTaskable(), this.getTaskable_Examinees(), "tasks", null, 0, -1, Examinable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminable_Findings(), this.getFindable(), this.getFindable_Examinees(), "findings", null, 0, -1, Examinable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provableEClass, Provable.class, "Provable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvable_Examinees(), this.getExaminable(), this.getExaminable_Evidence(), "examinees", null, 0, -1, Provable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvable_Traces(), this.getTraceable(), this.getTraceable_Evidence(), "traces", null, 0, -1, Provable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceableEClass, Traceable.class, "Traceable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceable_Evidence(), this.getProvable(), this.getProvable_Traces(), "evidence", null, 0, -1, Traceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceable_Examinees(), this.getExaminable(), this.getExaminable_Traces(), "examinees", null, 0, -1, Traceable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchableEClass, Searchable.class, "Searchable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchable_Examinees(), this.getExaminable(), this.getExaminable_Searches(), "examinees", null, 0, 1, Searchable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskableEClass, Taskable.class, "Taskable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskable_Examinees(), this.getExaminable(), this.getExaminable_Tasks(), "examinees", null, 0, -1, Taskable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findableEClass, Findable.class, "Findable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFindable_Examinees(), this.getExaminable(), this.getExaminable_Findings(), "examinees", null, 0, -1, Findable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupableEClass, Groupable.class, "Groupable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberedEClass, Membered.class, "Membered", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType(groupEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getGroup_Members(), g1, this.getMember_Group(), "members", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getGroup());
		g2 = createEGenericType(memberEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getMember_Group(), g1, this.getGroup_Members(), "group", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupableMemberedEClass, GroupableMembered.class, "GroupableMembered", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberedGroupableEClass, MemberedGroupable.class, "MemberedGroupable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlTypeEClass, ControlType.class, "ControlType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlGroupEClass, ControlGroup.class, "ControlGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlEClass, Control.class, "Control", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Cwes(), this.getCWE(), this.getCWE_Controls(), "cwes", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cweGroupEClass, CWEGroup.class, "CWEGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCWEGroup_Cwes(), this.getCWE(), this.getCWE_CweGroup(), "cwes", null, 0, -1, CWEGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cweEClass, us.coastalhacking.semiotics.model.assessment.CWE.class, "CWE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCWE_CweGroup(), this.getCWEGroup(), this.getCWEGroup_Cwes(), "cweGroup", null, 0, 1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCWE_Id(), theEcorePackage.getEInt(), "id", null, 0, 1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCWE_Title(), theEcorePackage.getEString(), "title", null, 0, 1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCWE_Url(), theEcorePackage.getEString(), "url", null, 0, 1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getControl());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getControlType());
		g2.setEUpperBound(g3);
		initEReference(getCWE_Controls(), g1, this.getControl_Cwes(), "controls", null, 0, -1, us.coastalhacking.semiotics.model.assessment.CWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationControlTypeEClass, AuthenticationControlType.class, "AuthenticationControlType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationGroupEClass, AuthenticationGroup.class, "AuthenticationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationEClass, Authentication.class, "Authentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizationControlTypeEClass, AuthorizationControlType.class, "AuthorizationControlType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizationGroupEClass, AuthorizationGroup.class, "AuthorizationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizationEClass, Authorization.class, "Authorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accountControlTypeEClass, AccountControlType.class, "AccountControlType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accountGroupEClass, AccountGroup.class, "AccountGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_Username(), theEcorePackage.getEString(), "username", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_Password(), theEcorePackage.getEString(), "password", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cryptographyControlTypeEClass, CryptographyControlType.class, "CryptographyControlType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cryptographyGroupEClass, CryptographyGroup.class, "CryptographyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cryptographyEClass, Cryptography.class, "Cryptography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEncodingControlTypeEClass, OutputEncodingControlType.class, "OutputEncodingControlType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEncodingGroupEClass, OutputEncodingGroup.class, "OutputEncodingGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEncodingEClass, OutputEncoding.class, "OutputEncoding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericControlTypeEClass, GenericControlType.class, "GenericControlType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericControlEClass, GenericControl.class, "GenericControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericControlGroupEClass, GenericControlGroup.class, "GenericControlGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(surfaceAreaTypeEClass, SurfaceAreaType.class, "SurfaceAreaType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(surfaceAreaGroupEClass, SurfaceAreaGroup.class, "SurfaceAreaGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(surfaceAreaEClass, SurfaceArea.class, "SurfaceArea", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkIngressTypeEClass, NetworkIngressType.class, "NetworkIngressType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkIngressEClass, NetworkIngress.class, "NetworkIngress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkIngressGroupEClass, NetworkIngressGroup.class, "NetworkIngressGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEgressTypeEClass, NetworkEgressType.class, "NetworkEgressType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEgressEClass, NetworkEgress.class, "NetworkEgress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEgressGroupEClass, NetworkEgressGroup.class, "NetworkEgressGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getSnippet());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getSnippetType());
		g2.setEUpperBound(g3);
		initEReference(getData_Snippets(), g1, this.getSnippet_Data(), "snippets", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Data(), theEcorePackage.getEString(), "data", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataGroupEClass, DataGroup.class, "DataGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(snippetTypeEClass, SnippetType.class, "SnippetType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(snippetEClass, Snippet.class, "Snippet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getData());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getDataType());
		g2.setEUpperBound(g3);
		initEReference(getSnippet_Data(), g1, this.getData_Snippets(), "data", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textSnippetTypeEClass, TextSnippetType.class, "TextSnippetType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textSnippetEClass, TextSnippet.class, "TextSnippet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextSnippet_Offset(), theEcorePackage.getEInt(), "offset", null, 0, 1, TextSnippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextSnippet_Length(), theEcorePackage.getEInt(), "length", null, 0, 1, TextSnippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextSnippet_Text(), theEcorePackage.getEString(), "text", null, 0, 1, TextSnippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileTypeEClass, FileType.class, "FileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_FullPath(), theEcorePackage.getEString(), "fullPath", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileGroupEClass, FileGroup.class, "FileGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestTypeEClass, RequestType.class, "RequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Response(), this.getResponse(), this.getResponse_Request(), "response", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestGroupEClass, RequestGroup.class, "RequestGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseTypeEClass, ResponseType.class, "ResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_Request(), this.getRequest(), this.getRequest_Response(), "request", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseGroupEClass, ResponseGroup.class, "ResponseGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowTypeEClass, FlowType.class, "FlowType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlow_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getFlowType());
		g2.setEUpperBound(g3);
		initEReference(getFlow_Flows(), g1, this.getFlowNode_FlowRoot(), "flows", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowGroupEClass, FlowGroup.class, "FlowGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowNodeEClass, FlowNode.class, "FlowNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getFlowType());
		g2.setEUpperBound(g3);
		initEReference(getFlowNode_FlowFrom(), g1, this.getFlowNode_FlowTo(), "flowFrom", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getFlow());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getFlowType());
		g2.setEUpperBound(g3);
		initEReference(getFlowNode_FlowRoot(), g1, this.getFlow_Flows(), "flowRoot", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getFlowNode());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getFlowType());
		g2.setEUpperBound(g3);
		initEReference(getFlowNode_FlowTo(), g1, this.getFlowNode_FlowFrom(), "flowTo", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowTypeEClass, DataFlowType.class, "DataFlowType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFlow_SourceType(), this.getDataTaintType(), "sourceType", null, 0, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowNodeEClass, DataFlowNode.class, "DataFlowNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowGroupEClass, DataFlowGroup.class, "DataFlowGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowConstraintEClass, DataFlowConstraint.class, "DataFlowConstraint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(controlFlowTypeEClass, ControlFlowType.class, "ControlFlowType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlFlowNodeEClass, ControlFlowNode.class, "ControlFlowNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlFlowGroupEClass, ControlFlowGroup.class, "ControlFlowGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assessmentTypeEClass, AssessmentType.class, "AssessmentType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assessableEClass, Assessable.class, "Assessable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assessmentEClass, Assessment.class, "Assessment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssessment_Properties(), this.getProperty(), null, "properties", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assessmentGroupEClass, AssessmentGroup.class, "AssessmentGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationAssessmentTypeEClass, ApplicationAssessmentType.class, "ApplicationAssessmentType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationAssessmentEClass, ApplicationAssessment.class, "ApplicationAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationAssessmentGroupEClass, ApplicationAssessmentGroup.class, "ApplicationAssessmentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationTypeEClass, ApplicationType.class, "ApplicationType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationalEClass, Applicational.class, "Applicational", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationEClass, Application.class, "Application", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationGroupEClass, ApplicationGroup.class, "ApplicationGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webApplicationTypeEClass, WebApplicationType.class, "WebApplicationType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webApplicationEClass, WebApplication.class, "WebApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebApplication_InternalURL(), theEcorePackage.getEString(), "internalURL", null, 0, 1, WebApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebApplication_ExternalURL(), theEcorePackage.getEString(), "externalURL", null, 0, 1, WebApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webApplicationGroupEClass, WebApplicationGroup.class, "WebApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchTypeEClass, SearchType.class, "SearchType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchGroupEClass, SearchGroup.class, "SearchGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchGroup_SearchResultCWEs(), this.getCWE(), null, "searchResultCWEs", null, 0, -1, SearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchEClass, Search.class, "Search", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getSearchPattern());
		g2 = createEGenericType(searchEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getSearch_Pattern(), g1, null, "pattern", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchPatternEClass, SearchPattern.class, "SearchPattern", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchPattern_Pattern(), theEcorePackage.getEString(), "pattern", null, 0, 1, SearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaSearchTypeEClass, JavaSearchType.class, "JavaSearchType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaSearchEClass, JavaSearch.class, "JavaSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaSearchGroupEClass, JavaSearchGroup.class, "JavaSearchGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaSearchPatternEClass, JavaSearchPattern.class, "JavaSearchPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaSearchPattern_PatternType(), this.getJavaSearchPatternType(), "patternType", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaSearchPattern_SearchFor(), this.getJavaSearchFor(), "searchFor", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaSearchPattern_LimitTo(), this.getJavaLimitTo(), "limitTo", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaSearchPattern_MatchRule(), this.getJavaMatchRule(), "matchRule", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaSearchPattern_CaseSensitivity(), this.getJavaMatchCaseSensitivity(), "caseSensitivity", null, 0, 1, JavaSearchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeEClass, TaskType.class, "TaskType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskGroupEClass, TaskGroup.class, "TaskGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_TaskStatus(), this.getTaskStatus(), "taskStatus", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localTaskTypeEClass, LocalTaskType.class, "LocalTaskType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localTaskGroupEClass, LocalTaskGroup.class, "LocalTaskGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localTaskEClass, LocalTask.class, "LocalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(findingTypeEClass, FindingType.class, "FindingType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(findingGroupEClass, FindingGroup.class, "FindingGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(findingEClass, Finding.class, "Finding", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinding_Details(), theEcorePackage.getEString(), "details", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Remediation(), theEcorePackage.getEString(), "remediation", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Reproducer(), theEcorePackage.getEString(), "reproducer", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_References(), theEcorePackage.getEString(), "references", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localFindingTypeEClass, LocalFindingType.class, "LocalFindingType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localFindingGroupEClass, LocalFindingGroup.class, "LocalFindingGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localFindingEClass, LocalFinding.class, "LocalFinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dataTaintTypeEEnum, DataTaintType.class, "DataTaintType");
		addEEnumLiteral(dataTaintTypeEEnum, DataTaintType.HTTP);
		addEEnumLiteral(dataTaintTypeEEnum, DataTaintType.HTTPS);
		addEEnumLiteral(dataTaintTypeEEnum, DataTaintType.GENERIC_NETWORK);
		addEEnumLiteral(dataTaintTypeEEnum, DataTaintType.FILE);
		addEEnumLiteral(dataTaintTypeEEnum, DataTaintType.CONSOLE);
		addEEnumLiteral(dataTaintTypeEEnum, DataTaintType.OTHER);

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

		initEEnum(taskStatusEEnum, TaskStatus.class, "TaskStatus");
		addEEnumLiteral(taskStatusEEnum, TaskStatus.TODO);
		addEEnumLiteral(taskStatusEEnum, TaskStatus.IN_PROGRESS);
		addEEnumLiteral(taskStatusEEnum, TaskStatus.COMPLETED);
		addEEnumLiteral(taskStatusEEnum, TaskStatus.SKIPPED);

		// Create resource
		createResource(eNS_URI);
	}

} //AssessmentPackageImpl
