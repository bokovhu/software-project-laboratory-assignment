package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class ChocolateVendingMachine extends Item {

    public ChocolateVendingMachine () {
    }

    public ChocolateVendingMachine (Tile placedOn) {
        super (placedOn);
    }

    @Override
    public void update () {

        ActionLogger.log (this, "Updating");

        // if (random) {
        //     BeepWave wave = new BeepWave ();
        //     wave.setOrigin (getPlacedOn ());
        //     getPlacedOn ().spawnWave (wave);
        // }

        throw new UnsupportedOperationException ();

    }

    @Override
    public String toString () {
        return "ChocolateVendingMachine{" +
                "id=" + id +
                '}';
    }

}
