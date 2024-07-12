package com.example.library.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class BookDTO {

    @NotEmpty
    @Size(min = 2, max = 100)
    private String title;

    private AuthorDTO author;

    // Getters and Setters
}
