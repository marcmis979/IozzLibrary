package com.example.repository;

import com.example.model.Author;

import java.util.List;

public interface AuthorRepository {
    List<Author> findAll();
    Author findById(Long id);
    void save(Author author);
}
