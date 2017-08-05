package com.twu.biblioteca;

public class User {
    private Books allBooks;
    private Books borrowBooks;

    public User(Books allBooks, Books borrowBooks) {
        this.allBooks = allBooks;
        this.borrowBooks = borrowBooks;
    }

    public Books getAllBooks() {
        return allBooks;
    }

    public Books getBorrowBooks() {
        return borrowBooks;
    }

    public String checkOutBook(String bookName){
        String result = "";

        int out = 0;
        for (Book book: this.allBooks.getBooks()
                ) {
            String nameInList = book.getName();
            if(bookName.equals(nameInList)){
                this.allBooks.removeBook(book);
                this.borrowBooks.addBook(book);
                result = "Thank you! Enjoy the book.\n";
                out = 1;
                break;
            }
        }
        if(out ==  0)
            result = "That book is not available.\n";

        return result;
    }

    public String returnBook(String bookName){
        String result = "";

        int out = 0;
        for (Book book:this.borrowBooks.getBooks()
                ) {
            String nameInList = book.getName();
            if(bookName.equals(nameInList)){
                this.borrowBooks.removeBook(book);
                this.allBooks.addBook(book);
                result = "Thank you for returning the book.\n";
                out = 1;
                break;
            }
        }
        if(out == 0)
            result  = "That is not a valid book to return.\n";

        return result;
    }
}
