package data.ioc_example.dao;

import data.ioc_example.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseDao extends CrudRepository<Course, Long> {

    //void createCourse(Course course);
    //List findAll();

}
