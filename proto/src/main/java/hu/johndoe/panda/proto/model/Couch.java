package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

/**
 * A single couch in the game. Sleepy pandas can sleep in couches. When a sleepy panda steps to a neighbouring tile of
 * an untaken couch, the panda will decide to go to sleep, and occupy the couch. After this, the panda becomes
 * inrescuable
 */
public class Couch extends Item implements Serializable {

    /** True, if there's currently a panda sleeping in this couch */
    private boolean isTaken;

    public Couch () {
    }

    public Couch (Tile placedOn) {
        super (placedOn);
    }

    /**
     * Makes the couch be used by the parameter animal. The couch will command the user to go to sleep.
     * @param user the animal that uses the couch
     */
    @Override
    public void use (Animal user) {

        ActionLogger.log (this, "Getting used by %s", user.toString ());
        ActionLogger.push ();

        if (!isTaken) {
            ActionLogger.log (this, "I am not yet taken, making user go to sleep");
            user.goToSleep (getPlacedOn ());
            isTaken = true;
        }

        ActionLogger.pop ();

    }

    /**
     * Updates the couch. On every update, the couch will emit sleepy waves to the tile that it's placed on, as well as
     * its neighbours, causing sleepy pandas that are standing on either of these tiles to suddenly feel the urge to go
     * to sleep immediately.
     */
    @Override
    public void update () {

        ActionLogger.log (this, "Updating");

        if (!isTaken) {
            ActionLogger.log (this, "I am not yet taken, spawning a sleepy wave");
            SleepyWave wave = new SleepyWave ();
            wave.setOrigin (getPlacedOn ());

            getPlacedOn ().spawnWave (wave);
        }

    }

    @Override
    public String toString () {
        return "Couch{" +
                "id=" + id +
                '}';
    }

    @Override
    public String getTag () {
        return "COUCH";
    }

    @Override
    public String toPrintableRepresentation () {
        return super.toPrintableRepresentation () + " ISTAKEN = " + isTaken;
    }

}
