package com.google.service;
import com.google.config.SpringConfig;
import com.google.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)

public class BookServiceTest {
    @Autowired
    BookService bookService;

    @Test
    public void getByIdTest() {
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void getAllTest() {
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }
}
