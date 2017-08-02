package com.ak.entity;

import javax.persistence.*;

/**
 * Created by arthur on 7/10/17.
 */
@Entity
public class Racer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "racer_id")
    private int id;
    private String name;
    private String birthday;
    @Enumerated(EnumType.STRING)
    private Category category;
    private int number;
    @Embedded
    @Column(insertable = false, updatable = false)
    private RacerTime firstAttempt;
    @Embedded
    @Column(insertable = false, updatable = false)
    private RacerTime secondAttempt;


    public Racer() {
    }

    /**
     * @param name
     * @param birthday
     * @param category
     * @param number
     */
    public Racer(String name, String birthday, Category category, int number) {
        this.name = name;
        this.birthday = birthday;
        this.category = category;
        this.number = number;
    }

    /**
     * @param name
     * @param birthday
     * @param category
     * @param number
     * @param firstAttempt
     * @param secondAttempt
     */
    public Racer(String name, String birthday, Category category, int number, RacerTime firstAttempt, RacerTime secondAttempt) {
        this.name = name;
        this.birthday = birthday;
        this.category = category;
        this.number = number;
        this.firstAttempt = firstAttempt;
        this.secondAttempt = secondAttempt;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RacerTime getFirstAttempt() {
        return firstAttempt;
    }

    public void setFirstAttempt(RacerTime firstAttempt) {
        this.firstAttempt = firstAttempt;
    }

    public RacerTime getSecondAttempt() {
        return secondAttempt;
    }

    public void setSecondAttempt(RacerTime secondAttempt) {
        this.secondAttempt = secondAttempt;
    }
}

