package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book) {
        bookService.createBook(book);
        return "Created book with id: " + book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<Book> getBooks(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Deleted book with id: " + id;
    }
}
