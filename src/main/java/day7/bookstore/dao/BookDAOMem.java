package day7.bookstore.dao;

import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;

import java.util.*;

public class BookDAOMem implements BookDAO {
    private Map<Integer, Book> mapa = new HashMap<>();  //
//    private Map<Integer, Book> mapa;

    public BookDAOMem() {
        insertBooks();
        //dodać mapę wyciagana z pliku - dodawanie i odejmowanie do pliku
    }

    private void insertBooks() {
        Author stanislawLem = new Author(1, "Stanisław", "Lem");
        Author danSimmons = new Author(2, "Dan", "Simmons");
        Author sapkowski = new Author(3, "Andrzej", "Sapkowski");

        int id1 = generateID1();
        mapa.put(id1, new Book(id1, "Solaris", "SF", stanislawLem, 30.0));
        int id2 = generateID1();
        mapa.put(id2, new Book(id2, "Hyperion", "SF", danSimmons, 40.0));
        int id3 = generateID1();
        mapa.put(id3, new Book(id3, "Wiedźmin", "Fantasy", sapkowski, 50.0));
        int id4 = generateID1();
        mapa.put(id4, new Book(id4, "Narrenturum", "Fantasy", sapkowski, 60.0));
        int id5 = generateID1();
        mapa.put(id5, new Book(id5, "Dzienniki gwiazdowe", "SF", stanislawLem, 49.99));
    }

    private int generateID() {
        Set<Integer> keys = mapa.keySet();
        int result = 0;
        for (int i : keys) {
            if (i > result) {
                result = i;
            }
        }
        return result + 1;

    }

    private int generateID1() {
        Set<Integer> keys = mapa.keySet();
        int result = 1;
        for (int i : keys) {
            if (i != result) {
                return result;
            }
            result++;
        }
        return result;

    }

    @Override
    public void addBook(Book book) {
        book.setId(generateID1());
        mapa.put(book.getId(), book);
    }

    @Override
    public Book removeBook(int id) {
        return mapa.remove(id);

    }

    @Override
    public Book findBookByID(int id) {
        return mapa.get(id);  // zaimpleentować exception
    }

    @Override
    public Book findBookByTitle(String title) {
        List<Book> books = getAllBooks();
        //lista tytyułów
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                return book;  //lista ksiazek - dopisywanie wywalonych bookow
            }
        }
        return null; //zamienić żeby nie zwracał nulla
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        List<Book> books = getAllBooks();
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                result.add(book);
            }
        }
        return result;
    }


    @Override
    public List<Book> findBookByAuthor(Author author) {
        int id = author.getId();
        List<Book> books = new ArrayList<>();
        List<Book> bookList = getAllBooks();
        for (Book book : bookList) {
            Author author1 = book.getAuthor();
            int a = author1.getId();
            if (a == id) {
                books.add(book);
            }
        }

        return books;
    }

    @Override
    public List<Book> getAllBooks() {
        Collection<Book> books = mapa.values();


        return new ArrayList<>(books); // to ciekawe jest new ArrayList<>(books)
    }

    @Override
    public void editBook(int id, Book book) {
        mapa.put(id,book);
    }
}
