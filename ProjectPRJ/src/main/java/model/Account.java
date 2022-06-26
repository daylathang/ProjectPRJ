package model;

import javax.persistence.*;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @Column(name = "aid", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rid", nullable = false)
    private Role rid;


}