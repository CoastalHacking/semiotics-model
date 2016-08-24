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
 * A representation of the model object '<em><b>Membered Groupable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An element primarily identifying as a member, of some group, that also contains sub-groups
 * <!-- end-model-doc -->
 *
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getMemberedGroupable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MemberedGroupable<G extends Groupable, M extends Membered> extends Member<G>, Group<M> {
} // MemberedGroupable
