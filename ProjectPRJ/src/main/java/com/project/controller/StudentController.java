package com.project.controller;

import com.project.model.Student;
import com.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public String findAllStudent(Model model){
        List<Student> students = studentService.findAllStudents();
        model.addAttribute("students", students);
        return "student";
    }
    @GetMapping("/student/{id}")
    public String findStudentById(@PathVariable("id") Integer id, Model model){
        Student student = studentService.findStudentById(id);
        model.addAttribute("student", student);
        return "student";
    }

}
