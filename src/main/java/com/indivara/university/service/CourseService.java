package com.indivara.university.service;

import com.indivara.university.entity.Course;
import com.indivara.university.entity.Student;
import com.indivara.university.entity.Subject;
import com.indivara.university.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public Course updateCourse(Course course) {
        Course existingCourse = courseRepository.getById(course.getCourseID());
        existingCourse.setLecturerID(course.getLecturerID());
        existingCourse.setSubjectID(course.getSubjectID());
        existingCourse.setPeriod(course.getPeriod());

        return courseRepository.save(existingCourse);
    }

}
