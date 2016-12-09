import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class XmlValidator {

	public static boolean validate() {
		SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		File file = new File("test.xml");
		Schema schema;
		try {
			schema = factory.newSchema(file);
			JAXBContext context = JAXBContext.newInstance(ACCESREFUSE.class);
			Unmarshaller u = context.createUnmarshaller();
			u.setSchema(schema);
			Object anObject = u.unmarshal(new StreamSource(new StringReader(getMessage())), ACCESREFUSE.class);

		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	private static String getMessage() {

		return "<ACCESREFUSE>" + "<v1>Tue Oct 15 11:45:48 CEST 2013</v1>"
				+ "<v2>0000000000000000000000000000000000000000</v2>" + "<v3>JC</v3>" + "<v4>Interdit</v4>"
				+ "<v5>81.252.190.129</v5>" + "<v6>002</v6>" + "<v7>301090</v7>" + "<v8>0</v8>" + "<v9> test </v9>"
				+ "<TypeRefus>RejetIdentite</TypeRefus>"

				+ "</ACCESREFUSE>";
	}
}
