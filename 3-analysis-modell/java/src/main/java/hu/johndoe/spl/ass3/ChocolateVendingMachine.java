package hu.johndoe.spl.ass3;

import hu.johndoe.spl.ass3.internal.GameRandom;

public class ChocolateVendingMachine extends Item {

    @Override
    public void update () {

        if (GameRandom.random ()) {

            Wave wave = new Wave ();
            wave.type = WaveType.BEEPING;
            this.placedOn.spawnWave (wave);

        }

    }

}
