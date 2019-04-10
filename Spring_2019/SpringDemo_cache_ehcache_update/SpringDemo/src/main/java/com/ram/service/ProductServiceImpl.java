package com.ram.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ram.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService
{

	private static List<Product> products;

	static
	{
		products = getDummyProducts();
	}

	@Cacheable(value = "products",
			key = "#name",
			condition = "#name!='Phone'",
			unless = "#result==null")

	public Product getByName(String name)
	{
		System.out.println("<!----------Entering getByName()---------->");
		for (Product p : products)
		{
			if (p.getName().equalsIgnoreCase(name))
				return p;
		}
		return null;
	}

	@CacheEvict(value = "products", allEntries = true)
	public void refreshAllProducts()
	{
		// This method will remove all 'products' from cache, say as a
		// result of flush API.
	}

	@CachePut(value = "products", key = "#product.name", unless = "#result==null")
	public Product updateProduct(Product product)
	{
		System.out.println("<!----------Entering updateProduct --------->");
		for (Product p : products)
		{
			if (p.getName().equalsIgnoreCase(product.getName()))
				p.setPrice(product.getPrice());
			return p;
		}
		return null;
	}

	private static List<Product> getDummyProducts()
	{
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("LED TV", 500));
		products.add(new Product("Phone", 600));
		products.add(new Product("Fridge", 800));
		return products;
	}

}
