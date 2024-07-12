package com.example.library.dao;

import com.example.library.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorDAO {

    private List<Author> authors = new ArrayList<>();

    public List<Author> getAllAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }
}
