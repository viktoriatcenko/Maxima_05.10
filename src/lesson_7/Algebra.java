package lesson_7;

import java.util.random.RandomGenerator;

public class Algebra {

    public final int SOMEVALUE = 31;

    public final String hello = "Hello";

    public double pi;

    public static double g;
    public static double speedOfSound;

    static {
        g = 9.8;
        speedOfSound = 300;
    }

    {
        pi = 3.14;
    }

    public static double randomDouble() {
        return RandomGenerator.getDefault().nextDouble();
    }

    public double getPi() {
        return pi * randomDouble();
    }
}
