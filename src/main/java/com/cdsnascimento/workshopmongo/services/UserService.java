package com.cdsnascimento.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import com.cdsnascimento.workshopmongo.damain.User;
import com.cdsnascimento.workshopmongo.dto.UserDTO;
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

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
