package com.educandoweb.Repositorios;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Modelos.User;

public interface UserRepository extends JpaRepository<User, UUID> {

    
}