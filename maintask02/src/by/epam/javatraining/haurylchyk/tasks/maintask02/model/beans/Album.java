package by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans;

import java.util.Objects;

/**
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 20/06/19
 */
public class Album extends Edition {

    String content;

    //<editor-fold defaultstate="collapsed" desc="constructors">
    public Album() {
    }

    public Album(String name) {
        super(name);
    }

    public Album(String name, int pageCount, int year, int raiting, String content) {
        super(name, pageCount, year, raiting);
        this.content = content;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
//</editor-fold>

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Album)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Album book = (Album) o;
        return getContent() == book.getContent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getContent());
    }

    @Override
    public String toString() {
        return "Album{"
                + super.toString()
                + " content= " + content + "}";
    }

}
