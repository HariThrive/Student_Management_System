package com.example.studentmanagementsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentmanagementsystemproject.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
