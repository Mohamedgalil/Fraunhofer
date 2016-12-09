/**
 */
package liaa.ipa.xml.control.BillOfResources.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import liaa.ipa.xml.control.BillOfResources.HazardDescriptor;
import liaa.ipa.xml.control.BillOfResources.borFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hazard Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardDescriptorTest extends TestCase {

	/**
	 * The fixture for this Hazard Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardDescriptor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HazardDescriptorTest.class);
	}

	/**
	 * Constructs a new Hazard Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hazard Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HazardDescriptor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hazard Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardDescriptor getFixture() {
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
		setFixture(borFactory.eINSTANCE.createHazardDescriptor());
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

} //HazardDescriptorTest
