package com.tweteroo.api.DTOs;

import jakarta.validation.constraints.NotBlank;

public record ActiveUserDTO(
    
@NotBlank String username,

@NotBlank String avatar) {
    
}
