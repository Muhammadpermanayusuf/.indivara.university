package com.indivara.university.repository;


import com.indivara.university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByStudentName(String studentName);


   Student findByUsernameAndPassword(String username, String password);



}
