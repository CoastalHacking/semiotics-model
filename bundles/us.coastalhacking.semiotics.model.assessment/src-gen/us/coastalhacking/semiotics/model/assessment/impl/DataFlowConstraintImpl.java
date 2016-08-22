/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.impl;

import org.eclipse.emf.ecore.EClass;

import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.DataFlowConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataFlowConstraintImpl extends DataFlowImpl implements DataFlowConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.DATA_FLOW_CONSTRAINT;
	}

} //DataFlowConstraintImpl
