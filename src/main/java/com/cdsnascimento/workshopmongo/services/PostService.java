package com.cdsnascimento.workshopmongo.services;

import java.util.Optional;

import com.cdsnascimento.workshopmongo.damain.Post;
import com.cdsnascimento.workshopmongo.damain.User;
import com.cdsnascimento.workshopmongo.repository.PostRepository;
import com.cdsnascimento.workshopmongo.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
