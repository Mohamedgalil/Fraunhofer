/**
 */
package liaa.ipa.xml.control.BillOfResources;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getFormat <em>Format</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getId <em>Id</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getLabel <em>Label</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getType <em>Type</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getAttributeDescriptor()
 * @model extendedMetaData="name='AttributeDescriptor' kind='empty'"
 * @generated
 */
public interface AttributeDescriptor extends EObject {
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
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getAttributeDescriptor_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link liaa.ipa.xml.control.BillOfResources.FormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see liaa.ipa.xml.control.BillOfResources.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(FormatType)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getAttributeDescriptor_Format()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see liaa.ipa.xml.control.BillOfResources.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Unsets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	boolean isSetFormat();

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
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getAttributeDescriptor_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getId <em>Id</em>}' attribute.
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
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getAttributeDescriptor_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link liaa.ipa.xml.control.BillOfResources.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(AttributeType)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getAttributeDescriptor_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Unsets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(AttributeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(AttributeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link liaa.ipa.xml.control.BillOfResources.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see liaa.ipa.xml.control.BillOfResources.UnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(UnitType)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getAttributeDescriptor_Unit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see liaa.ipa.xml.control.BillOfResources.UnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

	/**
	 * Unsets the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitType)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitType)
	 * @generated
	 */
	boolean isSetUnit();

} // AttributeDescriptor
