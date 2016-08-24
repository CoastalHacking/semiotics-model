/**
 * Copyright (c) 2016 Coastal Hacking
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package us.coastalhacking.semiotics.model.assessment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import us.coastalhacking.semiotics.model.assessment.AssessmentFactory;
import us.coastalhacking.semiotics.model.assessment.AssessmentPackage;
import us.coastalhacking.semiotics.model.assessment.WebApplication;

/**
 * This is the item provider adapter for a {@link us.coastalhacking.semiotics.model.assessment.WebApplication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebApplicationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApplicationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addInternalURLPropertyDescriptor(object);
			addExternalURLPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Nameable_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Nameable_name_feature", "_UI_Nameable_type"),
				 AssessmentPackage.Literals.NAMEABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Member_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Member_group_feature", "_UI_Member_type"),
				 AssessmentPackage.Literals.MEMBER__GROUP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internal URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebApplication_internalURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebApplication_internalURL_feature", "_UI_WebApplication_type"),
				 AssessmentPackage.Literals.WEB_APPLICATION__INTERNAL_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebApplication_externalURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebApplication_externalURL_feature", "_UI_WebApplication_type"),
				 AssessmentPackage.Literals.WEB_APPLICATION__EXTERNAL_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AssessmentPackage.Literals.GROUP__MEMBERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WebApplication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebApplication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WebApplication)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WebApplication_type") :
			getString("_UI_WebApplication_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(WebApplication.class)) {
			case AssessmentPackage.WEB_APPLICATION__NAME:
			case AssessmentPackage.WEB_APPLICATION__INTERNAL_URL:
			case AssessmentPackage.WEB_APPLICATION__EXTERNAL_URL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AssessmentPackage.WEB_APPLICATION__MEMBERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createAuthenticationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createAuthentication()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createAuthorizationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createAuthorization()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createAccountGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createAccount()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createCryptographyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createCryptography()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createOutputEncodingGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createOutputEncoding()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createGenericControl()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createGenericControlGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createNetworkIngress()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createNetworkIngressGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createNetworkEgress()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createNetworkEgressGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createFileGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createRequest()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createRequestGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createResponse()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createResponseGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createDataFlowGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createControlFlowGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createApplicationAssessment()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createWebApplication()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createWebApplicationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createJavaSearch()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createJavaSearchGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createLocalTaskGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createLocalTask()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createLocalFindingGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.GROUP__MEMBERS,
				 AssessmentFactory.eINSTANCE.createLocalFinding()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AssessmentEditPlugin.INSTANCE;
	}

}
