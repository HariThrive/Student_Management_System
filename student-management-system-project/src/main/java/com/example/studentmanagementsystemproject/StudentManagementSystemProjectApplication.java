package com.example.studentmanagementsystemproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentmanagementsystemproject.entity.Student;
import com.example.studentmanagementsystemproject.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*
	 * @Autowired private StudentRepository studentRepository;
	 * 
	 * @Override public void run(String... args) throws Exception { Student list=new
	 * Student("hariram","V","email.id");
	 * 
	 * studentRepository.save(list); }
	 */

}
