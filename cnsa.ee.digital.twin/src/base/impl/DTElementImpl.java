/**
 */
package base.impl;

import base.Base_Package;
import base.Coordinate;
import base.DTElement;
import base.Dimension;
import base.Heading;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DT Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.DTElementImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#isIsCitation <em>Is Citation</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#getCitedElement <em>Cited Element</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link base.impl.DTElementImpl#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DTElementImpl extends ElementImpl implements DTElement {
	/**
	 * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected static final String GID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected String gid = GID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCitation() <em>Is Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCitation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CITATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCitation() <em>Is Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCitation()
	 * @generated
	 * @ordered
	 */
	protected boolean isCitation = IS_CITATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCitedElement() <em>Cited Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedElement()
	 * @generated
	 * @ordered
	 */
	protected DTElement citedElement;

	/**
	 * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected Coordinate coordinate;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected Heading heading;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Base_Package.Literals.DT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGid() {
		return gid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGid(String newGid) {
		String oldGid = gid;
		gid = newGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__GID, oldGid, gid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCitation() {
		return isCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCitation(boolean newIsCitation) {
		boolean oldIsCitation = isCitation;
		isCitation = newIsCitation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__IS_CITATION, oldIsCitation, isCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTElement getCitedElement() {
		if (citedElement != null && citedElement.eIsProxy()) {
			InternalEObject oldCitedElement = (InternalEObject)citedElement;
			citedElement = (DTElement)eResolveProxy(oldCitedElement);
			if (citedElement != oldCitedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Base_Package.DT_ELEMENT__CITED_ELEMENT, oldCitedElement, citedElement));
			}
		}
		return citedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTElement basicGetCitedElement() {
		return citedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitedElement(DTElement newCitedElement) {
		DTElement oldCitedElement = citedElement;
		citedElement = newCitedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__CITED_ELEMENT, oldCitedElement, citedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinate getCoordinate() {
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinate(Coordinate newCoordinate, NotificationChain msgs) {
		Coordinate oldCoordinate = coordinate;
		coordinate = newCoordinate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__COORDINATE, oldCoordinate, newCoordinate);
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
	public void setCoordinate(Coordinate newCoordinate) {
		if (newCoordinate != coordinate) {
			NotificationChain msgs = null;
			if (coordinate != null)
				msgs = ((InternalEObject)coordinate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.DT_ELEMENT__COORDINATE, null, msgs);
			if (newCoordinate != null)
				msgs = ((InternalEObject)newCoordinate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.DT_ELEMENT__COORDINATE, null, msgs);
			msgs = basicSetCoordinate(newCoordinate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__COORDINATE, newCoordinate, newCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Dimension newDimension, NotificationChain msgs) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__DIMENSION, oldDimension, newDimension);
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
	public void setDimension(Dimension newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject)dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.DT_ELEMENT__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject)newDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.DT_ELEMENT__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__DIMENSION, newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heading getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeading(Heading newHeading, NotificationChain msgs) {
		Heading oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__HEADING, oldHeading, newHeading);
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
	public void setHeading(Heading newHeading) {
		if (newHeading != heading) {
			NotificationChain msgs = null;
			if (heading != null)
				msgs = ((InternalEObject)heading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.DT_ELEMENT__HEADING, null, msgs);
			if (newHeading != null)
				msgs = ((InternalEObject)newHeading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.DT_ELEMENT__HEADING, null, msgs);
			msgs = basicSetHeading(newHeading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.DT_ELEMENT__HEADING, newHeading, newHeading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Base_Package.DT_ELEMENT__COORDINATE:
				return basicSetCoordinate(null, msgs);
			case Base_Package.DT_ELEMENT__DIMENSION:
				return basicSetDimension(null, msgs);
			case Base_Package.DT_ELEMENT__HEADING:
				return basicSetHeading(null, msgs);
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
			case Base_Package.DT_ELEMENT__GID:
				return getGid();
			case Base_Package.DT_ELEMENT__IS_CITATION:
				return isIsCitation();
			case Base_Package.DT_ELEMENT__IS_ABSTRACT:
				return isIsAbstract();
			case Base_Package.DT_ELEMENT__CITED_ELEMENT:
				if (resolve) return getCitedElement();
				return basicGetCitedElement();
			case Base_Package.DT_ELEMENT__COORDINATE:
				return getCoordinate();
			case Base_Package.DT_ELEMENT__DIMENSION:
				return getDimension();
			case Base_Package.DT_ELEMENT__HEADING:
				return getHeading();
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
			case Base_Package.DT_ELEMENT__GID:
				setGid((String)newValue);
				return;
			case Base_Package.DT_ELEMENT__IS_CITATION:
				setIsCitation((Boolean)newValue);
				return;
			case Base_Package.DT_ELEMENT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case Base_Package.DT_ELEMENT__CITED_ELEMENT:
				setCitedElement((DTElement)newValue);
				return;
			case Base_Package.DT_ELEMENT__COORDINATE:
				setCoordinate((Coordinate)newValue);
				return;
			case Base_Package.DT_ELEMENT__DIMENSION:
				setDimension((Dimension)newValue);
				return;
			case Base_Package.DT_ELEMENT__HEADING:
				setHeading((Heading)newValue);
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
			case Base_Package.DT_ELEMENT__GID:
				setGid(GID_EDEFAULT);
				return;
			case Base_Package.DT_ELEMENT__IS_CITATION:
				setIsCitation(IS_CITATION_EDEFAULT);
				return;
			case Base_Package.DT_ELEMENT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case Base_Package.DT_ELEMENT__CITED_ELEMENT:
				setCitedElement((DTElement)null);
				return;
			case Base_Package.DT_ELEMENT__COORDINATE:
				setCoordinate((Coordinate)null);
				return;
			case Base_Package.DT_ELEMENT__DIMENSION:
				setDimension((Dimension)null);
				return;
			case Base_Package.DT_ELEMENT__HEADING:
				setHeading((Heading)null);
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
			case Base_Package.DT_ELEMENT__GID:
				return GID_EDEFAULT == null ? gid != null : !GID_EDEFAULT.equals(gid);
			case Base_Package.DT_ELEMENT__IS_CITATION:
				return isCitation != IS_CITATION_EDEFAULT;
			case Base_Package.DT_ELEMENT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case Base_Package.DT_ELEMENT__CITED_ELEMENT:
				return citedElement != null;
			case Base_Package.DT_ELEMENT__COORDINATE:
				return coordinate != null;
			case Base_Package.DT_ELEMENT__DIMENSION:
				return dimension != null;
			case Base_Package.DT_ELEMENT__HEADING:
				return heading != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (gid: ");
		result.append(gid);
		result.append(", isCitation: ");
		result.append(isCitation);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //DTElementImpl
