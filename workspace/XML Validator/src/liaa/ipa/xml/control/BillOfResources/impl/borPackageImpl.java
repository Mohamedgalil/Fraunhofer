/**
 */
package liaa.ipa.xml.control.BillOfResources.impl;

import liaa.ipa.xml.control.BillOfResources.Attribute;
import liaa.ipa.xml.control.BillOfResources.AttributeDescriptor;
import liaa.ipa.xml.control.BillOfResources.AttributeType;
import liaa.ipa.xml.control.BillOfResources.BoR;
import liaa.ipa.xml.control.BillOfResources.FormatType;
import liaa.ipa.xml.control.BillOfResources.HazardDescriptor;
import liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor;
import liaa.ipa.xml.control.BillOfResources.Resource;
import liaa.ipa.xml.control.BillOfResources.ResourceDescriptor;
import liaa.ipa.xml.control.BillOfResources.UnitType;
import liaa.ipa.xml.control.BillOfResources.borFactory;
import liaa.ipa.xml.control.BillOfResources.borPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class borPackageImpl extends EPackageImpl implements borPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resCategoryDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private borPackageImpl() {
		super(eNS_URI, borFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link borPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static borPackage init() {
		if (isInited) return (borPackage)EPackage.Registry.INSTANCE.getEPackage(borPackage.eNS_URI);

		// Obtain or create and register package
		borPackageImpl theborPackage = (borPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof borPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new borPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theborPackage.createPackageContents();

		// Initialize created meta-data
		theborPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theborPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(borPackage.eNS_URI, theborPackage);
		return theborPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Description() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Id() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Label() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDescriptor() {
		return attributeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Description() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Format() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Id() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Label() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Type() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Unit() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoR() {
		return boREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoR_Resources() {
		return (EReference)boREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoR_ResourceDescriptions() {
		return (EReference)boREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoR_ResCategoryDescriptions() {
		return (EReference)boREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardDescriptor() {
		return hazardDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardDescriptor_Description() {
		return (EAttribute)hazardDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardDescriptor_Id() {
		return (EAttribute)hazardDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardDescriptor_Label() {
		return (EAttribute)hazardDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardDescriptor_Type() {
		return (EAttribute)hazardDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResCategoryDescriptor() {
		return resCategoryDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResCategoryDescriptor_AttributeDescriptors() {
		return (EReference)resCategoryDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResCategoryDescriptor_HazardDescriptors() {
		return (EReference)resCategoryDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResCategoryDescriptor_Description() {
		return (EAttribute)resCategoryDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResCategoryDescriptor_Id() {
		return (EAttribute)resCategoryDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResCategoryDescriptor_Label() {
		return (EAttribute)resCategoryDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Description() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Position() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Id() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Label() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDescriptor() {
		return resourceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDescriptor_ResourceCategories() {
		return (EReference)resourceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDescriptor_Attributes() {
		return (EReference)resourceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDescriptor_HazardDescriptors() {
		return (EReference)resourceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDescriptor_Cad() {
		return (EAttribute)resourceDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDescriptor_Description() {
		return (EAttribute)resourceDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDescriptor_Designelement() {
		return (EAttribute)resourceDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDescriptor_Id() {
		return (EAttribute)resourceDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDescriptor_Label() {
		return (EAttribute)resourceDescriptorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDescriptor_Thumbnail() {
		return (EAttribute)resourceDescriptorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormatType() {
		return formatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitType() {
		return unitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttributeTypeObject() {
		return attributeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormatTypeObject() {
		return formatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnitTypeObject() {
		return unitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public borFactory getborFactory() {
		return (borFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__DESCRIPTION);
		createEAttribute(attributeEClass, ATTRIBUTE__ID);
		createEAttribute(attributeEClass, ATTRIBUTE__LABEL);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		attributeDescriptorEClass = createEClass(ATTRIBUTE_DESCRIPTOR);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__FORMAT);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__ID);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__LABEL);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__TYPE);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__UNIT);

		boREClass = createEClass(BO_R);
		createEReference(boREClass, BO_R__RESOURCES);
		createEReference(boREClass, BO_R__RESOURCE_DESCRIPTIONS);
		createEReference(boREClass, BO_R__RES_CATEGORY_DESCRIPTIONS);

		hazardDescriptorEClass = createEClass(HAZARD_DESCRIPTOR);
		createEAttribute(hazardDescriptorEClass, HAZARD_DESCRIPTOR__DESCRIPTION);
		createEAttribute(hazardDescriptorEClass, HAZARD_DESCRIPTOR__ID);
		createEAttribute(hazardDescriptorEClass, HAZARD_DESCRIPTOR__LABEL);
		createEAttribute(hazardDescriptorEClass, HAZARD_DESCRIPTOR__TYPE);

		resCategoryDescriptorEClass = createEClass(RES_CATEGORY_DESCRIPTOR);
		createEReference(resCategoryDescriptorEClass, RES_CATEGORY_DESCRIPTOR__ATTRIBUTE_DESCRIPTORS);
		createEReference(resCategoryDescriptorEClass, RES_CATEGORY_DESCRIPTOR__HAZARD_DESCRIPTORS);
		createEAttribute(resCategoryDescriptorEClass, RES_CATEGORY_DESCRIPTOR__DESCRIPTION);
		createEAttribute(resCategoryDescriptorEClass, RES_CATEGORY_DESCRIPTOR__ID);
		createEAttribute(resCategoryDescriptorEClass, RES_CATEGORY_DESCRIPTOR__LABEL);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__DESCRIPTION);
		createEReference(resourceEClass, RESOURCE__POSITION);
		createEAttribute(resourceEClass, RESOURCE__ID);
		createEAttribute(resourceEClass, RESOURCE__LABEL);

		resourceDescriptorEClass = createEClass(RESOURCE_DESCRIPTOR);
		createEReference(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__RESOURCE_CATEGORIES);
		createEReference(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__ATTRIBUTES);
		createEReference(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__HAZARD_DESCRIPTORS);
		createEAttribute(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__CAD);
		createEAttribute(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__DESIGNELEMENT);
		createEAttribute(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__ID);
		createEAttribute(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__LABEL);
		createEAttribute(resourceDescriptorEClass, RESOURCE_DESCRIPTOR__THUMBNAIL);

		// Create enums
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
		formatTypeEEnum = createEEnum(FORMAT_TYPE);
		unitTypeEEnum = createEEnum(UNIT_TYPE);

		// Create data types
		attributeTypeObjectEDataType = createEDataType(ATTRIBUTE_TYPE_OBJECT);
		formatTypeObjectEDataType = createEDataType(FORMAT_TYPE_OBJECT);
		unitTypeObjectEDataType = createEDataType(UNIT_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Description(), this.getAttributeDescriptor(), null, "description", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDescriptorEClass, AttributeDescriptor.class, "AttributeDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDescriptor_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_Format(), this.getFormatType(), "format", null, 1, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_Type(), this.getAttributeType(), "type", null, 1, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_Unit(), this.getUnitType(), "unit", null, 1, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boREClass, BoR.class, "BoR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoR_Resources(), this.getResource(), null, "resources", null, 1, 1, BoR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoR_ResourceDescriptions(), this.getResourceDescriptor(), null, "resourceDescriptions", null, 1, 1, BoR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoR_ResCategoryDescriptions(), this.getResCategoryDescriptor(), null, "resCategoryDescriptions", null, 1, 1, BoR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardDescriptorEClass, HazardDescriptor.class, "HazardDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHazardDescriptor_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, HazardDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardDescriptor_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, HazardDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardDescriptor_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, HazardDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardDescriptor_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, HazardDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resCategoryDescriptorEClass, ResCategoryDescriptor.class, "ResCategoryDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResCategoryDescriptor_AttributeDescriptors(), this.getAttributeDescriptor(), null, "attributeDescriptors", null, 1, -1, ResCategoryDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResCategoryDescriptor_HazardDescriptors(), this.getHazardDescriptor(), null, "hazardDescriptors", null, 1, -1, ResCategoryDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResCategoryDescriptor_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, ResCategoryDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResCategoryDescriptor_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, ResCategoryDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResCategoryDescriptor_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, ResCategoryDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Description(), this.getResourceDescriptor(), null, "description", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Position(), ecorePackage.getEObject(), null, "position", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceDescriptorEClass, ResourceDescriptor.class, "ResourceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceDescriptor_ResourceCategories(), this.getResCategoryDescriptor(), null, "resourceCategories", null, 1, -1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceDescriptor_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceDescriptor_HazardDescriptors(), this.getHazardDescriptor(), null, "hazardDescriptors", null, 1, -1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDescriptor_Cad(), theXMLTypePackage.getString(), "cad", null, 1, 1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDescriptor_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDescriptor_Designelement(), theXMLTypePackage.getString(), "designelement", null, 1, 1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDescriptor_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDescriptor_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDescriptor_Thumbnail(), theXMLTypePackage.getString(), "thumbnail", null, 1, 1, ResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.DECIMAL);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.STRING);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.INTEGER);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.BOOLEAN);

		initEEnum(formatTypeEEnum, FormatType.class, "FormatType");
		addEEnumLiteral(formatTypeEEnum, FormatType.SINGLE_VALUE);
		addEEnumLiteral(formatTypeEEnum, FormatType.RANGE);
		addEEnumLiteral(formatTypeEEnum, FormatType.ENUMERATION);

		initEEnum(unitTypeEEnum, UnitType.class, "UnitType");
		addEEnumLiteral(unitTypeEEnum, UnitType.MM);
		addEEnumLiteral(unitTypeEEnum, UnitType.MS);
		addEEnumLiteral(unitTypeEEnum, UnitType.GR);

		// Initialize data types
		initEDataType(attributeTypeObjectEDataType, AttributeType.class, "AttributeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(formatTypeObjectEDataType, FormatType.class, "FormatTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitTypeObjectEDataType, UnitType.class, "UnitTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "name", "Attribute",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAttribute_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttribute_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttribute_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttribute_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (attributeDescriptorEClass, 
		   source, 
		   new String[] {
			 "name", "AttributeDescriptor",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAttributeDescriptor_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeDescriptor_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeDescriptor_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeDescriptor_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeDescriptor_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeDescriptor_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (attributeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "attributeType"
		   });	
		addAnnotation
		  (attributeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "attributeType:Object",
			 "baseType", "attributeType"
		   });	
		addAnnotation
		  (boREClass, 
		   source, 
		   new String[] {
			 "name", "BoR",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBoR_Resources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Resources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBoR_ResourceDescriptions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourceDescriptions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBoR_ResCategoryDescriptions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResCategoryDescriptions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (formatTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "formatType"
		   });	
		addAnnotation
		  (formatTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "formatType:Object",
			 "baseType", "formatType"
		   });	
		addAnnotation
		  (hazardDescriptorEClass, 
		   source, 
		   new String[] {
			 "name", "HazardDescriptor",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getHazardDescriptor_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHazardDescriptor_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHazardDescriptor_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHazardDescriptor_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resCategoryDescriptorEClass, 
		   source, 
		   new String[] {
			 "name", "ResCategoryDescriptor",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResCategoryDescriptor_AttributeDescriptors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AttributeDescriptors",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResCategoryDescriptor_HazardDescriptors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HazardDescriptors",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResCategoryDescriptor_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResCategoryDescriptor_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResCategoryDescriptor_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "name", "Resource",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResource_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResource_Position(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Position",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResource_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResource_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourceDescriptorEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceDescriptor",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResourceDescriptor_ResourceCategories(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourceCategories",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceDescriptor_Attributes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Attributes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceDescriptor_HazardDescriptors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HazardDescriptors",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceDescriptor_Cad(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cad",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceDescriptor_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceDescriptor_Designelement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "designelement",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceDescriptor_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceDescriptor_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceDescriptor_Thumbnail(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thumbnail",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (unitTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "unitType"
		   });	
		addAnnotation
		  (unitTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "unitType:Object",
			 "baseType", "unitType"
		   });
	}

} //borPackageImpl
