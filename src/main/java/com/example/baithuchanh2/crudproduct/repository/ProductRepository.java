package com.example.baithuchanh2.crudproduct.repository;


import com.example.baithuchanh2.crudproduct.model.ProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
