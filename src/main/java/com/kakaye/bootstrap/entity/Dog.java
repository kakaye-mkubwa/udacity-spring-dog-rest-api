package com.kakaye.bootstrap.entity;

import javax.persistence.*;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String dogName;
    private String breed,origin;

    public Dog(String dogName, String breed, String origin) {
        this.dogName = dogName;
        this.breed  = breed;
        this.origin = origin;
    }

    public Dog(Long id, String dogName, String breed, String origin) {
        this.id = id;
        this.dogName = dogName;
        this.breed = breed;
        this.origin = origin;
    }

    public Dog() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String name) {
        this.dogName = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
