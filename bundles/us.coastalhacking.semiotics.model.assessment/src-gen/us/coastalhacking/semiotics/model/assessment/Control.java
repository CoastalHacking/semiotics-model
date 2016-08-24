/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Control#getCwes <em>Cwes</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getControl()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control<T extends ControlType> extends Member<T>, Examinable, Describable {
	/**
	 * Returns the value of the '<em><b>Cwes</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.model.assessment.CWE}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.assessment.CWE#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cwes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwes</em>' reference list.
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getControl_Cwes()
	 * @see us.coastalhacking.semiotics.model.assessment.CWE#getControls
	 * @model opposite="controls"
	 * @generated
	 */
	EList<CWE> getCwes();

} // Control
