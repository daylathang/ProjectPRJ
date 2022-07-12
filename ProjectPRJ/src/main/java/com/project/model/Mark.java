package com.project.model;

import com.project.embedded.EmbeddedID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "Mark")
public class Mark implements Serializable {
    @EmbeddedId
    private EmbeddedID embeddedID;

    @Column(name = "mark", nullable = false)
    private Double mark;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cid", nullable = false)
    private MarkCategory cid;

}