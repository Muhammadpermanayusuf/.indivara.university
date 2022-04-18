package com.indivara.university.service;

import com.indivara.university.entity.Student;
import com.indivara.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    public Student getStudentById(Long studentID) {
        return studentRepository.findById(studentID).orElse(null);
    }

    public Student getStudentByStudentName(String studentName) {
        return studentRepository.findByStudentName(studentName);
    }

    public Student getStudentByUsernameAndPassword(String username, String password){
        return studentRepository.findByUsernameAndPassword(username, password);
    }



   public String deleteStudent(Long studentID) {
        studentRepository.deleteById(studentID);
        return "product removed ||" + studentID;
    }

   public Student updateStudent(Student student) {
       Student existingStudent = studentRepository.getById(student.getStudentID());
       existingStudent.setUsername(student.getUsername());
        existingStudent.setPassword(student.getPassword());
        existingStudent.setAddress(student.getAddress());

        return studentRepository.save(existingStudent);
    }
}
