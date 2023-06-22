package com.mojaaplikacja.biblioteka;

/**
 * Klasa reprezentująca wypożyczenie książki z biblioteki.
 */
public class Loan {
    private Book book; // wypożyczona książka
    private String borrower; // wypożyczający

    public Loan(Book book, String borrower) {
        this.book = book;
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public String getBorrower() {
        return borrower;
    }
}