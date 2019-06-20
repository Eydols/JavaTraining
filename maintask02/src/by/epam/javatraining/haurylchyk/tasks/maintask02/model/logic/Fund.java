package by.epam.javatraining.haurylchyk.tasks.maintask02.model.logic;

import by.epam.javatraining.haurylchyk.tasks.maintask02.model.beans.Edition;
import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 20/06/19
 */
public class Fund {

    private static final Logger LOGGER = Logger.getLogger(Fund.class);
    private static final int DEFAULT_CAPACITY = 10;
    private Edition[] editions;
    private int size;

    public Fund() {
        editions = new Edition[DEFAULT_CAPACITY];
    }

    public Fund(int capacity) {
        editions = new Edition[capacity];
        size = 0;
    }

    public Fund(Edition[] fund) {
        this.editions = fund;
        size = fund.length;
    }

    public void add(Edition edition) {
        if (size == editions.length) {
            increaseArray();
        }
        editions[size] = edition;
        size++;
        LOGGER.trace("Add edition " + edition.toString());
    }

    public void remove(int index) {
        if (index < 0) {
            LOGGER.warn("Negative index");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            editions[i - 1] = editions[i];
        }
        size -= 1;
    }

    private void increaseArray() {
        Edition[] newEditions = new Edition[editions.length * 2];
        for (int i = 0; i < size - 1; i++) {
            newEditions[i] = editions[i];
        }
        editions = newEditions;
        LOGGER.info("New size of fund is " + editions.length);
    }

    public Edition returnEditionByIndex(int index) {
        checkIndex(index);
        LOGGER.info("Return edition with index " + index + ". Edition is " + editions[index].toString());
        return editions[index];
    }

    public void putEditionByIndex(int index, Edition value) {
        checkIndex(index);
        editions[index] = value;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }
        LOGGER.info("Edition index is correct");
    }

    public int getSize() {
        return size;
    }

    public Edition[] getEditions() {
        return editions;
    }

    //An auxiliary method that swaps two specified elements of the same array
    public void swap(int index1, int index2) {

        Edition temp = getEditions()[index1];
        getEditions()[index1] = getEditions()[index2];
        getEditions()[index2] = temp;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Fund fund = (Fund) obj;
        if (fund.size != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (fund.returnEditionByIndex(i) != this.editions[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fund includes the following editions{\n" + Arrays.toString(editions) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Arrays.deepHashCode(this.editions);
        return hash;
    }

}
