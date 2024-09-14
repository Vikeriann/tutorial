package com.application.tutorial.controller;

import com.application.tutorial.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController
{
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getAllBooks(Model model)
    {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }
}
