package by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans;

import java.util.Objects;

/**
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 20/06/19
 */
public class Edition {

    private String name;
    private int pageCount;
    private int year;
    private int raiting;

    //<editor-fold defaultstate="collapsed" desc="constructors">
    public Edition() {
    }

    public Edition(String name) {
        this.name = name;
    }

    public Edition(String name, int pageCount, int year, int raiting) {
        this.name = name;
        this.pageCount = pageCount;
        this.year = year;
        this.raiting = raiting;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "name=" + name + '\''
                + ", pageCount=" + pageCount
                + ", year=" + year
                + ", raiting=" + raiting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Edition)) {
            return false;
        }
        Edition edition = (Edition) o;
        return name == edition.name
                && pageCount == edition.pageCount
                && year == edition.year
                && raiting == edition.raiting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pageCount, year, raiting);
    }

}
