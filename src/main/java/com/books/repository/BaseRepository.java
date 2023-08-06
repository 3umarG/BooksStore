package com.books.repository;

import com.books.exceptions.NotFoundBookCustomException;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T> {
    List<T> getAll();

    void add(T item);

    List<T> search(String query);

    T getById(int id) throws NotFoundBookCustomException;
}
