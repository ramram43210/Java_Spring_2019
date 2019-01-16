package com.ram.core.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.ram.core.XMLConverter;

@Configuration
public class AppConfig
{
	@Bean
	public XMLConverter getHandler()
	{
		XMLConverter xmlConverter = new XMLConverter();
		xmlConverter.setMarshaller(getJaxbMarshaller());
		xmlConverter.setUnmarshaller(getJaxbMarshaller());
		return xmlConverter;
	}

	@Bean
	public Jaxb2Marshaller getJaxbMarshaller()
	{
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setPackagesToScan("com.ram.core.model");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("jaxb.formatted.output", true);
		jaxb2Marshaller.setMarshallerProperties(map);
		return jaxb2Marshaller;
	}

}
