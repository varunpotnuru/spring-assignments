package com.cg.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentDao;
import com.cg.entity.Student;

@Service
public class StudentServiceImp implements StudentService      
{
	@Autowired
    StudentDao studentdao;
	@Override
	public void create(Student s) 
	{
		
		studentdao.create(s);
	}

	@Override
	public List reterive() 
	{
		
		return studentdao.reterive();
	}

	@Override
	public Student findById(int id) 
	{
		
		return studentdao.findById(id);
		 
		

	}
	public void delete(int id)
	{
		Student st1 = studentdao.findById(id);
		if(st1!=null)
		{
			studentdao.delete(id);
		}
		else
		{
			throw new RuntimeException("id not exists");
		}
	}

	


}
