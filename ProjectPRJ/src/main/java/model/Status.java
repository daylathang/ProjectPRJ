package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Status")
public class Status {
    @Id
    @Column(name = "staid", nullable = false)
    private Integer id;

    @Column(name = "staname", nullable = false, length = 150)
    private String staname;

    public String getStaname() {
        return staname;
    }

    public void setStaname(String staname) {
        this.staname = staname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}