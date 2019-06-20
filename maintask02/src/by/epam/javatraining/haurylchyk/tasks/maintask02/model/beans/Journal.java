package by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans;

import java.util.Objects;

/**
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 20/06/19
 */
public class Journal extends Edition {

    private int number;
    private String thema;

    //<editor-fold defaultstate="collapsed" desc="constructors">
    public Journal() {
    }

    public Journal(String name, int number) {
        super(name);
        this.number = number;
    }

    public Journal(String name, int pageCount, int year, int raiting, int number, String thema) {
        super(name, pageCount, year, raiting);
        this.number = number;
        this.thema = thema;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

//</editor-fold>
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Journal)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Journal journal = (Journal) o;
        return getNumber() == journal.getNumber()
                && getThema() == journal.getThema();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumber(), getThema());
    }

    @Override
    public String toString() {
        return "Journal{"
                + super.toString()
                + " number= " + number
                + " thema= " + thema + "}";
    }
}
