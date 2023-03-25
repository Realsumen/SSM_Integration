package com.google.service;

import com.google.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    boolean save(Book book);

    boolean update(Book book);

    boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();
}
