package com.example.baithuchanh2.crudproduct.service;

import java.util.List;

import com.example.baithuchanh2.crudproduct.model.ProductEntity;
import com.example.baithuchanh2.crudproduct.repository.ProductRepository;
import com.example.baithuchanh2.crudproduct.service.impl.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductServiceImpl{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductEntity createProduct(ProductEntity product) {
		return productRepository.save(product);
	}

	@Override
	public ProductEntity getProductById(int id) {
		return productRepository.findById(id).get();
	}

	@Override
	public List<ProductEntity> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public ProductEntity editProduct(int id, ProductEntity product) {
		ProductEntity productInDB = productRepository.findById(id).get();
		
		productInDB.setCode(product.getCode());
		productInDB.setDescription(product.getDescription());
		productInDB.setPrice(product.getPrice());
		
		return productRepository.save(productInDB);
	}

	@Override
	public void deleteProduct(ProductEntity product) {
		productRepository.delete(product);
	}

	
}
