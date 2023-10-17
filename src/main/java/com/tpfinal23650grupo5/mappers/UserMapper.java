package com.tpfinal23650grupo5.mappers;

import com.tpfinal23650grupo5.entities.User;
import com.tpfinal23650grupo5.entities.dtos.UserDto;

public class UserMapper {

    public User dtoToUser(UserDto dto){
        User user=new User();
        user.setUserName(dto.getUserName());
        user.setUserPassword(dto.setUserPassword());

        return user;
    }

    public UserDto userToDto(User user){
        UserDto dto=new UserDto();
        dto.setUserName(user.getUserName());

        return dto;
    }
}
