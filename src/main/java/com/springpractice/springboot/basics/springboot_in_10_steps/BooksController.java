package com.springpractice.springboot.basics.springboot_in_10_steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks()
    {
        return List.of(new Book(1L, "Mastering Spring 5.1", "Ranga Karana"));
    }
}
