package com.control.rest;

import com.ex.StudentNotFoundException;
import com.model.Student;
import com.service.StudentSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        try {
            return svc.getById(id);
        } catch (Exception e) {
            throw new StudentNotFoundException("Not found student with id " + id);
        }
    }
}
