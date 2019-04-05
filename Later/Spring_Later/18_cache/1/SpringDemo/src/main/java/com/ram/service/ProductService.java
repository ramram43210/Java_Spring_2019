package com.ram.service;

import com.ram.model.Product;

public interface ProductService
{

	Product getByName(String name);

	void refreshAllProducts();
}
