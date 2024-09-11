package com.application.tutorial.repository;

import com.application.tutorial.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long>
{
}
