package com.project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Getter
@Setter
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid", nullable = false)
    private Integer id;

    @Column(name = "scode", nullable = false, length = 50)
    private String code;

    @Column(name = "sname", nullable = false, length = 150)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "did", nullable = false)
    private Department did;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "aid", nullable = false)
    private Account aid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "gid", nullable = false)
    private Group gid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ssid", nullable = false)
    private StudentStatus ssid;


    public Student() {

    }
}