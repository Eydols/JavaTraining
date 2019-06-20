package by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans;

import java.util.Objects;

/**
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 20/06/19
 */
public class Book extends Edition {

    private long isbn;
    private String author;
    private String genre;

    //<editor-fold defaultstate="collapsed" desc="constructors">
    public Book() {
    }

    public Book(String author, String name) {
        super(name);
        this.author = author;
    }

    public Book(String name, int pageCount, int year, int raiting, long isbn, String author, String genre) {
        super(name, pageCount, year, raiting);
        this.isbn = isbn;
        this.author = author;
        this.genre = genre;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

//</editor-fold>
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Book book = (Book) o;
        return getIsbn() == book.getIsbn()
                && getAuthor() == book.getAuthor()
                && getGenre() == book.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIsbn(), getAuthor(), getGenre());
    }

    @Override
    public String toString() {
        return "Book{"
                + super.toString()
                + " isbn= " + isbn
                + " author= " + author
                + " genre= " + genre + "}";
    }

}
