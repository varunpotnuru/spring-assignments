package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;

@Transactional
@Repository
public class ProductDaoImp implements ProductInterface 
{
   @PersistenceContext	
   EntityManager em;
	@Override
	public void create(Product p) 
	{
		
     em.persist(p);
	}

	@Override
	public List reterive() 
	{
		Query q = em.createQuery("from Product p");
		return q.getResultList();
		
	}

}
