package com.example.studentmanagementsystemproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.studentmanagementsystemproject.entity.Student;
import com.example.studentmanagementsystemproject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student SaveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
		
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
