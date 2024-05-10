package com.in28minutes.learnspringboot.courses.controller;

import com.in28minutes.learnspringboot.courses.bean.Course;
import com.in28minutes.learnspringboot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();

//        return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
//                new Course(2, "Learn Full Stack With Angular and React", "in28minutes"));
    }

    @GetMapping("/courses/{id}")
    public Course getCoursesDetails(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if (course.isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
//        return new Course(1, "Learn Microservices 1", "in28minutes");
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }
}