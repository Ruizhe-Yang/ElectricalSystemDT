/**
 */
package digital_twin.provider;


import artifact.Artifact_Factory;

import base.provider.ArtifactElementItemProvider;

import component.Component_Factory;

import digital_twin.DigitalTwinPackage;
import digital_twin.Digital_twin_Factory;
import digital_twin.Digital_twin_Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import terminology.Terminology_Factory;

/**
 * This is the item provider adapter for a {@link digital_twin.DigitalTwinPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DigitalTwinPackageItemProvider extends ArtifactElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalTwinPackageItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES);
			childrenFeatures.add(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__INTERFACES);
			childrenFeatures.add(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES);
			childrenFeatures.add(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES);
			childrenFeatures.add(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES);
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
	 * This returns DigitalTwinPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DigitalTwinPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DigitalTwinPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_DigitalTwinPackage_type") :
			getString("_UI_DigitalTwinPackage_type") + " " + label;
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

		switch (notification.getFeatureID(DigitalTwinPackage.class)) {
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES:
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__INTERFACES:
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES:
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES:
			case Digital_twin_Package.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES:
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
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES,
				 Digital_twin_Factory.eINSTANCE.createDigitalTwinPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES,
				 Digital_twin_Factory.eINSTANCE.createDigitalTwinPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__INTERFACES,
				 Digital_twin_Factory.eINSTANCE.createDigitalTwinPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__COMPONENT_PACKAGES,
				 Component_Factory.eINSTANCE.createComponentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES,
				 Artifact_Factory.eINSTANCE.createArtifactPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__ARTIFACT_PACKAGES,
				 Artifact_Factory.eINSTANCE.createArtifactPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES,
				 Terminology_Factory.eINSTANCE.createTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__TERMINOLOGY_PACKAGES,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageInterface()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__DIGITAL_TWIN_PACKAGES ||
			childFeature == Digital_twin_Package.Literals.DIGITAL_TWIN_PACKAGE__INTERFACES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
