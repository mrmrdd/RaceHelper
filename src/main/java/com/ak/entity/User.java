package com.ak.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by arthur on 7/10/17.
 */
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @NotEmpty(message = "Please provide your first name")
    private String name;

    @Column(name = "password")
    @NotEmpty(message = "Please provide a password")
    private String password;

    @Enumerated(EnumType.STRING)
    private Roles role;

    @NotEmpty(message = "Please provide an email")
    private String email;

    public User() {
    }

    public User(String name, String password, Roles role, String email) {
        this.name = name;
        this.password = password;
        this.role = role;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Enumerated(EnumType.STRING)
    public Roles getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }
}
