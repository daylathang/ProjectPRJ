package model;

import javax.persistence.*;

@Entity
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
    private String suname;

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    public Department getDid() {
        return did;
    }

    public void setDid(Department did) {
        this.did = did;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}