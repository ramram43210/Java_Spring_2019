package com.ram.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.ram.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringBootApplicationTests
{
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	int randomServerPort;

	// @Test
	public void testCreateEmployeeSuccess() throws URISyntaxException
	{
		final String baseUrl = "http://localhost:" + randomServerPort + "/employees/";
		URI uri = new URI(baseUrl);
		Employee employee = new Employee("Peter", 32, 90900);

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RAM-PERSIST", "true");

		HttpEntity<Employee> request = new HttpEntity<>(employee, headers);

		ResponseEntity<String> responseEntity = this.restTemplate.postForEntity(uri, request,
				String.class);

		// Verify request succeed
		Assert.assertEquals(201, responseEntity.getStatusCodeValue());
	}

	// @Test
	public void testCreateEmployeeMissingHeader() throws URISyntaxException
	{
		final String baseUrl = "http://localhost:" + randomServerPort + "/employees/";
		URI uri = new URI(baseUrl);
		Employee employee = new Employee("Peter", 32, 90900);

		HttpHeaders headers = new HttpHeaders();

		HttpEntity<Employee> request = new HttpEntity<>(employee, headers);

		ResponseEntity<String> responseEntity = this.restTemplate.postForEntity(uri, request,
				String.class);

		// Verify request succeed
		Assert.assertEquals(400, responseEntity.getStatusCodeValue());
	}

	// @Test
	public void testGetEmployees() throws URISyntaxException
	{
		final String baseUrl = "http://localhost:" + randomServerPort + "/employees/";
		URI uri = new URI(baseUrl);

		ResponseEntity<String> responseEntity = this.restTemplate.getForEntity(uri, String.class);

		String employees = responseEntity.getBody();

		System.out.println(employees);

		// Verify request succeed
		Assert.assertEquals(200, responseEntity.getStatusCodeValue());
	}

	// @Test
	public void testGetEmployee() throws URISyntaxException
	{
		final String baseUrl = "http://localhost:" + randomServerPort + "/employees/5";
		URI uri = new URI(baseUrl);

		ResponseEntity<Employee> responseEntity = this.restTemplate.getForEntity(uri,
				Employee.class);

		Employee employee = responseEntity.getBody();

		System.out.println("employee = " + employee);

		// Verify request succeed
		Assert.assertEquals(200, responseEntity.getStatusCodeValue());
	}
	
	//@Test
	public void testDeleteEmployee() throws URISyntaxException
	{
		String baseUrl = "http://localhost:" + randomServerPort + "/employees/6";
		URI uri = new URI(baseUrl);
		this.restTemplate.delete(uri);
	}
	
	@Test
	public void testUpdateEmployee() throws URISyntaxException
	{
		String baseUrl = "http://localhost:" + randomServerPort + "/employees/7";
		
		Employee employee = new Employee("Peter", 29, 888888 );
		
		URI uri = new URI(baseUrl);
		this.restTemplate.put(uri, employee);
	}

}