package by.epam.javatraining.haurylchyk.lesson06.tast01.model.logic;

import java.util.Random;

public class HeadsOrTails {

    public static final int MAX = 2;

    public static int getCountHeads(int countThrow) {

        Random random = new Random();
        int countHeads = 0;

        for (int i = 0; i < countThrow; i++) {
            if (random.nextInt(MAX) == 0) {
                countHeads++;
            }
        }
        return countHeads;
    }
}
