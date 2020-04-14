package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;


@Repository
public interface ProductInterface 
{
	public void create(Product p);
	public List reterive();

}
