package com.tpfinal23650grupo5.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter
@AllArgsConstructor

public class User {
    private String userName;
    private String userPassword;

    public User() {

    }
}
