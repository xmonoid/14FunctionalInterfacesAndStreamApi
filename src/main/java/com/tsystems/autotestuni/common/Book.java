package com.tsystems.autotestuni.common;

import java.util.List;
import java.util.Objects;

public class Book {
    private final String author;
    private final String title;
    private final int publishYear;
    private double currentPrice;

    public Book(String author, String title, int publishYear, double currentPrice) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.currentPrice = currentPrice;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Double.compare(book.currentPrice, currentPrice) == 0
                && author.equals(book.author) && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, publishYear, currentPrice);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static final List<Book> books = List.of(
            new Book("J. K. Rowling", "Harry Potter and the Prisoner of Azkaban", 1999, 46.47),
            new Book("Stephen King", "The Green Mile", 1996, 10.00),
            new Book("Margaret Mitchell", "Gone with the Wind", 1936, 70.98),
            new Book("Kathryn Stockett", "The Help", 2009, 19.59),
            new Book("Alexandre Dumas", "The Count of Monte Cristo", 1884, 14.69),
            new Book("J. R. R. Tolkien", "The Return of the King", 1955, 14.59),
            new Book("George R. R. Martin", "A Storm of Swords", 2000, 15.94),
            new Book("Mario Puzo", "The Godfather", 1969, 14.99),
            new Book("Fredrik Backman", "A Man Called Ove", 2012, 7.63),
            new Book("Arthur Conan Doyle", "The Adventures of Sherlock Holmes", 1892, 5.99),
            new Book("Daniel Keyes", "Flowers for Algernon", 1959, 8.29),
            new Book("James Herriot", "All Creatures Great and Small", 1975, 11.43),
            new Book("Agatha Christie", "And Then There Were None", 1939, 7.99)
    );
}
