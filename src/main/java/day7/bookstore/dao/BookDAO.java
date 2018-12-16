package day7.bookstore.dao;

import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;
import day7.wyjatki.OwnException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface BookDAO {
    void addBook(Book book);

    Book removeBook(int id) throws OwnException, OwnException, day7.bookstore.exceptions.OwnException;

    Book findBookByID(int id) throws day7.bookstore.exceptions.OwnException;

    Book findBookByTitle(String title) throws day7.bookstore.exceptions.OwnException;

    List<Book> findBooksByTitle(String title) throws day7.bookstore.exceptions.OwnException;

    List<Book> findBookByAuthor(Author author);

    List<Book> getAllBooks();

    void editBook(int id, Book book); //edycja ksiazki

    Map<Integer, Book> readBookDAOFile() throws IOException, ClassNotFoundException;

    void writeBookDAOFile() throws IOException;

    int generateAuthorID();



}
