package com.example.library.dao;

import com.example.library.model.Library;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibraryDAO {

    private List<Library> libraries = new ArrayList<>();

    public List<Library> getAllLibraries() {
        return libraries;
    }

    public void addLibrary(Library library) {
        libraries.add(library);
    }
}
