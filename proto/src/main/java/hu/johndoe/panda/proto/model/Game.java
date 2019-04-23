package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

/**
 * Represents the game itself. Owns an instance of the currently played level.
 *
 * This is a singleton class, only one Game may be constructed per application instance.
 */
public class Game {

    private static final Game INSTANCE = new Game ();

    public Level level;

    /**
     * Returns the singleton instance of the game.
     * @return the singleton instance
     */
    public static Game getInstance () {
        ActionLogger.log (INSTANCE, "getInstance ()");
        return INSTANCE;
    }

    /**
     * Rewards the player with exactly one point.
     */
    public void addPoint () {
        ActionLogger.log (INSTANCE, "Adding 1 point");
    }

    @Override
    public String toString () {
        return "Game <<singleton>>";
    }

}
