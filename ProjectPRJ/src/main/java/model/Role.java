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
@Table(name = "Role")
public class Role {
    @Id
    @Column(name = "rid", nullable = false)
    private Integer id;

    @Column(name = "rname", nullable = false, length = 50)
    private String rname;
}