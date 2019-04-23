package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;
import hu.johndoe.panda.proto._internal.GameRandom;

import java.io.Serializable;

/**
 * A single game machine. The game machine randomly makes noises, which may make jumpy pandas jump. When a jumpy panda
 * jumps, the jumping disrupts the currently lead animal chain, and if the panda is standing on a fragile tile, the tile
 * is damaged.
 */
public class GameMachine extends Item implements Serializable {

    public GameMachine () {
    }

    public GameMachine (Tile placedOn) {
        super (placedOn);
    }

    /**
     * Updates the game machine. It may emit a jumpy wave randomly to the tile its placed on, as well as its
     * neighbouring tiles.
     */
    @Override
    public void update () {

        ActionLogger.log (this, "Updating");

        if (GameRandom.random ()) {
            JumpyWave wave = new JumpyWave ();
            wave.setOrigin (getPlacedOn ());
            getPlacedOn ().spawnWave (wave);
        }

    }

    @Override
    public String toString () {
        return "GameMachine{" +
                "id=" + id +
                '}';
    }

    @Override
    public String getTag () {
        return "GAMEMACHINE";
    }

}
