package com.control;

import com.model.Student;
import com.service.StudentSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControl {

    @Autowired
    private StudentSvc svc;

    @GetMapping("/list")
    public List<Student> studentList() {
        return svc.getAll();
    }

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable int id) {
        return svc.getBbyId(id);
    }
}
