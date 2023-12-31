/**
 */
package component.provider;


import component.ComponentPackage;
import component.Component_Factory;
import component.Component_Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link component.ComponentPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPackageItemProvider extends ComponentElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPackageItemProvider(AdapterFactory adapterFactory) {
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

			addInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentPackage_interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentPackage_interface_feature", "_UI_ComponentPackage_type"),
				 Component_Package.Literals.COMPONENT_PACKAGE__INTERFACE,
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
			childrenFeatures.add(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS);
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
	 * This returns ComponentPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentPackage_type") :
			getString("_UI_ComponentPackage_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentPackage.class)) {
			case Component_Package.COMPONENT_PACKAGE__COMPONENTS:
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
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createComponentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createComponentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createComponentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createDirectedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createUndirectedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createFork()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createLPort()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createRPort()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createReading()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createFailureMode()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createSafetyMechanism()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createCost()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createRegionalEffect()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createHigherLevelEffect()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT_PACKAGE__COMPONENTS,
				 Component_Factory.eINSTANCE.createFinalEffect()));
	}

}
