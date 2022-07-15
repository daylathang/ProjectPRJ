package com.project.repository;

import com.project.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    @Query("select new Subject(s.id, s.code, s.did, s.name) from Subject s where s.did = ?1")
    List<Subject> findSubjectByDid(Integer did);
}
