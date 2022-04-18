package com.indivara.university.controller;

import com.indivara.university.dto.CourseDTO;
import com.indivara.university.entity.Course;
import com.indivara.university.entity.Student;
import com.indivara.university.repository.CourseRepository;
import com.indivara.university.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping
    public void getAllCourses(){

    }
    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @PutMapping("/lecturerAddStudent")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @GetMapping("/courses")
    public List<Course> findAllCourses(){
        return courseService.getCourses();
    }


}
