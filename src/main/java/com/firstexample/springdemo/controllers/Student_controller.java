package com.firstexample.springdemo.controllers;

import com.firstexample.springdemo.entities.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stud")
public class Student_controller {
    @GetMapping("/test")
    public ResponseEntity<?> TestAPI(){
        return  ResponseEntity.ok("hello");
    }
    @GetMapping("/demo")
    public  String show(){
        return "welcome";
    }

}
