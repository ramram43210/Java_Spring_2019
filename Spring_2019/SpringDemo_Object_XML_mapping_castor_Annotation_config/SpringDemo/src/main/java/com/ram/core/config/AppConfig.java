package com.ram.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.oxm.castor.CastorMarshaller;

import com.ram.core.XMLConverter;

@Configuration
public class AppConfig
{

	@Bean
	public XMLConverter getHandler()
	{
		XMLConverter xmlConverter = new XMLConverter();
		xmlConverter.setMarshaller(getCastorMarshaller());
		xmlConverter.setUnmarshaller(getCastorMarshaller());
		return xmlConverter;
	}

	@Bean
	public CastorMarshaller getCastorMarshaller()
	{
		@SuppressWarnings("deprecation")
		CastorMarshaller castorMarshaller = new CastorMarshaller();
		Resource resource = new ClassPathResource(
				"customer_mapping.xml");
		castorMarshaller.setMappingLocation(resource);
		return castorMarshaller;
	}

}
