package com.example.vol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vol.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}
