/**
 */
package liaa.ipa.xml.control.BillOfResources.impl;

import liaa.ipa.xml.control.BillOfResources.BoR;
import liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor;
import liaa.ipa.xml.control.BillOfResources.Resource;
import liaa.ipa.xml.control.BillOfResources.ResourceDescriptor;
import liaa.ipa.xml.control.BillOfResources.borPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bo R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.BoRImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.BoRImpl#getResourceDescriptions <em>Resource Descriptions</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.BoRImpl#getResCategoryDescriptions <em>Res Category Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoRImpl extends MinimalEObjectImpl.Container implements BoR {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected Resource resources;

	/**
	 * The cached value of the '{@link #getResourceDescriptions() <em>Resource Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDescriptions()
	 * @generated
	 * @ordered
	 */
	protected ResourceDescriptor resourceDescriptions;

	/**
	 * The cached value of the '{@link #getResCategoryDescriptions() <em>Res Category Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResCategoryDescriptions()
	 * @generated
	 * @ordered
	 */
	protected ResCategoryDescriptor resCategoryDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return borPackage.Literals.BO_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(Resource newResources, NotificationChain msgs) {
		Resource oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, borPackage.BO_R__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(Resource newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - borPackage.BO_R__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - borPackage.BO_R__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.BO_R__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDescriptor getResourceDescriptions() {
		return resourceDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceDescriptions(ResourceDescriptor newResourceDescriptions, NotificationChain msgs) {
		ResourceDescriptor oldResourceDescriptions = resourceDescriptions;
		resourceDescriptions = newResourceDescriptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, borPackage.BO_R__RESOURCE_DESCRIPTIONS, oldResourceDescriptions, newResourceDescriptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceDescriptions(ResourceDescriptor newResourceDescriptions) {
		if (newResourceDescriptions != resourceDescriptions) {
			NotificationChain msgs = null;
			if (resourceDescriptions != null)
				msgs = ((InternalEObject)resourceDescriptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - borPackage.BO_R__RESOURCE_DESCRIPTIONS, null, msgs);
			if (newResourceDescriptions != null)
				msgs = ((InternalEObject)newResourceDescriptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - borPackage.BO_R__RESOURCE_DESCRIPTIONS, null, msgs);
			msgs = basicSetResourceDescriptions(newResourceDescriptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.BO_R__RESOURCE_DESCRIPTIONS, newResourceDescriptions, newResourceDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResCategoryDescriptor getResCategoryDescriptions() {
		return resCategoryDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResCategoryDescriptions(ResCategoryDescriptor newResCategoryDescriptions, NotificationChain msgs) {
		ResCategoryDescriptor oldResCategoryDescriptions = resCategoryDescriptions;
		resCategoryDescriptions = newResCategoryDescriptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS, oldResCategoryDescriptions, newResCategoryDescriptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResCategoryDescriptions(ResCategoryDescriptor newResCategoryDescriptions) {
		if (newResCategoryDescriptions != resCategoryDescriptions) {
			NotificationChain msgs = null;
			if (resCategoryDescriptions != null)
				msgs = ((InternalEObject)resCategoryDescriptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS, null, msgs);
			if (newResCategoryDescriptions != null)
				msgs = ((InternalEObject)newResCategoryDescriptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS, null, msgs);
			msgs = basicSetResCategoryDescriptions(newResCategoryDescriptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS, newResCategoryDescriptions, newResCategoryDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case borPackage.BO_R__RESOURCES:
				return basicSetResources(null, msgs);
			case borPackage.BO_R__RESOURCE_DESCRIPTIONS:
				return basicSetResourceDescriptions(null, msgs);
			case borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS:
				return basicSetResCategoryDescriptions(null, msgs);
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
			case borPackage.BO_R__RESOURCES:
				return getResources();
			case borPackage.BO_R__RESOURCE_DESCRIPTIONS:
				return getResourceDescriptions();
			case borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS:
				return getResCategoryDescriptions();
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
			case borPackage.BO_R__RESOURCES:
				setResources((Resource)newValue);
				return;
			case borPackage.BO_R__RESOURCE_DESCRIPTIONS:
				setResourceDescriptions((ResourceDescriptor)newValue);
				return;
			case borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS:
				setResCategoryDescriptions((ResCategoryDescriptor)newValue);
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
			case borPackage.BO_R__RESOURCES:
				setResources((Resource)null);
				return;
			case borPackage.BO_R__RESOURCE_DESCRIPTIONS:
				setResourceDescriptions((ResourceDescriptor)null);
				return;
			case borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS:
				setResCategoryDescriptions((ResCategoryDescriptor)null);
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
			case borPackage.BO_R__RESOURCES:
				return resources != null;
			case borPackage.BO_R__RESOURCE_DESCRIPTIONS:
				return resourceDescriptions != null;
			case borPackage.BO_R__RES_CATEGORY_DESCRIPTIONS:
				return resCategoryDescriptions != null;
		}
		return super.eIsSet(featureID);
	}

} //BoRImpl
