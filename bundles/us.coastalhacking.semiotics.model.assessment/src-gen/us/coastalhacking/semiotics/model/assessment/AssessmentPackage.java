/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/us.coastalhacking.semiotics.model.assessment.edit/src-gen' forceOverwrite='true' copyrightText='Copyright (c) 2016 Coastal Hacking\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License\nv1.0 which accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html' basePackage='us.coastalhacking.semiotics.model'"
 * @generated
 */
public interface AssessmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assessment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "us.coastalhacking.semiotics.model.assessment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assessment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssessmentPackage eINSTANCE = us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Nameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Nameable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Reviewable <em>Reviewable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getReviewable()
	 * @generated
	 */
	int REVIEWABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWABLE__EVIDENCE = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWABLE__TRACES = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWABLE__SEARCHES = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reviewable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWABLE_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reviewable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWABLE_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Provable <em>Provable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Provable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getProvable()
	 * @generated
	 */
	int PROVABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVABLE__REVIEWERS = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVABLE__TRACES = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVABLE_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVABLE_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Traceable <em>Traceable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTraceable()
	 * @generated
	 */
	int TRACEABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__EVIDENCE = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__REVIEWERS = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traceable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traceable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Searchable <em>Searchable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Searchable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchable()
	 * @generated
	 */
	int SEARCHABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE__REVIEWERS = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Searchable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Searchable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlGroupImpl <em>Control Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlGroup()
	 * @generated
	 */
	int CONTROL_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__CONTROLS = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = REVIEWABLE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__EVIDENCE = REVIEWABLE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TRACES = REVIEWABLE__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SEARCHES = REVIEWABLE__SEARCHES;

	/**
	 * The feature id for the '<em><b>Control Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROL_GROUP = REVIEWABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CWES = REVIEWABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = REVIEWABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = REVIEWABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CWEGroupImpl <em>CWE Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.CWEGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCWEGroup()
	 * @generated
	 */
	int CWE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_GROUP__CWES = 0;

	/**
	 * The number of structural features of the '<em>CWE Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CWE Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CWEImpl <em>CWE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.CWEImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCWE()
	 * @generated
	 */
	int CWE = 8;

	/**
	 * The feature id for the '<em><b>Cwe Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__CWE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__ID = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__URL = 3;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE__CONTROLS = 4;

	/**
	 * The number of structural features of the '<em>CWE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>CWE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getData()
	 * @generated
	 */
	int DATA = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SNIPPETS = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_GROUP = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataGroupImpl <em>Data Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataGroup()
	 * @generated
	 */
	int DATA_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__DATA = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.SnippetImpl <em>Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.SnippetImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSnippet()
	 * @generated
	 */
	int SNIPPET = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__NAME = PROVABLE__NAME;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__REVIEWERS = PROVABLE__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__TRACES = PROVABLE__TRACES;

	/**
	 * The feature id for the '<em><b>Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__DATA = PROVABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__ROW = PROVABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__COLUMN = PROVABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__LENGTH = PROVABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_FEATURE_COUNT = PROVABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_OPERATION_COUNT = PROVABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FileImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DATA_GROUP = DATA__DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FULL_PATH = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTENTS = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.RequestImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DATA_GROUP = DATA__DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__RESPONSE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ResponseImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DATA_GROUP = DATA__DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__REQUEST = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = TRACEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EVIDENCE = TRACEABLE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__REVIEWERS = TRACEABLE__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW_FROM = TRACEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW_TO = TRACEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = TRACEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = TRACEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowSourceImpl <em>Flow Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowSourceImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowSource()
	 * @generated
	 */
	int FLOW_SOURCE = 16;

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
	 * The number of structural features of the '<em>Flow Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowSinkImpl <em>Flow Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowSinkImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowSink()
	 * @generated
	 */
	int FLOW_SINK = 17;

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
	 * The number of structural features of the '<em>Flow Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SINK_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowGroupImpl <em>Flow Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowGroup()
	 * @generated
	 */
	int FLOW_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Flow Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP__FLOW_SOURCES = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 19;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowSourceImpl <em>Data Flow Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowSourceImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowSource()
	 * @generated
	 */
	int DATA_FLOW_SOURCE = 20;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowSinkImpl <em>Data Flow Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowSinkImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowSink()
	 * @generated
	 */
	int DATA_FLOW_SINK = 21;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowConstraintImpl <em>Flow Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowConstraintImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowConstraint()
	 * @generated
	 */
	int FLOW_CONSTRAINT = 22;

	/**
	 * The number of structural features of the '<em>Flow Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Flow Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowConstraintImpl <em>Data Flow Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowConstraintImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowConstraint()
	 * @generated
	 */
	int DATA_FLOW_CONSTRAINT = 23;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl <em>Ends With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getEndsWith()
	 * @generated
	 */
	int ENDS_WITH = 24;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.StartsWithImpl <em>Starts With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.StartsWithImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getStartsWith()
	 * @generated
	 */
	int STARTS_WITH = 25;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.MatchesImpl <em>Matches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.MatchesImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMatches()
	 * @generated
	 */
	int MATCHES = 26;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ContainsImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 27;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CastedToImpl <em>Casted To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.CastedToImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCastedTo()
	 * @generated
	 */
	int CASTED_TO = 28;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 29;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowSourceImpl <em>Control Flow Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowSourceImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowSource()
	 * @generated
	 */
	int CONTROL_FLOW_SOURCE = 30;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowSinkImpl <em>Control Flow Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowSinkImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowSink()
	 * @generated
	 */
	int CONTROL_FLOW_SINK = 31;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 32;

	/**
	 * The feature id for the '<em><b>Application Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__APPLICATION_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.PropertyImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 33;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ApplicationGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationGroup()
	 * @generated
	 */
	int APPLICATION_GROUP = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__APPLICATIONS = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__ASSESSMENT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Application Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_GROUP = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__FLOW_GROUPS = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTROL_GROUPS = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DATA_GROUPS = NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.SearchGroupImpl <em>Search Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.SearchGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchGroup()
	 * @generated
	 */
	int SEARCH_GROUP = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__SEARCHES = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Result Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__SEARCH_RESULT_DESCRIPTION = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Search Result CW Es</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__SEARCH_RESULT_CW_ES = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Search Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Search Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.SearchImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__NAME = SEARCHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__REVIEWERS = SEARCHABLE__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Search Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__SEARCH_GROUP = SEARCHABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__PATTERN = SEARCHABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = SEARCHABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPERATION_COUNT = SEARCHABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.SearchPattern <em>Search Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.SearchPattern
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchPattern()
	 * @generated
	 */
	int SEARCH_PATTERN = 38;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PATTERN__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Search Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Search Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl <em>Java Search Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchPattern()
	 * @generated
	 */
	int JAVA_SEARCH_PATTERN = 39;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_PATTERN__PATTERN = SEARCH_PATTERN__PATTERN;

	/**
	 * The feature id for the '<em><b>Pattern Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_PATTERN__PATTERN_TYPE = SEARCH_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_PATTERN__SEARCH_FOR = SEARCH_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Limit To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_PATTERN__LIMIT_TO = SEARCH_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Match Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_PATTERN__MATCH_RULE = SEARCH_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Case Sensitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_PATTERN__CASE_SENSITIVITY = SEARCH_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Java Search Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_PATTERN_FEATURE_COUNT = SEARCH_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Java Search Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_PATTERN_OPERATION_COUNT = SEARCH_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.DataSourceType <em>Data Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.DataSourceType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataSourceType()
	 * @generated
	 */
	int DATA_SOURCE_TYPE = 40;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.MatcherRegex <em>Matcher Regex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.MatcherRegex
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMatcherRegex()
	 * @generated
	 */
	int MATCHER_REGEX = 41;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType <em>Java Search Pattern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchPatternType()
	 * @generated
	 */
	int JAVA_SEARCH_PATTERN_TYPE = 42;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchFor <em>Java Search For</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchFor
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchFor()
	 * @generated
	 */
	int JAVA_SEARCH_FOR = 43;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaLimitTo <em>Java Limit To</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaLimitTo
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaLimitTo()
	 * @generated
	 */
	int JAVA_LIMIT_TO = 44;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaMatchRule <em>Java Match Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchRule
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaMatchRule()
	 * @generated
	 */
	int JAVA_MATCH_RULE = 45;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity <em>Java Match Case Sensitivity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaMatchCaseSensitivity()
	 * @generated
	 */
	int JAVA_MATCH_CASE_SENSITIVITY = 46;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Nameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Nameable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Nameable#getName()
	 * @see #getNameable()
	 * @generated
	 */
	EAttribute getNameable_Name();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Reviewable <em>Reviewable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reviewable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable
	 * @generated
	 */
	EClass getReviewable();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable#getEvidence()
	 * @see #getReviewable()
	 * @generated
	 */
	EReference getReviewable_Evidence();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traces</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable#getTraces()
	 * @see #getReviewable()
	 * @generated
	 */
	EReference getReviewable_Traces();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Reviewable#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Searches</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Reviewable#getSearches()
	 * @see #getReviewable()
	 * @generated
	 */
	EReference getReviewable_Searches();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Provable <em>Provable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Provable
	 * @generated
	 */
	EClass getProvable();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Provable#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reviewers</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Provable#getReviewers()
	 * @see #getProvable()
	 * @generated
	 */
	EReference getProvable_Reviewers();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Provable#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traces</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Provable#getTraces()
	 * @see #getProvable()
	 * @generated
	 */
	EReference getProvable_Traces();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Traceable <em>Traceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable
	 * @generated
	 */
	EClass getTraceable();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Traceable#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable#getEvidence()
	 * @see #getTraceable()
	 * @generated
	 */
	EReference getTraceable_Evidence();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Traceable#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reviewers</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable#getReviewers()
	 * @see #getTraceable()
	 * @generated
	 */
	EReference getTraceable_Reviewers();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Searchable <em>Searchable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Searchable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Searchable
	 * @generated
	 */
	EClass getSearchable();

	/**
	 * Returns the meta object for the reference '{@link us.coastalhacking.semiotics.model.assessment.Searchable#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reviewers</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Searchable#getReviewers()
	 * @see #getSearchable()
	 * @generated
	 */
	EReference getSearchable_Reviewers();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlGroup
	 * @generated
	 */
	EClass getControlGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.ControlGroup#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlGroup#getControls()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Controls();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.Control#getControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Control Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Control#getControlGroup()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_ControlGroup();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Control#getCwes <em>Cwes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cwes</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Control#getCwes()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Cwes();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.CWEGroup <em>CWE Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWE Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CWEGroup
	 * @generated
	 */
	EClass getCWEGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.CWEGroup#getCwes <em>Cwes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cwes</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CWEGroup#getCwes()
	 * @see #getCWEGroup()
	 * @generated
	 */
	EReference getCWEGroup_Cwes();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.CWE <em>CWE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWE</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CWE
	 * @generated
	 */
	EClass getCWE();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.CWE#getCweGroup <em>Cwe Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cwe Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CWE#getCweGroup()
	 * @see #getCWE()
	 * @generated
	 */
	EReference getCWE_CweGroup();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.CWE#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CWE#getId()
	 * @see #getCWE()
	 * @generated
	 */
	EAttribute getCWE_Id();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.CWE#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CWE#getTitle()
	 * @see #getCWE()
	 * @generated
	 */
	EAttribute getCWE_Title();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.CWE#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CWE#getUrl()
	 * @see #getCWE()
	 * @generated
	 */
	EAttribute getCWE_Url();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.CWE#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CWE#getControls()
	 * @see #getCWE()
	 * @generated
	 */
	EReference getCWE_Controls();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.Data#getSnippets <em>Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Snippets</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Data#getSnippets()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Snippets();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.Data#getDataGroup <em>Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Data#getDataGroup()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_DataGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataGroup <em>Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataGroup
	 * @generated
	 */
	EClass getDataGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.DataGroup#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataGroup#getData()
	 * @see #getDataGroup()
	 * @generated
	 */
	EReference getDataGroup_Data();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Snippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Snippet
	 * @generated
	 */
	EClass getSnippet();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.Snippet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Snippet#getData()
	 * @see #getSnippet()
	 * @generated
	 */
	EReference getSnippet_Data();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Snippet#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Snippet#getRow()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_Row();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Snippet#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Snippet#getColumn()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_Column();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Snippet#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Snippet#getLength()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_Length();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.File#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.File#getFullPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FullPath();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.File#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.File#getContents()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Contents();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the reference '{@link us.coastalhacking.semiotics.model.assessment.Request#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Request#getResponse()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Response();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the reference '{@link us.coastalhacking.semiotics.model.assessment.Response#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Response#getRequest()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Request();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlowFrom <em>Flow From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow From</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Flow#getFlowFrom()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FlowFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlowTo <em>Flow To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow To</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Flow#getFlowTo()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FlowTo();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FlowSource <em>Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Source</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowSource
	 * @generated
	 */
	EClass getFlowSource();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.FlowSource#getFlowGroup <em>Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowSource#getFlowGroup()
	 * @see #getFlowSource()
	 * @generated
	 */
	EReference getFlowSource_FlowGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FlowSink <em>Flow Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Sink</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowSink
	 * @generated
	 */
	EClass getFlowSink();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FlowGroup <em>Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowGroup
	 * @generated
	 */
	EClass getFlowGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.FlowGroup#getFlowSources <em>Flow Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Sources</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowGroup#getFlowSources()
	 * @see #getFlowGroup()
	 * @generated
	 */
	EReference getFlowGroup_FlowSources();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowSource <em>Data Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Source</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowSource
	 * @generated
	 */
	EClass getDataFlowSource();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.DataFlowSource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowSource#getValue()
	 * @see #getDataFlowSource()
	 * @generated
	 */
	EAttribute getDataFlowSource_Value();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.DataFlowSource#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowSource#getSourceType()
	 * @see #getDataFlowSource()
	 * @generated
	 */
	EAttribute getDataFlowSource_SourceType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowSink <em>Data Flow Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Sink</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowSink
	 * @generated
	 */
	EClass getDataFlowSink();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FlowConstraint <em>Flow Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Constraint</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowConstraint
	 * @generated
	 */
	EClass getFlowConstraint();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowConstraint <em>Data Flow Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Constraint</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowConstraint
	 * @generated
	 */
	EClass getDataFlowConstraint();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.EndsWith <em>Ends With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ends With</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.EndsWith
	 * @generated
	 */
	EClass getEndsWith();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.EndsWith#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.EndsWith#getSuffix()
	 * @see #getEndsWith()
	 * @generated
	 */
	EAttribute getEndsWith_Suffix();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.StartsWith <em>Starts With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starts With</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.StartsWith
	 * @generated
	 */
	EClass getStartsWith();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.StartsWith#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.StartsWith#getPrefix()
	 * @see #getStartsWith()
	 * @generated
	 */
	EAttribute getStartsWith_Prefix();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Matches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matches</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Matches
	 * @generated
	 */
	EClass getMatches();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Matches#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Matches#getPattern()
	 * @see #getMatches()
	 * @generated
	 */
	EAttribute getMatches_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Matches#getRegexType <em>Regex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Matches#getRegexType()
	 * @see #getMatches()
	 * @generated
	 */
	EAttribute getMatches_RegexType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Contains#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Contains#getContents()
	 * @see #getContains()
	 * @generated
	 */
	EAttribute getContains_Contents();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.CastedTo <em>Casted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Casted To</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CastedTo
	 * @generated
	 */
	EClass getCastedTo();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.CastedTo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CastedTo#getType()
	 * @see #getCastedTo()
	 * @generated
	 */
	EAttribute getCastedTo_Type();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.ControlFlow#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlow#getDescription()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_Description();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowSource <em>Control Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Source</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowSource
	 * @generated
	 */
	EClass getControlFlowSource();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowSink <em>Control Flow Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Sink</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowSink
	 * @generated
	 */
	EClass getControlFlowSink();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.Assessment#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Groups</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Assessment#getApplicationGroups()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_ApplicationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.Assessment#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Assessment#getProperties()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Properties();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationGroup
	 * @generated
	 */
	EClass getApplicationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getApplications()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_Applications();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assessment</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationGroup#getAssessment()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_Assessment();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.Application#getApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Application#getApplicationGroup()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.Application#getFlowGroups <em>Flow Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Groups</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Application#getFlowGroups()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_FlowGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.Application#getControlGroups <em>Control Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Groups</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Application#getControlGroups()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ControlGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.Application#getDataGroups <em>Data Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Groups</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Application#getDataGroups()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_DataGroups();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup <em>Search Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchGroup
	 * @generated
	 */
	EClass getSearchGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Searches</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearches()
	 * @see #getSearchGroup()
	 * @generated
	 */
	EReference getSearchGroup_Searches();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearchResultDescription <em>Search Result Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Result Description</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearchResultDescription()
	 * @see #getSearchGroup()
	 * @generated
	 */
	EAttribute getSearchGroup_SearchResultDescription();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearchResultCWEs <em>Search Result CW Es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Search Result CW Es</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchGroup#getSearchResultCWEs()
	 * @see #getSearchGroup()
	 * @generated
	 */
	EReference getSearchGroup_SearchResultCWEs();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.Search#getSearchGroup <em>Search Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Search Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Search#getSearchGroup()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_SearchGroup();

	/**
	 * Returns the meta object for the containment reference '{@link us.coastalhacking.semiotics.model.assessment.Search#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Search#getPattern()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Pattern();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.SearchPattern <em>Search Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Pattern</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchPattern
	 * @generated
	 */
	EClass getSearchPattern();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.SearchPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchPattern#getPattern()
	 * @see #getSearchPattern()
	 * @generated
	 */
	EAttribute getSearchPattern_Pattern();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern <em>Java Search Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Search Pattern</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPattern
	 * @generated
	 */
	EClass getJavaSearchPattern();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getPatternType <em>Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getPatternType()
	 * @see #getJavaSearchPattern()
	 * @generated
	 */
	EAttribute getJavaSearchPattern_PatternType();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getSearchFor <em>Search For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search For</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getSearchFor()
	 * @see #getJavaSearchPattern()
	 * @generated
	 */
	EAttribute getJavaSearchPattern_SearchFor();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getLimitTo <em>Limit To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit To</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getLimitTo()
	 * @see #getJavaSearchPattern()
	 * @generated
	 */
	EAttribute getJavaSearchPattern_LimitTo();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getMatchRule <em>Match Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Rule</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getMatchRule()
	 * @see #getJavaSearchPattern()
	 * @generated
	 */
	EAttribute getJavaSearchPattern_MatchRule();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getCaseSensitivity <em>Case Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitivity</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPattern#getCaseSensitivity()
	 * @see #getJavaSearchPattern()
	 * @generated
	 */
	EAttribute getJavaSearchPattern_CaseSensitivity();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.DataSourceType <em>Data Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Source Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataSourceType
	 * @generated
	 */
	EEnum getDataSourceType();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.MatcherRegex <em>Matcher Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Matcher Regex</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.MatcherRegex
	 * @generated
	 */
	EEnum getMatcherRegex();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType <em>Java Search Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Search Pattern Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType
	 * @generated
	 */
	EEnum getJavaSearchPatternType();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchFor <em>Java Search For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Search For</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchFor
	 * @generated
	 */
	EEnum getJavaSearchFor();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.JavaLimitTo <em>Java Limit To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Limit To</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaLimitTo
	 * @generated
	 */
	EEnum getJavaLimitTo();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.JavaMatchRule <em>Java Match Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Match Rule</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchRule
	 * @generated
	 */
	EEnum getJavaMatchRule();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity <em>Java Match Case Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Match Case Sensitivity</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity
	 * @generated
	 */
	EEnum getJavaMatchCaseSensitivity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssessmentFactory getAssessmentFactory();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Nameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Nameable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEABLE__NAME = eINSTANCE.getNameable_Name();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Reviewable <em>Reviewable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Reviewable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getReviewable()
		 * @generated
		 */
		EClass REVIEWABLE = eINSTANCE.getReviewable();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEWABLE__EVIDENCE = eINSTANCE.getReviewable_Evidence();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEWABLE__TRACES = eINSTANCE.getReviewable_Traces();

		/**
		 * The meta object literal for the '<em><b>Searches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEWABLE__SEARCHES = eINSTANCE.getReviewable_Searches();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Provable <em>Provable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Provable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getProvable()
		 * @generated
		 */
		EClass PROVABLE = eINSTANCE.getProvable();

		/**
		 * The meta object literal for the '<em><b>Reviewers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVABLE__REVIEWERS = eINSTANCE.getProvable_Reviewers();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVABLE__TRACES = eINSTANCE.getProvable_Traces();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Traceable <em>Traceable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Traceable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTraceable()
		 * @generated
		 */
		EClass TRACEABLE = eINSTANCE.getTraceable();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE__EVIDENCE = eINSTANCE.getTraceable_Evidence();

		/**
		 * The meta object literal for the '<em><b>Reviewers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE__REVIEWERS = eINSTANCE.getTraceable_Reviewers();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Searchable <em>Searchable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Searchable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchable()
		 * @generated
		 */
		EClass SEARCHABLE = eINSTANCE.getSearchable();

		/**
		 * The meta object literal for the '<em><b>Reviewers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCHABLE__REVIEWERS = eINSTANCE.getSearchable_Reviewers();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlGroupImpl <em>Control Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlGroup()
		 * @generated
		 */
		EClass CONTROL_GROUP = eINSTANCE.getControlGroup();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_GROUP__CONTROLS = eINSTANCE.getControlGroup_Controls();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Control Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CONTROL_GROUP = eINSTANCE.getControl_ControlGroup();

		/**
		 * The meta object literal for the '<em><b>Cwes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CWES = eINSTANCE.getControl_Cwes();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CWEGroupImpl <em>CWE Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.CWEGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCWEGroup()
		 * @generated
		 */
		EClass CWE_GROUP = eINSTANCE.getCWEGroup();

		/**
		 * The meta object literal for the '<em><b>Cwes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWE_GROUP__CWES = eINSTANCE.getCWEGroup_Cwes();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CWEImpl <em>CWE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.CWEImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCWE()
		 * @generated
		 */
		EClass CWE = eINSTANCE.getCWE();

		/**
		 * The meta object literal for the '<em><b>Cwe Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWE__CWE_GROUP = eINSTANCE.getCWE_CweGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CWE__ID = eINSTANCE.getCWE_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CWE__TITLE = eINSTANCE.getCWE_Title();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CWE__URL = eINSTANCE.getCWE_Url();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWE__CONTROLS = eINSTANCE.getCWE_Controls();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.DataImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Snippets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SNIPPETS = eINSTANCE.getData_Snippets();

		/**
		 * The meta object literal for the '<em><b>Data Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATA_GROUP = eINSTANCE.getData_DataGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataGroupImpl <em>Data Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.DataGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataGroup()
		 * @generated
		 */
		EClass DATA_GROUP = eINSTANCE.getDataGroup();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_GROUP__DATA = eINSTANCE.getDataGroup_Data();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.SnippetImpl <em>Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.SnippetImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSnippet()
		 * @generated
		 */
		EClass SNIPPET = eINSTANCE.getSnippet();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNIPPET__DATA = eINSTANCE.getSnippet_Data();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__ROW = eINSTANCE.getSnippet_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__COLUMN = eINSTANCE.getSnippet_Column();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__LENGTH = eINSTANCE.getSnippet_Length();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.FileImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FULL_PATH = eINSTANCE.getFile_FullPath();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CONTENTS = eINSTANCE.getFile_Contents();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.RequestImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__RESPONSE = eINSTANCE.getRequest_Response();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ResponseImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__REQUEST = eINSTANCE.getResponse_Request();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlow()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowSourceImpl <em>Flow Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowSourceImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowSource()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowSinkImpl <em>Flow Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowSinkImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowSink()
		 * @generated
		 */
		EClass FLOW_SINK = eINSTANCE.getFlowSink();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowGroupImpl <em>Flow Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowGroup()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowSourceImpl <em>Data Flow Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowSourceImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowSource()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowSinkImpl <em>Data Flow Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowSinkImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowSink()
		 * @generated
		 */
		EClass DATA_FLOW_SINK = eINSTANCE.getDataFlowSink();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FlowConstraintImpl <em>Flow Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.FlowConstraintImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowConstraint()
		 * @generated
		 */
		EClass FLOW_CONSTRAINT = eINSTANCE.getFlowConstraint();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowConstraintImpl <em>Data Flow Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowConstraintImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowConstraint()
		 * @generated
		 */
		EClass DATA_FLOW_CONSTRAINT = eINSTANCE.getDataFlowConstraint();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl <em>Ends With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getEndsWith()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.StartsWithImpl <em>Starts With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.StartsWithImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getStartsWith()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.MatchesImpl <em>Matches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.MatchesImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMatches()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ContainsImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getContains()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CastedToImpl <em>Casted To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.CastedToImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCastedTo()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlow()
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowSourceImpl <em>Control Flow Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowSourceImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowSource()
		 * @generated
		 */
		EClass CONTROL_FLOW_SOURCE = eINSTANCE.getControlFlowSource();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowSinkImpl <em>Control Flow Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowSinkImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowSink()
		 * @generated
		 */
		EClass CONTROL_FLOW_SINK = eINSTANCE.getControlFlowSink();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Application Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__APPLICATION_GROUPS = eINSTANCE.getAssessment_ApplicationGroups();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__PROPERTIES = eINSTANCE.getAssessment_Properties();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.PropertyImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ApplicationGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationGroup()
		 * @generated
		 */
		EClass APPLICATION_GROUP = eINSTANCE.getApplicationGroup();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__APPLICATIONS = eINSTANCE.getApplicationGroup_Applications();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__ASSESSMENT = eINSTANCE.getApplicationGroup_Assessment();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ApplicationImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Application Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_GROUP = eINSTANCE.getApplication_ApplicationGroup();

		/**
		 * The meta object literal for the '<em><b>Flow Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__FLOW_GROUPS = eINSTANCE.getApplication_FlowGroups();

		/**
		 * The meta object literal for the '<em><b>Control Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONTROL_GROUPS = eINSTANCE.getApplication_ControlGroups();

		/**
		 * The meta object literal for the '<em><b>Data Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DATA_GROUPS = eINSTANCE.getApplication_DataGroups();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.SearchGroupImpl <em>Search Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.SearchGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchGroup()
		 * @generated
		 */
		EClass SEARCH_GROUP = eINSTANCE.getSearchGroup();

		/**
		 * The meta object literal for the '<em><b>Searches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_GROUP__SEARCHES = eINSTANCE.getSearchGroup_Searches();

		/**
		 * The meta object literal for the '<em><b>Search Result Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_GROUP__SEARCH_RESULT_DESCRIPTION = eINSTANCE.getSearchGroup_SearchResultDescription();

		/**
		 * The meta object literal for the '<em><b>Search Result CW Es</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_GROUP__SEARCH_RESULT_CW_ES = eINSTANCE.getSearchGroup_SearchResultCWEs();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.SearchImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Search Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__SEARCH_GROUP = eINSTANCE.getSearch_SearchGroup();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__PATTERN = eINSTANCE.getSearch_Pattern();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.SearchPattern <em>Search Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.SearchPattern
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchPattern()
		 * @generated
		 */
		EClass SEARCH_PATTERN = eINSTANCE.getSearchPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PATTERN__PATTERN = eINSTANCE.getSearchPattern_Pattern();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl <em>Java Search Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchPattern()
		 * @generated
		 */
		EClass JAVA_SEARCH_PATTERN = eINSTANCE.getJavaSearchPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SEARCH_PATTERN__PATTERN_TYPE = eINSTANCE.getJavaSearchPattern_PatternType();

		/**
		 * The meta object literal for the '<em><b>Search For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SEARCH_PATTERN__SEARCH_FOR = eINSTANCE.getJavaSearchPattern_SearchFor();

		/**
		 * The meta object literal for the '<em><b>Limit To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SEARCH_PATTERN__LIMIT_TO = eINSTANCE.getJavaSearchPattern_LimitTo();

		/**
		 * The meta object literal for the '<em><b>Match Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SEARCH_PATTERN__MATCH_RULE = eINSTANCE.getJavaSearchPattern_MatchRule();

		/**
		 * The meta object literal for the '<em><b>Case Sensitivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SEARCH_PATTERN__CASE_SENSITIVITY = eINSTANCE.getJavaSearchPattern_CaseSensitivity();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.DataSourceType <em>Data Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.DataSourceType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataSourceType()
		 * @generated
		 */
		EEnum DATA_SOURCE_TYPE = eINSTANCE.getDataSourceType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.MatcherRegex <em>Matcher Regex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.MatcherRegex
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMatcherRegex()
		 * @generated
		 */
		EEnum MATCHER_REGEX = eINSTANCE.getMatcherRegex();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType <em>Java Search Pattern Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchPatternType()
		 * @generated
		 */
		EEnum JAVA_SEARCH_PATTERN_TYPE = eINSTANCE.getJavaSearchPatternType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchFor <em>Java Search For</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchFor
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchFor()
		 * @generated
		 */
		EEnum JAVA_SEARCH_FOR = eINSTANCE.getJavaSearchFor();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.JavaLimitTo <em>Java Limit To</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.JavaLimitTo
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaLimitTo()
		 * @generated
		 */
		EEnum JAVA_LIMIT_TO = eINSTANCE.getJavaLimitTo();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.JavaMatchRule <em>Java Match Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchRule
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaMatchRule()
		 * @generated
		 */
		EEnum JAVA_MATCH_RULE = eINSTANCE.getJavaMatchRule();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity <em>Java Match Case Sensitivity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaMatchCaseSensitivity()
		 * @generated
		 */
		EEnum JAVA_MATCH_CASE_SENSITIVITY = eINSTANCE.getJavaMatchCaseSensitivity();

	}

} //AssessmentPackage
