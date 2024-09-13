package com.application.tutorial;

import com.application.tutorial.entity.Author;
import com.application.tutorial.entity.Book;
import com.application.tutorial.entity.Category;
import com.application.tutorial.entity.Publisher;
import com.application.tutorial.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService)
	{

		return args -> {
			Book book1 = new Book("978-3-16-148410-0", "Spring Boot - The Definitive Guide", "Craig Walls");
			Author author1 = new Author("Adam Russell", "Craig Walls is an American software engineer and founder of Spring.io. ");
			Category category1 = new Category("Spring Boot");
			Publisher publisher1 = new Publisher("O'Reilly Media");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.addBook(book1);

			Book book2 = new Book("978-1-78528-565-7", "Apache Camel - The Definitive Guide", "Craig Walls");
			Author author2 = new Author("Craig Walls", "Craig Walls is an American software engineer and founder of Spring.io. ");
			Category category2 = new Category("Spring Boot");
			Publisher publisher2 = new Publisher("O'Reilly Media");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.addBook(book2);

			Book book3 = new Book("978-1-78528-565-9", "Rest with Spring Boot - The Definitive Guide", "Craig Walls");
			Author author3 = new Author("Brian Clozel", "Craig Walls is an American software engineer and founder of Spring.io. ");
			Category category3 = new Category("Spring Boot");
			Publisher publisher3 = new Publisher("O'Reilly Media");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookService.addBook(book3);
		};
	}
}
