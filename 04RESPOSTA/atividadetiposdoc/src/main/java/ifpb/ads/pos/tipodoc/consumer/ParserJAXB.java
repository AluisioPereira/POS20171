package ifpb.ads.pos.tipodoc.consumer;

import ifpb.ads.pos.tipodoc.entidades.Livro;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author ajp
 */
public class ParserJAXB implements ParserXML {

    @Override
    public void toObject() {
        try {
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("src/main/java/ads/pos/xml/source/livro.xsd"));

            File file = new File("src/main/java/ifpb/ads/pos/tipodoc/livro.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Livro.class);
            Unmarshaller marshaller = jaxbContext.createUnmarshaller();
            marshaller.setSchema(schema);

            Livro livro = (Livro) marshaller.unmarshal(file);
            System.out.println(livro);
        } catch (JAXBException | SAXException e) {
            Logger.getLogger(ParserJAXB.class.getName()).log(Level.SEVERE, null, e);
        }
    }

 

    @Override
    public void toXML(Livro livro) {
         try {

            File file = new File("src/main/java/ifpb/ads/pos/tipodoc/livro.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Livro.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.w3schools.com livro.xsd");

            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("src/main/java/ifpb/ads/pos/tipodoc/livro.xsd"));
            marshaller.setSchema(schema);

            marshaller.marshal(livro, file);
            marshaller.marshal(livro, System.out);

        } catch (JAXBException | SAXException e) {
            Logger.getLogger(ParserJAXB.class.getName()).log(Level.SEVERE, null, e);
        }    
    
    }

}
