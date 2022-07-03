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
    private String name;

    @Column(name = "\"from\"", nullable = false)
    private LocalDate from;

    @Column(name = "\"to\"", nullable = false)
    private LocalDate to;

}