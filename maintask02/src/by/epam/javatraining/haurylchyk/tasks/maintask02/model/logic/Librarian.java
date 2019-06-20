package by.epam.javatraining.haurylchyk.tasks.maintask02.model.logic;

import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Edition;
import org.apache.log4j.Logger;

public class Librarian {

    private static final Logger LOGGER = Logger.getLogger(Library.class);

    public Edition bringEditionWithMaxRaiting(Fund fund) {

        Edition searchEdition = fund.getEditions()[0];

        for (Edition edition : fund.getEditions()) {
            if (edition == null) {
                break;
            } else if (edition.getRaiting() > searchEdition.getRaiting()) {
                searchEdition = edition;
            }
        }
        LOGGER.info("Edition with max raiting " + searchEdition);
        return searchEdition;
    }

    public Edition bringEditionWithMaxPageCount(Fund fund) {

        Edition searchEdition = fund.getEditions()[0];

        for (Edition edition : fund.getEditions()) {
            if (edition == null) {
                break;
            } else if (edition.getPageCount() > searchEdition.getPageCount()) {
                searchEdition = edition;
            }
        }
        LOGGER.trace("Edition with max page count " + searchEdition);
        return searchEdition;
    }

    public void sortEditionByRaiting(Fund fund) {

        if (fund == null || fund.getSize() == 0) {
            LOGGER.warn("Fund is null or fund size is 0");
            return;
        }
        int size = fund.getSize();
        boolean sorted = false;
        int lastIndex = size - 1;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lastIndex; i++) {
                if (fund.returnEditionByIndex(i).getRaiting() > fund.returnEditionByIndex(i + 1).getRaiting()) {
                    sorted = false;
                    fund.swap(i, i + 1);
                }
            }
        }
    }

    public void sortEditionByYear(Fund fund) {

        if (fund == null || fund.getSize() == 0) {
            LOGGER.warn("Fund is null or fund size is 0");
            return;
        }
        int size = fund.getSize();
        boolean sorted = false;
        int lastIndex = size - 1;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lastIndex; i++) {
                if (fund.returnEditionByIndex(i).getYear() > fund.returnEditionByIndex(i + 1).getYear()) {
                    sorted = false;
                    fund.swap(i, i + 1);
                }
            }
        }
    }

}
