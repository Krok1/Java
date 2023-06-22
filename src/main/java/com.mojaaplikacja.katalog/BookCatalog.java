package com.mojaaplikacja.katalog;

import com.mojaaplikacja.biblioteka.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca katalog książek.
 */
public class BookCatalog {
    private List<Book> books; // lista książek w katalogu

    public BookCatalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}