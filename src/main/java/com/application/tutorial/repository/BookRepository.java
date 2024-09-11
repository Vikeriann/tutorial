package com.application.tutorial.repository;

import com.application.tutorial.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>
{
}
