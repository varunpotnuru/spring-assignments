package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Student;

@Repository
public interface StudentDao 
{
	public void create(Student s);
	public List reterive();
	public Student findById(int id);
	public void delete(int id);
	public void update(int id);
   
	
	

}
