package by.epam.javatraining.haurylchyk.lesson05.task03.model.logic;

import java.util.Random;

public class UtilMood {

    public static final int MAX = 4;

    final private static String SAD = ":(";
    final private static String NORMAL = ":|";
    final private static String JOLLY = ":)";
    final private static String HAPPY = ":D";
    
    final private static String ERROR = "Error!!!";

    public static String getMood(int number) {

        String mood = ERROR;

        switch (number) {
            case 0:
                mood = SAD;
                break;
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
    return getMood(new Random().nextInt(MAX));
    }

}
