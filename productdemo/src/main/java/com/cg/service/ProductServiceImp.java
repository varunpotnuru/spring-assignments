package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductInterface;
import com.cg.entity.Product;
@Service

public class ProductServiceImp implements ProductServiceInterface 
{
	
   @Autowired
   ProductInterface productdao;
	@Override
	public void create(Product p) {
		
		 productdao.create(p);
		
	}

	@Override
	public List reterive() 
	{
		return productdao.reterive();
	}

}
