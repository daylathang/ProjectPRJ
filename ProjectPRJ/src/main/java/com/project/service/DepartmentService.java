package com.project.service;

import com.project.model.Department;
import com.project.model.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartmentService {
    List<Department> getAllDepartment();
}
