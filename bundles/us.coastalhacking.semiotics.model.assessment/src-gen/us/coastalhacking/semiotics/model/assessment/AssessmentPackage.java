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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Describable <em>Describable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Describable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDescribable()
	 * @generated
	 */
	int DESCRIBABLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Examinable <em>Examinable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getExaminable()
	 * @generated
	 */
	int EXAMINABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINABLE__EVIDENCE = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINABLE__TRACES = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINABLE__SEARCHES = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINABLE__TASKS = NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINABLE__FINDINGS = NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Examinable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINABLE_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Examinable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINABLE_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Provable <em>Provable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Provable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getProvable()
	 * @generated
	 */
	int PROVABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVABLE__EXAMINEES = NAMEABLE_FEATURE_COUNT + 0;

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
	int TRACEABLE = 4;

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
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__EXAMINEES = NAMEABLE_FEATURE_COUNT + 1;

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
	int SEARCHABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE__EXAMINEES = NAMEABLE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Taskable <em>Taskable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Taskable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTaskable()
	 * @generated
	 */
	int TASKABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKABLE__EXAMINEES = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Taskable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKABLE_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Taskable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKABLE_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Findable <em>Findable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Findable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFindable()
	 * @generated
	 */
	int FINDABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDABLE__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDABLE__EXAMINEES = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Findable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDABLE_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Findable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDABLE_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Groupable <em>Groupable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Groupable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGroupable()
	 * @generated
	 */
	int GROUPABLE = 8;

	/**
	 * The number of structural features of the '<em>Groupable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Groupable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Membered <em>Membered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Membered
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMembered()
	 * @generated
	 */
	int MEMBERED = 9;

	/**
	 * The number of structural features of the '<em>Membered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERED_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Membered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERED_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Group <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Group
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBERS = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Member <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Member
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__GROUP = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.GroupableMembered <em>Groupable Membered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.GroupableMembered
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGroupableMembered()
	 * @generated
	 */
	int GROUPABLE_MEMBERED = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPABLE_MEMBERED__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPABLE_MEMBERED__MEMBERS = GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPABLE_MEMBERED__GROUP = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Groupable Membered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPABLE_MEMBERED_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Groupable Membered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPABLE_MEMBERED_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.MemberedGroupable <em>Membered Groupable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.MemberedGroupable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMemberedGroupable()
	 * @generated
	 */
	int MEMBERED_GROUPABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERED_GROUPABLE__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERED_GROUPABLE__GROUP = MEMBER__GROUP;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERED_GROUPABLE__MEMBERS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Membered Groupable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERED_GROUPABLE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Membered Groupable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERED_GROUPABLE_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.ControlType <em>Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.ControlType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 14;

	/**
	 * The number of structural features of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.ControlGroup <em>Control Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.ControlGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlGroup()
	 * @generated
	 */
	int CONTROL_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__NAME = GROUPABLE_MEMBERED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__MEMBERS = GROUPABLE_MEMBERED__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__GROUP = GROUPABLE_MEMBERED__GROUP;

	/**
	 * The number of structural features of the '<em>Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP_FEATURE_COUNT = GROUPABLE_MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP_OPERATION_COUNT = GROUPABLE_MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Control <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Control
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__GROUP = MEMBER__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__EVIDENCE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TRACES = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SEARCHES = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TASKS = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__FINDINGS = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION = MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CWES = MEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CWEGroupImpl <em>CWE Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.CWEGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCWEGroup()
	 * @generated
	 */
	int CWE_GROUP = 17;

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
	int CWE = 18;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.AuthenticationControlType <em>Authentication Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.AuthenticationControlType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthenticationControlType()
	 * @generated
	 */
	int AUTHENTICATION_CONTROL_TYPE = 19;

	/**
	 * The number of structural features of the '<em>Authentication Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_CONTROL_TYPE_FEATURE_COUNT = CONTROL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authentication Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_CONTROL_TYPE_OPERATION_COUNT = CONTROL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AuthenticationGroupImpl <em>Authentication Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AuthenticationGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthenticationGroup()
	 * @generated
	 */
	int AUTHENTICATION_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_GROUP__NAME = CONTROL_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_GROUP__MEMBERS = CONTROL_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_GROUP__GROUP = CONTROL_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Authentication Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_GROUP_FEATURE_COUNT = CONTROL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authentication Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_GROUP_OPERATION_COUNT = CONTROL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AuthenticationImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__GROUP = CONTROL__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__EVIDENCE = CONTROL__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__TRACES = CONTROL__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__SEARCHES = CONTROL__SEARCHES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__TASKS = CONTROL__TASKS;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__FINDINGS = CONTROL__FINDINGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__CWES = CONTROL__CWES;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.AuthorizationControlType <em>Authorization Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.AuthorizationControlType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthorizationControlType()
	 * @generated
	 */
	int AUTHORIZATION_CONTROL_TYPE = 22;

	/**
	 * The number of structural features of the '<em>Authorization Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_CONTROL_TYPE_FEATURE_COUNT = CONTROL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authorization Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_CONTROL_TYPE_OPERATION_COUNT = CONTROL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationGroupImpl <em>Authorization Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AuthorizationGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthorizationGroup()
	 * @generated
	 */
	int AUTHORIZATION_GROUP = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_GROUP__NAME = CONTROL_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_GROUP__MEMBERS = CONTROL_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_GROUP__GROUP = CONTROL_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Authorization Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_GROUP_FEATURE_COUNT = CONTROL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authorization Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_GROUP_OPERATION_COUNT = CONTROL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl <em>Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthorization()
	 * @generated
	 */
	int AUTHORIZATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__GROUP = CONTROL__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__EVIDENCE = CONTROL__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__TRACES = CONTROL__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__SEARCHES = CONTROL__SEARCHES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__TASKS = CONTROL__TASKS;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__FINDINGS = CONTROL__FINDINGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__CWES = CONTROL__CWES;

	/**
	 * The number of structural features of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.AccountControlType <em>Account Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.AccountControlType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAccountControlType()
	 * @generated
	 */
	int ACCOUNT_CONTROL_TYPE = 25;

	/**
	 * The number of structural features of the '<em>Account Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROL_TYPE_FEATURE_COUNT = CONTROL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Account Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROL_TYPE_OPERATION_COUNT = CONTROL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AccountGroupImpl <em>Account Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AccountGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAccountGroup()
	 * @generated
	 */
	int ACCOUNT_GROUP = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_GROUP__NAME = CONTROL_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_GROUP__MEMBERS = CONTROL_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_GROUP__GROUP = CONTROL_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Account Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_GROUP_FEATURE_COUNT = CONTROL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Account Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_GROUP_OPERATION_COUNT = CONTROL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AccountImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__GROUP = CONTROL__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__EVIDENCE = CONTROL__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TRACES = CONTROL__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__SEARCHES = CONTROL__SEARCHES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TASKS = CONTROL__TASKS;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__FINDINGS = CONTROL__FINDINGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CWES = CONTROL__CWES;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__USERNAME = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PASSWORD = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.CryptographyControlType <em>Cryptography Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.CryptographyControlType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCryptographyControlType()
	 * @generated
	 */
	int CRYPTOGRAPHY_CONTROL_TYPE = 28;

	/**
	 * The number of structural features of the '<em>Cryptography Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_CONTROL_TYPE_FEATURE_COUNT = CONTROL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cryptography Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_CONTROL_TYPE_OPERATION_COUNT = CONTROL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyGroupImpl <em>Cryptography Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.CryptographyGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCryptographyGroup()
	 * @generated
	 */
	int CRYPTOGRAPHY_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_GROUP__NAME = CONTROL_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_GROUP__MEMBERS = CONTROL_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_GROUP__GROUP = CONTROL_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Cryptography Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_GROUP_FEATURE_COUNT = CONTROL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cryptography Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_GROUP_OPERATION_COUNT = CONTROL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl <em>Cryptography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCryptography()
	 * @generated
	 */
	int CRYPTOGRAPHY = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__GROUP = CONTROL__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__EVIDENCE = CONTROL__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__TRACES = CONTROL__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__SEARCHES = CONTROL__SEARCHES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__TASKS = CONTROL__TASKS;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__FINDINGS = CONTROL__FINDINGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__CWES = CONTROL__CWES;

	/**
	 * The number of structural features of the '<em>Cryptography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cryptography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType <em>Output Encoding Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getOutputEncodingControlType()
	 * @generated
	 */
	int OUTPUT_ENCODING_CONTROL_TYPE = 31;

	/**
	 * The number of structural features of the '<em>Output Encoding Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_CONTROL_TYPE_FEATURE_COUNT = CONTROL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Encoding Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_CONTROL_TYPE_OPERATION_COUNT = CONTROL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.OutputEncodingGroupImpl <em>Output Encoding Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.OutputEncodingGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getOutputEncodingGroup()
	 * @generated
	 */
	int OUTPUT_ENCODING_GROUP = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_GROUP__NAME = CONTROL_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_GROUP__MEMBERS = CONTROL_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_GROUP__GROUP = CONTROL_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Output Encoding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_GROUP_FEATURE_COUNT = CONTROL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Encoding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_GROUP_OPERATION_COUNT = CONTROL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.OutputEncodingImpl <em>Output Encoding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.OutputEncodingImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getOutputEncoding()
	 * @generated
	 */
	int OUTPUT_ENCODING = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__GROUP = CONTROL__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__EVIDENCE = CONTROL__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__TRACES = CONTROL__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__SEARCHES = CONTROL__SEARCHES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__TASKS = CONTROL__TASKS;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__FINDINGS = CONTROL__FINDINGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING__CWES = CONTROL__CWES;

	/**
	 * The number of structural features of the '<em>Output Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENCODING_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.GenericControlType <em>Generic Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.GenericControlType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGenericControlType()
	 * @generated
	 */
	int GENERIC_CONTROL_TYPE = 34;

	/**
	 * The number of structural features of the '<em>Generic Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE_FEATURE_COUNT = CONTROL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_TYPE_OPERATION_COUNT = CONTROL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.GenericControlImpl <em>Generic Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.GenericControlImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGenericControl()
	 * @generated
	 */
	int GENERIC_CONTROL = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__GROUP = CONTROL__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__EVIDENCE = CONTROL__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__TRACES = CONTROL__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__SEARCHES = CONTROL__SEARCHES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__TASKS = CONTROL__TASKS;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__FINDINGS = CONTROL__FINDINGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__DESCRIPTION = CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL__CWES = CONTROL__CWES;

	/**
	 * The number of structural features of the '<em>Generic Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.GenericControlGroupImpl <em>Generic Control Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.GenericControlGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGenericControlGroup()
	 * @generated
	 */
	int GENERIC_CONTROL_GROUP = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_GROUP__NAME = CONTROL_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_GROUP__MEMBERS = CONTROL_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_GROUP__GROUP = CONTROL_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Generic Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_GROUP_FEATURE_COUNT = CONTROL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROL_GROUP_OPERATION_COUNT = CONTROL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.SurfaceAreaType <em>Surface Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceAreaType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSurfaceAreaType()
	 * @generated
	 */
	int SURFACE_AREA_TYPE = 37;

	/**
	 * The number of structural features of the '<em>Surface Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Surface Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup <em>Surface Area Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSurfaceAreaGroup()
	 * @generated
	 */
	int SURFACE_AREA_GROUP = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP__NAME = GROUPABLE_MEMBERED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP__MEMBERS = GROUPABLE_MEMBERED__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP__GROUP = GROUPABLE_MEMBERED__GROUP;

	/**
	 * The number of structural features of the '<em>Surface Area Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP_FEATURE_COUNT = GROUPABLE_MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Surface Area Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP_OPERATION_COUNT = GROUPABLE_MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.SurfaceArea <em>Surface Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceArea
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSurfaceArea()
	 * @generated
	 */
	int SURFACE_AREA = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__GROUP = MEMBER__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__EVIDENCE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__TRACES = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__SEARCHES = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__TASKS = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__FINDINGS = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Surface Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Surface Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.NetworkIngressType <em>Network Ingress Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkIngressType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkIngressType()
	 * @generated
	 */
	int NETWORK_INGRESS_TYPE = 40;

	/**
	 * The number of structural features of the '<em>Network Ingress Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_TYPE_FEATURE_COUNT = SURFACE_AREA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Ingress Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_TYPE_OPERATION_COUNT = SURFACE_AREA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.NetworkIngressImpl <em>Network Ingress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.NetworkIngressImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkIngress()
	 * @generated
	 */
	int NETWORK_INGRESS = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS__NAME = SURFACE_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS__GROUP = SURFACE_AREA__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS__EVIDENCE = SURFACE_AREA__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS__TRACES = SURFACE_AREA__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS__SEARCHES = SURFACE_AREA__SEARCHES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS__TASKS = SURFACE_AREA__TASKS;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS__FINDINGS = SURFACE_AREA__FINDINGS;

	/**
	 * The number of structural features of the '<em>Network Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_FEATURE_COUNT = SURFACE_AREA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_OPERATION_COUNT = SURFACE_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.NetworkIngressGroupImpl <em>Network Ingress Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.NetworkIngressGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkIngressGroup()
	 * @generated
	 */
	int NETWORK_INGRESS_GROUP = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_GROUP__NAME = SURFACE_AREA_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_GROUP__MEMBERS = SURFACE_AREA_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_GROUP__GROUP = SURFACE_AREA_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Network Ingress Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_GROUP_FEATURE_COUNT = SURFACE_AREA_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Ingress Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INGRESS_GROUP_OPERATION_COUNT = SURFACE_AREA_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.NetworkEgressType <em>Network Egress Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkEgressType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkEgressType()
	 * @generated
	 */
	int NETWORK_EGRESS_TYPE = 43;

	/**
	 * The number of structural features of the '<em>Network Egress Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_TYPE_FEATURE_COUNT = SURFACE_AREA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Egress Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_TYPE_OPERATION_COUNT = SURFACE_AREA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.NetworkEgressImpl <em>Network Egress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.NetworkEgressImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkEgress()
	 * @generated
	 */
	int NETWORK_EGRESS = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS__NAME = SURFACE_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS__GROUP = SURFACE_AREA__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS__EVIDENCE = SURFACE_AREA__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS__TRACES = SURFACE_AREA__TRACES;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS__SEARCHES = SURFACE_AREA__SEARCHES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS__TASKS = SURFACE_AREA__TASKS;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS__FINDINGS = SURFACE_AREA__FINDINGS;

	/**
	 * The number of structural features of the '<em>Network Egress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_FEATURE_COUNT = SURFACE_AREA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Egress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_OPERATION_COUNT = SURFACE_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.NetworkEgressGroupImpl <em>Network Egress Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.NetworkEgressGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkEgressGroup()
	 * @generated
	 */
	int NETWORK_EGRESS_GROUP = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_GROUP__NAME = SURFACE_AREA_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_GROUP__MEMBERS = SURFACE_AREA_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_GROUP__GROUP = SURFACE_AREA_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Network Egress Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_GROUP_FEATURE_COUNT = SURFACE_AREA_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Egress Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EGRESS_GROUP_OPERATION_COUNT = SURFACE_AREA_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.DataType <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.DataType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 46;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Data <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Data
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getData()
	 * @generated
	 */
	int DATA = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__GROUP = MEMBER__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EXAMINEES = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TRACES = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SNIPPETS = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.DataGroup <em>Data Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.DataGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataGroup()
	 * @generated
	 */
	int DATA_GROUP = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__NAME = GROUPABLE_MEMBERED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__MEMBERS = GROUPABLE_MEMBERED__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__GROUP = GROUPABLE_MEMBERED__GROUP;

	/**
	 * The number of structural features of the '<em>Data Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP_FEATURE_COUNT = GROUPABLE_MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP_OPERATION_COUNT = GROUPABLE_MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.SnippetType <em>Snippet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.SnippetType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSnippetType()
	 * @generated
	 */
	int SNIPPET_TYPE = 49;

	/**
	 * The number of structural features of the '<em>Snippet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Snippet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Snippet <em>Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Snippet
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSnippet()
	 * @generated
	 */
	int SNIPPET = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__NAME = PROVABLE__NAME;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__EXAMINEES = PROVABLE__EXAMINEES;

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
	 * The number of structural features of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_FEATURE_COUNT = PROVABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_OPERATION_COUNT = PROVABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.TextSnippetType <em>Text Snippet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.TextSnippetType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTextSnippetType()
	 * @generated
	 */
	int TEXT_SNIPPET_TYPE = 51;

	/**
	 * The number of structural features of the '<em>Text Snippet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET_TYPE_FEATURE_COUNT = SNIPPET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Snippet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET_TYPE_OPERATION_COUNT = SNIPPET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.TextSnippetImpl <em>Text Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.TextSnippetImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTextSnippet()
	 * @generated
	 */
	int TEXT_SNIPPET = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET__NAME = SNIPPET__NAME;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET__EXAMINEES = SNIPPET__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET__TRACES = SNIPPET__TRACES;

	/**
	 * The feature id for the '<em><b>Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET__DATA = SNIPPET__DATA;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET__OFFSET = SNIPPET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET__LENGTH = SNIPPET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET__TEXT = SNIPPET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET_FEATURE_COUNT = SNIPPET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SNIPPET_OPERATION_COUNT = SNIPPET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FileTypeImpl <em>File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FileTypeImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 53;

	/**
	 * The number of structural features of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FileImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GROUP = DATA__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXAMINEES = DATA__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TRACES = DATA__TRACES;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DATA = DATA__DATA;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FULL_PATH = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FileGroupImpl <em>File Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.FileGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFileGroup()
	 * @generated
	 */
	int FILE_GROUP = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GROUP__NAME = DATA_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GROUP__MEMBERS = DATA_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GROUP__GROUP = DATA_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>File Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GROUP_FEATURE_COUNT = DATA_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GROUP_OPERATION_COUNT = DATA_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.RequestTypeImpl <em>Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.RequestTypeImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getRequestType()
	 * @generated
	 */
	int REQUEST_TYPE = 56;

	/**
	 * The number of structural features of the '<em>Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.RequestImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__GROUP = DATA__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__EXAMINEES = DATA__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__TRACES = DATA__TRACES;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DATA = DATA__DATA;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.RequestGroupImpl <em>Request Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.RequestGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getRequestGroup()
	 * @generated
	 */
	int REQUEST_GROUP = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_GROUP__NAME = DATA_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_GROUP__MEMBERS = DATA_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_GROUP__GROUP = DATA_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Request Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_GROUP_FEATURE_COUNT = DATA_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_GROUP_OPERATION_COUNT = DATA_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ResponseTypeImpl <em>Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ResponseTypeImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getResponseType()
	 * @generated
	 */
	int RESPONSE_TYPE = 59;

	/**
	 * The number of structural features of the '<em>Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ResponseImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__GROUP = DATA__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__EXAMINEES = DATA__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TRACES = DATA__TRACES;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DATA = DATA__DATA;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ResponseGroupImpl <em>Response Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ResponseGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getResponseGroup()
	 * @generated
	 */
	int RESPONSE_GROUP = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GROUP__NAME = DATA_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GROUP__MEMBERS = DATA_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GROUP__GROUP = DATA_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Response Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GROUP_FEATURE_COUNT = DATA_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GROUP_OPERATION_COUNT = DATA_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.FlowType <em>Flow Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.FlowType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowType()
	 * @generated
	 */
	int FLOW_TYPE = 62;

	/**
	 * The number of structural features of the '<em>Flow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Flow <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Flow
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__GROUP = MEMBER__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EVIDENCE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EXAMINEES = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__VALUE = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOWS = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.FlowGroup <em>Flow Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.FlowGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowGroup()
	 * @generated
	 */
	int FLOW_GROUP = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP__NAME = GROUPABLE_MEMBERED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP__MEMBERS = GROUPABLE_MEMBERED__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP__GROUP = GROUPABLE_MEMBERED__GROUP;

	/**
	 * The number of structural features of the '<em>Flow Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP_FEATURE_COUNT = GROUPABLE_MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_GROUP_OPERATION_COUNT = GROUPABLE_MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.FlowNode <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = TRACEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__EVIDENCE = TRACEABLE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__EXAMINEES = TRACEABLE__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__FLOW_FROM = TRACEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__FLOW_ROOT = TRACEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__FLOW_TO = TRACEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = TRACEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_OPERATION_COUNT = TRACEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.DataFlowType <em>Data Flow Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowType()
	 * @generated
	 */
	int DATA_FLOW_TYPE = 66;

	/**
	 * The number of structural features of the '<em>Data Flow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_TYPE_FEATURE_COUNT = FLOW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_TYPE_OPERATION_COUNT = FLOW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__EVIDENCE = FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__EXAMINEES = FLOW__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__VALUE = FLOW__VALUE;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__FLOWS = FLOW__FLOWS;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE_TYPE = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowNodeImpl <em>Data Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowNodeImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowNode()
	 * @generated
	 */
	int DATA_FLOW_NODE = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NODE__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NODE__EVIDENCE = FLOW_NODE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NODE__EXAMINEES = FLOW_NODE__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NODE__FLOW_FROM = FLOW_NODE__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NODE__FLOW_ROOT = FLOW_NODE__FLOW_ROOT;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NODE__FLOW_TO = FLOW_NODE__FLOW_TO;

	/**
	 * The number of structural features of the '<em>Data Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NODE_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowGroupImpl <em>Data Flow Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowGroup()
	 * @generated
	 */
	int DATA_FLOW_GROUP = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GROUP__NAME = FLOW_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GROUP__MEMBERS = FLOW_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GROUP__GROUP = FLOW_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Data Flow Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GROUP_FEATURE_COUNT = FLOW_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GROUP_OPERATION_COUNT = FLOW_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.DataFlowConstraint <em>Data Flow Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowConstraint
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowConstraint()
	 * @generated
	 */
	int DATA_FLOW_CONSTRAINT = 70;

	/**
	 * The number of structural features of the '<em>Data Flow Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT_FEATURE_COUNT = DATA_FLOW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_CONSTRAINT_OPERATION_COUNT = DATA_FLOW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl <em>Ends With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.EndsWithImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getEndsWith()
	 * @generated
	 */
	int ENDS_WITH = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__EVIDENCE = FLOW_NODE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__EXAMINEES = FLOW_NODE__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__FLOW_FROM = FLOW_NODE__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__FLOW_ROOT = FLOW_NODE__FLOW_ROOT;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__FLOW_TO = FLOW_NODE__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__SUFFIX = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.StartsWithImpl <em>Starts With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.StartsWithImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getStartsWith()
	 * @generated
	 */
	int STARTS_WITH = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__EVIDENCE = FLOW_NODE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__EXAMINEES = FLOW_NODE__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__FLOW_FROM = FLOW_NODE__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__FLOW_ROOT = FLOW_NODE__FLOW_ROOT;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__FLOW_TO = FLOW_NODE__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__PREFIX = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Starts With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Starts With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.MatchesImpl <em>Matches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.MatchesImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMatches()
	 * @generated
	 */
	int MATCHES = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__EVIDENCE = FLOW_NODE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__EXAMINEES = FLOW_NODE__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__FLOW_FROM = FLOW_NODE__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__FLOW_ROOT = FLOW_NODE__FLOW_ROOT;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__FLOW_TO = FLOW_NODE__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__PATTERN = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regex Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__REGEX_TYPE = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Matches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ContainsImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__EVIDENCE = FLOW_NODE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__EXAMINEES = FLOW_NODE__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__FLOW_FROM = FLOW_NODE__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__FLOW_ROOT = FLOW_NODE__FLOW_ROOT;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__FLOW_TO = FLOW_NODE__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__CONTENTS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CastedToImpl <em>Casted To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.CastedToImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCastedTo()
	 * @generated
	 */
	int CASTED_TO = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__EVIDENCE = FLOW_NODE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__EXAMINEES = FLOW_NODE__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__FLOW_FROM = FLOW_NODE__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__FLOW_ROOT = FLOW_NODE__FLOW_ROOT;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__FLOW_TO = FLOW_NODE__FLOW_TO;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO__TYPE = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Casted To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Casted To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_TO_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowType <em>Control Flow Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowType()
	 * @generated
	 */
	int CONTROL_FLOW_TYPE = 76;

	/**
	 * The number of structural features of the '<em>Control Flow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TYPE_FEATURE_COUNT = FLOW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Flow Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TYPE_OPERATION_COUNT = FLOW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__EVIDENCE = FLOW__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__EXAMINEES = FLOW__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__VALUE = FLOW__VALUE;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__FLOWS = FLOW__FLOWS;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowNodeImpl <em>Control Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowNodeImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowNode()
	 * @generated
	 */
	int CONTROL_FLOW_NODE = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NODE__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NODE__EVIDENCE = FLOW_NODE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NODE__EXAMINEES = FLOW_NODE__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Flow From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NODE__FLOW_FROM = FLOW_NODE__FLOW_FROM;

	/**
	 * The feature id for the '<em><b>Flow Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NODE__FLOW_ROOT = FLOW_NODE__FLOW_ROOT;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NODE__FLOW_TO = FLOW_NODE__FLOW_TO;

	/**
	 * The number of structural features of the '<em>Control Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NODE_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowGroupImpl <em>Control Flow Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowGroup()
	 * @generated
	 */
	int CONTROL_FLOW_GROUP = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GROUP__NAME = FLOW_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GROUP__MEMBERS = FLOW_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GROUP__GROUP = FLOW_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Control Flow Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GROUP_FEATURE_COUNT = FLOW_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Flow Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GROUP_OPERATION_COUNT = FLOW_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.AssessmentType <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessmentType()
	 * @generated
	 */
	int ASSESSMENT_TYPE = 80;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Assessable <em>Assessable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Assessable
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessable()
	 * @generated
	 */
	int ASSESSABLE = 81;

	/**
	 * The number of structural features of the '<em>Assessable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSABLE_FEATURE_COUNT = MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assessable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSABLE_OPERATION_COUNT = MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Assessment <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Assessment
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 82;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__NAME = MEMBERED_GROUPABLE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__GROUP = MEMBERED_GROUPABLE__GROUP;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__MEMBERS = MEMBERED_GROUPABLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__PROPERTIES = MEMBERED_GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = MEMBERED_GROUPABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = MEMBERED_GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.AssessmentGroup <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessmentGroup()
	 * @generated
	 */
	int ASSESSMENT_GROUP = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_GROUP__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_GROUP__MEMBERS = GROUP__MEMBERS;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType <em>Application Assessment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationAssessmentType()
	 * @generated
	 */
	int APPLICATION_ASSESSMENT_TYPE = 84;

	/**
	 * The number of structural features of the '<em>Application Assessment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT_TYPE_FEATURE_COUNT = ASSESSMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Assessment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT_TYPE_OPERATION_COUNT = ASSESSMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationAssessmentImpl <em>Application Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ApplicationAssessmentImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationAssessment()
	 * @generated
	 */
	int APPLICATION_ASSESSMENT = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT__NAME = ASSESSMENT__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT__GROUP = ASSESSMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT__MEMBERS = ASSESSMENT__MEMBERS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT__PROPERTIES = ASSESSMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Application Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT_FEATURE_COUNT = ASSESSMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT_OPERATION_COUNT = ASSESSMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationAssessmentGroupImpl <em>Application Assessment Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.ApplicationAssessmentGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationAssessmentGroup()
	 * @generated
	 */
	int APPLICATION_ASSESSMENT_GROUP = 86;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT_GROUP__NAME = ASSESSMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT_GROUP__MEMBERS = ASSESSMENT_GROUP__MEMBERS;

	/**
	 * The number of structural features of the '<em>Application Assessment Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT_GROUP_FEATURE_COUNT = ASSESSMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Assessment Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSESSMENT_GROUP_OPERATION_COUNT = ASSESSMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.PropertyImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 87;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.ApplicationType <em>Application Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 88;

	/**
	 * The number of structural features of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Applicational <em>Applicational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Applicational
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicational()
	 * @generated
	 */
	int APPLICATIONAL = 89;

	/**
	 * The number of structural features of the '<em>Applicational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONAL_FEATURE_COUNT = MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Applicational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONAL_OPERATION_COUNT = MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Application <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Application
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = MEMBERED_GROUPABLE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__GROUP = MEMBERED_GROUPABLE__GROUP;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MEMBERS = MEMBERED_GROUPABLE__MEMBERS;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = MEMBERED_GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = MEMBERED_GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup <em>Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationGroup()
	 * @generated
	 */
	int APPLICATION_GROUP = 91;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__NAME = GROUPABLE_MEMBERED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__MEMBERS = GROUPABLE_MEMBERED__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__GROUP = GROUPABLE_MEMBERED__GROUP;

	/**
	 * The number of structural features of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_FEATURE_COUNT = GROUPABLE_MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_OPERATION_COUNT = GROUPABLE_MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.WebApplicationType <em>Web Application Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplicationType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getWebApplicationType()
	 * @generated
	 */
	int WEB_APPLICATION_TYPE = 92;

	/**
	 * The number of structural features of the '<em>Web Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_TYPE_FEATURE_COUNT = APPLICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_TYPE_OPERATION_COUNT = APPLICATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl <em>Web Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getWebApplication()
	 * @generated
	 */
	int WEB_APPLICATION = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__NAME = APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__GROUP = APPLICATION__GROUP;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__MEMBERS = APPLICATION__MEMBERS;

	/**
	 * The feature id for the '<em><b>Internal URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__INTERNAL_URL = APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__EXTERNAL_URL = APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FEATURE_COUNT = APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_OPERATION_COUNT = APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationGroupImpl <em>Web Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.WebApplicationGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getWebApplicationGroup()
	 * @generated
	 */
	int WEB_APPLICATION_GROUP = 94;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_GROUP__NAME = APPLICATION_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_GROUP__MEMBERS = APPLICATION_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_GROUP__GROUP = APPLICATION_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Web Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_GROUP_FEATURE_COUNT = APPLICATION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_GROUP_OPERATION_COUNT = APPLICATION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.SearchType <em>Search Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.SearchType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchType()
	 * @generated
	 */
	int SEARCH_TYPE = 95;

	/**
	 * The number of structural features of the '<em>Search Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Search Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup <em>Search Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.SearchGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchGroup()
	 * @generated
	 */
	int SEARCH_GROUP = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__NAME = GROUPABLE_MEMBERED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__MEMBERS = GROUPABLE_MEMBERED__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__GROUP = GROUPABLE_MEMBERED__GROUP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__DESCRIPTION = GROUPABLE_MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Result CW Es</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP__SEARCH_RESULT_CW_ES = GROUPABLE_MEMBERED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Search Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP_FEATURE_COUNT = GROUPABLE_MEMBERED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Search Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_GROUP_OPERATION_COUNT = GROUPABLE_MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Search <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Search
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 97;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__GROUP = MEMBER__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__EXAMINEES = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__PATTERN = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.SearchPattern <em>Search Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.SearchPattern
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchPattern()
	 * @generated
	 */
	int SEARCH_PATTERN = 98;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchType <em>Java Search Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchType()
	 * @generated
	 */
	int JAVA_SEARCH_TYPE = 99;

	/**
	 * The number of structural features of the '<em>Java Search Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_TYPE_FEATURE_COUNT = SEARCH_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Java Search Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_TYPE_OPERATION_COUNT = SEARCH_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchImpl <em>Java Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.JavaSearchImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearch()
	 * @generated
	 */
	int JAVA_SEARCH = 100;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH__NAME = SEARCH__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH__GROUP = SEARCH__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH__EXAMINEES = SEARCH__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH__PATTERN = SEARCH__PATTERN;

	/**
	 * The number of structural features of the '<em>Java Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_FEATURE_COUNT = SEARCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Java Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_OPERATION_COUNT = SEARCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchGroupImpl <em>Java Search Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.JavaSearchGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchGroup()
	 * @generated
	 */
	int JAVA_SEARCH_GROUP = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_GROUP__NAME = SEARCH_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_GROUP__MEMBERS = SEARCH_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_GROUP__GROUP = SEARCH_GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_GROUP__DESCRIPTION = SEARCH_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Search Result CW Es</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_GROUP__SEARCH_RESULT_CW_ES = SEARCH_GROUP__SEARCH_RESULT_CW_ES;

	/**
	 * The number of structural features of the '<em>Java Search Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_GROUP_FEATURE_COUNT = SEARCH_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Java Search Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SEARCH_GROUP_OPERATION_COUNT = SEARCH_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl <em>Java Search Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.JavaSearchPatternImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchPattern()
	 * @generated
	 */
	int JAVA_SEARCH_PATTERN = 102;

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
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.TaskType <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.TaskType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 103;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.TaskGroup <em>Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.TaskGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTaskGroup()
	 * @generated
	 */
	int TASK_GROUP = 104;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__NAME = GROUPABLE_MEMBERED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MEMBERS = GROUPABLE_MEMBERED__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__GROUP = GROUPABLE_MEMBERED__GROUP;

	/**
	 * The number of structural features of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_FEATURE_COUNT = GROUPABLE_MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_OPERATION_COUNT = GROUPABLE_MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Task <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Task
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 105;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__GROUP = MEMBER__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXAMINEES = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_STATUS = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.LocalTaskType <em>Local Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.LocalTaskType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalTaskType()
	 * @generated
	 */
	int LOCAL_TASK_TYPE = 106;

	/**
	 * The number of structural features of the '<em>Local Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_TYPE_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_TYPE_OPERATION_COUNT = TASK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.LocalTaskGroupImpl <em>Local Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.LocalTaskGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalTaskGroup()
	 * @generated
	 */
	int LOCAL_TASK_GROUP = 107;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_GROUP__NAME = TASK_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_GROUP__MEMBERS = TASK_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_GROUP__GROUP = TASK_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Local Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_GROUP_FEATURE_COUNT = TASK_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_GROUP_OPERATION_COUNT = TASK_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.LocalTaskImpl <em>Local Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.LocalTaskImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalTask()
	 * @generated
	 */
	int LOCAL_TASK = 108;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK__GROUP = TASK__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK__EXAMINEES = TASK__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Task Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK__TASK_STATUS = TASK__TASK_STATUS;

	/**
	 * The number of structural features of the '<em>Local Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.FindingType <em>Finding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.FindingType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFindingType()
	 * @generated
	 */
	int FINDING_TYPE = 109;

	/**
	 * The number of structural features of the '<em>Finding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TYPE_FEATURE_COUNT = GROUPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Finding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TYPE_OPERATION_COUNT = GROUPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.FindingGroup <em>Finding Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.FindingGroup
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFindingGroup()
	 * @generated
	 */
	int FINDING_GROUP = 110;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_GROUP__NAME = GROUPABLE_MEMBERED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_GROUP__MEMBERS = GROUPABLE_MEMBERED__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_GROUP__GROUP = GROUPABLE_MEMBERED__GROUP;

	/**
	 * The number of structural features of the '<em>Finding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_GROUP_FEATURE_COUNT = GROUPABLE_MEMBERED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Finding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_GROUP_OPERATION_COUNT = GROUPABLE_MEMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.Finding <em>Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.Finding
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFinding()
	 * @generated
	 */
	int FINDING = 111;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__GROUP = MEMBER__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__EXAMINEES = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DESCRIPTION = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DETAILS = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REMEDIATION = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reproducer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REPRODUCER = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REFERENCES = MEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.LocalFindingType <em>Local Finding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.LocalFindingType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalFindingType()
	 * @generated
	 */
	int LOCAL_FINDING_TYPE = 112;

	/**
	 * The number of structural features of the '<em>Local Finding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_TYPE_FEATURE_COUNT = FINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Finding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_TYPE_OPERATION_COUNT = FINDING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingGroupImpl <em>Local Finding Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.LocalFindingGroupImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalFindingGroup()
	 * @generated
	 */
	int LOCAL_FINDING_GROUP = 113;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_GROUP__NAME = FINDING_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_GROUP__MEMBERS = FINDING_GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_GROUP__GROUP = FINDING_GROUP__GROUP;

	/**
	 * The number of structural features of the '<em>Local Finding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_GROUP_FEATURE_COUNT = FINDING_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Finding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_GROUP_OPERATION_COUNT = FINDING_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl <em>Local Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalFinding()
	 * @generated
	 */
	int LOCAL_FINDING = 114;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING__NAME = FINDING__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING__GROUP = FINDING__GROUP;

	/**
	 * The feature id for the '<em><b>Examinees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING__EXAMINEES = FINDING__EXAMINEES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING__DESCRIPTION = FINDING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING__DETAILS = FINDING__DETAILS;

	/**
	 * The feature id for the '<em><b>Remediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING__REMEDIATION = FINDING__REMEDIATION;

	/**
	 * The feature id for the '<em><b>Reproducer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING__REPRODUCER = FINDING__REPRODUCER;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING__REFERENCES = FINDING__REFERENCES;

	/**
	 * The number of structural features of the '<em>Local Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_FEATURE_COUNT = FINDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FINDING_OPERATION_COUNT = FINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.DataTaintType <em>Data Taint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.DataTaintType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataTaintType()
	 * @generated
	 */
	int DATA_TAINT_TYPE = 115;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.MatcherRegex <em>Matcher Regex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.MatcherRegex
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMatcherRegex()
	 * @generated
	 */
	int MATCHER_REGEX = 116;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType <em>Java Search Pattern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchPatternType
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchPatternType()
	 * @generated
	 */
	int JAVA_SEARCH_PATTERN_TYPE = 117;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchFor <em>Java Search For</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchFor
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchFor()
	 * @generated
	 */
	int JAVA_SEARCH_FOR = 118;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaLimitTo <em>Java Limit To</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaLimitTo
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaLimitTo()
	 * @generated
	 */
	int JAVA_LIMIT_TO = 119;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaMatchRule <em>Java Match Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchRule
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaMatchRule()
	 * @generated
	 */
	int JAVA_MATCH_RULE = 120;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity <em>Java Match Case Sensitivity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.JavaMatchCaseSensitivity
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaMatchCaseSensitivity()
	 * @generated
	 */
	int JAVA_MATCH_CASE_SENSITIVITY = 121;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.assessment.TaskStatus <em>Task Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.assessment.TaskStatus
	 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTaskStatus()
	 * @generated
	 */
	int TASK_STATUS = 122;


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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Describable <em>Describable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Describable
	 * @generated
	 */
	EClass getDescribable();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Describable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Describable#getDescription()
	 * @see #getDescribable()
	 * @generated
	 */
	EAttribute getDescribable_Description();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Examinable <em>Examinable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examinable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable
	 * @generated
	 */
	EClass getExaminable();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Examinable#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable#getEvidence()
	 * @see #getExaminable()
	 * @generated
	 */
	EReference getExaminable_Evidence();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Examinable#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traces</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable#getTraces()
	 * @see #getExaminable()
	 * @generated
	 */
	EReference getExaminable_Traces();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Examinable#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Searches</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable#getSearches()
	 * @see #getExaminable()
	 * @generated
	 */
	EReference getExaminable_Searches();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Examinable#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable#getTasks()
	 * @see #getExaminable()
	 * @generated
	 */
	EReference getExaminable_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Examinable#getFindings <em>Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Findings</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Examinable#getFindings()
	 * @see #getExaminable()
	 * @generated
	 */
	EReference getExaminable_Findings();

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
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Provable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Examinees</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Provable#getExaminees()
	 * @see #getProvable()
	 * @generated
	 */
	EReference getProvable_Examinees();

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
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Traceable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Examinees</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Traceable#getExaminees()
	 * @see #getTraceable()
	 * @generated
	 */
	EReference getTraceable_Examinees();

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
	 * Returns the meta object for the reference '{@link us.coastalhacking.semiotics.model.assessment.Searchable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Examinees</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Searchable#getExaminees()
	 * @see #getSearchable()
	 * @generated
	 */
	EReference getSearchable_Examinees();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Taskable <em>Taskable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taskable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Taskable
	 * @generated
	 */
	EClass getTaskable();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Taskable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Examinees</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Taskable#getExaminees()
	 * @see #getTaskable()
	 * @generated
	 */
	EReference getTaskable_Examinees();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Findable <em>Findable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Findable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Findable
	 * @generated
	 */
	EClass getFindable();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.assessment.Findable#getExaminees <em>Examinees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Examinees</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Findable#getExaminees()
	 * @see #getFindable()
	 * @generated
	 */
	EReference getFindable_Examinees();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Groupable <em>Groupable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Groupable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Groupable
	 * @generated
	 */
	EClass getGroupable();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Membered <em>Membered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membered</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Membered
	 * @generated
	 */
	EClass getMembered();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.Group#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Group#getMembers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Members();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.Member#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Member#getGroup()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Group();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.GroupableMembered <em>Groupable Membered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Groupable Membered</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.GroupableMembered
	 * @generated
	 */
	EClass getGroupableMembered();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.MemberedGroupable <em>Membered Groupable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membered Groupable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.MemberedGroupable
	 * @generated
	 */
	EClass getMemberedGroupable();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlType
	 * @generated
	 */
	EClass getControlType();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Control
	 * @generated
	 */
	EClass getControl();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.AuthenticationControlType <em>Authentication Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Control Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.AuthenticationControlType
	 * @generated
	 */
	EClass getAuthenticationControlType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.AuthenticationGroup <em>Authentication Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.AuthenticationGroup
	 * @generated
	 */
	EClass getAuthenticationGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.AuthorizationControlType <em>Authorization Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Control Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.AuthorizationControlType
	 * @generated
	 */
	EClass getAuthorizationControlType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.AuthorizationGroup <em>Authorization Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.AuthorizationGroup
	 * @generated
	 */
	EClass getAuthorizationGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Authorization
	 * @generated
	 */
	EClass getAuthorization();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.AccountControlType <em>Account Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Control Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.AccountControlType
	 * @generated
	 */
	EClass getAccountControlType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.AccountGroup <em>Account Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.AccountGroup
	 * @generated
	 */
	EClass getAccountGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Account#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Account#getUsername()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Username();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Account#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Account#getPassword()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Password();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.CryptographyControlType <em>Cryptography Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cryptography Control Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CryptographyControlType
	 * @generated
	 */
	EClass getCryptographyControlType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.CryptographyGroup <em>Cryptography Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cryptography Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.CryptographyGroup
	 * @generated
	 */
	EClass getCryptographyGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Cryptography <em>Cryptography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cryptography</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Cryptography
	 * @generated
	 */
	EClass getCryptography();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType <em>Output Encoding Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Encoding Control Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType
	 * @generated
	 */
	EClass getOutputEncodingControlType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.OutputEncodingGroup <em>Output Encoding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Encoding Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.OutputEncodingGroup
	 * @generated
	 */
	EClass getOutputEncodingGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.OutputEncoding <em>Output Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Encoding</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.OutputEncoding
	 * @generated
	 */
	EClass getOutputEncoding();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.GenericControlType <em>Generic Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Control Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.GenericControlType
	 * @generated
	 */
	EClass getGenericControlType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.GenericControl <em>Generic Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Control</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.GenericControl
	 * @generated
	 */
	EClass getGenericControl();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.GenericControlGroup <em>Generic Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Control Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.GenericControlGroup
	 * @generated
	 */
	EClass getGenericControlGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.SurfaceAreaType <em>Surface Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Area Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceAreaType
	 * @generated
	 */
	EClass getSurfaceAreaType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup <em>Surface Area Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Area Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup
	 * @generated
	 */
	EClass getSurfaceAreaGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.SurfaceArea <em>Surface Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Area</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SurfaceArea
	 * @generated
	 */
	EClass getSurfaceArea();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.NetworkIngressType <em>Network Ingress Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Ingress Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkIngressType
	 * @generated
	 */
	EClass getNetworkIngressType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.NetworkIngress <em>Network Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Ingress</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkIngress
	 * @generated
	 */
	EClass getNetworkIngress();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.NetworkIngressGroup <em>Network Ingress Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Ingress Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkIngressGroup
	 * @generated
	 */
	EClass getNetworkIngressGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.NetworkEgressType <em>Network Egress Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Egress Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkEgressType
	 * @generated
	 */
	EClass getNetworkEgressType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.NetworkEgress <em>Network Egress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Egress</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkEgress
	 * @generated
	 */
	EClass getNetworkEgress();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.NetworkEgressGroup <em>Network Egress Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Egress Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.NetworkEgressGroup
	 * @generated
	 */
	EClass getNetworkEgressGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataType
	 * @generated
	 */
	EClass getDataType();

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
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Data#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Data#getData()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Data();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.SnippetType <em>Snippet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SnippetType
	 * @generated
	 */
	EClass getSnippetType();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.TextSnippetType <em>Text Snippet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Snippet Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.TextSnippetType
	 * @generated
	 */
	EClass getTextSnippetType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.TextSnippet <em>Text Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Snippet</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.TextSnippet
	 * @generated
	 */
	EClass getTextSnippet();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.TextSnippet#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.TextSnippet#getOffset()
	 * @see #getTextSnippet()
	 * @generated
	 */
	EAttribute getTextSnippet_Offset();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.TextSnippet#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.TextSnippet#getLength()
	 * @see #getTextSnippet()
	 * @generated
	 */
	EAttribute getTextSnippet_Length();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.TextSnippet#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.TextSnippet#getText()
	 * @see #getTextSnippet()
	 * @generated
	 */
	EAttribute getTextSnippet_Text();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FileType
	 * @generated
	 */
	EClass getFileType();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FileGroup <em>File Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FileGroup
	 * @generated
	 */
	EClass getFileGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.RequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.RequestType
	 * @generated
	 */
	EClass getRequestType();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.RequestGroup <em>Request Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.RequestGroup
	 * @generated
	 */
	EClass getRequestGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ResponseType
	 * @generated
	 */
	EClass getResponseType();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ResponseGroup <em>Response Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ResponseGroup
	 * @generated
	 */
	EClass getResponseGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FlowType <em>Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowType
	 * @generated
	 */
	EClass getFlowType();

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
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Flow#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Flow#getValue()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Value();

	/**
	 * Returns the meta object for the containment reference '{@link us.coastalhacking.semiotics.model.assessment.Flow#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flows</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Flow#getFlows()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Flows();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowFrom <em>Flow From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow From</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowFrom()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_FlowFrom();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowRoot <em>Flow Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow Root</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowRoot()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_FlowRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowTo <em>Flow To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow To</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FlowNode#getFlowTo()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_FlowTo();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowType <em>Data Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowType
	 * @generated
	 */
	EClass getDataFlowType();

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
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.DataFlow#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlow#getSourceType()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_SourceType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowNode <em>Data Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Node</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowNode
	 * @generated
	 */
	EClass getDataFlowNode();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.DataFlowGroup <em>Data Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataFlowGroup
	 * @generated
	 */
	EClass getDataFlowGroup();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowType <em>Control Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowType
	 * @generated
	 */
	EClass getControlFlowType();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowNode <em>Control Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Node</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowNode
	 * @generated
	 */
	EClass getControlFlowNode();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowGroup <em>Control Flow Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowGroup
	 * @generated
	 */
	EClass getControlFlowGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.AssessmentType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentType
	 * @generated
	 */
	EClass getAssessmentType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Assessable <em>Assessable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessable</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Assessable
	 * @generated
	 */
	EClass getAssessable();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.AssessmentGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentGroup
	 * @generated
	 */
	EClass getAssessmentGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType <em>Application Assessment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Assessment Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType
	 * @generated
	 */
	EClass getApplicationAssessmentType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationAssessment <em>Application Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Assessment</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationAssessment
	 * @generated
	 */
	EClass getApplicationAssessment();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentGroup <em>Application Assessment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Assessment Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentGroup
	 * @generated
	 */
	EClass getApplicationAssessmentGroup();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationType
	 * @generated
	 */
	EClass getApplicationType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Applicational <em>Applicational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicational</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Applicational
	 * @generated
	 */
	EClass getApplicational();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.ApplicationGroup
	 * @generated
	 */
	EClass getApplicationGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.WebApplicationType <em>Web Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplicationType
	 * @generated
	 */
	EClass getWebApplicationType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplication
	 * @generated
	 */
	EClass getWebApplication();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.WebApplication#getInternalURL <em>Internal URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal URL</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplication#getInternalURL()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_InternalURL();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.WebApplication#getExternalURL <em>External URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External URL</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplication#getExternalURL()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_ExternalURL();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.WebApplicationGroup <em>Web Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.WebApplicationGroup
	 * @generated
	 */
	EClass getWebApplicationGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.SearchType <em>Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.SearchType
	 * @generated
	 */
	EClass getSearchType();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchType <em>Java Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Search Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchType
	 * @generated
	 */
	EClass getJavaSearchType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.JavaSearch <em>Java Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Search</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearch
	 * @generated
	 */
	EClass getJavaSearch();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchGroup <em>Java Search Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Search Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchGroup
	 * @generated
	 */
	EClass getJavaSearchGroup();

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
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.TaskGroup
	 * @generated
	 */
	EClass getTaskGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Task#getTaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Status</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Task#getTaskStatus()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskStatus();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.LocalTaskType <em>Local Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Task Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalTaskType
	 * @generated
	 */
	EClass getLocalTaskType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.LocalTaskGroup <em>Local Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Task Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalTaskGroup
	 * @generated
	 */
	EClass getLocalTaskGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.LocalTask <em>Local Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Task</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalTask
	 * @generated
	 */
	EClass getLocalTask();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FindingType <em>Finding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FindingType
	 * @generated
	 */
	EClass getFindingType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.FindingGroup <em>Finding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.FindingGroup
	 * @generated
	 */
	EClass getFindingGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Finding
	 * @generated
	 */
	EClass getFinding();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Finding#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Finding#getDetails()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Details();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Finding#getRemediation <em>Remediation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remediation</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Finding#getRemediation()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Remediation();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Finding#getReproducer <em>Reproducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reproducer</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Finding#getReproducer()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Reproducer();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.assessment.Finding#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>References</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.Finding#getReferences()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_References();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.LocalFindingType <em>Local Finding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Finding Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalFindingType
	 * @generated
	 */
	EClass getLocalFindingType();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.LocalFindingGroup <em>Local Finding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Finding Group</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalFindingGroup
	 * @generated
	 */
	EClass getLocalFindingGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.assessment.LocalFinding <em>Local Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Finding</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.LocalFinding
	 * @generated
	 */
	EClass getLocalFinding();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.DataTaintType <em>Data Taint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Taint Type</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.DataTaintType
	 * @generated
	 */
	EEnum getDataTaintType();

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
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.model.assessment.TaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Status</em>'.
	 * @see us.coastalhacking.semiotics.model.assessment.TaskStatus
	 * @generated
	 */
	EEnum getTaskStatus();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Describable <em>Describable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Describable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDescribable()
		 * @generated
		 */
		EClass DESCRIBABLE = eINSTANCE.getDescribable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE__DESCRIPTION = eINSTANCE.getDescribable_Description();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Examinable <em>Examinable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Examinable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getExaminable()
		 * @generated
		 */
		EClass EXAMINABLE = eINSTANCE.getExaminable();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINABLE__EVIDENCE = eINSTANCE.getExaminable_Evidence();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINABLE__TRACES = eINSTANCE.getExaminable_Traces();

		/**
		 * The meta object literal for the '<em><b>Searches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINABLE__SEARCHES = eINSTANCE.getExaminable_Searches();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINABLE__TASKS = eINSTANCE.getExaminable_Tasks();

		/**
		 * The meta object literal for the '<em><b>Findings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINABLE__FINDINGS = eINSTANCE.getExaminable_Findings();

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
		 * The meta object literal for the '<em><b>Examinees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVABLE__EXAMINEES = eINSTANCE.getProvable_Examinees();

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
		 * The meta object literal for the '<em><b>Examinees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE__EXAMINEES = eINSTANCE.getTraceable_Examinees();

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
		 * The meta object literal for the '<em><b>Examinees</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCHABLE__EXAMINEES = eINSTANCE.getSearchable_Examinees();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Taskable <em>Taskable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Taskable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTaskable()
		 * @generated
		 */
		EClass TASKABLE = eINSTANCE.getTaskable();

		/**
		 * The meta object literal for the '<em><b>Examinees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKABLE__EXAMINEES = eINSTANCE.getTaskable_Examinees();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Findable <em>Findable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Findable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFindable()
		 * @generated
		 */
		EClass FINDABLE = eINSTANCE.getFindable();

		/**
		 * The meta object literal for the '<em><b>Examinees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINDABLE__EXAMINEES = eINSTANCE.getFindable_Examinees();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Groupable <em>Groupable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Groupable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGroupable()
		 * @generated
		 */
		EClass GROUPABLE = eINSTANCE.getGroupable();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Membered <em>Membered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Membered
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMembered()
		 * @generated
		 */
		EClass MEMBERED = eINSTANCE.getMembered();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Group <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Group
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MEMBERS = eINSTANCE.getGroup_Members();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Member <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Member
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__GROUP = eINSTANCE.getMember_Group();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.GroupableMembered <em>Groupable Membered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.GroupableMembered
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGroupableMembered()
		 * @generated
		 */
		EClass GROUPABLE_MEMBERED = eINSTANCE.getGroupableMembered();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.MemberedGroupable <em>Membered Groupable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.MemberedGroupable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getMemberedGroupable()
		 * @generated
		 */
		EClass MEMBERED_GROUPABLE = eINSTANCE.getMemberedGroupable();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.ControlType <em>Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.ControlType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlType()
		 * @generated
		 */
		EClass CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.ControlGroup <em>Control Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.ControlGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlGroup()
		 * @generated
		 */
		EClass CONTROL_GROUP = eINSTANCE.getControlGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Control <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Control
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.AuthenticationControlType <em>Authentication Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.AuthenticationControlType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthenticationControlType()
		 * @generated
		 */
		EClass AUTHENTICATION_CONTROL_TYPE = eINSTANCE.getAuthenticationControlType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AuthenticationGroupImpl <em>Authentication Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AuthenticationGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthenticationGroup()
		 * @generated
		 */
		EClass AUTHENTICATION_GROUP = eINSTANCE.getAuthenticationGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AuthenticationImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.AuthorizationControlType <em>Authorization Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.AuthorizationControlType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthorizationControlType()
		 * @generated
		 */
		EClass AUTHORIZATION_CONTROL_TYPE = eINSTANCE.getAuthorizationControlType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationGroupImpl <em>Authorization Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AuthorizationGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthorizationGroup()
		 * @generated
		 */
		EClass AUTHORIZATION_GROUP = eINSTANCE.getAuthorizationGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl <em>Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AuthorizationImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAuthorization()
		 * @generated
		 */
		EClass AUTHORIZATION = eINSTANCE.getAuthorization();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.AccountControlType <em>Account Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.AccountControlType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAccountControlType()
		 * @generated
		 */
		EClass ACCOUNT_CONTROL_TYPE = eINSTANCE.getAccountControlType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AccountGroupImpl <em>Account Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AccountGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAccountGroup()
		 * @generated
		 */
		EClass ACCOUNT_GROUP = eINSTANCE.getAccountGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AccountImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__USERNAME = eINSTANCE.getAccount_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PASSWORD = eINSTANCE.getAccount_Password();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.CryptographyControlType <em>Cryptography Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.CryptographyControlType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCryptographyControlType()
		 * @generated
		 */
		EClass CRYPTOGRAPHY_CONTROL_TYPE = eINSTANCE.getCryptographyControlType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyGroupImpl <em>Cryptography Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.CryptographyGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCryptographyGroup()
		 * @generated
		 */
		EClass CRYPTOGRAPHY_GROUP = eINSTANCE.getCryptographyGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl <em>Cryptography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.CryptographyImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getCryptography()
		 * @generated
		 */
		EClass CRYPTOGRAPHY = eINSTANCE.getCryptography();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType <em>Output Encoding Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.OutputEncodingControlType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getOutputEncodingControlType()
		 * @generated
		 */
		EClass OUTPUT_ENCODING_CONTROL_TYPE = eINSTANCE.getOutputEncodingControlType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.OutputEncodingGroupImpl <em>Output Encoding Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.OutputEncodingGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getOutputEncodingGroup()
		 * @generated
		 */
		EClass OUTPUT_ENCODING_GROUP = eINSTANCE.getOutputEncodingGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.OutputEncodingImpl <em>Output Encoding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.OutputEncodingImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getOutputEncoding()
		 * @generated
		 */
		EClass OUTPUT_ENCODING = eINSTANCE.getOutputEncoding();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.GenericControlType <em>Generic Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.GenericControlType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGenericControlType()
		 * @generated
		 */
		EClass GENERIC_CONTROL_TYPE = eINSTANCE.getGenericControlType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.GenericControlImpl <em>Generic Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.GenericControlImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGenericControl()
		 * @generated
		 */
		EClass GENERIC_CONTROL = eINSTANCE.getGenericControl();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.GenericControlGroupImpl <em>Generic Control Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.GenericControlGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getGenericControlGroup()
		 * @generated
		 */
		EClass GENERIC_CONTROL_GROUP = eINSTANCE.getGenericControlGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.SurfaceAreaType <em>Surface Area Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.SurfaceAreaType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSurfaceAreaType()
		 * @generated
		 */
		EClass SURFACE_AREA_TYPE = eINSTANCE.getSurfaceAreaType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup <em>Surface Area Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.SurfaceAreaGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSurfaceAreaGroup()
		 * @generated
		 */
		EClass SURFACE_AREA_GROUP = eINSTANCE.getSurfaceAreaGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.SurfaceArea <em>Surface Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.SurfaceArea
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSurfaceArea()
		 * @generated
		 */
		EClass SURFACE_AREA = eINSTANCE.getSurfaceArea();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.NetworkIngressType <em>Network Ingress Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.NetworkIngressType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkIngressType()
		 * @generated
		 */
		EClass NETWORK_INGRESS_TYPE = eINSTANCE.getNetworkIngressType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.NetworkIngressImpl <em>Network Ingress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.NetworkIngressImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkIngress()
		 * @generated
		 */
		EClass NETWORK_INGRESS = eINSTANCE.getNetworkIngress();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.NetworkIngressGroupImpl <em>Network Ingress Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.NetworkIngressGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkIngressGroup()
		 * @generated
		 */
		EClass NETWORK_INGRESS_GROUP = eINSTANCE.getNetworkIngressGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.NetworkEgressType <em>Network Egress Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.NetworkEgressType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkEgressType()
		 * @generated
		 */
		EClass NETWORK_EGRESS_TYPE = eINSTANCE.getNetworkEgressType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.NetworkEgressImpl <em>Network Egress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.NetworkEgressImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkEgress()
		 * @generated
		 */
		EClass NETWORK_EGRESS = eINSTANCE.getNetworkEgress();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.NetworkEgressGroupImpl <em>Network Egress Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.NetworkEgressGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getNetworkEgressGroup()
		 * @generated
		 */
		EClass NETWORK_EGRESS_GROUP = eINSTANCE.getNetworkEgressGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.DataType <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.DataType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Data <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Data
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
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DATA = eINSTANCE.getData_Data();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.DataGroup <em>Data Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.DataGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataGroup()
		 * @generated
		 */
		EClass DATA_GROUP = eINSTANCE.getDataGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.SnippetType <em>Snippet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.SnippetType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSnippetType()
		 * @generated
		 */
		EClass SNIPPET_TYPE = eINSTANCE.getSnippetType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Snippet <em>Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Snippet
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.TextSnippetType <em>Text Snippet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.TextSnippetType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTextSnippetType()
		 * @generated
		 */
		EClass TEXT_SNIPPET_TYPE = eINSTANCE.getTextSnippetType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.TextSnippetImpl <em>Text Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.TextSnippetImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTextSnippet()
		 * @generated
		 */
		EClass TEXT_SNIPPET = eINSTANCE.getTextSnippet();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_SNIPPET__OFFSET = eINSTANCE.getTextSnippet_Offset();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_SNIPPET__LENGTH = eINSTANCE.getTextSnippet_Length();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_SNIPPET__TEXT = eINSTANCE.getTextSnippet_Text();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FileTypeImpl <em>File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.FileTypeImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFileType()
		 * @generated
		 */
		EClass FILE_TYPE = eINSTANCE.getFileType();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.FileGroupImpl <em>File Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.FileGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFileGroup()
		 * @generated
		 */
		EClass FILE_GROUP = eINSTANCE.getFileGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.RequestTypeImpl <em>Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.RequestTypeImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getRequestType()
		 * @generated
		 */
		EClass REQUEST_TYPE = eINSTANCE.getRequestType();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.RequestGroupImpl <em>Request Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.RequestGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getRequestGroup()
		 * @generated
		 */
		EClass REQUEST_GROUP = eINSTANCE.getRequestGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ResponseTypeImpl <em>Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ResponseTypeImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getResponseType()
		 * @generated
		 */
		EClass RESPONSE_TYPE = eINSTANCE.getResponseType();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ResponseGroupImpl <em>Response Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ResponseGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getResponseGroup()
		 * @generated
		 */
		EClass RESPONSE_GROUP = eINSTANCE.getResponseGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.FlowType <em>Flow Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.FlowType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowType()
		 * @generated
		 */
		EClass FLOW_TYPE = eINSTANCE.getFlowType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Flow <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Flow
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__VALUE = eINSTANCE.getFlow_Value();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FLOWS = eINSTANCE.getFlow_Flows();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.FlowGroup <em>Flow Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.FlowGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowGroup()
		 * @generated
		 */
		EClass FLOW_GROUP = eINSTANCE.getFlowGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.FlowNode <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.FlowNode
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '<em><b>Flow From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__FLOW_FROM = eINSTANCE.getFlowNode_FlowFrom();

		/**
		 * The meta object literal for the '<em><b>Flow Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__FLOW_ROOT = eINSTANCE.getFlowNode_FlowRoot();

		/**
		 * The meta object literal for the '<em><b>Flow To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__FLOW_TO = eINSTANCE.getFlowNode_FlowTo();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.DataFlowType <em>Data Flow Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.DataFlowType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowType()
		 * @generated
		 */
		EClass DATA_FLOW_TYPE = eINSTANCE.getDataFlowType();

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
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__SOURCE_TYPE = eINSTANCE.getDataFlow_SourceType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowNodeImpl <em>Data Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowNodeImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowNode()
		 * @generated
		 */
		EClass DATA_FLOW_NODE = eINSTANCE.getDataFlowNode();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.DataFlowGroupImpl <em>Data Flow Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.DataFlowGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataFlowGroup()
		 * @generated
		 */
		EClass DATA_FLOW_GROUP = eINSTANCE.getDataFlowGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.DataFlowConstraint <em>Data Flow Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.DataFlowConstraint
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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.ControlFlowType <em>Control Flow Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.ControlFlowType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowType()
		 * @generated
		 */
		EClass CONTROL_FLOW_TYPE = eINSTANCE.getControlFlowType();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowNodeImpl <em>Control Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowNodeImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowNode()
		 * @generated
		 */
		EClass CONTROL_FLOW_NODE = eINSTANCE.getControlFlowNode();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ControlFlowGroupImpl <em>Control Flow Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ControlFlowGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getControlFlowGroup()
		 * @generated
		 */
		EClass CONTROL_FLOW_GROUP = eINSTANCE.getControlFlowGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.AssessmentType <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.AssessmentType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessmentType()
		 * @generated
		 */
		EClass ASSESSMENT_TYPE = eINSTANCE.getAssessmentType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Assessable <em>Assessable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Assessable
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessable()
		 * @generated
		 */
		EClass ASSESSABLE = eINSTANCE.getAssessable();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Assessment <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Assessment
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__PROPERTIES = eINSTANCE.getAssessment_Properties();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.AssessmentGroup <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.AssessmentGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessmentGroup()
		 * @generated
		 */
		EClass ASSESSMENT_GROUP = eINSTANCE.getAssessmentGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType <em>Application Assessment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.ApplicationAssessmentType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationAssessmentType()
		 * @generated
		 */
		EClass APPLICATION_ASSESSMENT_TYPE = eINSTANCE.getApplicationAssessmentType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationAssessmentImpl <em>Application Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ApplicationAssessmentImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationAssessment()
		 * @generated
		 */
		EClass APPLICATION_ASSESSMENT = eINSTANCE.getApplicationAssessment();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.ApplicationAssessmentGroupImpl <em>Application Assessment Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.ApplicationAssessmentGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationAssessmentGroup()
		 * @generated
		 */
		EClass APPLICATION_ASSESSMENT_GROUP = eINSTANCE.getApplicationAssessmentGroup();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.ApplicationType <em>Application Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.ApplicationType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationType()
		 * @generated
		 */
		EClass APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Applicational <em>Applicational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Applicational
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicational()
		 * @generated
		 */
		EClass APPLICATIONAL = eINSTANCE.getApplicational();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Application <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Application
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.ApplicationGroup <em>Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.ApplicationGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplicationGroup()
		 * @generated
		 */
		EClass APPLICATION_GROUP = eINSTANCE.getApplicationGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.WebApplicationType <em>Web Application Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.WebApplicationType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getWebApplicationType()
		 * @generated
		 */
		EClass WEB_APPLICATION_TYPE = eINSTANCE.getWebApplicationType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl <em>Web Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.WebApplicationImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getWebApplication()
		 * @generated
		 */
		EClass WEB_APPLICATION = eINSTANCE.getWebApplication();

		/**
		 * The meta object literal for the '<em><b>Internal URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__INTERNAL_URL = eINSTANCE.getWebApplication_InternalURL();

		/**
		 * The meta object literal for the '<em><b>External URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__EXTERNAL_URL = eINSTANCE.getWebApplication_ExternalURL();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.WebApplicationGroupImpl <em>Web Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.WebApplicationGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getWebApplicationGroup()
		 * @generated
		 */
		EClass WEB_APPLICATION_GROUP = eINSTANCE.getWebApplicationGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.SearchType <em>Search Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.SearchType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchType()
		 * @generated
		 */
		EClass SEARCH_TYPE = eINSTANCE.getSearchType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.SearchGroup <em>Search Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.SearchGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearchGroup()
		 * @generated
		 */
		EClass SEARCH_GROUP = eINSTANCE.getSearchGroup();

		/**
		 * The meta object literal for the '<em><b>Search Result CW Es</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_GROUP__SEARCH_RESULT_CW_ES = eINSTANCE.getSearchGroup_SearchResultCWEs();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Search <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Search
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.JavaSearchType <em>Java Search Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.JavaSearchType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchType()
		 * @generated
		 */
		EClass JAVA_SEARCH_TYPE = eINSTANCE.getJavaSearchType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchImpl <em>Java Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.JavaSearchImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearch()
		 * @generated
		 */
		EClass JAVA_SEARCH = eINSTANCE.getJavaSearch();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.JavaSearchGroupImpl <em>Java Search Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.JavaSearchGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getJavaSearchGroup()
		 * @generated
		 */
		EClass JAVA_SEARCH_GROUP = eINSTANCE.getJavaSearchGroup();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.TaskType <em>Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.TaskType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.TaskGroup <em>Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.TaskGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTaskGroup()
		 * @generated
		 */
		EClass TASK_GROUP = eINSTANCE.getTaskGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Task <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Task
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Task Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_STATUS = eINSTANCE.getTask_TaskStatus();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.LocalTaskType <em>Local Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.LocalTaskType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalTaskType()
		 * @generated
		 */
		EClass LOCAL_TASK_TYPE = eINSTANCE.getLocalTaskType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.LocalTaskGroupImpl <em>Local Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.LocalTaskGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalTaskGroup()
		 * @generated
		 */
		EClass LOCAL_TASK_GROUP = eINSTANCE.getLocalTaskGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.LocalTaskImpl <em>Local Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.LocalTaskImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalTask()
		 * @generated
		 */
		EClass LOCAL_TASK = eINSTANCE.getLocalTask();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.FindingType <em>Finding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.FindingType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFindingType()
		 * @generated
		 */
		EClass FINDING_TYPE = eINSTANCE.getFindingType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.FindingGroup <em>Finding Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.FindingGroup
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFindingGroup()
		 * @generated
		 */
		EClass FINDING_GROUP = eINSTANCE.getFindingGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.Finding <em>Finding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.Finding
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getFinding()
		 * @generated
		 */
		EClass FINDING = eINSTANCE.getFinding();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__DETAILS = eINSTANCE.getFinding_Details();

		/**
		 * The meta object literal for the '<em><b>Remediation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__REMEDIATION = eINSTANCE.getFinding_Remediation();

		/**
		 * The meta object literal for the '<em><b>Reproducer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__REPRODUCER = eINSTANCE.getFinding_Reproducer();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__REFERENCES = eINSTANCE.getFinding_References();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.LocalFindingType <em>Local Finding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.LocalFindingType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalFindingType()
		 * @generated
		 */
		EClass LOCAL_FINDING_TYPE = eINSTANCE.getLocalFindingType();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingGroupImpl <em>Local Finding Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.LocalFindingGroupImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalFindingGroup()
		 * @generated
		 */
		EClass LOCAL_FINDING_GROUP = eINSTANCE.getLocalFindingGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl <em>Local Finding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.impl.LocalFindingImpl
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getLocalFinding()
		 * @generated
		 */
		EClass LOCAL_FINDING = eINSTANCE.getLocalFinding();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.DataTaintType <em>Data Taint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.DataTaintType
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getDataTaintType()
		 * @generated
		 */
		EEnum DATA_TAINT_TYPE = eINSTANCE.getDataTaintType();

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

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.assessment.TaskStatus <em>Task Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.assessment.TaskStatus
		 * @see us.coastalhacking.semiotics.model.assessment.impl.AssessmentPackageImpl#getTaskStatus()
		 * @generated
		 */
		EEnum TASK_STATUS = eINSTANCE.getTaskStatus();

	}

} //AssessmentPackage
