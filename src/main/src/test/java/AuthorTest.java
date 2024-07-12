package com.example.library.test;

import com.example.library.model.Author;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorTest {

    @Test
    public void testAuthorName() {
        Author author = new Author();
        author.setName("John Doe");
        assertEquals("John Doe", author.getName());
    }
}
