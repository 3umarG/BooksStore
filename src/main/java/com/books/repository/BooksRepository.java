package com.books.repository;

import com.books.exceptions.NotFoundBookCustomException;
import com.books.models.Book;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BooksRepository implements BaseRepository<Book> {
    private static List<Book> books = new LinkedList<>();


    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public void add(Book item) {
        books.add(item);
    }

    @Override
    public List<Book> search(String query) {
        return books.stream()
                .filter(b -> b.getAuthor().contains(query) || b.getTitle().contains(query))
                .collect(Collectors.toList());
    }

    @Override
    public Book getById(int id) throws NotFoundBookCustomException {
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundBookCustomException("There is no book with that ID")
                );
    }
}
