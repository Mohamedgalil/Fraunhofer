/**
 */
package liaa.ipa.xml.control.BillOfResources;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bo R</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.BoR#getResources <em>Resources</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.BoR#getResourceDescriptions <em>Resource Descriptions</em>}</li>
 *   <li>{@link liaa.ipa.xml.control.BillOfResources.BoR#getResCategoryDescriptions <em>Res Category Descriptions</em>}</li>
 * </ul>
 *
 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getBoR()
 * @model extendedMetaData="name='BoR' kind='elementOnly'"
 * @generated
 */
public interface BoR extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(Resource)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getBoR_Resources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Resources' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getResources();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.BoR#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(Resource value);

	/**
	 * Returns the value of the '<em><b>Resource Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Descriptions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Descriptions</em>' containment reference.
	 * @see #setResourceDescriptions(ResourceDescriptor)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getBoR_ResourceDescriptions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResourceDescriptions' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceDescriptor getResourceDescriptions();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.BoR#getResourceDescriptions <em>Resource Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Descriptions</em>' containment reference.
	 * @see #getResourceDescriptions()
	 * @generated
	 */
	void setResourceDescriptions(ResourceDescriptor value);

	/**
	 * Returns the value of the '<em><b>Res Category Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Category Descriptions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Category Descriptions</em>' containment reference.
	 * @see #setResCategoryDescriptions(ResCategoryDescriptor)
	 * @see liaa.ipa.xml.control.BillOfResources.borPackage#getBoR_ResCategoryDescriptions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResCategoryDescriptions' namespace='##targetNamespace'"
	 * @generated
	 */
	ResCategoryDescriptor getResCategoryDescriptions();

	/**
	 * Sets the value of the '{@link liaa.ipa.xml.control.BillOfResources.BoR#getResCategoryDescriptions <em>Res Category Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Category Descriptions</em>' containment reference.
	 * @see #getResCategoryDescriptions()
	 * @generated
	 */
	void setResCategoryDescriptions(ResCategoryDescriptor value);

} // BoR
