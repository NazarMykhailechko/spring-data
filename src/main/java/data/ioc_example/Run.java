package data.ioc_example;

import data.ioc_example.model.Course;
import data.ioc_example.model.Student;
import data.ioc_example.model.Teacher;
import data.ioc_example.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Configuration
@ComponentScan("data.ioc_example")
//@EnableAspectJAutoProxy
public class Run {

    public static void main(String[] args) {

        Course course1 = new Course("Java",6000.0);
        Course course2 = new Course("Machine learning",13000.0);

        course1.addStudent(new Student("Nazar",35));
        course1.addTeacher(new Teacher("Serhii",25));

        course2.addStudent(new Student("Nazar",36));
        course2.addTeacher(new Teacher("Serhii",26));

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring.xml");

        CourseService courseService = applicationContext.getBean(CourseService.class);
        courseService.createCourse(course1);
        courseService.createCourse(course2);

        courseService.findAll().forEach(System.out::println);

    }
}
