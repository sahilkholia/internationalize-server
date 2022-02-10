package com.server.internationalize.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String english;
    private String hindi;
    private String spanish;

    public Survey() {
    }

    public Survey(String english, String hindi, String spanish) {
        this.english = english;
        this.hindi = hindi;
        this.spanish = spanish;
    }
}