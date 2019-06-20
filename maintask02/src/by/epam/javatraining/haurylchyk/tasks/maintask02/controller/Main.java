package by.epam.javatraining.haurylchyk.tasks.maintask02.controller;

import by.epam.javatraining.haurylchyk.tasks.maintask02.model.logic.Library;
import by.epam.javatraining.haurylchyk.tasks.maintask02.utils.UtilFileReader;
import org.apache.log4j.Logger;

/**
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 20/06/19
 */

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        String path = "./by/epam/javatraining/haurylchyk/tasks/maintask02/resources/data.txt";

        Library library = new Library(UtilFileReader.parseFile(path));

        LOGGER.info("Fund of books are: " + library.returnBookFund().toString());

        LOGGER.info("Fund of journals are: " + library.returnJournalFund().toString());

        LOGGER.info("Fund of albums are: " + library.returnAlbumFund().toString());

        LOGGER.info("The edition with max page count: " + library.bringEditionWithMaxPageCount().toString());

        LOGGER.info("The edition with max raiting: " + library.bringEditionWithMaxRaiting().toString());

        library.sortEditionByRaiting();
        LOGGER.info("The editions sorted by raiting: " + library.getFund().toString());

        library.sortEditionByYear();
        LOGGER.info("The editions sorted by years: " + library.getFund().toString());
    }

}
