/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Groupable Membered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An element primarily identifying as a group that is also a member of some other group
 * <!-- end-model-doc -->
 *
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getGroupableMembered()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GroupableMembered<G extends Groupable, M extends Membered> extends Group<G>, Member<M> {
} // GroupableMembered
