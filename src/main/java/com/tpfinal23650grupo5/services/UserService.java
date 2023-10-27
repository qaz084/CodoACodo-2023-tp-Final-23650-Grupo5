package com.tpfinal23650grupo5.services;

import com.tpfinal23650grupo5.entities.User;
import com.tpfinal23650grupo5.entities.dtos.UserDto;
import com.tpfinal23650grupo5.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getUsers() {
        List<User> users = repository.findAll();
        return users;
    }

    public User getUserById(Long id) {

        //Trato de validar que exista el usuario con el ID proporcionado
        try {
            Optional<User> optionalUser = repository.findById(id);
            if (optionalUser.isPresent()) {
                User userById = optionalUser.get();
                return userById;
            } else {
                throw new EntityNotFoundException("No se encontró ningún usuario con el ID proporcionado: "
                        + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ocurrió un error al buscar el usuario con ID: " + id);
        }
    }

    public UserDto createUser(UserDto user) {
        // List<String> users = this.getUsers();
        // users.add(user.getUserName());
        return user;
    }
}
