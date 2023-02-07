package com.springrest.services;

import com.springrest.dao.CourseDao;
import com.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {

    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseDao.deleteById(courseId);
    }
}
