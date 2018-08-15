package ioc;


import data.ioc_example.model.Course;
import data.ioc_example.service.CourseService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Ioc_Test {

    @Test
    public void createCourse(){

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("data.ioc_example");
        CourseService courseService = applicationContext.getBean(CourseService.class);

        courseService.createCourse(new Course());

        Assert.assertTrue(true);

    }
}
