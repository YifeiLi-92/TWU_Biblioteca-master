package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    public static final int LIST_BOOKS = 1;
    public static final int CHECK_OUT_BOOK = 2;
    public static final int RETURN_BOOK = 3;
    public static final int QUIT = 4;

    public static void main(String[] args) {

        /*Books books = new Books();
        books.addBook(new Book("1","2","3"));
        books.addBook(new Book("4","5","6"));
        Books borrowBooks = new Books();

        User user = new User(books,borrowBooks);


        System.out.println("***************   Welcome to Biblioteca!   ***************");
        Scanner input = new Scanner(System.in);

        int flag = 0;
        int i = 0;
        while (true) {
            try {
                System.out.println("\n********************   Main Menu   ********************\nList Books(1)   Check-out Book(2)   Return book(3)   Quit(4)");

                int select = Integer.valueOf(input.next());
                switch (select) {
                    case LIST_BOOKS:
                        System.out.printf("Name     Author     Year Published\n");
                        System.out.printf(user.getAllBooks().showList());
                        break;
                    case CHECK_OUT_BOOK:
                        System.out.printf("Input the name of the book:\n");
                        String name = input.next();

                        System.out.printf(user.checkOutBook(name));
                        break;
                    case RETURN_BOOK:
                        System.out.printf("Input the name of the book:\n");
                        name = input.next();

                        System.out.printf(user.returnBook(name));

                        break;
                    case QUIT:
                        flag = 1;
                        break;
                    default:
                        System.out.printf("Select a valid option!\n");
                }

            } catch (Exception e) {
                System.out.printf("Select a valid option!\n");
            }
            if (flag == 1)
                break;
        }*/
    }
}
