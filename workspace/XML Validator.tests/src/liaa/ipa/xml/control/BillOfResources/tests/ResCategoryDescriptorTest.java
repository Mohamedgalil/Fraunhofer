/**
 */
package liaa.ipa.xml.control.BillOfResources.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import liaa.ipa.xml.control.BillOfResources.ResCategoryDescriptor;
import liaa.ipa.xml.control.BillOfResources.borFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Res Category Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResCategoryDescriptorTest extends TestCase {

	/**
	 * The fixture for this Res Category Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResCategoryDescriptor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResCategoryDescriptorTest.class);
	}

	/**
	 * Constructs a new Res Category Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResCategoryDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Res Category Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResCategoryDescriptor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Res Category Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResCategoryDescriptor getFixture() {
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
		setFixture(borFactory.eINSTANCE.createResCategoryDescriptor());
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

} //ResCategoryDescriptorTest
