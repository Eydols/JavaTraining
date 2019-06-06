package by.epam.javatraining.haurylchyk.lesson05.task02.model.logic;

public class Letter {

    public static final char[] VOWEL_LETTERS = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static boolean isVowel(char letter) {

        letter = Character.toLowerCase(letter);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
        }
        return false;
    }

    public static boolean isVowel2(char letter) {

        letter = Character.toLowerCase(letter);

        for (int i = 0; i < VOWEL_LETTERS.length; i++) {
            if (VOWEL_LETTERS[i] == letter) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel3(char letter) {

        letter = Character.toLowerCase(letter);

        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y';
    }
}
