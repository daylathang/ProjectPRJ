package com.project.repository;

import com.project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select new Student(s.id , s.code ,  s.name,  s.did, s.aid, s.gid, s.ssid) from Student s where s.gid = ?1")
    List<Student> getAllStudentsByGroup(Integer id);

}