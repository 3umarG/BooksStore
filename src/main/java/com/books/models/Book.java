package com.books.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private final int id;
    private final String title;
    private final String author;
    private final String description;
    private final double price;
    private final int quantity;

//    public Book(int id, String title, String author, String description, double price, int quantity) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.description = description;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
}
