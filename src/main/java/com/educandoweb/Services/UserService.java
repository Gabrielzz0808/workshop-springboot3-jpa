package com.educandoweb.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.Modelos.User;
import com.educandoweb.Repositorios.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> BuscarUsuario(){
        return userRepository.findAll();
    }
    
    public User BuscarPorId(UUID idUser){
        Optional<User> obj = userRepository.findById(idUser);
        return obj.get();
    }
}
