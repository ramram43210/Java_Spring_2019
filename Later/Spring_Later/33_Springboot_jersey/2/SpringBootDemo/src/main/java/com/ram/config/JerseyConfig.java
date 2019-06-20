package com.ram.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.ram.filter.SecurityFilter;
import com.ram.resource.EmployeeResource;
 
@Component
public class JerseyConfig extends ResourceConfig 
{
    public JerseyConfig() 
    {
    	register(SecurityFilter.class);
        register(EmployeeResource.class);
    }
}
