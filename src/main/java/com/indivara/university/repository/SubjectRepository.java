package com.indivara.university.repository;

import com.indivara.university.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SubjectRepository extends JpaRepository <Subject, Long> {
    Subject findBySubjectName(String subjectName);



}
