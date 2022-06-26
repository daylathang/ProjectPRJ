package model;

import javax.persistence.*;

@Entity
@Table(name = "Mark")
public class Mark {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "suid", nullable = false)
    private Subject suid;

    @Column(name = "mark", nullable = false)
    private Double mark;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cid", nullable = false)
    private MarkCategory cid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sid", nullable = false)
    private Student sid;

    public Student getSid() {
        return sid;
    }

    public void setSid(Student sid) {
        this.sid = sid;
    }

    public MarkCategory getCid() {
        return cid;
    }

    public void setCid(MarkCategory cid) {
        this.cid = cid;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public Subject getSuid() {
        return suid;
    }

    public void setSuid(Subject suid) {
        this.suid = suid;
    }
}