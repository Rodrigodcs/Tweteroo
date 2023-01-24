package com.tweteroo.api.DTOs;

import jakarta.validation.constraints.NotBlank;

public record TweetDTO(
    
@NotBlank String username,

@NotBlank String text) {
    
}
