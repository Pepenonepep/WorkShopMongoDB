package com.cauaoliveira.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cauaoliveira.workshopmongo.domain.Post;
import com.cauaoliveira.workshopmongo.repository.PostRepository;
import com.cauaoliveira.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object Not Found ! "));
    }

}
