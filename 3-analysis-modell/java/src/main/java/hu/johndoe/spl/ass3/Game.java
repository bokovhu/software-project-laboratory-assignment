package hu.johndoe.spl.ass3;

import java.util.List;

// Stereotype: <<singleton>>
// TODO: Missing from DOCUMENT.md
public class Game {

    private static Game INSTANCE = new Game ();

    public static Game getInstance () {
        return INSTANCE;
    }

    public Level level;
    public List <Updatable> updatables;

}
