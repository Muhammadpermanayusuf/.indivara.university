package com.indivara.university.controller;

import com.indivara.university.entity.Lecturer;
import com.indivara.university.entity.Student;
import com.indivara.university.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LecturerController {
    @Autowired
    private LecturerService lecturerService;

    @PostMapping("/addLecturer")
    public Lecturer addLecturer(@RequestBody Lecturer lecturer){
      return lecturerService.saveLecturer(lecturer);
    }

    @GetMapping("/lecturers")
    public List<Lecturer> findAllLecturer(){
        return  lecturerService.getLecturers();
    }

    @GetMapping("/loginLecturer")
    public Lecturer findByUsernameAndPassword(@RequestParam String username, @RequestParam String password){
        return lecturerService.getLecturerByUsernameAndPassword(username,password);
    }


    @PutMapping("/editlecturer")
    public Lecturer updateLecturer(@RequestBody Lecturer lecturer){
        return lecturerService.updateLecturer(lecturer);
    }


}
