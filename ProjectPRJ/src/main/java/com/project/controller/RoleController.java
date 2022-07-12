package com.project.controller;

import com.project.model.Role;
import com.project.repository.RoleRepository;
import com.project.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String HomepageView(){
        return "index";
    }
    @RequestMapping(value = {"roles", "ditmethyme"}, method = RequestMethod.GET)
    public String roleListing(Model model) {
        List<Role> roleList = roleService.getAllRole();
        model.addAttribute("roleList", roleList);
        return "roles";
    }

}
