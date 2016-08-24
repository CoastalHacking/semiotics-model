/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import us.coastalhacking.semiotics.model.assessment.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.assessment.AssessmentPackage
 * @generated
 */
public class AssessmentSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssessmentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSwitch() {
		if (modelPackage == null) {
			modelPackage = AssessmentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AssessmentPackage.NAMEABLE: {
				Nameable nameable = (Nameable)theEObject;
				T1 result = caseNameable(nameable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DESCRIBABLE: {
				Describable describable = (Describable)theEObject;
				T1 result = caseDescribable(describable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.EXAMINABLE: {
				Examinable examinable = (Examinable)theEObject;
				T1 result = caseExaminable(examinable);
				if (result == null) result = caseNameable(examinable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.PROVABLE: {
				Provable provable = (Provable)theEObject;
				T1 result = caseProvable(provable);
				if (result == null) result = caseNameable(provable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.TRACEABLE: {
				Traceable traceable = (Traceable)theEObject;
				T1 result = caseTraceable(traceable);
				if (result == null) result = caseNameable(traceable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCHABLE: {
				Searchable searchable = (Searchable)theEObject;
				T1 result = caseSearchable(searchable);
				if (result == null) result = caseNameable(searchable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.TASKABLE: {
				Taskable taskable = (Taskable)theEObject;
				T1 result = caseTaskable(taskable);
				if (result == null) result = caseNameable(taskable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FINDABLE: {
				Findable findable = (Findable)theEObject;
				T1 result = caseFindable(findable);
				if (result == null) result = caseNameable(findable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.GROUPABLE: {
				Groupable groupable = (Groupable)theEObject;
				T1 result = caseGroupable(groupable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.MEMBERED: {
				Membered membered = (Membered)theEObject;
				T1 result = caseMembered(membered);
				if (result == null) result = caseGroupable(membered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.GROUP: {
				Group<?> group = (Group<?>)theEObject;
				T1 result = caseGroup(group);
				if (result == null) result = caseNameable(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.MEMBER: {
				Member<?> member = (Member<?>)theEObject;
				T1 result = caseMember(member);
				if (result == null) result = caseNameable(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.GROUPABLE_MEMBERED: {
				GroupableMembered<?, ?> groupableMembered = (GroupableMembered<?, ?>)theEObject;
				T1 result = caseGroupableMembered(groupableMembered);
				if (result == null) result = caseGroup(groupableMembered);
				if (result == null) result = caseMember(groupableMembered);
				if (result == null) result = caseNameable(groupableMembered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.MEMBERED_GROUPABLE: {
				MemberedGroupable<?, ?> memberedGroupable = (MemberedGroupable<?, ?>)theEObject;
				T1 result = caseMemberedGroupable(memberedGroupable);
				if (result == null) result = caseMember(memberedGroupable);
				if (result == null) result = caseGroup(memberedGroupable);
				if (result == null) result = caseNameable(memberedGroupable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL_TYPE: {
				ControlType controlType = (ControlType)theEObject;
				T1 result = caseControlType(controlType);
				if (result == null) result = caseGroupable(controlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL_GROUP: {
				ControlGroup<?> controlGroup = (ControlGroup<?>)theEObject;
				T1 result = caseControlGroup(controlGroup);
				if (result == null) result = caseGroupableMembered(controlGroup);
				if (result == null) result = caseGroup(controlGroup);
				if (result == null) result = caseMember(controlGroup);
				if (result == null) result = caseNameable(controlGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL: {
				Control<?> control = (Control<?>)theEObject;
				T1 result = caseControl(control);
				if (result == null) result = caseMember(control);
				if (result == null) result = caseExaminable(control);
				if (result == null) result = caseDescribable(control);
				if (result == null) result = caseNameable(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CWE_GROUP: {
				CWEGroup cweGroup = (CWEGroup)theEObject;
				T1 result = caseCWEGroup(cweGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CWE: {
				CWE cwe = (CWE)theEObject;
				T1 result = caseCWE(cwe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.AUTHENTICATION_CONTROL_TYPE: {
				AuthenticationControlType authenticationControlType = (AuthenticationControlType)theEObject;
				T1 result = caseAuthenticationControlType(authenticationControlType);
				if (result == null) result = caseControlType(authenticationControlType);
				if (result == null) result = caseGroupable(authenticationControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.AUTHENTICATION_GROUP: {
				AuthenticationGroup authenticationGroup = (AuthenticationGroup)theEObject;
				T1 result = caseAuthenticationGroup(authenticationGroup);
				if (result == null) result = caseControlGroup(authenticationGroup);
				if (result == null) result = caseGroupableMembered(authenticationGroup);
				if (result == null) result = caseGroup(authenticationGroup);
				if (result == null) result = caseMember(authenticationGroup);
				if (result == null) result = caseNameable(authenticationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.AUTHENTICATION: {
				Authentication authentication = (Authentication)theEObject;
				T1 result = caseAuthentication(authentication);
				if (result == null) result = caseControl(authentication);
				if (result == null) result = caseMember(authentication);
				if (result == null) result = caseExaminable(authentication);
				if (result == null) result = caseDescribable(authentication);
				if (result == null) result = caseNameable(authentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.AUTHORIZATION_CONTROL_TYPE: {
				AuthorizationControlType authorizationControlType = (AuthorizationControlType)theEObject;
				T1 result = caseAuthorizationControlType(authorizationControlType);
				if (result == null) result = caseControlType(authorizationControlType);
				if (result == null) result = caseGroupable(authorizationControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.AUTHORIZATION_GROUP: {
				AuthorizationGroup authorizationGroup = (AuthorizationGroup)theEObject;
				T1 result = caseAuthorizationGroup(authorizationGroup);
				if (result == null) result = caseControlGroup(authorizationGroup);
				if (result == null) result = caseGroupableMembered(authorizationGroup);
				if (result == null) result = caseGroup(authorizationGroup);
				if (result == null) result = caseMember(authorizationGroup);
				if (result == null) result = caseNameable(authorizationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.AUTHORIZATION: {
				Authorization authorization = (Authorization)theEObject;
				T1 result = caseAuthorization(authorization);
				if (result == null) result = caseControl(authorization);
				if (result == null) result = caseMember(authorization);
				if (result == null) result = caseExaminable(authorization);
				if (result == null) result = caseDescribable(authorization);
				if (result == null) result = caseNameable(authorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.ACCOUNT_CONTROL_TYPE: {
				AccountControlType accountControlType = (AccountControlType)theEObject;
				T1 result = caseAccountControlType(accountControlType);
				if (result == null) result = caseControlType(accountControlType);
				if (result == null) result = caseGroupable(accountControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.ACCOUNT_GROUP: {
				AccountGroup accountGroup = (AccountGroup)theEObject;
				T1 result = caseAccountGroup(accountGroup);
				if (result == null) result = caseControlGroup(accountGroup);
				if (result == null) result = caseGroupableMembered(accountGroup);
				if (result == null) result = caseGroup(accountGroup);
				if (result == null) result = caseMember(accountGroup);
				if (result == null) result = caseNameable(accountGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T1 result = caseAccount(account);
				if (result == null) result = caseControl(account);
				if (result == null) result = caseMember(account);
				if (result == null) result = caseExaminable(account);
				if (result == null) result = caseDescribable(account);
				if (result == null) result = caseNameable(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CRYPTOGRAPHY_CONTROL_TYPE: {
				CryptographyControlType cryptographyControlType = (CryptographyControlType)theEObject;
				T1 result = caseCryptographyControlType(cryptographyControlType);
				if (result == null) result = caseControlType(cryptographyControlType);
				if (result == null) result = caseGroupable(cryptographyControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CRYPTOGRAPHY_GROUP: {
				CryptographyGroup cryptographyGroup = (CryptographyGroup)theEObject;
				T1 result = caseCryptographyGroup(cryptographyGroup);
				if (result == null) result = caseControlGroup(cryptographyGroup);
				if (result == null) result = caseGroupableMembered(cryptographyGroup);
				if (result == null) result = caseGroup(cryptographyGroup);
				if (result == null) result = caseMember(cryptographyGroup);
				if (result == null) result = caseNameable(cryptographyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CRYPTOGRAPHY: {
				Cryptography cryptography = (Cryptography)theEObject;
				T1 result = caseCryptography(cryptography);
				if (result == null) result = caseControl(cryptography);
				if (result == null) result = caseMember(cryptography);
				if (result == null) result = caseExaminable(cryptography);
				if (result == null) result = caseDescribable(cryptography);
				if (result == null) result = caseNameable(cryptography);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.OUTPUT_ENCODING_CONTROL_TYPE: {
				OutputEncodingControlType outputEncodingControlType = (OutputEncodingControlType)theEObject;
				T1 result = caseOutputEncodingControlType(outputEncodingControlType);
				if (result == null) result = caseControlType(outputEncodingControlType);
				if (result == null) result = caseGroupable(outputEncodingControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.OUTPUT_ENCODING_GROUP: {
				OutputEncodingGroup outputEncodingGroup = (OutputEncodingGroup)theEObject;
				T1 result = caseOutputEncodingGroup(outputEncodingGroup);
				if (result == null) result = caseControlGroup(outputEncodingGroup);
				if (result == null) result = caseGroupableMembered(outputEncodingGroup);
				if (result == null) result = caseGroup(outputEncodingGroup);
				if (result == null) result = caseMember(outputEncodingGroup);
				if (result == null) result = caseNameable(outputEncodingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.OUTPUT_ENCODING: {
				OutputEncoding outputEncoding = (OutputEncoding)theEObject;
				T1 result = caseOutputEncoding(outputEncoding);
				if (result == null) result = caseControl(outputEncoding);
				if (result == null) result = caseMember(outputEncoding);
				if (result == null) result = caseExaminable(outputEncoding);
				if (result == null) result = caseDescribable(outputEncoding);
				if (result == null) result = caseNameable(outputEncoding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.GENERIC_CONTROL_TYPE: {
				GenericControlType genericControlType = (GenericControlType)theEObject;
				T1 result = caseGenericControlType(genericControlType);
				if (result == null) result = caseControlType(genericControlType);
				if (result == null) result = caseGroupable(genericControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.GENERIC_CONTROL: {
				GenericControl genericControl = (GenericControl)theEObject;
				T1 result = caseGenericControl(genericControl);
				if (result == null) result = caseControl(genericControl);
				if (result == null) result = caseMember(genericControl);
				if (result == null) result = caseExaminable(genericControl);
				if (result == null) result = caseDescribable(genericControl);
				if (result == null) result = caseNameable(genericControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.GENERIC_CONTROL_GROUP: {
				GenericControlGroup genericControlGroup = (GenericControlGroup)theEObject;
				T1 result = caseGenericControlGroup(genericControlGroup);
				if (result == null) result = caseControlGroup(genericControlGroup);
				if (result == null) result = caseGroupableMembered(genericControlGroup);
				if (result == null) result = caseGroup(genericControlGroup);
				if (result == null) result = caseMember(genericControlGroup);
				if (result == null) result = caseNameable(genericControlGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SURFACE_AREA_TYPE: {
				SurfaceAreaType surfaceAreaType = (SurfaceAreaType)theEObject;
				T1 result = caseSurfaceAreaType(surfaceAreaType);
				if (result == null) result = caseGroupable(surfaceAreaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SURFACE_AREA_GROUP: {
				SurfaceAreaGroup<?> surfaceAreaGroup = (SurfaceAreaGroup<?>)theEObject;
				T1 result = caseSurfaceAreaGroup(surfaceAreaGroup);
				if (result == null) result = caseGroupableMembered(surfaceAreaGroup);
				if (result == null) result = caseGroup(surfaceAreaGroup);
				if (result == null) result = caseMember(surfaceAreaGroup);
				if (result == null) result = caseNameable(surfaceAreaGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SURFACE_AREA: {
				SurfaceArea<?> surfaceArea = (SurfaceArea<?>)theEObject;
				T1 result = caseSurfaceArea(surfaceArea);
				if (result == null) result = caseMember(surfaceArea);
				if (result == null) result = caseExaminable(surfaceArea);
				if (result == null) result = caseNameable(surfaceArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.NETWORK_INGRESS_TYPE: {
				NetworkIngressType networkIngressType = (NetworkIngressType)theEObject;
				T1 result = caseNetworkIngressType(networkIngressType);
				if (result == null) result = caseSurfaceAreaType(networkIngressType);
				if (result == null) result = caseGroupable(networkIngressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.NETWORK_INGRESS: {
				NetworkIngress networkIngress = (NetworkIngress)theEObject;
				T1 result = caseNetworkIngress(networkIngress);
				if (result == null) result = caseSurfaceArea(networkIngress);
				if (result == null) result = caseMember(networkIngress);
				if (result == null) result = caseExaminable(networkIngress);
				if (result == null) result = caseNameable(networkIngress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.NETWORK_INGRESS_GROUP: {
				NetworkIngressGroup networkIngressGroup = (NetworkIngressGroup)theEObject;
				T1 result = caseNetworkIngressGroup(networkIngressGroup);
				if (result == null) result = caseSurfaceAreaGroup(networkIngressGroup);
				if (result == null) result = caseGroupableMembered(networkIngressGroup);
				if (result == null) result = caseGroup(networkIngressGroup);
				if (result == null) result = caseMember(networkIngressGroup);
				if (result == null) result = caseNameable(networkIngressGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.NETWORK_EGRESS_TYPE: {
				NetworkEgressType networkEgressType = (NetworkEgressType)theEObject;
				T1 result = caseNetworkEgressType(networkEgressType);
				if (result == null) result = caseSurfaceAreaType(networkEgressType);
				if (result == null) result = caseGroupable(networkEgressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.NETWORK_EGRESS: {
				NetworkEgress networkEgress = (NetworkEgress)theEObject;
				T1 result = caseNetworkEgress(networkEgress);
				if (result == null) result = caseSurfaceArea(networkEgress);
				if (result == null) result = caseMember(networkEgress);
				if (result == null) result = caseExaminable(networkEgress);
				if (result == null) result = caseNameable(networkEgress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.NETWORK_EGRESS_GROUP: {
				NetworkEgressGroup networkEgressGroup = (NetworkEgressGroup)theEObject;
				T1 result = caseNetworkEgressGroup(networkEgressGroup);
				if (result == null) result = caseSurfaceAreaGroup(networkEgressGroup);
				if (result == null) result = caseGroupableMembered(networkEgressGroup);
				if (result == null) result = caseGroup(networkEgressGroup);
				if (result == null) result = caseMember(networkEgressGroup);
				if (result == null) result = caseNameable(networkEgressGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T1 result = caseDataType(dataType);
				if (result == null) result = caseGroupable(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA: {
				Data<?> data = (Data<?>)theEObject;
				T1 result = caseData(data);
				if (result == null) result = caseMember(data);
				if (result == null) result = caseProvable(data);
				if (result == null) result = caseNameable(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_GROUP: {
				DataGroup<?> dataGroup = (DataGroup<?>)theEObject;
				T1 result = caseDataGroup(dataGroup);
				if (result == null) result = caseGroupableMembered(dataGroup);
				if (result == null) result = caseGroup(dataGroup);
				if (result == null) result = caseMember(dataGroup);
				if (result == null) result = caseNameable(dataGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SNIPPET_TYPE: {
				SnippetType snippetType = (SnippetType)theEObject;
				T1 result = caseSnippetType(snippetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SNIPPET: {
				Snippet<?> snippet = (Snippet<?>)theEObject;
				T1 result = caseSnippet(snippet);
				if (result == null) result = caseProvable(snippet);
				if (result == null) result = caseNameable(snippet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.TEXT_SNIPPET_TYPE: {
				TextSnippetType textSnippetType = (TextSnippetType)theEObject;
				T1 result = caseTextSnippetType(textSnippetType);
				if (result == null) result = caseSnippetType(textSnippetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.TEXT_SNIPPET: {
				TextSnippet textSnippet = (TextSnippet)theEObject;
				T1 result = caseTextSnippet(textSnippet);
				if (result == null) result = caseSnippet(textSnippet);
				if (result == null) result = caseProvable(textSnippet);
				if (result == null) result = caseNameable(textSnippet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				T1 result = caseFileType(fileType);
				if (result == null) result = caseDataType(fileType);
				if (result == null) result = caseGroupable(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FILE: {
				File file = (File)theEObject;
				T1 result = caseFile(file);
				if (result == null) result = caseData(file);
				if (result == null) result = caseMember(file);
				if (result == null) result = caseProvable(file);
				if (result == null) result = caseNameable(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FILE_GROUP: {
				FileGroup fileGroup = (FileGroup)theEObject;
				T1 result = caseFileGroup(fileGroup);
				if (result == null) result = caseDataGroup(fileGroup);
				if (result == null) result = caseGroupableMembered(fileGroup);
				if (result == null) result = caseGroup(fileGroup);
				if (result == null) result = caseMember(fileGroup);
				if (result == null) result = caseNameable(fileGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.REQUEST_TYPE: {
				RequestType requestType = (RequestType)theEObject;
				T1 result = caseRequestType(requestType);
				if (result == null) result = caseDataType(requestType);
				if (result == null) result = caseGroupable(requestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.REQUEST: {
				Request request = (Request)theEObject;
				T1 result = caseRequest(request);
				if (result == null) result = caseData(request);
				if (result == null) result = caseMember(request);
				if (result == null) result = caseProvable(request);
				if (result == null) result = caseNameable(request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.REQUEST_GROUP: {
				RequestGroup requestGroup = (RequestGroup)theEObject;
				T1 result = caseRequestGroup(requestGroup);
				if (result == null) result = caseDataGroup(requestGroup);
				if (result == null) result = caseGroupableMembered(requestGroup);
				if (result == null) result = caseGroup(requestGroup);
				if (result == null) result = caseMember(requestGroup);
				if (result == null) result = caseNameable(requestGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.RESPONSE_TYPE: {
				ResponseType responseType = (ResponseType)theEObject;
				T1 result = caseResponseType(responseType);
				if (result == null) result = caseDataType(responseType);
				if (result == null) result = caseGroupable(responseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.RESPONSE: {
				Response response = (Response)theEObject;
				T1 result = caseResponse(response);
				if (result == null) result = caseData(response);
				if (result == null) result = caseMember(response);
				if (result == null) result = caseProvable(response);
				if (result == null) result = caseNameable(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.RESPONSE_GROUP: {
				ResponseGroup responseGroup = (ResponseGroup)theEObject;
				T1 result = caseResponseGroup(responseGroup);
				if (result == null) result = caseDataGroup(responseGroup);
				if (result == null) result = caseGroupableMembered(responseGroup);
				if (result == null) result = caseGroup(responseGroup);
				if (result == null) result = caseMember(responseGroup);
				if (result == null) result = caseNameable(responseGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FLOW_TYPE: {
				FlowType flowType = (FlowType)theEObject;
				T1 result = caseFlowType(flowType);
				if (result == null) result = caseGroupable(flowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FLOW: {
				Flow<?> flow = (Flow<?>)theEObject;
				T1 result = caseFlow(flow);
				if (result == null) result = caseMember(flow);
				if (result == null) result = caseTraceable(flow);
				if (result == null) result = caseNameable(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FLOW_GROUP: {
				FlowGroup<?> flowGroup = (FlowGroup<?>)theEObject;
				T1 result = caseFlowGroup(flowGroup);
				if (result == null) result = caseGroupableMembered(flowGroup);
				if (result == null) result = caseGroup(flowGroup);
				if (result == null) result = caseMember(flowGroup);
				if (result == null) result = caseNameable(flowGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FLOW_NODE: {
				FlowNode<?> flowNode = (FlowNode<?>)theEObject;
				T1 result = caseFlowNode(flowNode);
				if (result == null) result = caseTraceable(flowNode);
				if (result == null) result = caseNameable(flowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_FLOW_TYPE: {
				DataFlowType dataFlowType = (DataFlowType)theEObject;
				T1 result = caseDataFlowType(dataFlowType);
				if (result == null) result = caseFlowType(dataFlowType);
				if (result == null) result = caseGroupable(dataFlowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T1 result = caseDataFlow(dataFlow);
				if (result == null) result = caseFlow(dataFlow);
				if (result == null) result = caseMember(dataFlow);
				if (result == null) result = caseTraceable(dataFlow);
				if (result == null) result = caseNameable(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_FLOW_NODE: {
				DataFlowNode dataFlowNode = (DataFlowNode)theEObject;
				T1 result = caseDataFlowNode(dataFlowNode);
				if (result == null) result = caseFlowNode(dataFlowNode);
				if (result == null) result = caseTraceable(dataFlowNode);
				if (result == null) result = caseNameable(dataFlowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_FLOW_GROUP: {
				DataFlowGroup dataFlowGroup = (DataFlowGroup)theEObject;
				T1 result = caseDataFlowGroup(dataFlowGroup);
				if (result == null) result = caseFlowGroup(dataFlowGroup);
				if (result == null) result = caseGroupableMembered(dataFlowGroup);
				if (result == null) result = caseGroup(dataFlowGroup);
				if (result == null) result = caseMember(dataFlowGroup);
				if (result == null) result = caseNameable(dataFlowGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.DATA_FLOW_CONSTRAINT: {
				DataFlowConstraint dataFlowConstraint = (DataFlowConstraint)theEObject;
				T1 result = caseDataFlowConstraint(dataFlowConstraint);
				if (result == null) result = caseDataFlowType(dataFlowConstraint);
				if (result == null) result = caseFlowType(dataFlowConstraint);
				if (result == null) result = caseGroupable(dataFlowConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.ENDS_WITH: {
				EndsWith endsWith = (EndsWith)theEObject;
				T1 result = caseEndsWith(endsWith);
				if (result == null) result = caseFlowNode(endsWith);
				if (result == null) result = caseTraceable(endsWith);
				if (result == null) result = caseNameable(endsWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.STARTS_WITH: {
				StartsWith startsWith = (StartsWith)theEObject;
				T1 result = caseStartsWith(startsWith);
				if (result == null) result = caseFlowNode(startsWith);
				if (result == null) result = caseTraceable(startsWith);
				if (result == null) result = caseNameable(startsWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.MATCHES: {
				Matches matches = (Matches)theEObject;
				T1 result = caseMatches(matches);
				if (result == null) result = caseFlowNode(matches);
				if (result == null) result = caseTraceable(matches);
				if (result == null) result = caseNameable(matches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTAINS: {
				Contains contains = (Contains)theEObject;
				T1 result = caseContains(contains);
				if (result == null) result = caseFlowNode(contains);
				if (result == null) result = caseTraceable(contains);
				if (result == null) result = caseNameable(contains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CASTED_TO: {
				CastedTo castedTo = (CastedTo)theEObject;
				T1 result = caseCastedTo(castedTo);
				if (result == null) result = caseFlowNode(castedTo);
				if (result == null) result = caseTraceable(castedTo);
				if (result == null) result = caseNameable(castedTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL_FLOW_TYPE: {
				ControlFlowType controlFlowType = (ControlFlowType)theEObject;
				T1 result = caseControlFlowType(controlFlowType);
				if (result == null) result = caseFlowType(controlFlowType);
				if (result == null) result = caseGroupable(controlFlowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T1 result = caseControlFlow(controlFlow);
				if (result == null) result = caseFlow(controlFlow);
				if (result == null) result = caseMember(controlFlow);
				if (result == null) result = caseTraceable(controlFlow);
				if (result == null) result = caseNameable(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL_FLOW_NODE: {
				ControlFlowNode controlFlowNode = (ControlFlowNode)theEObject;
				T1 result = caseControlFlowNode(controlFlowNode);
				if (result == null) result = caseFlowNode(controlFlowNode);
				if (result == null) result = caseTraceable(controlFlowNode);
				if (result == null) result = caseNameable(controlFlowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.CONTROL_FLOW_GROUP: {
				ControlFlowGroup controlFlowGroup = (ControlFlowGroup)theEObject;
				T1 result = caseControlFlowGroup(controlFlowGroup);
				if (result == null) result = caseFlowGroup(controlFlowGroup);
				if (result == null) result = caseGroupableMembered(controlFlowGroup);
				if (result == null) result = caseGroup(controlFlowGroup);
				if (result == null) result = caseMember(controlFlowGroup);
				if (result == null) result = caseNameable(controlFlowGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.ASSESSMENT_TYPE: {
				AssessmentType assessmentType = (AssessmentType)theEObject;
				T1 result = caseAssessmentType(assessmentType);
				if (result == null) result = caseGroupable(assessmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.ASSESSABLE: {
				Assessable assessable = (Assessable)theEObject;
				T1 result = caseAssessable(assessable);
				if (result == null) result = caseMembered(assessable);
				if (result == null) result = caseGroupable(assessable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.ASSESSMENT: {
				Assessment<?> assessment = (Assessment<?>)theEObject;
				T1 result = caseAssessment(assessment);
				if (result == null) result = caseMemberedGroupable(assessment);
				if (result == null) result = caseMember(assessment);
				if (result == null) result = caseGroup(assessment);
				if (result == null) result = caseNameable(assessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.ASSESSMENT_GROUP: {
				AssessmentGroup<?> assessmentGroup = (AssessmentGroup<?>)theEObject;
				T1 result = caseAssessmentGroup(assessmentGroup);
				if (result == null) result = caseGroup(assessmentGroup);
				if (result == null) result = caseNameable(assessmentGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATION_ASSESSMENT_TYPE: {
				ApplicationAssessmentType applicationAssessmentType = (ApplicationAssessmentType)theEObject;
				T1 result = caseApplicationAssessmentType(applicationAssessmentType);
				if (result == null) result = caseAssessmentType(applicationAssessmentType);
				if (result == null) result = caseGroupable(applicationAssessmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATION_ASSESSMENT: {
				ApplicationAssessment applicationAssessment = (ApplicationAssessment)theEObject;
				T1 result = caseApplicationAssessment(applicationAssessment);
				if (result == null) result = caseAssessment(applicationAssessment);
				if (result == null) result = caseMemberedGroupable(applicationAssessment);
				if (result == null) result = caseMember(applicationAssessment);
				if (result == null) result = caseGroup(applicationAssessment);
				if (result == null) result = caseNameable(applicationAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATION_ASSESSMENT_GROUP: {
				ApplicationAssessmentGroup applicationAssessmentGroup = (ApplicationAssessmentGroup)theEObject;
				T1 result = caseApplicationAssessmentGroup(applicationAssessmentGroup);
				if (result == null) result = caseAssessmentGroup(applicationAssessmentGroup);
				if (result == null) result = caseGroup(applicationAssessmentGroup);
				if (result == null) result = caseNameable(applicationAssessmentGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T1 result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATION_TYPE: {
				ApplicationType applicationType = (ApplicationType)theEObject;
				T1 result = caseApplicationType(applicationType);
				if (result == null) result = caseGroupable(applicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATIONAL: {
				Applicational applicational = (Applicational)theEObject;
				T1 result = caseApplicational(applicational);
				if (result == null) result = caseMembered(applicational);
				if (result == null) result = caseGroupable(applicational);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATION: {
				Application<?> application = (Application<?>)theEObject;
				T1 result = caseApplication(application);
				if (result == null) result = caseMemberedGroupable(application);
				if (result == null) result = caseMember(application);
				if (result == null) result = caseGroup(application);
				if (result == null) result = caseNameable(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.APPLICATION_GROUP: {
				ApplicationGroup<?> applicationGroup = (ApplicationGroup<?>)theEObject;
				T1 result = caseApplicationGroup(applicationGroup);
				if (result == null) result = caseGroupableMembered(applicationGroup);
				if (result == null) result = caseGroup(applicationGroup);
				if (result == null) result = caseMember(applicationGroup);
				if (result == null) result = caseNameable(applicationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.WEB_APPLICATION_TYPE: {
				WebApplicationType webApplicationType = (WebApplicationType)theEObject;
				T1 result = caseWebApplicationType(webApplicationType);
				if (result == null) result = caseApplicationType(webApplicationType);
				if (result == null) result = caseGroupable(webApplicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.WEB_APPLICATION: {
				WebApplication webApplication = (WebApplication)theEObject;
				T1 result = caseWebApplication(webApplication);
				if (result == null) result = caseApplication(webApplication);
				if (result == null) result = caseMemberedGroupable(webApplication);
				if (result == null) result = caseMember(webApplication);
				if (result == null) result = caseGroup(webApplication);
				if (result == null) result = caseNameable(webApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.WEB_APPLICATION_GROUP: {
				WebApplicationGroup webApplicationGroup = (WebApplicationGroup)theEObject;
				T1 result = caseWebApplicationGroup(webApplicationGroup);
				if (result == null) result = caseApplicationGroup(webApplicationGroup);
				if (result == null) result = caseGroupableMembered(webApplicationGroup);
				if (result == null) result = caseGroup(webApplicationGroup);
				if (result == null) result = caseMember(webApplicationGroup);
				if (result == null) result = caseNameable(webApplicationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCH_TYPE: {
				SearchType searchType = (SearchType)theEObject;
				T1 result = caseSearchType(searchType);
				if (result == null) result = caseGroupable(searchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCH_GROUP: {
				SearchGroup<?> searchGroup = (SearchGroup<?>)theEObject;
				T1 result = caseSearchGroup(searchGroup);
				if (result == null) result = caseGroupableMembered(searchGroup);
				if (result == null) result = caseDescribable(searchGroup);
				if (result == null) result = caseGroup(searchGroup);
				if (result == null) result = caseMember(searchGroup);
				if (result == null) result = caseNameable(searchGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCH: {
				Search<?> search = (Search<?>)theEObject;
				T1 result = caseSearch(search);
				if (result == null) result = caseMember(search);
				if (result == null) result = caseSearchable(search);
				if (result == null) result = caseNameable(search);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.SEARCH_PATTERN: {
				SearchPattern<?> searchPattern = (SearchPattern<?>)theEObject;
				T1 result = caseSearchPattern(searchPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.JAVA_SEARCH_TYPE: {
				JavaSearchType javaSearchType = (JavaSearchType)theEObject;
				T1 result = caseJavaSearchType(javaSearchType);
				if (result == null) result = caseSearchType(javaSearchType);
				if (result == null) result = caseGroupable(javaSearchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.JAVA_SEARCH: {
				JavaSearch javaSearch = (JavaSearch)theEObject;
				T1 result = caseJavaSearch(javaSearch);
				if (result == null) result = caseSearch(javaSearch);
				if (result == null) result = caseMember(javaSearch);
				if (result == null) result = caseSearchable(javaSearch);
				if (result == null) result = caseNameable(javaSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.JAVA_SEARCH_GROUP: {
				JavaSearchGroup javaSearchGroup = (JavaSearchGroup)theEObject;
				T1 result = caseJavaSearchGroup(javaSearchGroup);
				if (result == null) result = caseSearchGroup(javaSearchGroup);
				if (result == null) result = caseGroupableMembered(javaSearchGroup);
				if (result == null) result = caseDescribable(javaSearchGroup);
				if (result == null) result = caseGroup(javaSearchGroup);
				if (result == null) result = caseMember(javaSearchGroup);
				if (result == null) result = caseNameable(javaSearchGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.JAVA_SEARCH_PATTERN: {
				JavaSearchPattern javaSearchPattern = (JavaSearchPattern)theEObject;
				T1 result = caseJavaSearchPattern(javaSearchPattern);
				if (result == null) result = caseSearchPattern(javaSearchPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.TASK_TYPE: {
				TaskType taskType = (TaskType)theEObject;
				T1 result = caseTaskType(taskType);
				if (result == null) result = caseGroupable(taskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.TASK_GROUP: {
				TaskGroup<?> taskGroup = (TaskGroup<?>)theEObject;
				T1 result = caseTaskGroup(taskGroup);
				if (result == null) result = caseGroupableMembered(taskGroup);
				if (result == null) result = caseGroup(taskGroup);
				if (result == null) result = caseMember(taskGroup);
				if (result == null) result = caseNameable(taskGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.TASK: {
				Task<?> task = (Task<?>)theEObject;
				T1 result = caseTask(task);
				if (result == null) result = caseMember(task);
				if (result == null) result = caseTaskable(task);
				if (result == null) result = caseDescribable(task);
				if (result == null) result = caseNameable(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.LOCAL_TASK_TYPE: {
				LocalTaskType localTaskType = (LocalTaskType)theEObject;
				T1 result = caseLocalTaskType(localTaskType);
				if (result == null) result = caseTaskType(localTaskType);
				if (result == null) result = caseGroupable(localTaskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.LOCAL_TASK_GROUP: {
				LocalTaskGroup localTaskGroup = (LocalTaskGroup)theEObject;
				T1 result = caseLocalTaskGroup(localTaskGroup);
				if (result == null) result = caseTaskGroup(localTaskGroup);
				if (result == null) result = caseGroupableMembered(localTaskGroup);
				if (result == null) result = caseGroup(localTaskGroup);
				if (result == null) result = caseMember(localTaskGroup);
				if (result == null) result = caseNameable(localTaskGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.LOCAL_TASK: {
				LocalTask localTask = (LocalTask)theEObject;
				T1 result = caseLocalTask(localTask);
				if (result == null) result = caseTask(localTask);
				if (result == null) result = caseMember(localTask);
				if (result == null) result = caseTaskable(localTask);
				if (result == null) result = caseDescribable(localTask);
				if (result == null) result = caseNameable(localTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FINDING_TYPE: {
				FindingType findingType = (FindingType)theEObject;
				T1 result = caseFindingType(findingType);
				if (result == null) result = caseGroupable(findingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FINDING_GROUP: {
				FindingGroup<?> findingGroup = (FindingGroup<?>)theEObject;
				T1 result = caseFindingGroup(findingGroup);
				if (result == null) result = caseGroupableMembered(findingGroup);
				if (result == null) result = caseGroup(findingGroup);
				if (result == null) result = caseMember(findingGroup);
				if (result == null) result = caseNameable(findingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.FINDING: {
				Finding<?> finding = (Finding<?>)theEObject;
				T1 result = caseFinding(finding);
				if (result == null) result = caseMember(finding);
				if (result == null) result = caseFindable(finding);
				if (result == null) result = caseDescribable(finding);
				if (result == null) result = caseNameable(finding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.LOCAL_FINDING_TYPE: {
				LocalFindingType localFindingType = (LocalFindingType)theEObject;
				T1 result = caseLocalFindingType(localFindingType);
				if (result == null) result = caseFindingType(localFindingType);
				if (result == null) result = caseGroupable(localFindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.LOCAL_FINDING_GROUP: {
				LocalFindingGroup localFindingGroup = (LocalFindingGroup)theEObject;
				T1 result = caseLocalFindingGroup(localFindingGroup);
				if (result == null) result = caseFindingGroup(localFindingGroup);
				if (result == null) result = caseGroupableMembered(localFindingGroup);
				if (result == null) result = caseGroup(localFindingGroup);
				if (result == null) result = caseMember(localFindingGroup);
				if (result == null) result = caseNameable(localFindingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssessmentPackage.LOCAL_FINDING: {
				LocalFinding localFinding = (LocalFinding)theEObject;
				T1 result = caseLocalFinding(localFinding);
				if (result == null) result = caseFinding(localFinding);
				if (result == null) result = caseMember(localFinding);
				if (result == null) result = caseFindable(localFinding);
				if (result == null) result = caseDescribable(localFinding);
				if (result == null) result = caseNameable(localFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDescribable(Describable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examinable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examinable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExaminable(Examinable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProvable(Provable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTraceable(Traceable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Searchable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Searchable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSearchable(Searchable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taskable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taskable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskable(Taskable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Findable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Findable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFindable(Findable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groupable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groupable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGroupable(Groupable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Membered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Membered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMembered(Membered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Groupable> T1 caseGroup(Group<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Groupable> T1 caseMember(Member<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groupable Membered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groupable Membered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G extends Groupable, M extends Membered> T1 caseGroupableMembered(GroupableMembered<G, M> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Membered Groupable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Membered Groupable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G extends Groupable, M extends Membered> T1 caseMemberedGroupable(MemberedGroupable<G, M> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlType(ControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ControlType> T1 caseControlGroup(ControlGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ControlType> T1 caseControl(Control<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWE Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWE Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCWEGroup(CWEGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCWE(CWE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAuthenticationControlType(AuthenticationControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAuthenticationGroup(AuthenticationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAuthentication(Authentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAuthorizationControlType(AuthorizationControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAuthorizationGroup(AuthorizationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAuthorization(Authorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAccountControlType(AccountControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAccountGroup(AccountGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cryptography Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cryptography Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCryptographyControlType(CryptographyControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cryptography Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cryptography Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCryptographyGroup(CryptographyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cryptography</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cryptography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCryptography(Cryptography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Encoding Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Encoding Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOutputEncodingControlType(OutputEncodingControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Encoding Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Encoding Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOutputEncodingGroup(OutputEncodingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOutputEncoding(OutputEncoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGenericControlType(GenericControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGenericControl(GenericControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Control Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Control Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGenericControlGroup(GenericControlGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSurfaceAreaType(SurfaceAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Area Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Area Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SurfaceAreaType> T1 caseSurfaceAreaGroup(SurfaceAreaGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SurfaceAreaType> T1 caseSurfaceArea(SurfaceArea<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Ingress Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Ingress Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNetworkIngressType(NetworkIngressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Ingress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Ingress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNetworkIngress(NetworkIngress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Ingress Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Ingress Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNetworkIngressGroup(NetworkIngressGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Egress Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Egress Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNetworkEgressType(NetworkEgressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Egress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Egress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNetworkEgress(NetworkEgress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Egress Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Egress Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNetworkEgressGroup(NetworkEgressGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends DataType> T1 caseData(Data<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends DataType> T1 caseDataGroup(DataGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snippet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snippet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSnippetType(SnippetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snippet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snippet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SnippetType> T1 caseSnippet(Snippet<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Snippet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Snippet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextSnippetType(TextSnippetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Snippet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Snippet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextSnippet(TextSnippet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFileType(FileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFileGroup(FileGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRequestType(RequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRequestGroup(RequestGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResponseType(ResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResponseGroup(ResponseGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowType(FlowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends FlowType> T1 caseFlow(Flow<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends FlowType> T1 caseFlowGroup(FlowGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends FlowType> T1 caseFlowNode(FlowNode<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataFlowType(DataFlowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataFlowNode(DataFlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataFlowGroup(DataFlowGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataFlowConstraint(DataFlowConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ends With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ends With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEndsWith(EndsWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Starts With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Starts With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStartsWith(StartsWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMatches(Matches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Casted To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Casted To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCastedTo(CastedTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowType(ControlFlowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowNode(ControlFlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowGroup(ControlFlowGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssessmentType(AssessmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssessable(Assessable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends AssessmentType> T1 caseAssessment(Assessment<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends AssessmentType> T1 caseAssessmentGroup(AssessmentGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Assessment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Assessment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApplicationAssessmentType(ApplicationAssessmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApplicationAssessment(ApplicationAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Assessment Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Assessment Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApplicationAssessmentGroup(ApplicationAssessmentGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApplicationType(ApplicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applicational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applicational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApplicational(Applicational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ApplicationType> T1 caseApplication(Application<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ApplicationType> T1 caseApplicationGroup(ApplicationGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Application Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Application Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWebApplicationType(WebApplicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWebApplication(WebApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Application Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Application Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWebApplicationGroup(WebApplicationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSearchType(SearchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SearchType> T1 caseSearchGroup(SearchGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SearchType> T1 caseSearch(Search<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SearchType> T1 caseSearchPattern(SearchPattern<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Search Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Search Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaSearchType(JavaSearchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaSearch(JavaSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Search Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Search Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaSearchGroup(JavaSearchGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Search Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Search Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavaSearchPattern(JavaSearchPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TaskType> T1 caseTaskGroup(TaskGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TaskType> T1 caseTask(Task<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocalTaskType(LocalTaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Task Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocalTaskGroup(LocalTaskGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocalTask(LocalTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFindingType(FindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends FindingType> T1 caseFindingGroup(FindingGroup<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends FindingType> T1 caseFinding(Finding<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Finding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Finding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocalFindingType(LocalFindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Finding Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Finding Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocalFindingGroup(LocalFindingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocalFinding(LocalFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //AssessmentSwitch
