package com.application.tutorial.repository;

import com.application.tutorial.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>
{
}
