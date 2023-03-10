package com.anet.chcrud.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    public User(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    private Long id;

    private String name;

    private String surname;
}
