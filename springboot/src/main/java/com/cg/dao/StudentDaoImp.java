package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Student;

@Transactional
@Repository
public class StudentDaoImp implements StudentDao 
{
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Student s) 
	{
		em.persist(s);//this object will make a reference in database table
		
	}

	



	@Override
	public List reterive() 
	{
		Query q = em.createQuery("from Student s");
		return q.getResultList();
		
				
	}





	@Override
	public void delete(int id) 
	{
		Student s=em.find(Student.class, id);//this method will which id to remove
		System.out.println(s.getId() +" "+s.getDept() + " "+s.getName()+" is removed");
		
		em.remove(s);//this is object from the database
		
	}





	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		Student s1 = em.find(Student.class, id);
		s1.setDept("hr");
		System.out.println("updated");
		
		
	}





	@Override
	public Student findById(int id) {
		return em.find(Student.class, id);                                
	}






	
	

	

}
