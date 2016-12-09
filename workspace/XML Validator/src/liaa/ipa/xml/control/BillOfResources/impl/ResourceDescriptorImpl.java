/**
 */
package liaa.ipa.xml.control.BillOfResources.impl;

import java.util.Collection;

import liaa.ipa.xml.control.BillOfResources.Attribute;
import liaa.ipa.xml.control.BillOfResources.HazardDescriptor;
import liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor;
import liaa.ipa.xml.control.BillOfResources.ResourceDescriptor;
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
 * An implementation of the model object '<em><b>Resource Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getResourceCategories <em>Resource Categories</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getHazardDescriptors <em>Hazard Descriptors</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getCad <em>Cad</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getDesignelement <em>Designelement</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getId <em>Id</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl#getThumbnail <em>Thumbnail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceDescriptorImpl extends MinimalEObjectImpl.Container implements ResourceDescriptor {
	/**
	 * The cached value of the '{@link #getResourceCategories() <em>Resource Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ResCategoryDescriptor> resourceCategories;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	 * The default value of the '{@link #getCad() <em>Cad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCad()
	 * @generated
	 * @ordered
	 */
	protected static final String CAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCad() <em>Cad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCad()
	 * @generated
	 * @ordered
	 */
	protected String cad = CAD_EDEFAULT;

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
	 * The default value of the '{@link #getDesignelement() <em>Designelement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignelement()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignelement() <em>Designelement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignelement()
	 * @generated
	 * @ordered
	 */
	protected String designelement = DESIGNELEMENT_EDEFAULT;

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
	 * The default value of the '{@link #getThumbnail() <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnail()
	 * @generated
	 * @ordered
	 */
	protected static final String THUMBNAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThumbnail() <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnail()
	 * @generated
	 * @ordered
	 */
	protected String thumbnail = THUMBNAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return borPackage.Literals.RESOURCE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResCategoryDescriptor> getResourceCategories() {
		if (resourceCategories == null) {
			resourceCategories = new EObjectContainmentEList<ResCategoryDescriptor>(ResCategoryDescriptor.class, this, borPackage.RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES);
		}
		return resourceCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, borPackage.RESOURCE_DESCRIPTOR__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardDescriptor> getHazardDescriptors() {
		if (hazardDescriptors == null) {
			hazardDescriptors = new EObjectContainmentEList<HazardDescriptor>(HazardDescriptor.class, this, borPackage.RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS);
		}
		return hazardDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCad() {
		return cad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCad(String newCad) {
		String oldCad = cad;
		cad = newCad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RESOURCE_DESCRIPTOR__CAD, oldCad, cad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RESOURCE_DESCRIPTOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesignelement() {
		return designelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignelement(String newDesignelement) {
		String oldDesignelement = designelement;
		designelement = newDesignelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RESOURCE_DESCRIPTOR__DESIGNELEMENT, oldDesignelement, designelement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RESOURCE_DESCRIPTOR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RESOURCE_DESCRIPTOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnail(String newThumbnail) {
		String oldThumbnail = thumbnail;
		thumbnail = newThumbnail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, borPackage.RESOURCE_DESCRIPTOR__THUMBNAIL, oldThumbnail, thumbnail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case borPackage.RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES:
				return ((InternalEList<?>)getResourceCategories()).basicRemove(otherEnd, msgs);
			case borPackage.RESOURCE_DESCRIPTOR__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case borPackage.RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS:
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
			case borPackage.RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES:
				return getResourceCategories();
			case borPackage.RESOURCE_DESCRIPTOR__ATTRIBUTES:
				return getAttributes();
			case borPackage.RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS:
				return getHazardDescriptors();
			case borPackage.RESOURCE_DESCRIPTOR__CAD:
				return getCad();
			case borPackage.RESOURCE_DESCRIPTOR__DESCRIPTION:
				return getDescription();
			case borPackage.RESOURCE_DESCRIPTOR__DESIGNELEMENT:
				return getDesignelement();
			case borPackage.RESOURCE_DESCRIPTOR__ID:
				return getId();
			case borPackage.RESOURCE_DESCRIPTOR__LABEL:
				return getLabel();
			case borPackage.RESOURCE_DESCRIPTOR__THUMBNAIL:
				return getThumbnail();
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
			case borPackage.RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES:
				getResourceCategories().clear();
				getResourceCategories().addAll((Collection<? extends ResCategoryDescriptor>)newValue);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS:
				getHazardDescriptors().clear();
				getHazardDescriptors().addAll((Collection<? extends HazardDescriptor>)newValue);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__CAD:
				setCad((String)newValue);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__DESIGNELEMENT:
				setDesignelement((String)newValue);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__ID:
				setId((String)newValue);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__LABEL:
				setLabel((String)newValue);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__THUMBNAIL:
				setThumbnail((String)newValue);
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
			case borPackage.RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES:
				getResourceCategories().clear();
				return;
			case borPackage.RESOURCE_DESCRIPTOR__ATTRIBUTES:
				getAttributes().clear();
				return;
			case borPackage.RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS:
				getHazardDescriptors().clear();
				return;
			case borPackage.RESOURCE_DESCRIPTOR__CAD:
				setCad(CAD_EDEFAULT);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__DESIGNELEMENT:
				setDesignelement(DESIGNELEMENT_EDEFAULT);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__ID:
				setId(ID_EDEFAULT);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case borPackage.RESOURCE_DESCRIPTOR__THUMBNAIL:
				setThumbnail(THUMBNAIL_EDEFAULT);
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
			case borPackage.RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES:
				return resourceCategories != null && !resourceCategories.isEmpty();
			case borPackage.RESOURCE_DESCRIPTOR__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case borPackage.RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS:
				return hazardDescriptors != null && !hazardDescriptors.isEmpty();
			case borPackage.RESOURCE_DESCRIPTOR__CAD:
				return CAD_EDEFAULT == null ? cad != null : !CAD_EDEFAULT.equals(cad);
			case borPackage.RESOURCE_DESCRIPTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case borPackage.RESOURCE_DESCRIPTOR__DESIGNELEMENT:
				return DESIGNELEMENT_EDEFAULT == null ? designelement != null : !DESIGNELEMENT_EDEFAULT.equals(designelement);
			case borPackage.RESOURCE_DESCRIPTOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case borPackage.RESOURCE_DESCRIPTOR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case borPackage.RESOURCE_DESCRIPTOR__THUMBNAIL:
				return THUMBNAIL_EDEFAULT == null ? thumbnail != null : !THUMBNAIL_EDEFAULT.equals(thumbnail);
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
		result.append(" (cad: ");
		result.append(cad);
		result.append(", description: ");
		result.append(description);
		result.append(", designelement: ");
		result.append(designelement);
		result.append(", id: ");
		result.append(id);
		result.append(", label: ");
		result.append(label);
		result.append(", thumbnail: ");
		result.append(thumbnail);
		result.append(')');
		return result.toString();
	}

} //ResourceDescriptorImpl
