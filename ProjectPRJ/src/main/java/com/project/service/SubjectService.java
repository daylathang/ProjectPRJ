package com.project.service;

import com.project.model.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SubjectService {
    List<Subject> findAllSubject();
    List<Subject> findSubjectByDid(Integer id);

   Optional<Subject> findById(Integer id);
}
