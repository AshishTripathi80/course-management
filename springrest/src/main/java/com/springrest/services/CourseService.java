package com.springrest.services;

import com.springrest.entities.Course;
import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourseById(Long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(Long courseId);
}
