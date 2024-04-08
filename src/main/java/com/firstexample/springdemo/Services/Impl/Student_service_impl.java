package com.firstexample.springdemo.Services.Impl;

import com.firstexample.springdemo.Services.Student_service;
import com.firstexample.springdemo.entities.Student;
import com.firstexample.springdemo.repositories.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service

public class Student_service_impl implements Student_service {
    @Autowired
    public Studentrepository stud;

    @Override
    public Student createstudent(Student st) {
        return stud.save(st);
    }

    @Override
    public Student getStudentById(Integer Id) {
        return stud.getStudentById(Id);
    }


    @Override
    public List<Student> getAllStudents() {
        return stud.getAllByEnable(true);
/*
        return stud.getAllStudents();
*/
        /*return stud.findAll();*/
    }

    @Override
    public List<Student> getAllByEnable(Boolean b) {
        return stud.getAllByEnable(true);
    }

    @Override
    public Student getUpdate(Student s) {
        return stud.save(s);
    }

    @Override
    public Boolean deleteStudentById(Integer id) {
        Integer i = stud.deleteStudentById(id);
        System.out.println(i);
        if(i==0){

            return true;
        }
        else {
            return  false;
        }
    }


}
