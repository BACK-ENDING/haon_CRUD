package com.example.springstudy.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private long id;
    private String email;

    public Account(long id, String email) {
        this.id = id;
        this.email = email;

    }
    public Account(String email){
        this.email = email;
    }
}

