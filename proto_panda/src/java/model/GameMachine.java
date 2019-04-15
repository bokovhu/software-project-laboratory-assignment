package java.model;

import java._internal.ActionLogger;
import java._internal.IdGenerator;

public class GameMachine extends Item {

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
