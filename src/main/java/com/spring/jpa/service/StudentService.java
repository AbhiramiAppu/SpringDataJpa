package com.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.entity.Student;
import com.spring.jpa.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public List<Student> getAllStudentData() {
		List<Student> stList = repository.findAll();
		return stList;
	}

	public Student getStudentInfo(int id) {
		Student st = repository.findByStudentid(id);
		return st;
	}

	
	

}
