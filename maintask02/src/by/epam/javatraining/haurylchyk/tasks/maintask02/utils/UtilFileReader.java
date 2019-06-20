package by.epam.javatraining.haurylchyk.tasks.maintask02.utils;

import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Album;
import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Book;
import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Edition;
import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Journal;
import by.epam.javatraining.haurylchyk.tasks.maintask02.model.logic.Fund;
import org.apache.log4j.Logger;
import java.util.Scanner;

/**
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 20/06/19
 */
public class UtilFileReader {

    private static final Logger LOGGER = Logger.getLogger(UtilFileReader.class);
    private static final String DELIMITER = "[:]";
    private static final String TYPE_BOOK = "book";
    private static final String TYPE_JOURNAL = "journal";
    private static final String TYPE_ALBUM = "album";

    public static Fund parseFile(String path) {

        Fund fund = new Fund();

        Scanner scanner;
        try {
            scanner = new Scanner(path);
            scanner.useDelimiter(":\n");

            while (scanner.hasNextLine()) {
                String stringFromFile = scanner.nextLine();
                System.out.println(stringFromFile);
                Edition edition = parseEdition(stringFromFile);
                fund.add(edition);
            }
            scanner.close();
        } catch (IndexOutOfBoundsException e) {
            LOGGER.error("Check the file!");
        }

        return fund;
    }

    private static Edition parseEdition(String stringFromFile) {
        String[] tokens = stringFromFile.split(DELIMITER);
        String type = tokens[0];
        String name = tokens[1];
        int pageCount = Integer.parseInt(tokens[2]);
        int year = Integer.parseInt(tokens[3]);
        int raiting = Integer.parseInt(tokens[4]);
        long isbn = Long.parseLong(tokens[5]);
        String author = tokens[6];
        String genre = tokens[7];
        int number = Integer.parseInt(tokens[8]);
        String thema = tokens[9];
        String content = tokens[10];

        if (type.equals(TYPE_BOOK)) {
            return new Book(name, pageCount, year, raiting, isbn, author, genre);
        } else if (type.equals(TYPE_JOURNAL)) {
            return new Journal(name, pageCount, year, raiting, number, thema);
        } else if (type.equals(TYPE_ALBUM)) {
            return new Album(name, pageCount, year, raiting, content);
        } else {
            return null;
        }
    }
}
