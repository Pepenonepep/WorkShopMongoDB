package com.cauaoliveira.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cauaoliveira.workshopmongo.domain.User;
import com.cauaoliveira.workshopmongo.dto.UserDTO;
import com.cauaoliveira.workshopmongo.repository.UserRepository;
import com.cauaoliveira.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object Not Found ! "));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);

    }
    public User update(User obj){
        User newObj = repo.findById(obj.getId()).orElseThrow(() -> new ObjectNotFoundException("Object Not Found !"));
        updateData(newObj, obj);
        return repo.save(newObj);
    }
    private void updateData(User newObj, User obj){
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}
