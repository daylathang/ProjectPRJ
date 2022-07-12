package com.project.embedded;

import com.project.model.Student;
import com.project.model.Subject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class EmbeddedID implements Serializable {
    @ManyToOne
    @JoinColumn(name = "suid")
    private Subject suid;
    @ManyToOne
    @JoinColumn(name = "sid")
    private Student sid;
}
