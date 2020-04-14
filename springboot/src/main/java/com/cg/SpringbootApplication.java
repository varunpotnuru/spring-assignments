package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.StudentDao;
import com.cg.entity.Student;
import com.cg.service.StudentService;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner

{
	@Autowired
	StudentService stuservice;

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Student s = new Student(1,"sachin","cs");
		//Student s1 = new Student(2,"ram","ece");
		//Student s2 = new Student(3,"ravi","eee");
		//Student s3 = new Student(4,"dhoni","cse");
		//stuservice.create(s);
		//stuservice.create(s1);
		//stuservice.create(s2);
		//stuservice.create(s3);
		
		//List<Student> studentlist = studao.reterive();
		//for(Student stu:studentlist)
		{
			//System.out.println(stu.getId()+""+stu.getName()+""+stu.getDept());
			
		}
		//Student stu=studao.findById(2); 
		//System.out.println(stu.getId() +" "+stu.getName() + stu.getDept());
		//studao.delete(3);
		//studao.update(2);
		
		
		
	}

}
