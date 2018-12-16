package day7.bookstore.dao;


import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;
import day7.bookstore.exceptions.OwnException;
import utils.Utils;

import java.io.IOException;
import java.util.*;

public class BookDAOFile implements BookDAO {
    private Map<Integer, Book> booksMap = new HashMap<>();  //w mapach trzeba podawać typy obiektowe - nie można typów prostych
    private List<Author> authorsLists = new ArrayList<>();

    public BookDAOFile() throws IOException {
        insertBooks();
    }

    private void insertBooks() throws IOException {

        int idA1 = generateAuthorID();
        Author stanislawLem = new Author(idA1, "Stanisław", "Lem");
        authorsLists.add(stanislawLem);
        int idA2 = generateAuthorID();
        Author danSimmons = new Author(idA2, "Dan", "Simmons");
        authorsLists.add(danSimmons);
        int idA3 = generateAuthorID();
        Author sapkowski = new Author(idA3, "Andrzej", "Sapkowski");
        authorsLists.add(sapkowski);

        int id1 = generateID();
        booksMap.put(id1, new Book(id1, "Solaris", "SF", stanislawLem, 30.0));
        int id2 = generateID();
        booksMap.put(id2, new Book(id2, "Hyperion", "SF", danSimmons, 40.0));
        int id3 = generateID();
        booksMap.put(id3, new Book(id3, "Wiedźmin", "Fantasy", sapkowski, 50.0));
        int id4 = generateID();
        booksMap.put(id4, new Book(id4, "Narrenturum", "Fantasy", sapkowski, 60.0));
        int id5 = generateID();
        booksMap.put(id5, new Book(id5, "Dzienniki gwiazdowe", "SF", stanislawLem, 49.99));

        writeBookDAOFile();
    }


    public void writeBookDAOFile() throws IOException {
        Utils.writeObject("authors.dat", authorsLists); // DLA TRENINGU
        Utils.writeObject("books.dat", booksMap);
    }


    public Map<Integer,Book> readBookDAOFile() throws IOException, ClassNotFoundException {
        ArrayList<Author> objectAuthor = (ArrayList<Author>) Utils.readObject("authors.dat");
        Map<Integer, Book> objectBook = (Map<Integer, Book>) Utils.readObject("books.dat");

        return objectBook;
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
            throw new OwnException("Nie znaleziono książki o id " + id);
        } else {
            Book book = booksMap.get(id);
            System.out.println("książka znaleziona: " + book);
            return book;
        }
    }

    @Override
    public Book findBookByTitle(String title) throws OwnException {

        List<Book> books = getAllBooks();
        for (Book book : books) {
//           if(title.equalsIgnoreCase(book.getTitle())){ // przy takim zapisie nie znajdzie ksiazki przy niepelnym podanym tytlue
            if (book.getTitle().contains(title)) {
                System.out.println("Znaleziono książkę o szukanym tytule: " + book);
                return book;
            } else {
                throw new OwnException("Nie ma ksiązki o szukanym tytule");
            }
        }
        return null;
    }

    @Override
    public List<Book> findBooksByTitle(String title) throws OwnException {
        List<Book> books = getAllBooks();
        List<Book> findBooksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                findBooksByTitle.add(book);
            } else {
                throw new OwnException("Nie ma książek o szukanym tytule");
            }
        }

        return findBooksByTitle;
    }

    @Override
    public List<Book> findBookByAuthor(Author author) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        Collection<Book> allBooks = booksMap.values();
        return new ArrayList<>(allBooks);
    }

    @Override
    public void editBook(int id, Book book) {

    }
}
