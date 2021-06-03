package com.cdsnascimento.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import com.cdsnascimento.workshopmongo.damain.User;
import com.cdsnascimento.workshopmongo.repository.UserRepository;
import com.cdsnascimento.workshopmongo.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
