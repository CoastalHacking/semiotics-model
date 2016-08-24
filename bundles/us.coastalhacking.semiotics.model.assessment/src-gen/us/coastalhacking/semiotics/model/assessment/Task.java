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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.assessment.Task#getTaskStatus <em>Task Status</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getTask()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Task<T extends TaskType> extends Member<T>, Taskable, Describable {
	/**
	 * Returns the value of the '<em><b>Task Status</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.model.assessment.TaskStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Status</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.TaskStatus
	 * @see #setTaskStatus(TaskStatus)
	 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage#getTask_TaskStatus()
	 * @model unique="false"
	 * @generated
	 */
	TaskStatus getTaskStatus();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.assessment.Task#getTaskStatus <em>Task Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Status</em>' attribute.
	 * @see us.coastalhacking.semiotics.model.assessment.TaskStatus
	 * @see #getTaskStatus()
	 * @generated
	 */
	void setTaskStatus(TaskStatus value);

} // Task
