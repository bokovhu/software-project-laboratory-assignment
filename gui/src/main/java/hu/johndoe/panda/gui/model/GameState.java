package hu.johndoe.panda.gui.model;

import java.io.Serializable;

public final class GameState implements Serializable {

    private static final GameState INSTANCE = new GameState ();

    private Level level;
    private int numPoints;

    public static GameState getInstance () {
        return INSTANCE;
    }

    public void reset () {

        level = new Level ();
        numPoints = 0;

    }

    public Level getLevel () {
        return level;
    }

    public int getNumPoints () {
        return numPoints;
    }

    public void addPoint () {
        numPoints++;
    }

}
