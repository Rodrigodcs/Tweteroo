package com.tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.models.ActiveUser;

public interface ActiveUserRepository extends JpaRepository<ActiveUser, Long> {
    
}
