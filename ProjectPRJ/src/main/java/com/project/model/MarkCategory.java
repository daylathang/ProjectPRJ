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
@Table(name = "Mark_Category")
public class MarkCategory {
    @Id
    @Column(name = "cid", nullable = false)
    private Integer id;

    @Column(name = "cname", nullable = false, length = 150)
    private String name;

    @Column(name = "weight", nullable = false)
    private Integer weight;

}