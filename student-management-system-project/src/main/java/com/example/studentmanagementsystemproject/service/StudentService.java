package com.example.studentmanagementsystemproject.service;
import java.util.*;

import com.example.studentmanagementsystemproject.entity.Student;


public interface StudentService {
   List<Student> getAllStudents();
   Student SaveStudent(Student student);
   Student getStudentById(Long id);
   Student updateStudent(Student student);
   void deleteStudentById(Long id);
}
