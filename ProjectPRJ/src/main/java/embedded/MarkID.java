package embedded;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import model.Student;
import model.Subject;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class MarkID implements Serializable {
    @ManyToOne
    @JoinColumn(name = "suid")
    private Subject suid;
    @OneToOne
    @JoinColumn(name = "sid")
    private Student sid;
}
