/**
 */
package us.coastalhacking.semiotics.model.flow.provider;


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

import us.coastalhacking.semiotics.model.base.BasePackage;
import us.coastalhacking.semiotics.model.flow.Flow;
import us.coastalhacking.semiotics.model.flow.FlowFactory;
import us.coastalhacking.semiotics.model.flow.FlowPackage;

/**
 * This is the item provider adapter for a {@link us.coastalhacking.semiotics.model.flow.Flow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowItemProvider(AdapterFactory adapterFactory) {
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
			addEvidencePropertyDescriptor(object);
			addReviewersPropertyDescriptor(object);
			addFlowFromPropertyDescriptor(object);
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
				 BasePackage.Literals.NAMEABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evidence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvidencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traceable_evidence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traceable_evidence_feature", "_UI_Traceable_type"),
				 BasePackage.Literals.TRACEABLE__EVIDENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reviewers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReviewersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traceable_reviewers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traceable_reviewers_feature", "_UI_Traceable_type"),
				 BasePackage.Literals.TRACEABLE__REVIEWERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Flow_flowFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Flow_flowFrom_feature", "_UI_Flow_type"),
				 FlowPackage.Literals.FLOW__FLOW_FROM,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(FlowPackage.Literals.FLOW__FLOW_TO);
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
	 * This returns Flow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Flow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Flow)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Flow_type") :
			getString("_UI_Flow_type") + " " + label;
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

		switch (notification.getFeatureID(Flow.class)) {
			case FlowPackage.FLOW__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FlowPackage.FLOW__FLOW_TO:
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
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createFlow()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createFlowSource()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createFlowSink()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createDataFlowSource()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createDataFlowSink()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createMatches()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createContains()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createCastedTo()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createControlFlowSource()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.FLOW__FLOW_TO,
				 FlowFactory.eINSTANCE.createControlFlowSink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FlowEditPlugin.INSTANCE;
	}

}
