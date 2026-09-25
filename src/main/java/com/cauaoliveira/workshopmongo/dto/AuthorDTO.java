package com.cauaoliveira.workshopmongo.dto;

import java.io.Serializable;

import com.cauaoliveira.workshopmongo.domain.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "name"})
public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public AuthorDTO(){
    }

    public AuthorDTO(User obj){
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
