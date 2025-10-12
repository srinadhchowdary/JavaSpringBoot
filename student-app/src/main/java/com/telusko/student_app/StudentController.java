package com.telusko.student_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student_> getStudents(){
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent(){
        Student_ s = new Student_();
        s.setName("Raj");
        s.setAge(30);

        repo.save(s);
    }
}
