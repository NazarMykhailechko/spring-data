package data.ioc_example.dao;

import data.ioc_example.model.Course;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.util.List;

/*@Component
public class CourseDaoImpl implements CourseDao{

    @PersistenceContext
    private EntityManager entityManager;
    //@Autowired
    //private EntityManagerFactory entityManagerFactory;

    public CourseDaoImpl() {
    }

    @Override
    @Transactional
    public void createCourse(Course course) {
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
*//*        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        try {
            entityManager.persist(course);
            entityTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }*//*
        entityManager.persist(course);
    }

    @Override
    public List<Course> findAll() {
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.createQuery("SELECT c FROM Course as c").getResultList();
    }
}*/
