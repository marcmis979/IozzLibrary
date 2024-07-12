package com.example.repository;

import com.example.model.Library;

import java.util.List;

public interface LibraryRepository {
    List<Library> findAll();
    Library findById(Long id);
    void save(Library library);
}