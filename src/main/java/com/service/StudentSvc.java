package com.service;

import com.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSvc {

    public List<Student> getAll() {
        List<Student> rsl = List.of(
                Student.of(1, "Jack", "Nicholson"),
                Student.of(2, "Nikki", "Minaj"),
                Student.of(3, "Chris", "Pratt"),
                Student.of(4, "Sandra", "Bullock"),
                Student.of(5, "Hugh", "Jackman")
        );
        return rsl;
    }

    public Student getById(int id) throws Exception {
        return getAll().stream().filter(s -> s.getId() == id).findFirst().get();
    }
}
