package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

public class Game {

    private static final Game INSTANCE = new Game ();

    public Level level;

    public static Game getInstance () {
        ActionLogger.log (INSTANCE, "getInstance ()");
        return INSTANCE;
    }

    public void addPoint () {
        ActionLogger.log (INSTANCE, "Adding 1 point");
    }

    @Override
    public String toString () {
        return "Game <<singleton>>";
    }

}
