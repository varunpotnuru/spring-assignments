package com.cg.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;
import com.cg.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController 
{
  @Autowired
  
 
  StudentService stuservice;
  @GetMapping("/student")
  public List<Student> fetchStudent()
  {
	return stuservice.reterive();  
  }
  @GetMapping(value="/student/{id}")
  public Student fetchone(@PathVariable int id)
  {
	  return stuservice.findById( id);
  }
  @GetMapping(value="/delete/{id}")
  public void delete(@PathVariable int id)
  {
	  stuservice.delete(id);
  }
  @PostMapping(value="/student/new",consumes= {"application/json"})                                                                                            
  public String addStudent(@RequestBody Student student)
  {
	  stuservice.create(student);
	  return "stastement added";
  }
  
  
  
}
