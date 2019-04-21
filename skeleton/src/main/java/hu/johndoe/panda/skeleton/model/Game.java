package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class Game {

    private static final Game INSTANCE = new Game ();

    public Level level;

    public void addPoint () {
        ActionLogger.log (INSTANCE, "Adding 1 point");
    }

    public static Game getInstance () {
        ActionLogger.log (INSTANCE, "getInstance ()");
        return INSTANCE;
    }

    @Override
    public String toString () {
        return "Game <<singleton>>";
    }

}
