package com.firstexample.springdemo.controllers;

import com.firstexample.springdemo.entities.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")

public class Admin_controller {
    @GetMapping("/studinfo")
    public ResponseEntity<Student> Student_info(){
        Student st=new Student();
        st.setId(1);
        st.setName("divya");
        st.setContact("9370269225");
        st.setEmail("divya@gmail.com");
        st.setPassword("1234");

        return ResponseEntity.status(HttpStatus.CREATED).body(st);
    }

    @PostMapping("/createstud")
    public  Student createstud(@RequestBody Student st){
        Student st2=new Student();
        st2.setId(st.getId());
        st2.setName(st.getName());
        st2.setContact(st.getContact());
        st2.setEmail(st.getEmail());
        st2.setPassword(st.getPassword());


        return st2 ;
    }
}
