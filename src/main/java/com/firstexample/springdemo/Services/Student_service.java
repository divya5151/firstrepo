package com.firstexample.springdemo.Services;

import com.firstexample.springdemo.entities.Student;
import com.firstexample.springdemo.repositories.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface Student_service {
    public Student createstudent(Student stud);
    public  Student getStudentById(Integer Id);

    public List<Student> getAllStudents();

    public  List<Student> getAllByEnable(Boolean b);

    public  Student getUpdate(Student s);
    public Boolean deleteStudentById(Integer id);


}
