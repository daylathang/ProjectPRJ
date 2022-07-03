package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Semester")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seid", nullable = false)
    private Integer id;

    @Column(name = "sename", nullable = false, length = 50)
    private String sename;

    @Column(name = "\"from\"", nullable = false)
    private LocalDate from;

    @Column(name = "\"to\"", nullable = false)
    private LocalDate to;

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public String getSename() {
        return sename;
    }

    public void setSename(String sename) {
        this.sename = sename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}