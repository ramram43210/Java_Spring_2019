package com.ram.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ram.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService
{

	@Cacheable("products")
	public Product getByName(String name)
	{
		slowDownLookupOperation();
		System.out.println("Inside getByName(String name) method");
		return new Product(name, 100);
	}

	@CacheEvict(value = "products", allEntries = true)
	public void refreshAllProducts()
	{
		/*
		 * This method will remove all 'products' from cache, say as a
		 * result of flush API.
		 */
	}

	public void slowDownLookupOperation()
	{
		try
		{
			long time = 10000L;
			Thread.sleep(time);
		}
		catch (InterruptedException e)
		{
			throw new IllegalStateException(e);
		}
	}
}
