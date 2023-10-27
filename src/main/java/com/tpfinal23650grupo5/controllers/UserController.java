package com.tpfinal23650grupo5.controllers;

import com.tpfinal23650grupo5.entities.User;
import com.tpfinal23650grupo5.entities.dtos.UserDto;
import com.tpfinal23650grupo5.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserController {

    @Autowired
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    //REQUEST GET
    //TRAE LA INFO DE TODOS LOS USUARIOS
    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return service.getUsers();
    }


    //TRAE LA INFO DE UN SOLO USUARIO
    @GetMapping(value = "/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id) ;
    }

    //REQUEST CREATE

    @PostMapping(value="/users")
    public UserDto createUser(@RequestBody UserDto user){
        return service.createUser(user);
    }

    //REQUEST PUT
    public String updateFullUser() {

        return "";
    }

    //REQUEST PATCH

    public String updatePartialUser() {

        return "";
    }

    //REQUEST DELETE
    public void deleteUser() {

    }
}
