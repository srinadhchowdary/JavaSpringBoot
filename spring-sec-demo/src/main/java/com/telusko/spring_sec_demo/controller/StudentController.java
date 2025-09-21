package com.telusko.spring_sec_demo.controller;


import com.telusko.spring_sec_demo.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    List<Student> students = new ArrayList<>(List.of(

            new Student(1,"Navin","Java"),
            new Student(2,"Kiran","BlockChain")

    ));


    //HttpServletRequest will have csrf and session id details
//    @GetMapping("csrf-token")
//    public CsrfToken getCsrfToken(HttpServletRequest request){
//        return (CsrfToken) request.getAttribute("_csrf");
//    }

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
}
