package com.tweteroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.DTOs.TweetDTO;
import com.tweteroo.api.models.Tweet;
import com.tweteroo.api.repositories.TweetRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tweets")
public class TweetController {
    
    @Autowired
    private TweetRepository repository;

    @PostMapping
    public String create(@RequestBody @Valid TweetDTO req){
        repository.save(new Tweet(req));
        return "ok";
    }

    @GetMapping("{username}")
    public List<Tweet> listAllFromId(@PathVariable String username){
        Tweet tweet = new Tweet();
        tweet.setUsername(username);
        Example<Tweet> example= Example.of(tweet);
        return repository.findAll(example);
    }
}
