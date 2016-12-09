//package liaa.ipa.xml;
//
//import java.io.IOException;
//import java.util.Map;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
//
//import liaa.ipa.xml.control.BoR.BoR;
//import liaa.ipa.xml.control.BoR.BoRPackage;
//
//public class XmlValidator {
//
//	/**
//	 * {@link http://www.vogella.com/tutorials/EclipseEMFPersistence/article.html}
//	 *
//	 */
//	public static void main(String[] args) {
//		load("S:\\300\\320\\325\\Studenten\\RFA-MS\\Resources\\Bor_Example.bor");
//	}
//
//	public static BoR load(String xmlFilePath) {
//		BoR bor = null;
//		ResourceSet resourceSet = new ResourceSetImpl();
//
//		// register UML
//		Map packageRegistry = resourceSet.getPackageRegistry();
//		packageRegistry.put(BoRPackage.eNS_URI, BoRPackage.eINSTANCE);
//
//		// Register XML resource as UMLResource.Factory.Instance
//		Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
//		extensionFactoryMap.put("bor", new XMLResourceFactoryImpl());
//
//		Resource resource = resourceSet.getResource(URI.createFileURI(xmlFilePath), true);
//		bor = (BoR) resource.getContents().get(0);
//
//		return bor;
//	}
//}
