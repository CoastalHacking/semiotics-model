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
			public Adapter caseReviewable(Reviewable object) {
				return createReviewableAdapter();
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
			public Adapter caseControlGroup(ControlGroup object) {
				return createControlGroupAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
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
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseDataGroup(DataGroup object) {
				return createDataGroupAdapter();
			}
			@Override
			public Adapter caseSnippet(Snippet object) {
				return createSnippetAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseFlowSource(FlowSource object) {
				return createFlowSourceAdapter();
			}
			@Override
			public Adapter caseFlowSink(FlowSink object) {
				return createFlowSinkAdapter();
			}
			@Override
			public Adapter caseFlowGroup(FlowGroup object) {
				return createFlowGroupAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseDataFlowSource(DataFlowSource object) {
				return createDataFlowSourceAdapter();
			}
			@Override
			public Adapter caseDataFlowSink(DataFlowSink object) {
				return createDataFlowSinkAdapter();
			}
			@Override
			public Adapter caseFlowConstraint(FlowConstraint object) {
				return createFlowConstraintAdapter();
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
			public Adapter caseControlFlow(ControlFlow object) {
				return createControlFlowAdapter();
			}
			@Override
			public Adapter caseControlFlowSource(ControlFlowSource object) {
				return createControlFlowSourceAdapter();
			}
			@Override
			public Adapter caseControlFlowSink(ControlFlowSink object) {
				return createControlFlowSinkAdapter();
			}
			@Override
			public Adapter caseAssessment(Assessment object) {
				return createAssessmentAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseApplicationGroup(ApplicationGroup object) {
				return createApplicationGroupAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseSearchGroup(SearchGroup object) {
				return createSearchGroupAdapter();
			}
			@Override
			public Adapter caseSearch(Search object) {
				return createSearchAdapter();
			}
			@Override
			public Adapter caseSearchPattern(SearchPattern object) {
				return createSearchPatternAdapter();
			}
			@Override
			public Adapter caseJavaSearchPattern(JavaSearchPattern object) {
				return createJavaSearchPatternAdapter();
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
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.Reviewable <em>Reviewable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable
	 * @generated
	 */
	public Adapter createReviewableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FlowSource <em>Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowSource
	 * @generated
	 */
	public Adapter createFlowSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FlowSink <em>Flow Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowSink
	 * @generated
	 */
	public Adapter createFlowSinkAdapter() {
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
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowSource <em>Data Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowSource
	 * @generated
	 */
	public Adapter createDataFlowSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowSink <em>Data Flow Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowSink
	 * @generated
	 */
	public Adapter createDataFlowSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.FlowConstraint <em>Flow Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowConstraint
	 * @generated
	 */
	public Adapter createFlowConstraintAdapter() {
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
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowSource <em>Control Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowSource
	 * @generated
	 */
	public Adapter createControlFlowSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowSink <em>Control Flow Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowSink
	 * @generated
	 */
	public Adapter createControlFlowSinkAdapter() {
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
