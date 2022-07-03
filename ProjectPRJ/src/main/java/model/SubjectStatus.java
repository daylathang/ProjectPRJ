package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Subject_Status")
public class SubjectStatus {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sid", nullable = false)
    private Student sid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "suid", nullable = false)
    private Subject suid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "staid", nullable = false)
    private Status staid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "seid", nullable = false)
    private Semester seid;
}