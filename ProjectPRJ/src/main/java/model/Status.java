package model;

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
@Table(name = "Status")
public class Status {
    @Id
    @Column(name = "staid", nullable = false)
    private Integer id;

    @Column(name = "staname", nullable = false, length = 150)
    private String name;
}