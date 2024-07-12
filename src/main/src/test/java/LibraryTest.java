package com.example.library.test;

import com.example.library.model.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testLibraryName() {
        Library library = new Library();
        library.setName("Central Library");
        assertEquals("Central Library", library.getName());
    }
}
