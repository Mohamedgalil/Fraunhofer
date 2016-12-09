/**
 */
package liaa.ipa.xml.control.BillOfResources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getResourceCategories <em>Resource Categories</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getHazardDescriptors <em>Hazard Descriptors</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getCad <em>Cad</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getDesignelement <em>Designelement</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getId <em>Id</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getLabel <em>Label</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getThumbnail <em>Thumbnail</em>}</li>
 * </ul>
 *
 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor()
 * @model extendedMetaData="name='ResourceDescriptor' kind='elementOnly'"
 * @generated
 */
public interface ResourceDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Categories</b></em>' containment reference list.
	 * The list contents are of type {@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Categories</em>' containment reference list.
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_ResourceCategories()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResourceCategories' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResCategoryDescriptor> getResourceCategories();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link liaa.ipa.xml.control.BillOfResources.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_Attributes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Attributes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Hazard Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link liaa.ipa.xml.control.BillOfResources.HazardDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Descriptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Descriptors</em>' containment reference list.
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_HazardDescriptors()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='HazardDescriptors' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HazardDescriptor> getHazardDescriptors();

	/**
	 * Returns the value of the '<em><b>Cad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cad</em>' attribute.
	 * @see #setCad(String)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_Cad()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='cad' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCad();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getCad <em>Cad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cad</em>' attribute.
	 * @see #getCad()
	 * @generated
	 */
	void setCad(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Designelement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designelement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designelement</em>' attribute.
	 * @see #setDesignelement(String)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_Designelement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='designelement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDesignelement();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getDesignelement <em>Designelement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designelement</em>' attribute.
	 * @see #getDesignelement()
	 * @generated
	 */
	void setDesignelement(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thumbnail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbnail</em>' attribute.
	 * @see #setThumbnail(String)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResourceDescriptor_Thumbnail()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='thumbnail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getThumbnail();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getThumbnail <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbnail</em>' attribute.
	 * @see #getThumbnail()
	 * @generated
	 */
	void setThumbnail(String value);

} // ResourceDescriptor
