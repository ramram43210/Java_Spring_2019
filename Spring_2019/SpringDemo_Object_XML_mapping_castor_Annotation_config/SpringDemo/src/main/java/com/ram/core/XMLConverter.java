package com.ram.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class XMLConverter
{
	private Marshaller marshaller;	
	private Unmarshaller unmarshaller;

	public Marshaller getMarshaller()
	{
		return marshaller;
	}

	public void setMarshaller(Marshaller marshaller)
	{
		this.marshaller = marshaller;
	}

	public Unmarshaller getUnmarshaller()
	{
		return unmarshaller;
	}

	public void setUnmarshaller(Unmarshaller unmarshaller)
	{
		this.unmarshaller = unmarshaller;
	}

	public void convertFromObjectToXML(Object object, String filepath)
			throws IOException
	{

		FileOutputStream os = null;
		try
		{
			os = new FileOutputStream(filepath);
			getMarshaller().marshal(object, new StreamResult(os));
		}
		finally
		{
			if (os != null)
			{
				os.close();
			}
		}
	}

	public Object convertFromXMLToObject(String xmlfile)
			throws IOException
	{
		FileInputStream is = null;
		try
		{
			is = new FileInputStream(xmlfile);
			return getUnmarshaller().unmarshal(new StreamSource(is));
		}
		finally
		{
			if (is != null)
			{
				is.close();
			}
		}
	}

}