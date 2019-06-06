package by.epam.javatraining.haurylchyk.lesson05.task03.model.logic;

import java.util.Random;

public class UtilMood {

    public static final int MAX_VAL = 4;

    public static final Random RANDOM = new Random();

    public static final String SAD = ":(";
    public static final String NORMAL = ":|";
    public static final String JOLLY = ":)";
    public static final String HAPPY = ":D";

    public static String showMood(int number) { // change public to private after testing

        String mood = SAD;

        switch (number) {
            case 1:
                mood = NORMAL;
                break;
            case 2:
                mood = JOLLY;
                break;
            case 3:
                mood = HAPPY;
        }
        return mood;
    }

    public static String guessMood() {
        return showMood(RANDOM.nextInt(MAX_VAL));
    }

}
