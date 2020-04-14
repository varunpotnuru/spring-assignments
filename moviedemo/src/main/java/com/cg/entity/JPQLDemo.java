package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo {

	public static void main(String[] args) 
	
	{
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("per1");
	  EntityManager em = emf.createEntityManager();
	  Query query = em.createNamedQuery("movie.findAll");
	  
	  
	  
		

	}

}
