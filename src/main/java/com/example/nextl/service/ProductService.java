package com.example.nextl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.nextl.bean.Product;
import com.example.nextl.dao.ProductDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class ProductService {

	
	@Autowired
	public ProductDao productDao;
	

	public Product findByBarCode(String barCode) {
		return productDao.findByBarCode(barCode);
	}

	public Product findById(int id) {
		return productDao.findById(id);
	}

	public Page<Product> findAll(Pageable pageable) {
        return productDao.findAll(pageable);
    }
	
	
	

}
