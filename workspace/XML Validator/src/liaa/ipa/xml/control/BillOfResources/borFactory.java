/**
 */
package liaa.ipa.xml.control.BillOfResources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see liaa.ipa.xml.control.BillOfResources.borPackage
 * @generated
 */
public interface borFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	borFactory eINSTANCE = liaa.ipa.xml.control.BillOfResources.impl.borFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Attribute Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Descriptor</em>'.
	 * @generated
	 */
	AttributeDescriptor createAttributeDescriptor();

	/**
	 * Returns a new object of class '<em>Bo R</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bo R</em>'.
	 * @generated
	 */
	BoR createBoR();

	/**
	 * Returns a new object of class '<em>Hazard Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Descriptor</em>'.
	 * @generated
	 */
	HazardDescriptor createHazardDescriptor();

	/**
	 * Returns a new object of class '<em>Res Category Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Res Category Descriptor</em>'.
	 * @generated
	 */
	ResCategoryDescriptor createResCategoryDescriptor();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Resource Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Descriptor</em>'.
	 * @generated
	 */
	ResourceDescriptor createResourceDescriptor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	borPackage getborPackage();

} //borFactory
