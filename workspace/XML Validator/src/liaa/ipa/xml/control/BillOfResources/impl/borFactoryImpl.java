/**
 */
package liaa.ipa.xml.control.BillOfResources.impl;

import liaa.ipa.xml.control.BillOfResources.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class borFactoryImpl extends EFactoryImpl implements borFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static borFactory init() {
		try {
			borFactory theborFactory = (borFactory)EPackage.Registry.INSTANCE.getEFactory(borPackage.eNS_URI);
			if (theborFactory != null) {
				return theborFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new borFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public borFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case borPackage.ATTRIBUTE: return createAttribute();
			case borPackage.ATTRIBUTE_DESCRIPTOR: return createAttributeDescriptor();
			case borPackage.BO_R: return createBoR();
			case borPackage.HAZARD_DESCRIPTOR: return createHazardDescriptor();
			case borPackage.RES_CATEGORY_DESCRIPTOR: return createResCategoryDescriptor();
			case borPackage.RESOURCE: return createResource();
			case borPackage.RESOURCE_DESCRIPTOR: return createResourceDescriptor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case borPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			case borPackage.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			case borPackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case borPackage.ATTRIBUTE_TYPE_OBJECT:
				return createAttributeTypeObjectFromString(eDataType, initialValue);
			case borPackage.FORMAT_TYPE_OBJECT:
				return createFormatTypeObjectFromString(eDataType, initialValue);
			case borPackage.UNIT_TYPE_OBJECT:
				return createUnitTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case borPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			case borPackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			case borPackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case borPackage.ATTRIBUTE_TYPE_OBJECT:
				return convertAttributeTypeObjectToString(eDataType, instanceValue);
			case borPackage.FORMAT_TYPE_OBJECT:
				return convertFormatTypeObjectToString(eDataType, instanceValue);
			case borPackage.UNIT_TYPE_OBJECT:
				return convertUnitTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDescriptor createAttributeDescriptor() {
		AttributeDescriptorImpl attributeDescriptor = new AttributeDescriptorImpl();
		return attributeDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoR createBoR() {
		BoRImpl boR = new BoRImpl();
		return boR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardDescriptor createHazardDescriptor() {
		HazardDescriptorImpl hazardDescriptor = new HazardDescriptorImpl();
		return hazardDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResCategoryDescriptor createResCategoryDescriptor() {
		ResCategoryDescriptorImpl resCategoryDescriptor = new ResCategoryDescriptorImpl();
		return resCategoryDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDescriptor createResourceDescriptor() {
		ResourceDescriptorImpl resourceDescriptor = new ResourceDescriptorImpl();
		return resourceDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAttributeTypeFromString(borPackage.Literals.ATTRIBUTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAttributeTypeToString(borPackage.Literals.ATTRIBUTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFormatTypeFromString(borPackage.Literals.FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormatTypeToString(borPackage.Literals.FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitTypeFromString(borPackage.Literals.UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitTypeToString(borPackage.Literals.UNIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public borPackage getborPackage() {
		return (borPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static borPackage getPackage() {
		return borPackage.eINSTANCE;
	}

} //borFactoryImpl
