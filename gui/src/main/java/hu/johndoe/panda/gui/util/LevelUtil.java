package hu.johndoe.panda.gui.util;

import hu.johndoe.panda.gui.constants.Errors;
import hu.johndoe.panda.gui.model.Level;
import hu.johndoe.panda.gui.model.Tile;

import java.util.ArrayList;
import java.util.List;

public final class LevelUtil {

    private LevelUtil () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static void fixLevel (Level loadedLevel) {

        for (Tile tile : loadedLevel.tiles) {
            tile.life = Tile.DEFAULT_LIFE;
        }

        for (Tile tile : loadedLevel.tiles) {
            List<Tile> neighboursToRemove = new ArrayList<> ();
            for (Tile neighbour : tile.neighbours) {
                if (!loadedLevel.tiles.contains (neighbour)) {
                    neighboursToRemove.add (neighbour);
                }
            }
            tile.neighbours.removeAll (neighboursToRemove);
        }

    }

}
