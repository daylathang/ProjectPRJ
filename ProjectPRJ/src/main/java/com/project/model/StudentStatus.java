package com.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Student_Status")
public class StudentStatus {
    @Id
    @Column(name = "ssid", nullable = false)
    private Integer id;

    @Column(name = "ssname", nullable = false, length = 50)
    private String name;

}