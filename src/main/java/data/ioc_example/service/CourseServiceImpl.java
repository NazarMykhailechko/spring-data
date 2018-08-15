package data.ioc_example.service;

import data.ioc_example.dao.CourseDao;
import data.ioc_example.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {
    }

    @Override
    @Transactional
    public void createCourse(Course course) {
        courseDao.save(course);
    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseDao.findAll();
    }

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
}
