package com.application.tutorial.service;

import com.application.tutorial.entity.Publisher;
import com.application.tutorial.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService
{
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> getAllPublishers()
    {
        return publisherRepository.findAll();
    }

    public Publisher getPublisherById(Long id)
    {
        return publisherRepository.findById(id).orElseThrow
                (
                        () -> new RuntimeException("Publisher not found")
                );
    }

    public Publisher addPublisher(Publisher publisher)
    {
        return publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id)
    {
        publisherRepository.deleteById(id);
    }

    public Publisher updatePublisher(@NonNull Publisher publisher, Long id)
    {
        publisher.setId(id);
        return publisherRepository.save(publisher);
    }
}
