package Task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String args[]) throws JAXBException {

        //creating xml file
        Customer customer = new Customer(1, 26, "Ms Annie Leonheart");
        File file = new File("customer.xml");
        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(customer, file);

        //reading xml file
        File fileOut = new File("customer.xml");
        JAXBContext contextOut = JAXBContext.newInstance(Customer.class);
        Unmarshaller unmarshaller = contextOut.createUnmarshaller();
        Customer newCustomer = (Customer) unmarshaller.unmarshal(fileOut);

    }
}
