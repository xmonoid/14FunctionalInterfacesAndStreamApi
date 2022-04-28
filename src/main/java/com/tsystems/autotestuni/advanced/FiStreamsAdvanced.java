package com.tsystems.autotestuni.advanced;

import com.tsystems.autotestuni.common.Book;

import java.util.Optional;
import java.util.stream.Stream;

public class FiStreamsAdvanced {

    /**
     * There is a stream of {@link Book} objects.
     *
     * Find the cheapest one in a specified year range.
     *
     * @param bookStream stream of books
     * @param yearFrom minimal publication year (inclusive)
     * @param yearTo minimal publication year (exclusive)
     * @return the cheapest book
     */
    public static Optional<Book> cheapestBook(Stream<Book> bookStream, int yearFrom, int yearTo) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * There is a stream of {@link Book} objects.
     *
     * Find the total price of all books whose authors' names begin with the specified letter.
     *
     * @param bookStream stream of books
     * @param firstLetter the first letter of authors' name
     * @return the total price
     */
    public static double totalPriceOfBooks(Stream<Book> bookStream, char firstLetter) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
