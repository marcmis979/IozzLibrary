package com.example.library.controllers;

import com.example.library.dto.LibraryDTO;
import com.example.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping
    public List<LibraryDTO> getAllLibraries() {
        return libraryService.getAllLibraries();
    }
    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping
    public List<String> getLibraries() {
        return libraryService.getLibraries();
    }
    @PostMapping
    public ResponseEntity<?> addLibrary(@RequestBody @Valid LibraryDTO libraryDTO, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(errors.getAllErrors());
        }
        libraryService.addLibrary(libraryDTO);
        return ResponseEntity.ok().build();
    }
}
