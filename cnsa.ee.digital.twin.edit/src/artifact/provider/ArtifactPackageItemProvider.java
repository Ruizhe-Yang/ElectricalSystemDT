/**
 */
package artifact.provider;


import artifact.ArtifactPackage;
import artifact.Artifact_Factory;
import artifact.Artifact_Package;

import base.provider.ArtifactElementItemProvider;

import component.Component_Factory;

import digital_twin.Digital_twin_Factory;

import digital_twin.provider.Digital_twinEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import terminology.Terminology_Factory;

/**
 * This is the item provider adapter for a {@link artifact.ArtifactPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactPackageItemProvider extends ArtifactElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackageItemProvider(AdapterFactory adapterFactory) {
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

			addInterfacesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactPackage_interfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArtifactPackage_interfaces_feature", "_UI_ArtifactPackage_type"),
				 Artifact_Package.Literals.ARTIFACT_PACKAGE__INTERFACES,
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
			childrenFeatures.add(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT);
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
	 * This returns ArtifactPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArtifactPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArtifactPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_ArtifactPackage_type") :
			getString("_UI_ArtifactPackage_type") + " " + label;
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

		switch (notification.getFeatureID(ArtifactPackage.class)) {
			case Artifact_Package.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT:
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
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifactPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifactPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createTechnique()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifactAssetRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Digital_twin_Factory.eINSTANCE.createDigitalTwinPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Digital_twin_Factory.eINSTANCE.createDigitalTwinPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createComponentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createComponentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createComponentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createDirectedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createUndirectedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createFork()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createLPort()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createRPort()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createReading()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createFailureMode()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createSafetyMechanism()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createRegionalEffect()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createHigherLevelEffect()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Component_Factory.eINSTANCE.createFinalEffect()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerm()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Digital_twinEditPlugin.INSTANCE;
	}

}
