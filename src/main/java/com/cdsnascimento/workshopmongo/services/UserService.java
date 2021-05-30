package com.cdsnascimento.workshopmongo.services;

import java.util.List;

import com.cdsnascimento.workshopmongo.damain.User;
import com.cdsnascimento.workshopmongo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
