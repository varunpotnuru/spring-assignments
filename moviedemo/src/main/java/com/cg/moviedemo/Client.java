package com.cg.moviedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Movie;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("per1");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		 
		//for inserting
		Movie m1 = new Movie();
		m1.setId(100);
		m1.setMoviename("bahubhali");
		m1.setTheatrename("ramalaxman");
		m1.setScreenname("screen A");
        m1.setShowname("morning");
        System.out.println("inserted");
        
        //for inserting
        Movie m2 = new Movie();
        m2.setId(101);
        m2.setMoviename("arjunreddy");
        m2.setScreenname("screen B");
        m2.setShowname("afternoon");
        System.out.println("inserted");
       
        
        //for updating
        Movie m3 = em.find(Movie.class,100);
        System.out.println("before update");
        System.out.println("Id" +m3.getId());
        System.out.println("Moviename is " +m3.getMoviename());
        System.out.println("Theatrename is " +m3.getTheatrename());
        System.out.println("Screenname is " +m3.getScreenname());
        System.out.println("Showname is " +m3.getShowname());
        
        m3.setMoviename("hit");
        m3.setShowname("show d");
        System.out.println("after update");
        System.out.println("Id" +m3.getId());
        System.out.println("Moviename is " +m3.getMoviename());
        System.out.println("Theatrename is " +m3.getTheatrename());
        System.out.println("Screenname is " +m3.getScreenname());
        System.out.println("Showname is " +m3.getShowname());
        
        //for removing  
        Movie m4 = em.find(Movie.class, 101);
		em.remove(m4);
		System.out.println("element is removed");
		em.getTransaction().commit();
		em.close();
		
        
        
        
        
        
	}

}
