package com.application.tutorial.service;

import com.application.tutorial.entity.Book;
import com.application.tutorial.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id)
    {
        return bookRepository.findById(id).orElseThrow
                (
                        () -> new RuntimeException("Book not found")
                );
    }

    public void addBook(Book book)
    {
        bookRepository.save(book);
    }

    public void deleteBook(Long id)
    {
        bookRepository.deleteById(id);
    }
}
