package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface BookService {

    void createBook(Book book);

    List<Book> getBooks();

    Optional<Book> getBook(int id);

    void deleteBook(int id);
}
