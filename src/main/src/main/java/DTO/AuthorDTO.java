package com.example.library.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AuthorDTO {

    @NotEmpty
    @Size(min = 2, max = 100)
    private String name;

    // Getters and Setters
}
