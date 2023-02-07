package com.springrest.controller;

import com.springrest.entities.Course;
import com.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    //get the courses

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable Long courseId){
        return this.courseService.getCourseById(courseId);
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Long courseId){
        try {
            this.courseService.deleteCourse(courseId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
