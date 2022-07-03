package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suid", nullable = false)
    private Integer id;

    @Column(name = "code", nullable = false, length = 150)
    private String code;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "did", nullable = false)
    private Department did;

    @Column(name = "suname", nullable = false, length = 1500)
    private String name;


}