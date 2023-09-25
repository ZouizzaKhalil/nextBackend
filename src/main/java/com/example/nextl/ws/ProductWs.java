package com.example.nextl.ws;

import java.util.List; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.nextl.bean.Product;
import com.example.nextl.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/admin/product")

public class ProductWs {

	@Autowired
	public ProductService productService;
	
	
	@GetMapping("/barCode/{barCode}")
	public Product findByBarCode(@PathVariable String barCode) {
		return productService.findByBarCode(barCode);
	}

	@GetMapping("/id/{id}")
	public Product findById(@PathVariable int id) {
		return productService.findById(id);
	}
	
	 @GetMapping("/page")
	    public ResponseEntity<List<Product>> findAll(@RequestParam(defaultValue = "0") int page,
	                                                 @RequestParam(defaultValue = "5") int size) {
	        Page<Product> productsPage = productService.findAll(PageRequest.of(page, size));
	        List<Product> content = productsPage.getContent();
	        return ResponseEntity.ok(content);
	    }

	
	
}
