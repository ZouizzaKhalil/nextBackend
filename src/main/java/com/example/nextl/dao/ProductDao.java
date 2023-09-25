package com.example.nextl.dao;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.nextl.bean.Product;
import org.springframework.data.domain.Page;


public interface ProductDao extends JpaRepository<Product, Long> {

    Page<Product> findAll(Pageable pageable);

	Product findByBarCode(String barCode);
	
	Product findById(int id);

}