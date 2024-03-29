package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;
import hu.johndoe.panda.proto._internal.GameRandom;

import java.io.Serializable;

/**
 * Represents a chocolate vending machine in the game. Sometimes, the chocolate vending machine emits a beep wave, that
 * may scare coward pandas.
 */
public class ChocolateVendingMachine extends Item implements Serializable {

    public ChocolateVendingMachine () {
    }

    public ChocolateVendingMachine (Tile placedOn) {
        super (placedOn);
    }

    /**
     * Updates the internal state of the chocolate vending machine. May randomly spawn a single beep wave on the tile
     * its placed on.
     */
    @Override
    public void update () {

        ActionLogger.log (this, "Updating");

        if (GameRandom.random ()) {
            BeepWave wave = new BeepWave ();
            wave.setOrigin (getPlacedOn ());
            getPlacedOn ().spawnWave (wave);
        }

    }

    /**
     * Converts this chocolate vending machine to a textual representation, that can be used for logging purposes
     *
     * @return the textural representation of the chocolate vending machine
     */
    @Override
    public String toString () {
        return "ChocolateVendingMachine{" +
                "id=" + id +
                '}';
    }

    @Override
    public String getTag () {
        return "VENDINGMACHINE";
    }

}
