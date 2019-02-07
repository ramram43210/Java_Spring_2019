package ram.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class JaxbDemo
{
	public static void main(String[] args) throws Exception
	{
		convertObjectToXml();
		convertXmlToObject();
	}

	private static void convertObjectToXml() throws JAXBException,
			PropertyException, FileNotFoundException
	{
		JAXBContext jaxbContext = JAXBContext
				.newInstance(Employee.class);

		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
				true);

		Employee employee = new Employee(1, "Peter", 50000);

		marshaller.marshal(employee,
				new FileOutputStream("employee.xml"));
	}
	
	private static void convertXmlToObject()
	{
		try
		{
			File file = new File("employee.xml");
			JAXBContext jaxbContext = JAXBContext
					.newInstance(Employee.class);

			Unmarshaller unmarshaller = jaxbContext
					.createUnmarshaller();
			Employee employee = (Employee) unmarshaller.unmarshal(file);
			System.out.println(employee);

		}
		catch (JAXBException e)
		{
			e.printStackTrace();
		}
	}
}