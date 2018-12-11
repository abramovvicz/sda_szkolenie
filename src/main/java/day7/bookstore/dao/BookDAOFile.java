package day7.bookstore.dao;


import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;
import day7.bookstore.exceptions.OwnException;
import utils.Utils;

import java.io.IOException;
import java.util.*;

public class BookDAOFile implements BookDAO {
    private Map<Integer, Book> booksMap = new HashMap<>();  //
    private List<Author> authorsLists = new ArrayList<>();


    public BookDAOFile() throws IOException {
        insertBooks();
    }

    private void insertBooks() throws IOException {

        int idA1 = generateAuthorID();
        Author stanislawLem = new Author(idA1, "Stanisław", "Lem");
        authorsLists.add(stanislawLem);
        int idA2 = generateAuthorID();
        Author harukiMurakami = new Author(idA2, "Haruki", "Murakami");
        authorsLists.add(harukiMurakami);
        int idA3 = generateAuthorID();
        Author sapkowski = new Author(idA3, "Andrzej", "Sapkowski");
        authorsLists.add(sapkowski);

        int id1 = generateID();
        booksMap.put(id1, new Book(id1, "Solaris", "SF", stanislawLem, 30.0));
        int id2 = generateID();
        booksMap.put(id2, new Book(id2, "2088", "SF", harukiMurakami, 40.0));
        int id3 = generateID();
        booksMap.put(id3, new Book(id3, "Wiedźmin", "Fantasy", sapkowski, 50.0));
        int id4 = generateID();
        booksMap.put(id4, new Book(id4, "Narrenturum", "Fantasy", sapkowski, 60.0));
        int id5 = generateID();
        booksMap.put(id5, new Book(id5, "Dzienniki gwiazdowe", "SF", stanislawLem, 49.99));

        Utils.writeObject("authors.dat", authorsLists); // DLA TRENINGU
        Utils.writeObject("books.dat", booksMap);
    }


    public int generateID() {
        Set<Integer> ids = booksMap.keySet();
        int id = 1;
        for (int i = 0; i < ids.size(); i++) {
            id++;
        }
        return id;
    }

    public int generateAuthorID() {
        int id = 1;
        for (int i = 0; i < authorsLists.size(); i++) {
            id++;
        }
        return id;
    }

    @Override
    public void addBook(Book book) {
        book.setId(generateID()); //ustawienie id w book
        booksMap.put(book.getId(), book); //pobranie id w book
    }

    @Override
    public Book removeBook(int id) {

        return booksMap.remove(id);

    }

    @Override
    public Book findBookByID(int id) throws OwnException {
        if (booksMap.get(id) == null) {
            throw new OwnException("Nie ma takiej książki"); 
        } else {
            return booksMap.get(id);
        }
    }

    @Override
    public Book findBookByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> findBookByAuthor(Author author) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public void editBook(int id, Book book) {

    }
}
