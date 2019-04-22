package hu.johndoe.panda.proto._internal;

import java.util.Random;

public final class GameRandom {

    private GameRandom () {
        throw new UnsupportedOperationException ();
    }

    public static boolean random () {

        String randomSetting = System.getProperty ("hu.johndoe.panda.proto.random", "on");

        if ("on".equalsIgnoreCase (randomSetting)) {

            return new Random ().nextBoolean ();

        }

        if ("always_true".equalsIgnoreCase (randomSetting)) return true;
        if ("always_false".equalsIgnoreCase (randomSetting)) return false;

        System.err.println ("WARNING! Illegal value set for random setting! Use 'on', 'always_true', or 'always_false'!");
        return false;

    }

}
