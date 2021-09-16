package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.service.StudentService;
import com.spring.jpa.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/studentinfo",method=RequestMethod.GET)
	public List<Student> getStudentInfo(){
		return service.getAllStudentData();
		 
	}
	
	
	
	@RequestMapping(value="/studentinfo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Student postStudentData(@RequestBody Student student) {
		int id = student.getStudentid();
		Student st = service.getStudentInfo(id);
		return st;
		
	}
	
	

}
