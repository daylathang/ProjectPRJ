package com.project.service;

import com.project.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student getStudent(Integer id);

    List<Student> getAllStudentsByGroup(Integer id);
}
