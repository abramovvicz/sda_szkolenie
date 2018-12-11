package day7.bookstore;

import day7.bookstore.dao.BookDAO;
import day7.bookstore.dao.BookDAOFile;
import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;
import day7.bookstore.exceptions.OwnException;
import utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, OwnException {


        ArrayList<Author> objectAuthor = (ArrayList<Author>) Utils.readObject("authors.dat");//
        System.out.println(objectAuthor);
        Map<Integer, Book> objectBook = (Map<Integer, Book>) Utils.readObject("books.dat");
        System.out.println(objectBook);

        BookDAO bookDAOFile = new BookDAOFile();
        Book book = new Book("Tytuł", "Typ książki", new Author(((BookDAOFile) bookDAOFile).generateAuthorID(), "Imię", "Nazwisko"), 90.99); // pytanie jak z tego korzystać
        //TRENERZE co oznacza ((BookDAOFile) bookDAOFile).generateAuthorID()  czemu to tak rzutuje ?
        bookDAOFile.addBook(book);
        objectBook.put(book.getId(), book);
        System.out.println(objectBook);
        bookDAOFile.findBookByTitle("ol");

        try {
            bookDAOFile.findBookByID(6);
            bookDAOFile.findBookByID(39);

        } catch (OwnException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finalny blok");
        }





        ////na lekcjach *****BOOKDAEOMEM /////

//        BookDAO bookDAO = new BookDAOMem();
//        Book book = new Book( "Tytuł", "Typ książki", new Author(4, "Imię", "Nazwisko"), 90.99);
//        bookDAO.addBook(book);
//        System.out.println("**************************");
//        System.out.println(bookDAO.getAllBooks());
//        System.out.println("**************************");
//        System.out.println(bookDAO.removeBook(2));
//        System.out.println("**************************");
//        System.out.println(bookDAO.getAllBooks());
//        System.out.println("szukanie tytyłu ********");
//        System.out.println(bookDAO.findBookByTitle("ola"));
//        System.out.println("szukanie tytyłów ********");
//        System.out.println(bookDAO.findBooksByTitle("ar"));
//        System.out.println("szukanie autora ********");
//        System.out.println(bookDAO.findBookByAuthor(new Author(1, "", "")));
//        Book book = new Book("Tytuł", "Typ książki", new Author(4, "Imię", "Nazwisko"), 90.99);
//        bookDAO.addBook(book);
//        System.out.println(bookDAO.getAllBooks());
//        Book book1 = new Book(3,"Inna ksiązka", "jakiś typ książki", new Author(4, "Imię", "Nazwisko"), 90.99);
//        System.out.println("edytowanie ksiazki ********");
//        bookDAO.editBook(book1.getId(), book1);
//        System.out.println(bookDAO.getAllBooks());
    }
}

//dorobić dodawanie id authora  // DONE
//sprawdzić metody dla warunków brzegowych, żeby nie zwracałay nulla najlepiej przez exception - find po id lub wyaksować obiekt żeby były obsluzone wyjatkami,
//poszukiwanie id, któ®ego nie ma itp itd/DONE

//zapisywać ksiązki do pliku i skorzystać z tego zapisać jako obiekt // DONE