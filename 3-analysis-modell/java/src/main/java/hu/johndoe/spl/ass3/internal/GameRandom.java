package hu.johndoe.spl.ass3.internal;

import java.util.Random;

public class GameRandom {

    private static final Random RND = new Random ();

    public static final boolean random () {
        return RND.nextBoolean ();
    }

}
