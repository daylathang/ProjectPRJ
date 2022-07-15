package com.project.model;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Subject")
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "Subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suid", nullable = false)
    private Integer id;

    @Column(name = "code", nullable = false, length = 150)
    private String code;

    @JoinColumn(name = "did", referencedColumnName="did",nullable = false)
    private Integer did;

    @Column(name = "suname", nullable = false, length = 1500)
    private String name;

    public Subject(Integer id, String code, Integer did, String name) {
        this.id = id;
        this.code = code;
        this.did = did;
        this.name = name;
    }
}