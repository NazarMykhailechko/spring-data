package data.ioc_example.service;

import data.ioc_example.model.Course;

import java.util.List;

public interface CourseService {

    void createCourse(Course course);
    List<Course> findAll();

}
