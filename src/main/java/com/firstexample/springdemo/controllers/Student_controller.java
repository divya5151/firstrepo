package com.firstexample.springdemo.controllers;

import com.firstexample.springdemo.Services.Impl.Student_service_impl;
import com.firstexample.springdemo.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stud")
public class Student_controller {
    @Autowired
    Student_service_impl stimpl;
    @GetMapping("/test")
    public ResponseEntity<?> TestAPI(){
        return  ResponseEntity.ok("hello");
    }
    @GetMapping("/demo")
    public  String show(){

        return "welcome";
    }
    @GetMapping("/demo1")
    public  String display(){
        return"hello";
    }
    @PostMapping("/insertdata")
    public  Student registerstud(@RequestBody Student stud){
        return stimpl.createstudent(stud);
    }
    @GetMapping("/getinfo/{id}")
   public  Student getdata(@PathVariable Integer id){

        return  stimpl.getStudentById(id);
   }
   @GetMapping("/getallstud")
   public List<Student> getalldata(){
       return stimpl.getAllStudents();
   }
   @GetMapping("/getenablestud")
   public List<Student> getAllEnableStud(){
        return stimpl.getAllByEnable(true);
   }
   @PutMapping("/update")
   public Student updateStudent(@RequestBody Student s){
       return stimpl.getUpdate(s);
   }
   @DeleteMapping("/delete/{id}")
   public boolean deleteStudent(@PathVariable Integer id){
        return stimpl.deleteStudentById(id);
   }
}
