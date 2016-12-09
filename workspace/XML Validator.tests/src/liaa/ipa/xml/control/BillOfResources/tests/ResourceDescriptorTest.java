/**
 */
package liaa.ipa.xml.control.BillOfResources.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import liaa.ipa.xml.control.BillOfResources.ResourceDescriptor;
import liaa.ipa.xml.control.BillOfResources.borFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDescriptorTest extends TestCase {

	/**
	 * The fixture for this Resource Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDescriptor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceDescriptorTest.class);
	}

	/**
	 * Constructs a new Resource Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceDescriptor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDescriptor getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(borFactory.eINSTANCE.createResourceDescriptor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ResourceDescriptorTest
