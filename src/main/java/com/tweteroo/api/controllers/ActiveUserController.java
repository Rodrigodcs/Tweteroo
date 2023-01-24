package com.tweteroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.DTOs.ActiveUserDTO;
import com.tweteroo.api.models.ActiveUser;
import com.tweteroo.api.repositories.ActiveUserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/sign-up")
public class ActiveUserController {
    
    @Autowired
    private ActiveUserRepository repository;

    @PostMapping
    public String create(@RequestBody @Valid ActiveUserDTO req){
        repository.save(new ActiveUser(req));
        return "ok";
    }

    @GetMapping
    public List<ActiveUser> listAll(){
        return repository.findAll();
    }
}
