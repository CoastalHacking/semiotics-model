/**
 */
package us.coastalhacking.semiotics.model.flow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import us.coastalhacking.semiotics.model.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.flow.FlowFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/us.coastalhacking.semiotics.model.flow.edit/src-gen' forceOverwrite='true' basePackage='us.coastalhacking.semiotics.model'"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "us.coastalhacking.semiotics.model.flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = BasePackage.TRACEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EVIDENCE = BasePackage.TRACEABLE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__REVIEWERS = BasePackage.TRACEABLE__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW_FROM = BasePackage.TRACEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW_TO = BasePackage.TRACEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = BasePackage.TRACEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = BasePackage.TRACEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowSourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowSourceImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlowSource()
	 * @generated
	 */
	int FLOW_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__EVIDENCE = FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__REVIEWERS = FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__FLOW_FROM = FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__FLOW_TO = FLOW__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Flow Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__FLOW_GROUP = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowSinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowSinkImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlowSink()
	 * @generated
	 */
	int FLOW_SINK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK__EVIDENCE = FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK__REVIEWERS = FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK__FLOW_FROM = FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK__FLOW_TO = FLOW__FLOW_TO;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowGroupImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlowGroup()
	 * @generated
	 */
	int FLOW_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP__NAME = BasePackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Flow Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP__FLOW_SOURCES = BasePackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP_FEATURE_COUNT = BasePackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP_OPERATION_COUNT = BasePackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.DataFlowImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__EVIDENCE = FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__REVIEWERS = FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__FLOW_FROM = FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__FLOW_TO = FLOW__FLOW_TO;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowSourceImpl <em>Data Flow Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.DataFlowSourceImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataFlowSource()
	 * @generated
	 */
	int DATA_FLOW_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE__NAME = DATA_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE__EVIDENCE = DATA_FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE__REVIEWERS = DATA_FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE__FLOW_FROM = DATA_FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE__FLOW_TO = DATA_FLOW__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Flow Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE__FLOW_GROUP = DATA_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE__VALUE = DATA_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE__SOURCE_TYPE = DATA_FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Flow Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE_FEATURE_COUNT = DATA_FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Flow Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SOURCE_OPERATION_COUNT = DATA_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowSinkImpl <em>Data Flow Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.DataFlowSinkImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataFlowSink()
	 * @generated
	 */
	int DATA_FLOW_SINK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SINK__NAME = DATA_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SINK__EVIDENCE = DATA_FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SINK__REVIEWERS = DATA_FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SINK__FLOW_FROM = DATA_FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SINK__FLOW_TO = DATA_FLOW__FLOW_TO;

	/**
	 * The number of structural features of the '<em>Data Flow Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SINK_FEATURE_COUNT = DATA_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_SINK_OPERATION_COUNT = DATA_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowConstraintImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlowConstraint()
	 * @generated
	 */
	int FLOW_CONSTRAINT = 7;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowConstraintImpl <em>Data Flow Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.DataFlowConstraintImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataFlowConstraint()
	 * @generated
	 */
	int DATA_FLOW_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT__NAME = DATA_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT__EVIDENCE = DATA_FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT__REVIEWERS = DATA_FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT__FLOW_FROM = DATA_FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT__FLOW_TO = DATA_FLOW__FLOW_TO;

	/**
	 * The number of structural features of the '<em>Data Flow Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT_FEATURE_COUNT = DATA_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT_OPERATION_COUNT = DATA_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.EndsWithImpl <em>Ends With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.EndsWithImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getEndsWith()
	 * @generated
	 */
	int ENDS_WITH = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__NAME = DATA_FLOW_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__EVIDENCE = DATA_FLOW_CONSTRAINT__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__REVIEWERS = DATA_FLOW_CONSTRAINT__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__FLOW_FROM = DATA_FLOW_CONSTRAINT__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__FLOW_TO = DATA_FLOW_CONSTRAINT__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__SUFFIX = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FEATURE_COUNT = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_OPERATION_COUNT = DATA_FLOW_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.StartsWithImpl <em>Starts With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.StartsWithImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getStartsWith()
	 * @generated
	 */
	int STARTS_WITH = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__NAME = DATA_FLOW_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__EVIDENCE = DATA_FLOW_CONSTRAINT__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__REVIEWERS = DATA_FLOW_CONSTRAINT__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__FLOW_FROM = DATA_FLOW_CONSTRAINT__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__FLOW_TO = DATA_FLOW_CONSTRAINT__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__PREFIX = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Starts With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FEATURE_COUNT = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Starts With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OPERATION_COUNT = DATA_FLOW_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.MatchesImpl <em>Matches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.MatchesImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getMatches()
	 * @generated
	 */
	int MATCHES = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__NAME = DATA_FLOW_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__EVIDENCE = DATA_FLOW_CONSTRAINT__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__REVIEWERS = DATA_FLOW_CONSTRAINT__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__FLOW_FROM = DATA_FLOW_CONSTRAINT__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__FLOW_TO = DATA_FLOW_CONSTRAINT__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__PATTERN = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regex Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__REGEX_TYPE = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES_FEATURE_COUNT = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Matches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES_OPERATION_COUNT = DATA_FLOW_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.ContainsImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__NAME = DATA_FLOW_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__EVIDENCE = DATA_FLOW_CONSTRAINT__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__REVIEWERS = DATA_FLOW_CONSTRAINT__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__FLOW_FROM = DATA_FLOW_CONSTRAINT__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__FLOW_TO = DATA_FLOW_CONSTRAINT__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__CONTENTS = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = DATA_FLOW_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.CastedToImpl <em>Casted To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.CastedToImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getCastedTo()
	 * @generated
	 */
	int CASTED_TO = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__NAME = DATA_FLOW_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__EVIDENCE = DATA_FLOW_CONSTRAINT__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__REVIEWERS = DATA_FLOW_CONSTRAINT__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__FLOW_FROM = DATA_FLOW_CONSTRAINT__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__FLOW_TO = DATA_FLOW_CONSTRAINT__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__TYPE = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Casted To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO_FEATURE_COUNT = DATA_FLOW_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Casted To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO_OPERATION_COUNT = DATA_FLOW_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.ControlFlowImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__EVIDENCE = FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__REVIEWERS = FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__FLOW_FROM = FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__FLOW_TO = FLOW__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__DESCRIPTION = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.ControlFlowSourceImpl <em>Control Flow Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.ControlFlowSourceImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getControlFlowSource()
	 * @generated
	 */
	int CONTROL_FLOW_SOURCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE__NAME = CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE__EVIDENCE = CONTROL_FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE__REVIEWERS = CONTROL_FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE__FLOW_FROM = CONTROL_FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE__FLOW_TO = CONTROL_FLOW__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE__DESCRIPTION = CONTROL_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Flow Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE__FLOW_GROUP = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Flow Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE_OPERATION_COUNT = CONTROL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.impl.ControlFlowSinkImpl <em>Control Flow Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.impl.ControlFlowSinkImpl
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getControlFlowSink()
	 * @generated
	 */
	int CONTROL_FLOW_SINK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SINK__NAME = CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SINK__EVIDENCE = CONTROL_FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SINK__REVIEWERS = CONTROL_FLOW__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SINK__FLOW_FROM = CONTROL_FLOW__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SINK__FLOW_TO = CONTROL_FLOW__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SINK__DESCRIPTION = CONTROL_FLOW__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Control Flow Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SINK_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Flow Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SINK_OPERATION_COUNT = CONTROL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.DataSourceType <em>Data Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.DataSourceType
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataSourceType()
	 * @generated
	 */
	int DATA_SOURCE_TYPE = 17;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.flow.MatcherRegex <em>Matcher Regex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.flow.MatcherRegex
	 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getMatcherRegex()
	 * @generated
	 */
	int MATCHER_REGEX = 18;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.flow.Flow#getFlowFrom <em>Flow From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow From</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.Flow#getFlowFrom()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FlowFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.flow.Flow#getFlowTo <em>Flow To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow To</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.Flow#getFlowTo()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FlowTo();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.FlowSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.FlowSource
	 * @generated
	 */
	EClass getFlowSource();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.flow.FlowSource#getFlowGroup <em>Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow Group</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.FlowSource#getFlowGroup()
	 * @see #getFlowSource()
	 * @generated
	 */
	EReference getFlowSource_FlowGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.FlowSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.FlowSink
	 * @generated
	 */
	EClass getFlowSink();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.FlowGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.FlowGroup
	 * @generated
	 */
	EClass getFlowGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.flow.FlowGroup#getFlowSources <em>Flow Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Sources</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.FlowGroup#getFlowSources()
	 * @see #getFlowGroup()
	 * @generated
	 */
	EReference getFlowGroup_FlowSources();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.DataFlowSource <em>Data Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Source</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.DataFlowSource
	 * @generated
	 */
	EClass getDataFlowSource();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.DataFlowSource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.DataFlowSource#getValue()
	 * @see #getDataFlowSource()
	 * @generated
	 */
	EAttribute getDataFlowSource_Value();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.DataFlowSource#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.DataFlowSource#getSourceType()
	 * @see #getDataFlowSource()
	 * @generated
	 */
	EAttribute getDataFlowSource_SourceType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.DataFlowSink <em>Data Flow Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Sink</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.DataFlowSink
	 * @generated
	 */
	EClass getDataFlowSink();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.FlowConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.FlowConstraint
	 * @generated
	 */
	EClass getFlowConstraint();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.DataFlowConstraint <em>Data Flow Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Constraint</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.DataFlowConstraint
	 * @generated
	 */
	EClass getDataFlowConstraint();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.EndsWith <em>Ends With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ends With</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.EndsWith
	 * @generated
	 */
	EClass getEndsWith();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.EndsWith#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.EndsWith#getSuffix()
	 * @see #getEndsWith()
	 * @generated
	 */
	EAttribute getEndsWith_Suffix();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.StartsWith <em>Starts With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starts With</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.StartsWith
	 * @generated
	 */
	EClass getStartsWith();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.StartsWith#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.StartsWith#getPrefix()
	 * @see #getStartsWith()
	 * @generated
	 */
	EAttribute getStartsWith_Prefix();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.Matches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matches</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.Matches
	 * @generated
	 */
	EClass getMatches();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.Matches#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.Matches#getPattern()
	 * @see #getMatches()
	 * @generated
	 */
	EAttribute getMatches_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.Matches#getRegexType <em>Regex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex Type</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.Matches#getRegexType()
	 * @see #getMatches()
	 * @generated
	 */
	EAttribute getMatches_RegexType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.Contains#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.Contains#getContents()
	 * @see #getContains()
	 * @generated
	 */
	EAttribute getContains_Contents();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.CastedTo <em>Casted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Casted To</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.CastedTo
	 * @generated
	 */
	EClass getCastedTo();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.CastedTo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.CastedTo#getType()
	 * @see #getCastedTo()
	 * @generated
	 */
	EAttribute getCastedTo_Type();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.flow.ControlFlow#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.ControlFlow#getDescription()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_Description();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.ControlFlowSource <em>Control Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Source</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.ControlFlowSource
	 * @generated
	 */
	EClass getControlFlowSource();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.flow.ControlFlowSink <em>Control Flow Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Sink</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.ControlFlowSink
	 * @generated
	 */
	EClass getControlFlowSink();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.flow.DataSourceType <em>Data Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Source Type</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.DataSourceType
	 * @generated
	 */
	EEnum getDataSourceType();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.flow.MatcherRegex <em>Matcher Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Matcher Regex</em>'.
	 * @see us.coastalhacking.semiotics.model.flow.MatcherRegex
	 * @generated
	 */
	EEnum getMatcherRegex();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Flow From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FLOW_FROM = eINSTANCE.getFlow_FlowFrom();

		/**
		 * The meta object literal for the '<em><b>Flow To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FLOW_TO = eINSTANCE.getFlow_FlowTo();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowSourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowSourceImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlowSource()
		 * @generated
		 */
		EClass FLOW_SOURCE = eINSTANCE.getFlowSource();

		/**
		 * The meta object literal for the '<em><b>Flow Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SOURCE__FLOW_GROUP = eINSTANCE.getFlowSource_FlowGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowSinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowSinkImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlowSink()
		 * @generated
		 */
		EClass FLOW_SINK = eINSTANCE.getFlowSink();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowGroupImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlowGroup()
		 * @generated
		 */
		EClass FLOW_GROUP = eINSTANCE.getFlowGroup();

		/**
		 * The meta object literal for the '<em><b>Flow Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_GROUP__FLOW_SOURCES = eINSTANCE.getFlowGroup_FlowSources();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.DataFlowImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowSourceImpl <em>Data Flow Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.DataFlowSourceImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataFlowSource()
		 * @generated
		 */
		EClass DATA_FLOW_SOURCE = eINSTANCE.getDataFlowSource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_SOURCE__VALUE = eINSTANCE.getDataFlowSource_Value();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_SOURCE__SOURCE_TYPE = eINSTANCE.getDataFlowSource_SourceType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowSinkImpl <em>Data Flow Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.DataFlowSinkImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataFlowSink()
		 * @generated
		 */
		EClass DATA_FLOW_SINK = eINSTANCE.getDataFlowSink();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.FlowConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowConstraintImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getFlowConstraint()
		 * @generated
		 */
		EClass FLOW_CONSTRAINT = eINSTANCE.getFlowConstraint();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.DataFlowConstraintImpl <em>Data Flow Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.DataFlowConstraintImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataFlowConstraint()
		 * @generated
		 */
		EClass DATA_FLOW_CONSTRAINT = eINSTANCE.getDataFlowConstraint();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.EndsWithImpl <em>Ends With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.EndsWithImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getEndsWith()
		 * @generated
		 */
		EClass ENDS_WITH = eINSTANCE.getEndsWith();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDS_WITH__SUFFIX = eINSTANCE.getEndsWith_Suffix();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.StartsWithImpl <em>Starts With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.StartsWithImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getStartsWith()
		 * @generated
		 */
		EClass STARTS_WITH = eINSTANCE.getStartsWith();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTS_WITH__PREFIX = eINSTANCE.getStartsWith_Prefix();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.MatchesImpl <em>Matches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.MatchesImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getMatches()
		 * @generated
		 */
		EClass MATCHES = eINSTANCE.getMatches();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHES__PATTERN = eINSTANCE.getMatches_Pattern();

		/**
		 * The meta object literal for the '<em><b>Regex Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHES__REGEX_TYPE = eINSTANCE.getMatches_RegexType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.ContainsImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINS__CONTENTS = eINSTANCE.getContains_Contents();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.CastedToImpl <em>Casted To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.CastedToImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getCastedTo()
		 * @generated
		 */
		EClass CASTED_TO = eINSTANCE.getCastedTo();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASTED_TO__TYPE = eINSTANCE.getCastedTo_Type();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.ControlFlowImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__DESCRIPTION = eINSTANCE.getControlFlow_Description();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.ControlFlowSourceImpl <em>Control Flow Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.ControlFlowSourceImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getControlFlowSource()
		 * @generated
		 */
		EClass CONTROL_FLOW_SOURCE = eINSTANCE.getControlFlowSource();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.impl.ControlFlowSinkImpl <em>Control Flow Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.impl.ControlFlowSinkImpl
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getControlFlowSink()
		 * @generated
		 */
		EClass CONTROL_FLOW_SINK = eINSTANCE.getControlFlowSink();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.DataSourceType <em>Data Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.DataSourceType
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getDataSourceType()
		 * @generated
		 */
		EEnum DATA_SOURCE_TYPE = eINSTANCE.getDataSourceType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.flow.MatcherRegex <em>Matcher Regex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.flow.MatcherRegex
		 * @see us.coastalhacking.semiotics.model.flow.impl.FlowPackageImpl#getMatcherRegex()
		 * @generated
		 */
		EEnum MATCHER_REGEX = eINSTANCE.getMatcherRegex();

	}

} //FlowPackage
