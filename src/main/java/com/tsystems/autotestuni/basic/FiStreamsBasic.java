package com.tsystems.autotestuni.basic;

import com.tsystems.autotestuni.common.Book;

import java.util.stream.Stream;

public class FiStreamsBasic {

    /**
     * We have a functional interface {@link StringOperator} with a method run().
     * We have a method {@code printFormatted()} which takes two parameters: a string and an instance of this interface.
     *
     * Method {@code formatString()} takes a random string and applies a format to it.
     *
     * Implement the lambda expression {@code stringOperator} so that:
     * 1. It prints the original string to {@code System.out} every time it is called.
     *      "The original string => " + str
     * 2. It converts all letters to upper case ("abc" => "ABC").
     * 3. It prints the formatted string to {@code System.out} after it.
     *      "The formatted string => " + str
     *
     * @param text a random text
     * @return formatted text
     */
    public static String formatString(String text) {
        // TODO: Change null to implementation of lambda-expression
        StringOperator stringOperator = null;

        return printFormatted(text, stringOperator);
    }

    @FunctionalInterface
    private interface StringOperator {
        String run(String str);
    }

    private static String printFormatted(String str, StringOperator format) {
        return format.run(str);
    }

    /**
     * There is a stream of {@link Book} objects.
     *
     * Count how many books:
     * 1. Were published after the specified year
     * 2. Have its current price less that the specified one
     *
     * @param bookStream stream of books
     * @param minPublishYear minimal publish year
     * @param maxPrice maximal price
     * @return the number of books satisfying the condition
     */
    public static long countBooks(Stream<Book> bookStream, int minPublishYear, double maxPrice) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}


