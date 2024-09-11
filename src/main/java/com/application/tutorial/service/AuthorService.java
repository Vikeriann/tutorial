package com.application.tutorial.service;

import com.application.tutorial.entity.Author;
import com.application.tutorial.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService
{
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors()
    {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id)
    {
        return authorRepository.findById(id).orElseThrow
                (
                        () -> new RuntimeException("Author not found")
                );
    }

    public void addAuthor(Author author)
    {
        authorRepository.save(author);
    }

    public void deleteAuthor(Long id)
    {
        authorRepository.deleteById(id);
    }

    public void updateAuthor(@NonNull Author author, Long id)
    {
        author.setId(id);
        authorRepository.save(author);
    }

}
