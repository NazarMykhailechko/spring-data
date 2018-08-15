package data.ioc_example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course extends GeneralId {

    @Column
    private String name;

    @Column
    private double cost;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Student> studentList = new ArrayList<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Teacher> teacherList = new ArrayList<>();

    public Course() {
    }

    public Course(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", studentList=" + studentList +
                ", teacherList=" + teacherList +
                '}';
    }

    public void addStudent(Student student){
        student.setCourse(this);
        studentList.add(student);
    }

    public void addTeacher(Teacher teacher){
        teacher.setCourse(this);
        teacherList.add(teacher);
    }
}