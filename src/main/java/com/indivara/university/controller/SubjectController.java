package com.indivara.university.controller;



import com.indivara.university.entity.Subject;
import com.indivara.university.repository.SubjectRepository;
import com.indivara.university.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;




    @PostMapping("/addsubject")
    public Subject addSubject(@RequestBody Subject subject){
        return subjectService.saveSubject(subject);
    }

    @GetMapping("/subjects")
    public List <Subject> findAllSubjects(){
        return subjectService.getSubjects();
    }
    @PutMapping("/editsubject")
    public Subject updateSubject(@RequestBody Subject subject){
        return subjectService.updateSubject(subject);
    }
}
