package com.project.controller;

import com.project.model.Department;
import com.project.model.Subject;
import com.project.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(value = "/dept")
    public String HomeView(Model model, Department department){
        List<Department> departmentList = departmentService.getAllDepartment();
        model.addAttribute("departments", departmentList);
        return "dept";
    }
}
