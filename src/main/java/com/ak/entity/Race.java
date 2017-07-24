package com.ak.entity;

import javax.persistence.*;

/**
 * Created by arthur on 7/11/17.
 */
@Entity
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "race_id")
    private int id;
    private String name;
    private int membersQuantity;
    @ManyToOne
    @JoinColumn(name="uzer_id", nullable=false)
    private Uzer uzer;

    public Race() {
    }

    /**
     * @param name
     * @param membersQuantity
     */
    public Race(String name, int membersQuantity) {
        this.name = name;
        this.membersQuantity = membersQuantity;
    }

    public int getMembersQuantity() {
        return membersQuantity;
    }

    public void setMembersQuantity(int membersQuantity) {
        this.membersQuantity = membersQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Uzer getUzer() {
        return uzer;
    }

    public void setUzer(Uzer uzer) {
        this.uzer = uzer;
    }
}
