package com.tsystems.autotestuni.basic;

import com.tsystems.autotestuni.common.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;
import java.util.stream.Stream;

import static com.tsystems.autotestuni.basic.FiStreamsBasic.countBooks;
import static com.tsystems.autotestuni.basic.FiStreamsBasic.formatString;
import static org.junit.jupiter.api.Assertions.*;

class FiStreamsBasicTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void formatStringTest() {
        assertThrows(NullPointerException.class, () -> formatString(null));
        outputStreamCaptor.reset();
        assertEquals("", formatString(""));
        assertEquals("The original string => " + System.lineSeparator() +
                "The formatted string => " + System.lineSeparator(), outputStreamCaptor.toString());
        outputStreamCaptor.reset();
        assertEquals("THERE IS A HOUSE DOWN IN NEW ORLEANS THEY CALL THE RISING SUN\n" +
                        "AND IT'S BEEN THE RUIN OF MANY A POOR GIRL AND ME, OH GOD, I'M ONE",
                formatString("There is a house down in New Orleans they call the rising sun\n" +
                "And it's been the ruin of many a poor girl and me, oh God, I'm one"));
        assertEquals("The original string => There is a house down in New Orleans they call the rising sun\n" +
                "And it's been the ruin of many a poor girl and me, oh God, I'm one" + System.lineSeparator() +
                "The formatted string => THERE IS A HOUSE DOWN IN NEW ORLEANS THEY CALL THE RISING SUN\n" +
                "AND IT'S BEEN THE RUIN OF MANY A POOR GIRL AND ME, OH GOD, I'M ONE" + System.lineSeparator(),
                outputStreamCaptor.toString());
    }

    @Test
    void countBooksTest() {
        assertEquals(8, countBooks(Book.books.stream(), 1950, 20.00));
        assertEquals(4, countBooks(Book.books.stream(), 1960, 15.00));
        assertEquals(9, countBooks(Book.books.stream(), 1930, 46.47));
        assertEquals(13, countBooks(Book.books.stream(), 1800, 100.00));
    }
}