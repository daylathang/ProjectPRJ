package com.project.service;

import com.project.model.Subject;
import com.project.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService{
    final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
    @Override
    public List<Subject> findAllSubject() {
        return subjectRepository.findAll();

    }

    @Override
    public List<Subject> findSubjectByDid(Integer did) {
        return subjectRepository.findSubjectByDid(did);
    }

    @Override
    public Optional<Subject> findById(Integer id) {
        Optional<Subject> subject = subjectRepository.findById(id);
        return subject;
    }

}
