package com.project.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "Role")
public class Role {
    @Id
    @Column(name = "rid", nullable = false)
    private Integer id;

    @Column(name = "rname", nullable = false, length = 50)
    private String name;

}