package com.mojaaplikacja.biblioteka;

/**
 * Klasa reprezentująca książkę w bibliotece.
 */
public class Book {
    private String title; // tytuł książki
    private String author; // autor książki

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }