package com.example.emt_lab2.service;

import com.example.emt_lab2.model.Author;
import com.example.emt_lab2.model.Book;
import com.example.emt_lab2.model.dto.BookDto;
import com.example.emt_lab2.model.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> listAll();

    Optional<Book> findById(Long id);

    Optional<Book> create(BookDto book);

    Optional<Book> edit(Long id, BookDto book);

    Optional<Book> create(String name, Category category, Long author, Integer avCopies);
    Optional<Book> edit(Long id, String name, Category category, Long author, Integer avCopies);

    void deleteById(Long id);

    Book MarkAsTaken(Long id);
}
