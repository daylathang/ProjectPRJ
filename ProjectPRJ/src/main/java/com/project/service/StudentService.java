package com.project.service;

import com.project.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    List<Student> findAllStudentsByGroup(Integer id);
}
