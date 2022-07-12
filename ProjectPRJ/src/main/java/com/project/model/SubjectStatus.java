package com.project.model;

import com.project.embedded.EmbeddedID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Subject_Status")
public class SubjectStatus implements Serializable {
    @EmbeddedId
    private EmbeddedID embeddedID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "staid", nullable = false)
    private Status staid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "seid", nullable = false)
    private Semester seid;
}