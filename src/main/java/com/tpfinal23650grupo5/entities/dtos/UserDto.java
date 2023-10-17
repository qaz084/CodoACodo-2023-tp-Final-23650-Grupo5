package com.tpfinal23650grupo5.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {
    private String userName;
    private String userPassword;

    public UserDto() {

    }
}
