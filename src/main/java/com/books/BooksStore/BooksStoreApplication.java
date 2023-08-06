package com.books.BooksStore;

import com.books.service.BooksService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class BooksStoreApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BooksStoreApplication.class, args);
    }

    private final BooksService service;

    @Override
    public void run(String... args) throws Exception {

    }
}
