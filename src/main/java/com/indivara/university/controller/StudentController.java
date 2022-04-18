package com.indivara.university.controller;

import com.indivara.university.entity.Student;
import com.indivara.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/students")
    public List <Student> findAllStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/login")
    public Student findByUsernameAndPassword(@RequestParam String username, @RequestParam String password){
        return studentService.getStudentByUsernameAndPassword(username,password);
    }
    @PutMapping("/editStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }


}
