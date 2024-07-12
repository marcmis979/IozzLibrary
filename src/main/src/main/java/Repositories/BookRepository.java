package com.example.repository;

import com.example.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();
    Book findById(Long id);
    void save(Book book);
}
