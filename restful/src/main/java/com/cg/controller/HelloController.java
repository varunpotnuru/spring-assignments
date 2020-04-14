package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;

@RestController
@RequestMapping("/")


public class HelloController 
{
	List<Student> s=new ArrayList<>();
	public HelloController() 
	{
		s.add(new Student("A",1,"cse",10));
		s.add(new Student("B",2,"ece",11));
				
	}
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String index(@PathVariable String name)
	{
		return "Welcome to Sring Boot!" + name;
	}
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Student> index() {

		return s ;
	}
	@RequestMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}

}
