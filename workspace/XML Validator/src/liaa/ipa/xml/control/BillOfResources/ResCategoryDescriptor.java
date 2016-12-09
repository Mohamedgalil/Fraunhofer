/**
 */
package liaa.ipa.xml.control.BillOfResources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Res Category Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getAttributeDescriptors <em>Attribute Descriptors</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getHazardDescriptors <em>Hazard Descriptors</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getId <em>Id</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResCategoryDescriptor()
 * @model extendedMetaData="name='ResCategoryDescriptor' kind='elementOnly'"
 * @generated
 */
public interface ResCategoryDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Descriptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Descriptors</em>' containment reference list.
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResCategoryDescriptor_AttributeDescriptors()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AttributeDescriptors' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeDescriptor> getAttributeDescriptors();

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
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResCategoryDescriptor_HazardDescriptors()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='HazardDescriptors' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HazardDescriptor> getHazardDescriptors();

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
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResCategoryDescriptor_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResCategoryDescriptor_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getId <em>Id</em>}' attribute.
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
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getResCategoryDescriptor_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // ResCategoryDescriptor
