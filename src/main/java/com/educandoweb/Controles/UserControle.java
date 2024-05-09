package com.educandoweb.Controles;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.educandoweb.Modelos.User;
import com.educandoweb.Services.UserService;

public class UserControle {

    private UserService userService;

    @GetMapping("/User")
    public ResponseEntity<List<User>> BuscarUser(){

        List<User> list = userService.BuscarUsuario();
        return ResponseEntity.status(HttpStatus.OK).body(list);
        
    }

    @GetMapping("/User/{idUser}")
    public ResponseEntity<User> BuscarId(@PathVariable UUID idUser){
        User obj = userService.BuscarPorId(idUser);
        return ResponseEntity.status(HttpStatus.OK).body(obj);

    }
    
    
}
