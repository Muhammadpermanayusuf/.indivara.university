package com.indivara.university.repository;


import com.indivara.university.dto.CourseDTO;
import com.indivara.university.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {



}
