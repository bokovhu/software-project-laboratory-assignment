package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;
import hu.johndoe.panda.proto._internal.GameRandom;

import java.io.Serializable;

public class GameMachine extends Item implements Serializable {

    public GameMachine () {
    }

    public GameMachine (Tile placedOn) {
        super (placedOn);
    }

    @Override
    public void update () {

        ActionLogger.log (this, "Updating");

        if (GameRandom.random ()) {
            JumpyWave wave = new JumpyWave ();
            wave.setOrigin (getPlacedOn ());
            getPlacedOn ().spawnWave (wave);
        }

        throw new UnsupportedOperationException ();

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
