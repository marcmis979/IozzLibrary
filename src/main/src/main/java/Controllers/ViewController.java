package com.example.library.controllers;

import com.example.library.service.AuthorService;
import com.example.library.service.BookService;
import com.example.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/books")
    public String viewBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "booksView";
    }

    @GetMapping("/authors")
    public String viewAuthors(Model model) {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "authorsView";
    }

    @GetMapping("/libraries")
    public String viewLibraries(Model model) {
        model.addAttribute("libraries", libraryService.getAllLibraries());
        return "librariesView";
    }
}
