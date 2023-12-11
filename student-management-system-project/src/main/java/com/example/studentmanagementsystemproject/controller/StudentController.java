package com.example.studentmanagementsystemproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.studentmanagementsystemproject.entity.Student;
import com.example.studentmanagementsystemproject.service.StudentService;

@Controller
public class StudentController {
   private StudentService studentService;

public StudentController(StudentService studentService) {
	super();
	this.studentService = studentService;
}
     @GetMapping("/students")  
   public String ListStudent(Model model) {
	   model.addAttribute("students", studentService.getAllStudents());
	   return"students";
   }
     
     @GetMapping("/students/new")
     public String createStudentForm(Model model) {
    	 //create student object to hold student form data
    	 Student student=new Student();
    	 model.addAttribute("student", student);
    	 return "create_students";
     }
     @PostMapping("/students")
     public String saveStudent(@ModelAttribute("student") Student student) {
    	 studentService.SaveStudent(student);
    	 return "redirect:/students";
     }
     @GetMapping("/students/edit/{id}")
     public String editStudentForm(@PathVariable Long id,Model model) {
    	 model.addAttribute("student", studentService.getStudentById(id));
    	 return "edit_student";
     }
     //get student from database by id
     @PostMapping("/student/{id}")
     public String updateStudent(@PathVariable Long id,@ModelAttribute("student")Student student,Model model) {
    	 Student existingStudent=studentService.getStudentById(id);
    	 existingStudent.setId(id);
    	 existingStudent.setFirstName(student.getFirstName());
    	 existingStudent.setLastName(student.getLastName());
    	 existingStudent.setEmail(student.getEmail());
    	 //save updated student object
    	 studentService.updateStudent(existingStudent);
    	 
    	 return "redirect:/students";
     }
     
     //handler method to handle delete student request
     @GetMapping("/student/{id}")
     public String deleteStudent(@PathVariable Long id) {
    	 studentService.deleteStudentById(id);
    	 return "redirect:/students";
     }
}
