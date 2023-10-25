package com.tpfinal23650grupo5.services;

import com.tpfinal23650grupo5.entities.User;
import com.tpfinal23650grupo5.entities.dtos.UserDto;
import com.tpfinal23650grupo5.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository= repository;
    }

    public List<User> getUsers() {

        List<User>listUsers= repository.findAll();

        List<String> users = new ArrayList<String>();
        users.add("Jonathan");
        users.add("Cristian");
        users.add("Maximiliano");

        return listUsers;
    }

    public String getUserById(Long id) {
        List<String> users = this.getUsers();

        /*Uso esto para que por postman, se pase un ID y según eso,
        devuelva el usuario que corresponda del LIST "users"
        ( teniendo en cuenta el índice,) */
        int idConverted = Math.toIntExact(id);
        return users.get(idConverted);
    }

    public UserDto createUser(UserDto user){
        List<String> users = this.getUsers();
        users.add(user.getUserName());
        return user;
    }
}
