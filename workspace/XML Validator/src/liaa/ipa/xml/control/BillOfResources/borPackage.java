/**
 */
package liaa.ipa.xml.control.BillOfResources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see liaa.ipa.xml.control.BillOfResources.borFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface borPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BillOfResources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/C:/Users/rfa-ms/Downloads/Documents/BoR.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BillOfResources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	borPackage eINSTANCE = liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl.init();

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.impl.AttributeImpl
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.impl.AttributeDescriptorImpl <em>Attribute Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.impl.AttributeDescriptorImpl
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getAttributeDescriptor()
	 * @generated
	 */
	int ATTRIBUTE_DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__ID = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__UNIT = 5;

	/**
	 * The number of structural features of the '<em>Attribute Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.impl.BoRImpl <em>Bo R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.impl.BoRImpl
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getBoR()
	 * @generated
	 */
	int BO_R = 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_R__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Resource Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_R__RESOURCE_DESCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Res Category Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_R__RES_CATEGORY_DESCRIPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Bo R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_R_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bo R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_R_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.impl.HazardDescriptorImpl <em>Hazard Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.impl.HazardDescriptorImpl
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getHazardDescriptor()
	 * @generated
	 */
	int HAZARD_DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DESCRIPTOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DESCRIPTOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DESCRIPTOR__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DESCRIPTOR__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Hazard Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hazard Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl <em>Res Category Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getResCategoryDescriptor()
	 * @generated
	 */
	int RES_CATEGORY_DESCRIPTOR = 4;

	/**
	 * The feature id for the '<em><b>Attribute Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS = 0;

	/**
	 * The feature id for the '<em><b>Hazard Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CATEGORY_DESCRIPTOR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CATEGORY_DESCRIPTOR__ID = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CATEGORY_DESCRIPTOR__LABEL = 4;

	/**
	 * The number of structural features of the '<em>Res Category Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CATEGORY_DESCRIPTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Res Category Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CATEGORY_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.impl.ResourceImpl
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl <em>Resource Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getResourceDescriptor()
	 * @generated
	 */
	int RESOURCE_DESCRIPTOR = 6;

	/**
	 * The feature id for the '<em><b>Resource Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Hazard Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS = 2;

	/**
	 * The feature id for the '<em><b>Cad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__CAD = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__DESIGNELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__ID = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__LABEL = 7;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__THUMBNAIL = 8;

	/**
	 * The number of structural features of the '<em>Resource Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Resource Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeType
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 7;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.FormatType <em>Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.FormatType
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 8;

	/**
	 * The meta object id for the '{@link liaa.ipa.xml.control.BillOfResources.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.UnitType
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 9;

	/**
	 * The meta object id for the '<em>Attribute Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeType
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getAttributeTypeObject()
	 * @generated
	 */
	int ATTRIBUTE_TYPE_OBJECT = 10;

	/**
	 * The meta object id for the '<em>Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.FormatType
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getFormatTypeObject()
	 * @generated
	 */
	int FORMAT_TYPE_OBJECT = 11;

	/**
	 * The meta object id for the '<em>Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see liaa.ipa.xml.control.BillOfResources.UnitType
	 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getUnitTypeObject()
	 * @generated
	 */
	int UNIT_TYPE_OBJECT = 12;


	/**
	 * Returns the meta object for class '{@link liaa.ipa.xml.control.BillOfResources.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link liaa.ipa.xml.control.BillOfResources.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Description();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.Attribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Attribute#getId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Id();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.Attribute#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Attribute#getLabel()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Label();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor <em>Attribute Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Descriptor</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeDescriptor
	 * @generated
	 */
	EClass getAttributeDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getDescription()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Description();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getFormat()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Format();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getId()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Id();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getLabel()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Label();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getType()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Type();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeDescriptor#getUnit()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Unit();

	/**
	 * Returns the meta object for class '{@link liaa.ipa.xml.control.BillOfResources.BoR <em>Bo R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bo R</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.BoR
	 * @generated
	 */
	EClass getBoR();

	/**
	 * Returns the meta object for the containment reference '{@link liaa.ipa.xml.control.BillOfResources.BoR#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.BoR#getResources()
	 * @see #getBoR()
	 * @generated
	 */
	EReference getBoR_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link liaa.ipa.xml.control.BillOfResources.BoR#getResourceDescriptions <em>Resource Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Descriptions</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.BoR#getResourceDescriptions()
	 * @see #getBoR()
	 * @generated
	 */
	EReference getBoR_ResourceDescriptions();

	/**
	 * Returns the meta object for the containment reference '{@link liaa.ipa.xml.control.BillOfResources.BoR#getResCategoryDescriptions <em>Res Category Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res Category Descriptions</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.BoR#getResCategoryDescriptions()
	 * @see #getBoR()
	 * @generated
	 */
	EReference getBoR_ResCategoryDescriptions();

	/**
	 * Returns the meta object for class '{@link liaa.ipa.xml.control.BillOfResources.HazardDescriptor <em>Hazard Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Descriptor</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.HazardDescriptor
	 * @generated
	 */
	EClass getHazardDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.HazardDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.HazardDescriptor#getDescription()
	 * @see #getHazardDescriptor()
	 * @generated
	 */
	EAttribute getHazardDescriptor_Description();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.HazardDescriptor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.HazardDescriptor#getId()
	 * @see #getHazardDescriptor()
	 * @generated
	 */
	EAttribute getHazardDescriptor_Id();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.HazardDescriptor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.HazardDescriptor#getLabel()
	 * @see #getHazardDescriptor()
	 * @generated
	 */
	EAttribute getHazardDescriptor_Label();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.HazardDescriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.HazardDescriptor#getType()
	 * @see #getHazardDescriptor()
	 * @generated
	 */
	EAttribute getHazardDescriptor_Type();

	/**
	 * Returns the meta object for class '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor <em>Res Category Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Category Descriptor</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor
	 * @generated
	 */
	EClass getResCategoryDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getAttributeDescriptors <em>Attribute Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Descriptors</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getAttributeDescriptors()
	 * @see #getResCategoryDescriptor()
	 * @generated
	 */
	EReference getResCategoryDescriptor_AttributeDescriptors();

	/**
	 * Returns the meta object for the containment reference list '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getHazardDescriptors <em>Hazard Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard Descriptors</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getHazardDescriptors()
	 * @see #getResCategoryDescriptor()
	 * @generated
	 */
	EReference getResCategoryDescriptor_HazardDescriptors();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getDescription()
	 * @see #getResCategoryDescriptor()
	 * @generated
	 */
	EAttribute getResCategoryDescriptor_Description();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getId()
	 * @see #getResCategoryDescriptor()
	 * @generated
	 */
	EAttribute getResCategoryDescriptor_Id();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor#getLabel()
	 * @see #getResCategoryDescriptor()
	 * @generated
	 */
	EAttribute getResCategoryDescriptor_Label();

	/**
	 * Returns the meta object for class '{@link liaa.ipa.xml.control.BillOfResources.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference '{@link liaa.ipa.xml.control.BillOfResources.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Description();

	/**
	 * Returns the meta object for the containment reference '{@link liaa.ipa.xml.control.BillOfResources.Resource#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Resource#getPosition()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Position();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.Resource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Resource#getId()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.Resource#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.Resource#getLabel()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Label();

	/**
	 * Returns the meta object for class '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor <em>Resource Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Descriptor</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor
	 * @generated
	 */
	EClass getResourceDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getResourceCategories <em>Resource Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Categories</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getResourceCategories()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EReference getResourceDescriptor_ResourceCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getAttributes()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EReference getResourceDescriptor_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getHazardDescriptors <em>Hazard Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard Descriptors</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getHazardDescriptors()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EReference getResourceDescriptor_HazardDescriptors();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getCad <em>Cad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cad</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getCad()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_Cad();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getDescription()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_Description();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getDesignelement <em>Designelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Designelement</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getDesignelement()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_Designelement();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getId()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_Id();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getLabel()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_Label();

	/**
	 * Returns the meta object for the attribute '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getThumbnail <em>Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbnail</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor#getThumbnail()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_Thumbnail();

	/**
	 * Returns the meta object for enum '{@link liaa.ipa.xml.control.BillOfResources.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link liaa.ipa.xml.control.BillOfResources.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Type</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.FormatType
	 * @generated
	 */
	EEnum getFormatType();

	/**
	 * Returns the meta object for enum '{@link liaa.ipa.xml.control.BillOfResources.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.UnitType
	 * @generated
	 */
	EEnum getUnitType();

	/**
	 * Returns the meta object for data type '{@link liaa.ipa.xml.control.BillOfResources.AttributeType <em>Attribute Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attribute Type Object</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeType
	 * @model instanceClass="liaa.ipa.xml.control.BillOfResources.AttributeType"
	 *        extendedMetaData="name='attributeType:Object' baseType='attributeType'"
	 * @generated
	 */
	EDataType getAttributeTypeObject();

	/**
	 * Returns the meta object for data type '{@link liaa.ipa.xml.control.BillOfResources.FormatType <em>Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Format Type Object</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.FormatType
	 * @model instanceClass="liaa.ipa.xml.control.BillOfResources.FormatType"
	 *        extendedMetaData="name='formatType:Object' baseType='formatType'"
	 * @generated
	 */
	EDataType getFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link liaa.ipa.xml.control.BillOfResources.UnitType <em>Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Type Object</em>'.
	 * @see liaa.ipa.xml.control.BillOfResources.UnitType
	 * @model instanceClass="liaa.ipa.xml.control.BillOfResources.UnitType"
	 *        extendedMetaData="name='unitType:Object' baseType='unitType'"
	 * @generated
	 */
	EDataType getUnitTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	borFactory getborFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.impl.AttributeImpl
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ID = eINSTANCE.getAttribute_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LABEL = eINSTANCE.getAttribute_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.impl.AttributeDescriptorImpl <em>Attribute Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.impl.AttributeDescriptorImpl
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getAttributeDescriptor()
		 * @generated
		 */
		EClass ATTRIBUTE_DESCRIPTOR = eINSTANCE.getAttributeDescriptor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__DESCRIPTION = eINSTANCE.getAttributeDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__FORMAT = eINSTANCE.getAttributeDescriptor_Format();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__ID = eINSTANCE.getAttributeDescriptor_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__LABEL = eINSTANCE.getAttributeDescriptor_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__TYPE = eINSTANCE.getAttributeDescriptor_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__UNIT = eINSTANCE.getAttributeDescriptor_Unit();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.impl.BoRImpl <em>Bo R</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.impl.BoRImpl
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getBoR()
		 * @generated
		 */
		EClass BO_R = eINSTANCE.getBoR();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_R__RESOURCES = eINSTANCE.getBoR_Resources();

		/**
		 * The meta object literal for the '<em><b>Resource Descriptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_R__RESOURCE_DESCRIPTIONS = eINSTANCE.getBoR_ResourceDescriptions();

		/**
		 * The meta object literal for the '<em><b>Res Category Descriptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_R__RES_CATEGORY_DESCRIPTIONS = eINSTANCE.getBoR_ResCategoryDescriptions();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.impl.HazardDescriptorImpl <em>Hazard Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.impl.HazardDescriptorImpl
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getHazardDescriptor()
		 * @generated
		 */
		EClass HAZARD_DESCRIPTOR = eINSTANCE.getHazardDescriptor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_DESCRIPTOR__DESCRIPTION = eINSTANCE.getHazardDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_DESCRIPTOR__ID = eINSTANCE.getHazardDescriptor_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_DESCRIPTOR__LABEL = eINSTANCE.getHazardDescriptor_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_DESCRIPTOR__TYPE = eINSTANCE.getHazardDescriptor_Type();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl <em>Res Category Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.impl.ResCategoryDescriptorImpl
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getResCategoryDescriptor()
		 * @generated
		 */
		EClass RES_CATEGORY_DESCRIPTOR = eINSTANCE.getResCategoryDescriptor();

		/**
		 * The meta object literal for the '<em><b>Attribute Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS = eINSTANCE.getResCategoryDescriptor_AttributeDescriptors();

		/**
		 * The meta object literal for the '<em><b>Hazard Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS = eINSTANCE.getResCategoryDescriptor_HazardDescriptors();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_CATEGORY_DESCRIPTOR__DESCRIPTION = eINSTANCE.getResCategoryDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_CATEGORY_DESCRIPTOR__ID = eINSTANCE.getResCategoryDescriptor_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_CATEGORY_DESCRIPTOR__LABEL = eINSTANCE.getResCategoryDescriptor_Label();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.impl.ResourceImpl
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__POSITION = eINSTANCE.getResource_Position();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ID = eINSTANCE.getResource_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__LABEL = eINSTANCE.getResource_Label();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl <em>Resource Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.impl.ResourceDescriptorImpl
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getResourceDescriptor()
		 * @generated
		 */
		EClass RESOURCE_DESCRIPTOR = eINSTANCE.getResourceDescriptor();

		/**
		 * The meta object literal for the '<em><b>Resource Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES = eINSTANCE.getResourceDescriptor_ResourceCategories();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTOR__ATTRIBUTES = eINSTANCE.getResourceDescriptor_Attributes();

		/**
		 * The meta object literal for the '<em><b>Hazard Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS = eINSTANCE.getResourceDescriptor_HazardDescriptors();

		/**
		 * The meta object literal for the '<em><b>Cad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__CAD = eINSTANCE.getResourceDescriptor_Cad();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__DESCRIPTION = eINSTANCE.getResourceDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Designelement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__DESIGNELEMENT = eINSTANCE.getResourceDescriptor_Designelement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__ID = eINSTANCE.getResourceDescriptor_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__LABEL = eINSTANCE.getResourceDescriptor_Label();

		/**
		 * The meta object literal for the '<em><b>Thumbnail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__THUMBNAIL = eINSTANCE.getResourceDescriptor_Thumbnail();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.AttributeType
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.FormatType <em>Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.FormatType
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getFormatType()
		 * @generated
		 */
		EEnum FORMAT_TYPE = eINSTANCE.getFormatType();

		/**
		 * The meta object literal for the '{@link liaa.ipa.xml.control.BillOfResources.UnitType <em>Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.UnitType
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '<em>Attribute Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.AttributeType
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getAttributeTypeObject()
		 * @generated
		 */
		EDataType ATTRIBUTE_TYPE_OBJECT = eINSTANCE.getAttributeTypeObject();

		/**
		 * The meta object literal for the '<em>Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.FormatType
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getFormatTypeObject()
		 * @generated
		 */
		EDataType FORMAT_TYPE_OBJECT = eINSTANCE.getFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see liaa.ipa.xml.control.BillOfResources.UnitType
		 * @see liaa.ipa.xml.control.BillOfResources.impl.borPackageImpl#getUnitTypeObject()
		 * @generated
		 */
		EDataType UNIT_TYPE_OBJECT = eINSTANCE.getUnitTypeObject();

	}

} //borPackage
