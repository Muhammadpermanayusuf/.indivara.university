package com.indivara.university.service;


import com.indivara.university.entity.Subject;
import com.indivara.university.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long subjectID) {
        return subjectRepository.getById(subjectID);
    }

   public Subject getSubjectByName(String subjectName) {
       return subjectRepository.findBySubjectName(subjectName);
    }

    public String deleteSubject(Long subjectID) {
        subjectRepository.deleteById(subjectID);
        return "product removed ||" + subjectID;
    }

    public Subject updateSubject(Subject subject) {
        Subject existingSubject= subjectRepository.getById(subject.getSubjectID());
        existingSubject.setTimeTable(subject.getTimeTable());
        existingSubject.setCollegeCredits(subject.getCollegeCredits());

        return subjectRepository.save(existingSubject);
    }



}
