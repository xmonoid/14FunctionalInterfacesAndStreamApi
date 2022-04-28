package com.tsystems.autotestuni.advanced;

import com.tsystems.autotestuni.common.Book;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static com.tsystems.autotestuni.advanced.FiStreamsAdvanced.cheapestBook;
import static com.tsystems.autotestuni.advanced.FiStreamsAdvanced.totalPriceOfBooks;
import static com.tsystems.autotestuni.basic.FiStreamsBasic.countBooks;
import static org.junit.jupiter.api.Assertions.*;

class FiStreamsAdvancedTest {

    @Test
    void cheapestBookTest() {
        assertEquals(Optional.empty(), cheapestBook(Book.books.stream(), 1930, 1930));
        assertEquals(Optional.of(Book.books.get(9)), cheapestBook(Book.books.stream(), 1800, 2022));
        assertEquals(Optional.of(Book.books.get(8)), cheapestBook(Book.books.stream(), 1900, 2022));
        assertEquals(Optional.of(Book.books.get(1)), cheapestBook(Book.books.stream(), 1990, 2000));
    }

    @Test
    void totalPriceOfBooksTest() {
        assertEquals(0.0, totalPriceOfBooks(Book.books.stream(), 'Z'));
        assertEquals(72.49, totalPriceOfBooks(Book.books.stream(), 'J'));
        assertEquals(28.67, totalPriceOfBooks(Book.books.stream(), 'A'));
        assertEquals(19.59, totalPriceOfBooks(Book.books.stream(), 'K'));
        assertEquals(85.97, totalPriceOfBooks(Book.books.stream(), 'M'));
    }
}