package day7.bookstore.dao;

import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;
import day7.wyjatki.OwnException;

import java.util.List;
import java.util.Set;

public interface BookDAO {
    void addBook(Book book);

    Book removeBook(int id) throws OwnException, OwnException, day7.bookstore.exceptions.OwnException;

    Book findBookByID(int id) throws day7.bookstore.exceptions.OwnException;

    Book findBookByTitle(String title);

    List<Book> findBooksByTitle(String title);

    List<Book> findBookByAuthor(Author author);

    List<Book> getAllBooks();

    void editBook(int id, Book book); //edycja ksiazki


}