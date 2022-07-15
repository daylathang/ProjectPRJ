package com.project.controller;

import com.project.model.Subject;
import com.project.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.Optional;

@Controller
public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;;
    }

//    @GetMapping(value = "subject")
//    public String viewAllSubject(Model model){
//        List<Subject> subjectList = subjectService.findAllSubject();
//        model.addAttribute("subjectList", subjectList);
//        return "subject";
//    }

    @GetMapping("/subject/{id}")
    public String viewSubject(@PathVariable("id") Integer id, Model model){
        Optional<Subject> subject = subjectService.findById(id);
        Subject subject1 = subject.get();
        model.addAttribute("subject", subject1);
        return "index";
    }

    @GetMapping(value = "/subject/dept/{did}")
    public String viewSubjectById(Model model,@PathVariable("did") Integer id){
        List<Subject> subjectList = subjectService.findSubjectByDid(id);
        model.addAttribute("subjectList", subjectList);
        return "subject";
    }
}
