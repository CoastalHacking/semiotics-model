/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import us.coastalhacking.semiotics.model.assessment.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage
 * @generated
 */
public class AssessmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssessmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssessmentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSwitch<Adapter> modelSwitch =
		new AssessmentSwitch<Adapter>() {
			@Override
			public Adapter caseNameable(Nameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter caseDescribable(Describable object) {
				return createDescribableAdapter();
			}
			@Override
			public Adapter caseExaminable(Examinable object) {
				return createExaminableAdapter();
			}
			@Override
			public Adapter caseProvable(Provable object) {
				return createProvableAdapter();
			}
			@Override
			public Adapter caseTraceable(Traceable object) {
				return createTraceableAdapter();
			}
			@Override
			public Adapter caseSearchable(Searchable object) {
				return createSearchableAdapter();
			}
			@Override
			public Adapter caseTaskable(Taskable object) {
				return createTaskableAdapter();
			}
			@Override
			public Adapter caseFindable(Findable object) {
				return createFindableAdapter();
			}
			@Override
			public Adapter caseGroupable(Groupable object) {
				return createGroupableAdapter();
			}
			@Override
			public Adapter caseMembered(Membered object) {
				return createMemberedAdapter();
			}
			@Override
			public <T extends Groupable> Adapter caseGroup(Group<T> object) {
				return createGroupAdapter();
			}
			@Override
			public <T extends Groupable> Adapter caseMember(Member<T> object) {
				return createMemberAdapter();
			}
			@Override
			public <G extends Groupable, M extends Membered> Adapter caseGroupableMembered(GroupableMembered<G, M> object) {
				return createGroupableMemberedAdapter();
			}
			@Override
			public <G extends Groupable, M extends Membered> Adapter caseMemberedGroupable(MemberedGroupable<G, M> object) {
				return createMemberedGroupableAdapter();
			}
			@Override
			public Adapter caseControlType(ControlType object) {
				return createControlTypeAdapter();
			}
			@Override
			public <T extends ControlType> Adapter caseControlGroup(ControlGroup<T> object) {
				return createControlGroupAdapter();
			}
			@Override
			public <T extends ControlType> Adapter caseControl(Control<T> object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseCWEGroup(CWEGroup object) {
				return createCWEGroupAdapter();
			}
			@Override
			public Adapter caseCWE(CWE object) {
				return createCWEAdapter();
			}
			@Override
			public Adapter caseAuthenticationControlType(AuthenticationControlType object) {
				return createAuthenticationControlTypeAdapter();
			}
			@Override
			public Adapter caseAuthenticationGroup(AuthenticationGroup object) {
				return createAuthenticationGroupAdapter();
			}
			@Override
			public Adapter caseAuthentication(Authentication object) {
				return createAuthenticationAdapter();
			}
			@Override
			public Adapter caseAuthorizationControlType(AuthorizationControlType object) {
				return createAuthorizationControlTypeAdapter();
			}
			@Override
			public Adapter caseAuthorizationGroup(AuthorizationGroup object) {
				return createAuthorizationGroupAdapter();
			}
			@Override
			public Adapter caseAuthorization(Authorization object) {
				return createAuthorizationAdapter();
			}
			@Override
			public Adapter caseAccountControlType(AccountControlType object) {
				return createAccountControlTypeAdapter();
			}
			@Override
			public Adapter caseAccountGroup(AccountGroup object) {
				return createAccountGroupAdapter();
			}
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseCryptographyControlType(CryptographyControlType object) {
				return createCryptographyControlTypeAdapter();
			}
			@Override
			public Adapter caseCryptographyGroup(CryptographyGroup object) {
				return createCryptographyGroupAdapter();
			}
			@Override
			public Adapter caseCryptography(Cryptography object) {
				return createCryptographyAdapter();
			}
			@Override
			public Adapter caseOutputEncodingControlType(OutputEncodingControlType object) {
				return createOutputEncodingControlTypeAdapter();
			}
			@Override
			public Adapter caseOutputEncodingGroup(OutputEncodingGroup object) {
				return createOutputEncodingGroupAdapter();
			}
			@Override
			public Adapter caseOutputEncoding(OutputEncoding object) {
				return createOutputEncodingAdapter();
			}
			@Override
			public Adapter caseGenericControlType(GenericControlType object) {
				return createGenericControlTypeAdapter();
			}
			@Override
			public Adapter caseGenericControl(GenericControl object) {
				return createGenericControlAdapter();
			}
			@Override
			public Adapter caseGenericControlGroup(GenericControlGroup object) {
				return createGenericControlGroupAdapter();
			}
			@Override
			public Adapter caseSurfaceAreaType(SurfaceAreaType object) {
				return createSurfaceAreaTypeAdapter();
			}
			@Override
			public <T extends SurfaceAreaType> Adapter caseSurfaceAreaGroup(SurfaceAreaGroup<T> object) {
				return createSurfaceAreaGroupAdapter();
			}
			@Override
			public <T extends SurfaceAreaType> Adapter caseSurfaceArea(SurfaceArea<T> object) {
				return createSurfaceAreaAdapter();
			}
			@Override
			public Adapter caseNetworkIngressType(NetworkIngressType object) {
				return createNetworkIngressTypeAdapter();
			}
			@Override
			public Adapter caseNetworkIngress(NetworkIngress object) {
				return createNetworkIngressAdapter();
			}
			@Override
			public Adapter caseNetworkIngressGroup(NetworkIngressGroup object) {
				return createNetworkIngressGroupAdapter();
			}
			@Override
			public Adapter caseNetworkEgressType(NetworkEgressType object) {
				return createNetworkEgressTypeAdapter();
			}
			@Override
			public Adapter caseNetworkEgress(NetworkEgress object) {
				return createNetworkEgressAdapter();
			}
			@Override
			public Adapter caseNetworkEgressGroup(NetworkEgressGroup object) {
				return createNetworkEgressGroupAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public <T extends DataType> Adapter caseData(Data<T> object) {
				return createDataAdapter();
			}
			@Override
			public <T extends DataType> Adapter caseDataGroup(DataGroup<T> object) {
				return createDataGroupAdapter();
			}
			@Override
			public Adapter caseSnippetType(SnippetType object) {
				return createSnippetTypeAdapter();
			}
			@Override
			public <T extends SnippetType> Adapter caseSnippet(Snippet<T> object) {
				return createSnippetAdapter();
			}
			@Override
			public Adapter caseTextSnippetType(TextSnippetType object) {
				return createTextSnippetTypeAdapter();
			}
			@Override
			public Adapter caseTextSnippet(TextSnippet object) {
				return createTextSnippetAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseFileGroup(FileGroup object) {
				return createFileGroupAdapter();
			}
			@Override
			public Adapter caseRequestType(RequestType object) {
				return createRequestTypeAdapter();
			}
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseRequestGroup(RequestGroup object) {
				return createRequestGroupAdapter();
			}
			@Override
			public Adapter caseResponseType(ResponseType object) {
				return createResponseTypeAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseResponseGroup(ResponseGroup object) {
				return createResponseGroupAdapter();
			}
			@Override
			public Adapter caseFlowType(FlowType object) {
				return createFlowTypeAdapter();
			}
			@Override
			public <T extends FlowType> Adapter caseFlow(Flow<T> object) {
				return createFlowAdapter();
			}
			@Override
			public <T extends FlowType> Adapter caseFlowGroup(FlowGroup<T> object) {
				return createFlowGroupAdapter();
			}
			@Override
			public <T extends FlowType> Adapter caseFlowNode(FlowNode<T> object) {
				return createFlowNodeAdapter();
			}
			@Override
			public Adapter caseDataFlowType(DataFlowType object) {
				return createDataFlowTypeAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseDataFlowNode(DataFlowNode object) {
				return createDataFlowNodeAdapter();
			}
			@Override
			public Adapter caseDataFlowGroup(DataFlowGroup object) {
				return createDataFlowGroupAdapter();
			}
			@Override
			public Adapter caseDataFlowConstraint(DataFlowConstraint object) {
				return createDataFlowConstraintAdapter();
			}
			@Override
			public Adapter caseEndsWith(EndsWith object) {
				return createEndsWithAdapter();
			}
			@Override
			public Adapter caseStartsWith(StartsWith object) {
				return createStartsWithAdapter();
			}
			@Override
			public Adapter caseMatches(Matches object) {
				return createMatchesAdapter();
			}
			@Override
			public Adapter caseContains(Contains object) {
				return createContainsAdapter();
			}
			@Override
			public Adapter caseCastedTo(CastedTo object) {
				return createCastedToAdapter();
			}
			@Override
			public Adapter caseControlFlowType(ControlFlowType object) {
				return createControlFlowTypeAdapter();
			}
			@Override
			public Adapter caseControlFlow(ControlFlow object) {
				return createControlFlowAdapter();
			}
			@Override
			public Adapter caseControlFlowNode(ControlFlowNode object) {
				return createControlFlowNodeAdapter();
			}
			@Override
			public Adapter caseControlFlowGroup(ControlFlowGroup object) {
				return createControlFlowGroupAdapter();
			}
			@Override
			public Adapter caseAssessmentType(AssessmentType object) {
				return createAssessmentTypeAdapter();
			}
			@Override
			public Adapter caseAssessable(Assessable object) {
				return createAssessableAdapter();
			}
			@Override
			public <T extends AssessmentType> Adapter caseAssessment(Assessment<T> object) {
				return createAssessmentAdapter();
			}
			@Override
			public <T extends AssessmentType> Adapter caseAssessmentGroup(AssessmentGroup<T> object) {
				return createAssessmentGroupAdapter();
			}
			@Override
			public Adapter caseApplicationAssessmentType(ApplicationAssessmentType object) {
				return createApplicationAssessmentTypeAdapter();
			}
			@Override
			public Adapter caseApplicationAssessment(ApplicationAssessment object) {
				return createApplicationAssessmentAdapter();
			}
			@Override
			public Adapter caseApplicationAssessmentGroup(ApplicationAssessmentGroup object) {
				return createApplicationAssessmentGroupAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseApplicationType(ApplicationType object) {
				return createApplicationTypeAdapter();
			}
			@Override
			public Adapter caseApplicational(Applicational object) {
				return createApplicationalAdapter();
			}
			@Override
			public <T extends ApplicationType> Adapter caseApplication(Application<T> object) {
				return createApplicationAdapter();
			}
			@Override
			public <T extends ApplicationType> Adapter caseApplicationGroup(ApplicationGroup<T> object) {
				return createApplicationGroupAdapter();
			}
			@Override
			public Adapter caseWebApplicationType(WebApplicationType object) {
				return createWebApplicationTypeAdapter();
			}
			@Override
			public Adapter caseWebApplication(WebApplication object) {
				return createWebApplicationAdapter();
			}
			@Override
			public Adapter caseWebApplicationGroup(WebApplicationGroup object) {
				return createWebApplicationGroupAdapter();
			}
			@Override
			public Adapter caseSearchType(SearchType object) {
				return createSearchTypeAdapter();
			}
			@Override
			public <T extends SearchType> Adapter caseSearchGroup(SearchGroup<T> object) {
				return createSearchGroupAdapter();
			}
			@Override
			public <T extends SearchType> Adapter caseSearch(Search<T> object) {
				return createSearchAdapter();
			}
			@Override
			public <T extends SearchType> Adapter caseSearchPattern(SearchPattern<T> object) {
				return createSearchPatternAdapter();
			}
			@Override
			public Adapter caseJavaSearchType(JavaSearchType object) {
				return createJavaSearchTypeAdapter();
			}
			@Override
			public Adapter caseJavaSearch(JavaSearch object) {
				return createJavaSearchAdapter();
			}
			@Override
			public Adapter caseJavaSearchGroup(JavaSearchGroup object) {
				return createJavaSearchGroupAdapter();
			}
			@Override
			public Adapter caseJavaSearchPattern(JavaSearchPattern object) {
				return createJavaSearchPatternAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public <T extends TaskType> Adapter caseTaskGroup(TaskGroup<T> object) {
				return createTaskGroupAdapter();
			}
			@Override
			public <T extends TaskType> Adapter caseTask(Task<T> object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseLocalTaskType(LocalTaskType object) {
				return createLocalTaskTypeAdapter();
			}
			@Override
			public Adapter caseLocalTaskGroup(LocalTaskGroup object) {
				return createLocalTaskGroupAdapter();
			}
			@Override
			public Adapter caseLocalTask(LocalTask object) {
				return createLocalTaskAdapter();
			}
			@Override
			public Adapter caseFindingType(FindingType object) {
				return createFindingTypeAdapter();
			}
			@Override
			public <T extends FindingType> Adapter caseFindingGroup(FindingGroup<T> object) {
				return createFindingGroupAdapter();
			}
			@Override
			public <T extends FindingType> Adapter caseFinding(Finding<T> object) {
				return createFindingAdapter();
			}
			@Override
			public Adapter caseLocalFindingType(LocalFindingType object) {
				return createLocalFindingTypeAdapter();
			}
			@Override
			public Adapter caseLocalFindingGroup(LocalFindingGroup object) {
				return createLocalFindingGroupAdapter();
			}
			@Override
			public Adapter caseLocalFinding(LocalFinding object) {
				return createLocalFindingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Nameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Describable <em>Describable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Describable
	 * @generated
	 */
	public Adapter createDescribableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Examinable <em>Examinable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable
	 * @generated
	 */
	public Adapter createExaminableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Provable <em>Provable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Provable
	 * @generated
	 */
	public Adapter createProvableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Traceable <em>Traceable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable
	 * @generated
	 */
	public Adapter createTraceableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Searchable <em>Searchable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Searchable
	 * @generated
	 */
	public Adapter createSearchableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Taskable <em>Taskable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Taskable
	 * @generated
	 */
	public Adapter createTaskableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Findable <em>Findable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Findable
	 * @generated
	 */
	public Adapter createFindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Groupable <em>Groupable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Groupable
	 * @generated
	 */
	public Adapter createGroupableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Membered <em>Membered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Membered
	 * @generated
	 */
	public Adapter createMemberedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.GroupableMembered <em>Groupable Membered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.GroupableMembered
	 * @generated
	 */
	public Adapter createGroupableMemberedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.MemberedGroupable <em>Membered Groupable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.MemberedGroupable
	 * @generated
	 */
	public Adapter createMemberedGroupableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlType
	 * @generated
	 */
	public Adapter createControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlGroup
	 * @generated
	 */
	public Adapter createControlGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.CWEGroup <em>CWE Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.CWEGroup
	 * @generated
	 */
	public Adapter createCWEGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.CWE <em>CWE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.CWE
	 * @generated
	 */
	public Adapter createCWEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.AuthenticationControlType <em>Authentication Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.AuthenticationControlType
	 * @generated
	 */
	public Adapter createAuthenticationControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.AuthenticationGroup <em>Authentication Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.AuthenticationGroup
	 * @generated
	 */
	public Adapter createAuthenticationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Authentication
	 * @generated
	 */
	public Adapter createAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.AuthorizationControlType <em>Authorization Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.AuthorizationControlType
	 * @generated
	 */
	public Adapter createAuthorizationControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.AuthorizationGroup <em>Authorization Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.AuthorizationGroup
	 * @generated
	 */
	public Adapter createAuthorizationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Authorization
	 * @generated
	 */
	public Adapter createAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.AccountControlType <em>Account Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.AccountControlType
	 * @generated
	 */
	public Adapter createAccountControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.AccountGroup <em>Account Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.AccountGroup
	 * @generated
	 */
	public Adapter createAccountGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.CryptographyControlType <em>Cryptography Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.CryptographyControlType
	 * @generated
	 */
	public Adapter createCryptographyControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.CryptographyGroup <em>Cryptography Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.CryptographyGroup
	 * @generated
	 */
	public Adapter createCryptographyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Cryptography <em>Cryptography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Cryptography
	 * @generated
	 */
	public Adapter createCryptographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType <em>Output Encoding Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType
	 * @generated
	 */
	public Adapter createOutputEncodingControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.OutputEncodingGroup <em>Output Encoding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.OutputEncodingGroup
	 * @generated
	 */
	public Adapter createOutputEncodingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.OutputEncoding <em>Output Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.OutputEncoding
	 * @generated
	 */
	public Adapter createOutputEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.GenericControlType <em>Generic Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.GenericControlType
	 * @generated
	 */
	public Adapter createGenericControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.GenericControl <em>Generic Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.GenericControl
	 * @generated
	 */
	public Adapter createGenericControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.GenericControlGroup <em>Generic Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.GenericControlGroup
	 * @generated
	 */
	public Adapter createGenericControlGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.SurfaceAreaType <em>Surface Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceAreaType
	 * @generated
	 */
	public Adapter createSurfaceAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup <em>Surface Area Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup
	 * @generated
	 */
	public Adapter createSurfaceAreaGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.SurfaceArea <em>Surface Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceArea
	 * @generated
	 */
	public Adapter createSurfaceAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.NetworkIngressType <em>Network Ingress Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkIngressType
	 * @generated
	 */
	public Adapter createNetworkIngressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.NetworkIngress <em>Network Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkIngress
	 * @generated
	 */
	public Adapter createNetworkIngressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.NetworkIngressGroup <em>Network Ingress Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkIngressGroup
	 * @generated
	 */
	public Adapter createNetworkIngressGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.NetworkEgressType <em>Network Egress Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkEgressType
	 * @generated
	 */
	public Adapter createNetworkEgressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.NetworkEgress <em>Network Egress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkEgress
	 * @generated
	 */
	public Adapter createNetworkEgressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.NetworkEgressGroup <em>Network Egress Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkEgressGroup
	 * @generated
	 */
	public Adapter createNetworkEgressGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataGroup <em>Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataGroup
	 * @generated
	 */
	public Adapter createDataGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.SnippetType <em>Snippet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.SnippetType
	 * @generated
	 */
	public Adapter createSnippetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Snippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Snippet
	 * @generated
	 */
	public Adapter createSnippetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.TextSnippetType <em>Text Snippet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.TextSnippetType
	 * @generated
	 */
	public Adapter createTextSnippetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.TextSnippet <em>Text Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.TextSnippet
	 * @generated
	 */
	public Adapter createTextSnippetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FileGroup <em>File Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FileGroup
	 * @generated
	 */
	public Adapter createFileGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.RequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.RequestType
	 * @generated
	 */
	public Adapter createRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.RequestGroup <em>Request Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.RequestGroup
	 * @generated
	 */
	public Adapter createRequestGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ResponseType
	 * @generated
	 */
	public Adapter createResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ResponseGroup <em>Response Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ResponseGroup
	 * @generated
	 */
	public Adapter createResponseGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FlowType <em>Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowType
	 * @generated
	 */
	public Adapter createFlowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FlowGroup <em>Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowGroup
	 * @generated
	 */
	public Adapter createFlowGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowType <em>Data Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowType
	 * @generated
	 */
	public Adapter createDataFlowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowNode <em>Data Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowNode
	 * @generated
	 */
	public Adapter createDataFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowGroup <em>Data Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowGroup
	 * @generated
	 */
	public Adapter createDataFlowGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowConstraint <em>Data Flow Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowConstraint
	 * @generated
	 */
	public Adapter createDataFlowConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.EndsWith <em>Ends With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.EndsWith
	 * @generated
	 */
	public Adapter createEndsWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.StartsWith <em>Starts With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.StartsWith
	 * @generated
	 */
	public Adapter createStartsWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Matches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Matches
	 * @generated
	 */
	public Adapter createMatchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Contains
	 * @generated
	 */
	public Adapter createContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.CastedTo <em>Casted To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.CastedTo
	 * @generated
	 */
	public Adapter createCastedToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowType <em>Control Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowType
	 * @generated
	 */
	public Adapter createControlFlowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowNode <em>Control Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowNode
	 * @generated
	 */
	public Adapter createControlFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowGroup <em>Control Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowGroup
	 * @generated
	 */
	public Adapter createControlFlowGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.AssessmentType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentType
	 * @generated
	 */
	public Adapter createAssessmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Assessable <em>Assessable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Assessable
	 * @generated
	 */
	public Adapter createAssessableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Assessment
	 * @generated
	 */
	public Adapter createAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.AssessmentGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentGroup
	 * @generated
	 */
	public Adapter createAssessmentGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType <em>Application Assessment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType
	 * @generated
	 */
	public Adapter createApplicationAssessmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationAssessment <em>Application Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationAssessment
	 * @generated
	 */
	public Adapter createApplicationAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentGroup <em>Application Assessment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentGroup
	 * @generated
	 */
	public Adapter createApplicationAssessmentGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationType
	 * @generated
	 */
	public Adapter createApplicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Applicational <em>Applicational</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Applicational
	 * @generated
	 */
	public Adapter createApplicationalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationGroup
	 * @generated
	 */
	public Adapter createApplicationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.WebApplicationType <em>Web Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplicationType
	 * @generated
	 */
	public Adapter createWebApplicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplication
	 * @generated
	 */
	public Adapter createWebApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.WebApplicationGroup <em>Web Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplicationGroup
	 * @generated
	 */
	public Adapter createWebApplicationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.SearchType <em>Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchType
	 * @generated
	 */
	public Adapter createSearchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup <em>Search Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchGroup
	 * @generated
	 */
	public Adapter createSearchGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Search
	 * @generated
	 */
	public Adapter createSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.SearchPattern <em>Search Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchPattern
	 * @generated
	 */
	public Adapter createSearchPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchType <em>Java Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchType
	 * @generated
	 */
	public Adapter createJavaSearchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.JavaSearch <em>Java Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearch
	 * @generated
	 */
	public Adapter createJavaSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchGroup <em>Java Search Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchGroup
	 * @generated
	 */
	public Adapter createJavaSearchGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern <em>Java Search Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPattern
	 * @generated
	 */
	public Adapter createJavaSearchPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.TaskGroup
	 * @generated
	 */
	public Adapter createTaskGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.LocalTaskType <em>Local Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalTaskType
	 * @generated
	 */
	public Adapter createLocalTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.LocalTaskGroup <em>Local Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalTaskGroup
	 * @generated
	 */
	public Adapter createLocalTaskGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.LocalTask <em>Local Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalTask
	 * @generated
	 */
	public Adapter createLocalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FindingType <em>Finding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FindingType
	 * @generated
	 */
	public Adapter createFindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FindingGroup <em>Finding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FindingGroup
	 * @generated
	 */
	public Adapter createFindingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Finding
	 * @generated
	 */
	public Adapter createFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.LocalFindingType <em>Local Finding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalFindingType
	 * @generated
	 */
	public Adapter createLocalFindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.LocalFindingGroup <em>Local Finding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalFindingGroup
	 * @generated
	 */
	public Adapter createLocalFindingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.LocalFinding <em>Local Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalFinding
	 * @generated
	 */
	public Adapter createLocalFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AssessmentAdapterFactory
