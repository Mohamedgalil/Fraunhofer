/**
 */
package liaa.ipa.xml.control.BillOfResources.util;

import liaa.ipa.xml.control.BillOfResources.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see liaa.ipa.xml.control.BillOfResources.borPackage
 * @generated
 */
public class borAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static borPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public borAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = borPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected borSwitch<Adapter> modelSwitch =
		new borSwitch<Adapter>() {
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeDescriptor(AttributeDescriptor object) {
				return createAttributeDescriptorAdapter();
			}
			@Override
			public Adapter caseBoR(BoR object) {
				return createBoRAdapter();
			}
			@Override
			public Adapter caseHazardDescriptor(HazardDescriptor object) {
				return createHazardDescriptorAdapter();
			}
			@Override
			public Adapter caseResCategoryDescriptor(ResCategoryDescriptor object) {
				return createResCategoryDescriptorAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceDescriptor(ResourceDescriptor object) {
				return createResourceDescriptorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link liaa.ipa.xml.control.BillOfResources.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see liaa.ipa.xml.control.BillOfResources.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link liaa.ipa.xml.control.BillOfResources.AttributeDescriptor <em>Attribute Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see liaa.ipa.xml.control.BillOfResources.AttributeDescriptor
	 * @generated
	 */
	public Adapter createAttributeDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link liaa.ipa.xml.control.BillOfResources.BoR <em>Bo R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see liaa.ipa.xml.control.BillOfResources.BoR
	 * @generated
	 */
	public Adapter createBoRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link liaa.ipa.xml.control.BillOfResources.HazardDescriptor <em>Hazard Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see liaa.ipa.xml.control.BillOfResources.HazardDescriptor
	 * @generated
	 */
	public Adapter createHazardDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor <em>Res Category Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor
	 * @generated
	 */
	public Adapter createResCategoryDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link liaa.ipa.xml.control.BillOfResources.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see liaa.ipa.xml.control.BillOfResources.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link liaa.ipa.xml.control.BillOfResources.ResourceDescriptor <em>Resource Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see liaa.ipa.xml.control.BillOfResources.ResourceDescriptor
	 * @generated
	 */
	public Adapter createResourceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //borAdapterFactory
