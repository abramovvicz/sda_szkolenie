package day7.bookstore.domain;

import day7.bookstore.domain.Author;

import java.io.Serializable;

public class Book implements Serializable {
    private int id; //obiekt klasy w innej kklasie to kompozycja
    private String title;
    private String type;
    private Author author;
    private double cena;

    public Book( String title, String type, Author author, double cena) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.cena = cena;
    }

    public Book(int id, String title, String type, Author author, double cena) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.author = author;
        this.cena = cena;
    }

    public Book(int id, String tytuł, String typ_książki, String autor_ksiązki, int cena) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {  // łatwe wypisawanie obiektu
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author=" + author +
                ", cena=" + cena +
                '}'+'\n';
    }
}
