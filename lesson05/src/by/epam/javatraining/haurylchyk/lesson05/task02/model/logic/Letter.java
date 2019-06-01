package by.epam.javatraining.haurylchyk.lesson05.task02.model.logic;

public class Letter {

    public static boolean isVowel(char letter) {

        letter = Character.toLowerCase(letter);

        boolean result = false;

        switch (letter) {
            case 'a': ;
            case 'e': ;
            case 'i': ;
            case 'o': ;
            case 'u': ;
            case 'y': ;
                result = true;
        }
        return result;
    }

    public static boolean isVowel2(char letter) {

        letter = Character.toLowerCase(letter);

        boolean result = false;
        char vowel[] = {'a', 'e', 'i', 'o', 'u', 'y'};

        for (int i = 0; i < vowel.length; i++) {
            if (vowel[i] == letter) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isVowel3(char letter) {

        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u' || letter == 'y') {
            return true;
        } else {
            return false;
        }
    }
}
