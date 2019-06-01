package by.epam.javatraining.haurylchyk.lesson05.task01.model.logic;

public class Dragon {

    public static final int MIDDLE_AGE = 200;
    public static final int OLD_AGE = 300;

    public static final int BORN_HEADS = 3;
    public static final int MIDDLE_HEADS = 3;
    public static final int OLD_HEADS = 2;

    public static final int EYES = 2;

    public static int calcHeads(int age) {

        int heads = 0;

        if (age >= 0) {
            if (age <= MIDDLE_AGE) {
                heads = BORN_HEADS + age * MIDDLE_HEADS;
            } else if (age > MIDDLE_AGE && age <= OLD_AGE) {
                heads = BORN_HEADS + MIDDLE_HEADS * MIDDLE_AGE + (age - MIDDLE_AGE) * OLD_HEADS;
            } else {
                heads = BORN_HEADS + MIDDLE_HEADS * MIDDLE_AGE + (OLD_AGE - MIDDLE_AGE) * OLD_HEADS + age - OLD_AGE;
            }
        }
        return heads;
    }

    public static int calcEyes(int age) {
        return calcHeads(age) * EYES;

    }
}
