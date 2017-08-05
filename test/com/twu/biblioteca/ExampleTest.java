package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void show_books_should_return_123() throws Exception {
        Books books = new Books();

        Book book = new Book("1","2","3");
        books.addBook(book);

        assertEquals("1          2          3\n", books.showList());
    }

    @Test
    public void add_book_return_true() throws Exception {
        Books books = new Books();

        Book book = new Book("1","2","3");

        assertEquals(true,books.addBook(book));
    }

    @Test
    public void remove_book_return_true() throws Exception {
        Books books = new Books();
        Book book = new Book("1","2","3");

        books.addBook(book);

        assertEquals(true,books.removeBook(book));
    }

    @Test
    public void check_out_book_in_thank_you_enjoy_the_book() throws Exception {
        Books books = new Books();
        Books borrowBooks = new Books();
        Book book = new Book("1","2","3");

        books.addBook(book);
        User user = new User(books,borrowBooks);

        assertEquals("Thank you! Enjoy the book.\n",user.checkOutBook("1"));
    }

    @Test
    public void check_out_book_in_that_book_is_not_available() throws Exception {
        Books books = new Books();
        Books borrowBooks = new Books();
        Book book = new Book("1","2","3");

        books.addBook(book);
        User user = new User(books,borrowBooks);

        assertEquals("That book is not available.\n",user.checkOutBook("2"));
    }

    @Test
    public void return_book_in_thank_you_for_returning_the_book() throws Exception {
        Books books = new Books();
        Books borrowBooks = new Books();
        Book book = new Book("1","2","3");

        borrowBooks.addBook(book);
        User user = new User(books,borrowBooks);

        assertEquals("Thank you for returning the book.\n",user.returnBook("1"));
    }

    @Test
    public void return_book_in_that_is_not_a_valid_book_to_return() throws Exception {
        Books books = new Books();
        Books borrowBooks = new Books();
        Book book = new Book("1","2","3");

        borrowBooks.addBook(book);
        User user = new User(books,borrowBooks);

        assertEquals("That is not a valid book to return.\n",user.returnBook("2"));
    }
}
