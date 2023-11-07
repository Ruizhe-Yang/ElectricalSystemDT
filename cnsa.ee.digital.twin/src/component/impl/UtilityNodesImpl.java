/**
 */
package component.impl;

import component.Component_Package;
import component.Reading;
import component.UtilityNodes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utility Nodes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.UtilityNodesImpl#getReading <em>Reading</em>}</li>
 *   <li>{@link component.impl.UtilityNodesImpl#getSimulated_reading <em>Simulated reading</em>}</li>
 *   <li>{@link component.impl.UtilityNodesImpl#getActual_reading <em>Actual reading</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UtilityNodesImpl extends ComponentAssetImpl implements UtilityNodes {
	/**
	 * The cached value of the '{@link #getReading() <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading()
	 * @generated
	 * @ordered
	 */
	protected Reading reading;

	/**
	 * The cached value of the '{@link #getSimulated_reading() <em>Simulated reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulated_reading()
	 * @generated
	 * @ordered
	 */
	protected Reading simulated_reading;

	/**
	 * The cached value of the '{@link #getActual_reading() <em>Actual reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual_reading()
	 * @generated
	 * @ordered
	 */
	protected Reading actual_reading;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilityNodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.UTILITY_NODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reading getReading() {
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReading(Reading newReading, NotificationChain msgs) {
		Reading oldReading = reading;
		reading = newReading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_Package.UTILITY_NODES__READING, oldReading, newReading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReading(Reading newReading) {
		if (newReading != reading) {
			NotificationChain msgs = null;
			if (reading != null)
				msgs = ((InternalEObject)reading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Component_Package.UTILITY_NODES__READING, null, msgs);
			if (newReading != null)
				msgs = ((InternalEObject)newReading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Component_Package.UTILITY_NODES__READING, null, msgs);
			msgs = basicSetReading(newReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.UTILITY_NODES__READING, newReading, newReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reading getSimulated_reading() {
		return simulated_reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulated_reading(Reading newSimulated_reading, NotificationChain msgs) {
		Reading oldSimulated_reading = simulated_reading;
		simulated_reading = newSimulated_reading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_Package.UTILITY_NODES__SIMULATED_READING, oldSimulated_reading, newSimulated_reading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimulated_reading(Reading newSimulated_reading) {
		if (newSimulated_reading != simulated_reading) {
			NotificationChain msgs = null;
			if (simulated_reading != null)
				msgs = ((InternalEObject)simulated_reading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Component_Package.UTILITY_NODES__SIMULATED_READING, null, msgs);
			if (newSimulated_reading != null)
				msgs = ((InternalEObject)newSimulated_reading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Component_Package.UTILITY_NODES__SIMULATED_READING, null, msgs);
			msgs = basicSetSimulated_reading(newSimulated_reading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.UTILITY_NODES__SIMULATED_READING, newSimulated_reading, newSimulated_reading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reading getActual_reading() {
		return actual_reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual_reading(Reading newActual_reading, NotificationChain msgs) {
		Reading oldActual_reading = actual_reading;
		actual_reading = newActual_reading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_Package.UTILITY_NODES__ACTUAL_READING, oldActual_reading, newActual_reading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActual_reading(Reading newActual_reading) {
		if (newActual_reading != actual_reading) {
			NotificationChain msgs = null;
			if (actual_reading != null)
				msgs = ((InternalEObject)actual_reading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Component_Package.UTILITY_NODES__ACTUAL_READING, null, msgs);
			if (newActual_reading != null)
				msgs = ((InternalEObject)newActual_reading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Component_Package.UTILITY_NODES__ACTUAL_READING, null, msgs);
			msgs = basicSetActual_reading(newActual_reading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.UTILITY_NODES__ACTUAL_READING, newActual_reading, newActual_reading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_Package.UTILITY_NODES__READING:
				return basicSetReading(null, msgs);
			case Component_Package.UTILITY_NODES__SIMULATED_READING:
				return basicSetSimulated_reading(null, msgs);
			case Component_Package.UTILITY_NODES__ACTUAL_READING:
				return basicSetActual_reading(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_Package.UTILITY_NODES__READING:
				return getReading();
			case Component_Package.UTILITY_NODES__SIMULATED_READING:
				return getSimulated_reading();
			case Component_Package.UTILITY_NODES__ACTUAL_READING:
				return getActual_reading();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_Package.UTILITY_NODES__READING:
				setReading((Reading)newValue);
				return;
			case Component_Package.UTILITY_NODES__SIMULATED_READING:
				setSimulated_reading((Reading)newValue);
				return;
			case Component_Package.UTILITY_NODES__ACTUAL_READING:
				setActual_reading((Reading)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Component_Package.UTILITY_NODES__READING:
				setReading((Reading)null);
				return;
			case Component_Package.UTILITY_NODES__SIMULATED_READING:
				setSimulated_reading((Reading)null);
				return;
			case Component_Package.UTILITY_NODES__ACTUAL_READING:
				setActual_reading((Reading)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Component_Package.UTILITY_NODES__READING:
				return reading != null;
			case Component_Package.UTILITY_NODES__SIMULATED_READING:
				return simulated_reading != null;
			case Component_Package.UTILITY_NODES__ACTUAL_READING:
				return actual_reading != null;
		}
		return super.eIsSet(featureID);
	}

} //UtilityNodesImpl
