package day7.bookstore;

import day7.bookstore.dao.BookDAO;
import day7.bookstore.dao.BookDAOFile;
import day7.bookstore.domain.Author;
import day7.bookstore.domain.Book;
import day7.bookstore.exceptions.OwnException;
import day7.bookstore.view.UserInput;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Book book = new UserInput().getBookFromUser();

        List<Serializable> list = new ArrayList<>();
        list.add(new Author());
        list.add(new Book("fdffs", "title", "rodzaj", 3));


        Serializable author = new Author(); //można i tak :]

        BookDAO bookDAO = new BookDAOFile();
        System.out.println(bookDAO.getAllBooks());


    }
//    public static void main(String[] args) throws IOException, ClassNotFoundException, OwnException {
//
//
//        BookDAO bookDAOFile = new BookDAOFile();//dodać logikę, że jak nie ma pliku to najpierw zapisać to co jest a potem read ale to chyba mozna w DAO
//
//        bookDAOFile.readBookDAOFile();
//        System.out.println(bookDAOFile.readBookDAOFile());
//        Book book = new Book("Fundacja", "SF", new Author(bookDAOFile.generateAuthorID(), "Dan", "Simmons"), 90.99); // pytanie jak z tego korzystać
//        bookDAOFile.addBook(book);
//
//        bookDAOFile.writeBookDAOFile();
//        bookDAOFile.readBookDAOFile();
//        System.out.println(bookDAOFile.readBookDAOFile());
//
//        try {
////            bookDAOFile.findBookByTitle("Sol");
////            bookDAOFile.findBookByTitle("asda");
////            System.out.println(bookDAOFile.findBooksByTitle("asdco"));
//            bookDAOFile.findBookByID(39);
//            bookDAOFile.findBookByID(6);
//
//        } catch (OwnException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("finalny blok");
//        }
//

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
//    }
}

//dorobić dodawanie id authora  // DONE
//sprawdzić metody dla warunków brzegowych, żeby nie zwracałay nulla najlepiej przez exception - find po id lub wyaksować obiekt żeby były obsluzone wyjatkami,
//poszukiwanie id, któ®ego nie ma itp itd/DONE

//zapisywać ksiązki do pliku i skorzystać z tego zapisać jako obiekt // DONE