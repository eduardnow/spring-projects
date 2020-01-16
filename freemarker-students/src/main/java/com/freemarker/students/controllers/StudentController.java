package com.freemarker.students.controllers;

import com.freemarker.students.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/students")
    public String students(Model model) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tom", 80.58));
        students.add(new Student(1, "Jerry", 90.4));
        students.add(new Student(1, "Paul", 77.5));
        model.addAttribute("students", students);

        return "index";
    }
}
