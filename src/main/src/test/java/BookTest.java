package com.example.library.test;

import com.example.library.model.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void testBookTitle() {
        Book book = new Book();
        book.setTitle("Sample Book");
        assertEquals("Sample Book", book.getTitle());
    }
}
