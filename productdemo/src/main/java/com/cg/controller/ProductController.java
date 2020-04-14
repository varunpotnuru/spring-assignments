package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;

import com.cg.service.ProductServiceInterface;

@RestController
public class ProductController 
{
   @Autowired
   ProductServiceInterface productservice;
   @GetMapping("/product")
   public List<Product> fetchProduct()
   {
 	return productservice.reterive();  
   }
   @PostMapping(value="/product/new",consumes= {"application/json"})                                                                                            
   public String addProduct(@RequestBody Product product)
   {
 	  productservice.create(product);
 	  return "stastement added";
   }
	
}
