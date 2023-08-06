package com.books.service;


import com.books.exceptions.NotFoundBookCustomException;
import com.books.models.Book;
import com.books.repository.BaseRepository;
import com.books.repository.BooksRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BooksService {

    @Autowired
    private final BooksRepository repository;


    public List<Book> getAllBooks() {
        return repository.getAll();
    }

    public void addBook(Book book) {
        repository.add(book);
    }

    public List<Book> searchBook(String query) throws NotFoundBookCustomException {
        List<Book> result = repository.search(query);
        if (result.size() == 0)
            throw new NotFoundBookCustomException("There is no Books with that query !!");

        return result;
    }

    public Book getBookById(int id) {
        try {
            return repository.getById(id);
        } catch (NotFoundBookCustomException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
