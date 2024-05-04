package com.educandoweb.Controles;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.Modelos.User;

@RestController
@RequestMapping(value = "/users")
public class UserControls {

    public ResponseEntity<User> findAll(){
        
    }
    
}
