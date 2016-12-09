/**
 */
package liaa.ipa.xml.control.BillOfResources.impl;

import java.util.Collection;

import liaa.ipa.xml.control.BillOfResources.AttributeDescriptor;
import liaa.ipa.xml.control.BillOfResources.HazardDescriptor;
import liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor;
import liaa.ipa.xml.control.BillOfResources.borPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Res Category Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl#getAttributeDescriptors <em>Attribute Descriptors</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl#getHazardDescriptors <em>Hazard Descriptors</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl#getId <em>Id</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResCategoryDescriptorImpl extends MinimalEObjectImpl.Container implements ResCategoryDescriptor {
	/**
	 * The cached value of the '{@link #getAttributeDescriptors() <em>Attribute Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDescriptor> attributeDescriptors;

	/**
	 * The cached value of the '{@link #getHazardDescriptors() <em>Hazard Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardDescriptor> hazardDescriptors;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResCategoryDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return borPackage.Literals.RES_CATEGORY_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDescriptor> getAttributeDescriptors() {
		if (attributeDescriptors == null) {
			attributeDescriptors = new EObjectContainmentEList<AttributeDescriptor>(AttributeDescriptor.class, this, borPackage.RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS);
		}
		return attributeDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardDescriptor> getHazardDescriptors() {
		if (hazardDescriptors == null) {
			hazardDescriptors = new EObjectContainmentEList<HazardDescriptor>(HazardDescriptor.class, this, borPackage.RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS);
		}
		return hazardDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RES_CATEGORY_DESCRIPTOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RES_CATEGORY_DESCRIPTOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RES_CATEGORY_DESCRIPTOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case borPackage.RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS:
				return ((InternalEList<?>)getAttributeDescriptors()).basicRemove(otherEnd, msgs);
			case borPackage.RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS:
				return ((InternalEList<?>)getHazardDescriptors()).basicRemove(otherEnd, msgs);
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
			case borPackage.RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS:
				return getAttributeDescriptors();
			case borPackage.RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS:
				return getHazardDescriptors();
			case borPackage.RES_CATEGORY_DESCRIPTOR__DESCRIPTION:
				return getDescription();
			case borPackage.RES_CATEGORY_DESCRIPTOR__ID:
				return getId();
			case borPackage.RES_CATEGORY_DESCRIPTOR__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case borPackage.RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS:
				getAttributeDescriptors().clear();
				getAttributeDescriptors().addAll((Collection<? extends AttributeDescriptor>)newValue);
				return;
			case borPackage.RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS:
				getHazardDescriptors().clear();
				getHazardDescriptors().addAll((Collection<? extends HazardDescriptor>)newValue);
				return;
			case borPackage.RES_CATEGORY_DESCRIPTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case borPackage.RES_CATEGORY_DESCRIPTOR__ID:
				setId((String)newValue);
				return;
			case borPackage.RES_CATEGORY_DESCRIPTOR__LABEL:
				setLabel((String)newValue);
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
			case borPackage.RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS:
				getAttributeDescriptors().clear();
				return;
			case borPackage.RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS:
				getHazardDescriptors().clear();
				return;
			case borPackage.RES_CATEGORY_DESCRIPTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case borPackage.RES_CATEGORY_DESCRIPTOR__ID:
				setId(ID_EDEFAULT);
				return;
			case borPackage.RES_CATEGORY_DESCRIPTOR__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case borPackage.RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS:
				return attributeDescriptors != null && !attributeDescriptors.isEmpty();
			case borPackage.RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS:
				return hazardDescriptors != null && !hazardDescriptors.isEmpty();
			case borPackage.RES_CATEGORY_DESCRIPTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case borPackage.RES_CATEGORY_DESCRIPTOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case borPackage.RES_CATEGORY_DESCRIPTOR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ResCategoryDescriptorImpl
