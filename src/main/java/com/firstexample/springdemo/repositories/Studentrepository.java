package com.firstexample.springdemo.repositories;

import com.firstexample.springdemo.entities.Student;
import jakarta.transaction.Transactional;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.security.PublicKey;
import java.util.List;

public interface Studentrepository extends JpaRepository<Student,Integer>{
    public  Student getStudentById(Integer Id);
    @Query(nativeQuery = true,value = "select * from student")
    public List<Student>  getAllStudents();
    @Query(nativeQuery = true,value = "select * from student where enable='true'")

    public  List<Student> getAllStudentsByEnable();

    public  List<Student> getAllByEnable(Boolean b);
    @Transactional
    public Integer deleteStudentById(Integer id);




}
