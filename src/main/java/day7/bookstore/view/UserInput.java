package day7.bookstore.view;

import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;

import java.util.Scanner;

public class UserInput {


    public Book getBookFromUser() {
        String title = getData("Podaj tytuł ");
        String gatunek = getData("Podaj gatunek ksiżki ");
        String price = getData("Podaj cene ");
        double pc = Double.valueOf(price); // fajna rzecz zmiana stringa na double !!!!!
        Author author = new Author(5, "Jan", "Brzechwa");
        Book book = new Book(title, gatunek, author, pc);
        return book;
    }


    private String getData(String message) {
        System.out.println(message + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
