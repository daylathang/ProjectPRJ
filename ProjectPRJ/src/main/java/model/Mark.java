package model;

import embedded.MarkID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Mark")
public class Mark {
    @EmbeddedId
    private MarkID markID;

    @Column(name = "mark", nullable = false)
    private Double mark;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cid", nullable = false)
    private MarkCategory cid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sid", nullable = false)
    private Student sid;

}