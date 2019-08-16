package ram.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class JaxbDemo
{
	public static void main(String[] args) throws Exception
	{
		Bookstore bookStore = getBookStore();

		convertObjectToXml(bookStore);
		convertXmlToObject();
	}

	private static Bookstore getBookStore()
	{
		ArrayList<Book> bookList = new ArrayList<Book>();

		// create books
		Book book1 = new Book();
		book1.setIsbn("978-0060554736");
		book1.setName("Java Basics");
		book1.setAuthor("Peter");
		book1.setPublisher("John");
		bookList.add(book1);

		Book book2 = new Book();
		book2.setIsbn("978-3832180577");
		book2.setName("Julia");
		book2.setAuthor("David");
		book2.setPublisher("Ram");
		bookList.add(book2);

		/*
		 * Create bookstore, assigning book
		 */
		Bookstore bookStore = new Bookstore();
		bookStore.setName("National Bookstore");
		bookStore.setLocation("Washington DC");
		bookStore.setBookList(bookList);

		return bookStore;
	}

	private static void convertObjectToXml(Bookstore bookStore)
			throws JAXBException, PropertyException, FileNotFoundException
	{
		JAXBContext jaxbContext = JAXBContext.newInstance(Bookstore.class);

		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		marshaller.marshal(bookStore, new FileOutputStream("bookStore.xml"));
		System.out.println("bookStore.xml is created successfully");
	}

	private static void convertXmlToObject()
	{
		try
		{
			File file = new File("bookStore.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Bookstore.class);

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Bookstore bookstore = (Bookstore) unmarshaller.unmarshal(file);
			System.out.println(bookstore);

		}
		catch (JAXBException e)
		{
			e.printStackTrace();
		}
	}
}