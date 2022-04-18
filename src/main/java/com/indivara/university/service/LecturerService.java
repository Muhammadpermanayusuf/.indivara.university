package com.indivara.university.service;

import com.indivara.university.entity.Lecturer;
import com.indivara.university.entity.Student;
import com.indivara.university.repository.LecturerRepository;
import com.indivara.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LecturerService {

    @Autowired
    private LecturerRepository lecturerRepository;

    public Lecturer saveLecturer(Lecturer lecturer){
        return lecturerRepository .save(lecturer);
    }

    public List <Lecturer> getLecturers(){
        return lecturerRepository.findAll();
    }

    public Lecturer getLecturerById(Long lecturerID){
        return lecturerRepository.getById(lecturerID);
    }

    public Lecturer getByName(String name){
        return lecturerRepository.findByName(name);
    }

    public Lecturer getLecturerByUsernameAndPassword(String username, String password){
        return lecturerRepository.findByUsernameAndPassword(username, password);
    }

    public String deleteLecturer(Long lecturerID) {
        lecturerRepository.deleteById(lecturerID);
        return "product removed ||" + lecturerID;
    }

    public Lecturer updateLecturer(Lecturer lecturer){
        Lecturer existingLecturer = lecturerRepository.getById(lecturer.getLecturerID());
        existingLecturer.setUsername(lecturer.getUsername());
        existingLecturer.setPassword(lecturer.getPassword());
        existingLecturer.setAddress(lecturer.getAddress());

        return lecturerRepository.save(existingLecturer);
    }

}
