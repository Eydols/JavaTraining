package by.epam.javatraining.haurylchyk.lesson06.tast01.model.logic;

import java.util.Random;

public class HeadsOrTails {

    public static final int NUM_VAL = 2;
    public static final Random RANDOM = new Random(7);

    public static int calcCountHeads(int countThrow) {

        int countHeads = 0;

        for (int i = 0; i < countThrow; i++) {
            if (RANDOM.nextInt(NUM_VAL) == 0) {
                countHeads++;
            }
        }
        return countHeads;
    }
}
