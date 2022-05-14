package com.example.baithuchanh2.crudproduct.service.impl;

import java.util.List;

import com.example.baithuchanh2.crudproduct.model.ProductEntity;


public interface ProductServiceImpl {

	ProductEntity createProduct (ProductEntity product);
	
	ProductEntity getProductById (int id);
	
	List<ProductEntity> getAllProduct ();
	
	ProductEntity editProduct (int id, ProductEntity product);
	
	void deleteProduct (ProductEntity product);
	
}
