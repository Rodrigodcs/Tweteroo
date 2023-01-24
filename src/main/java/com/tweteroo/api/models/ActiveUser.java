package com.tweteroo.api.models;

import com.tweteroo.api.DTOs.ActiveUserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class ActiveUser {

    public ActiveUser(ActiveUserDTO data) {
        this.username = data.username();
        this.avatar = data.avatar();
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 200, nullable = false)
    private String avatar;

    public void setUsername(String username){
        this.username = username;
    }
    public void setAvatar(String avatar){
        this.avatar = avatar;
    }
}
