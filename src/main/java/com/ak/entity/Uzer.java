package com.ak.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by arthur on 7/10/17.
 */
@Entity
public class Uzer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uzer_id")
    private int id;

    @NotEmpty(message = "Please provide your first name")
    private String name;

    @Column(name = "password")
    @NotEmpty(message = "Please provide a password")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @NotEmpty(message = "Please provide an email")
    private String email;

    @OneToMany(mappedBy = "uzer")
    private Set<Race> races;

    public Uzer() {
    }

    /**
     * @param name
     * @param password
     * @param role
     * @param email
     */
    public Uzer(String name, String password, Role role, String email) {
        this.name = name;
        this.password = password;
        this.role = role;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
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
    public Role getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public Set<Race> getRaces() {
        return races;
    }

    public void setRaces(Set<Race> races) {
        this.races = races;
    }
}
