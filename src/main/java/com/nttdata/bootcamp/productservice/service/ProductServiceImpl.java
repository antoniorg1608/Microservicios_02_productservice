package com.nttdata.bootcamp.productservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.productservice.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Value("${server.port}")
	private String serverPort;

	public Product get(String id) {
		Product product = new Product();
		product.setProductId(id);
		
		return product;
	}

	public Product post(String id) {
		Product product = new Product();
		product.setProductId(id);
		
		return product;
	}
}
