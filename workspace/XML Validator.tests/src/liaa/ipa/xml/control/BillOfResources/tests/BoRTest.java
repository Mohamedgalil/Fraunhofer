/**
 */
package liaa.ipa.xml.control.BillOfResources.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import liaa.ipa.xml.control.BillOfResources.BoR;
import liaa.ipa.xml.control.BillOfResources.borFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bo R</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoRTest extends TestCase {

	/**
	 * The fixture for this Bo R test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoR fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoRTest.class);
	}

	/**
	 * Constructs a new Bo R test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoRTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bo R test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BoR fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bo R test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoR getFixture() {
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
		setFixture(borFactory.eINSTANCE.createBoR());
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

} //BoRTest
