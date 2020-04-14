package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.ProductInterface;
import com.cg.entity.Product;
import com.cg.service.ProductServiceInterface;

@SpringBootApplication
public class ProductdemoApplication implements CommandLineRunner {
	
	@Autowired
	ProductServiceInterface productservice;

	public static void main(String[] args) {
		SpringApplication.run(ProductdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Product p = new Product(101,"laptop",40000);
		//Product p1 = new Product(102,"mobilephone",20000);
		//Product p2 = new Product(103,"tv",60000);
		//productservice.create(p);
		//productservice.create(p1);
		//productservice.create(p2);
		//List<Product> productlist = productservice.reterive();
				//for(Product pr :productlist)
				{
					//System.out.println(pr.getProdId()+""+pr.getProdName()+""+pr.getProdPrice());
					
				}
		
		
		
		
	}

}
