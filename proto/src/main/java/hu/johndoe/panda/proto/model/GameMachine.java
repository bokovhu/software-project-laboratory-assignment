package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

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

        // if (random) {
        //     JumpyWave wave = new JumpyWave ();
        //     wave.setOrigin (getPlacedOn ());
        //     getPlacedOn ().spawnWave (wave);
        // }

        throw new UnsupportedOperationException ();

    }

    @Override
    public String toString () {
        return "GameMachine{" +
                "id=" + id +
                '}';
    }

}
