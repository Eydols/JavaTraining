package by.epam.javatraining.haurylchyk.tasks.maintask02.model.logic;

import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Album;
import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Book;
import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Edition;
import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Journal;
import org.apache.log4j.Logger;

public class Library {

    private static final Logger LOGGER = Logger.getLogger(Library.class);
    private Fund fund;
    private Librarian librarian;

    public Library() {
    }

    public Library(Fund fund) {
        this.fund = fund;
    }

    public Library(Fund fund, Librarian librarian) {
        this.fund = fund;
        this.librarian = librarian;
    }

    public Fund returnBookFund() {
        Fund fundBook = new Fund();
        for (Edition edition : fund.getEditions()) {
            if (edition instanceof Book) {
                fundBook.add(edition);
            }
        }
        LOGGER.info("Books: " + fundBook.toString());
        return fundBook;
    }

    public Fund returnJournalFund() {
        Fund fundJournal = new Fund();
        for (Edition edition : fund.getEditions()) {
            if (edition instanceof Journal) {
                fundJournal.add(edition);
            }
        }
        LOGGER.info("Journals: " + fundJournal.toString());
        return fundJournal;
    }

    public Fund returnAlbumFund() {
        Fund fundAlbum = new Fund();
        for (Edition edition : fund.getEditions()) {
            if (edition instanceof Album) {
                fundAlbum.add(edition);
            }
        }
        LOGGER.trace("Albums: " + fundAlbum.toString());
        return fundAlbum;
    }

    public Edition bringEditionWithMaxRaiting() {
        return librarian.bringEditionWithMaxPageCount(fund);
    }

    public Edition bringEditionWithMaxPageCount() {
        return librarian.bringEditionWithMaxPageCount(fund);
    }

    public void sortEditionByRaiting() {
        librarian.sortEditionByRaiting(fund);
    }

    public void sortEditionByYear() {
        librarian.sortEditionByYear(fund);
    }

    public Fund getFund() {
        return fund;
    }

    public void setFund(Fund fund) {
        this.fund = fund;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
}
