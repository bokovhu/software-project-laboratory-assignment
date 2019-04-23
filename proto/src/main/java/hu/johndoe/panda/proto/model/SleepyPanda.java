package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;
import java.util.Objects;

/**
 * A sleepy panda in the game. When sleepy pandas get near a couch, they will decide to take a nap there, given that
 * given that they are not already sleeping, and the couch is not taken yet. When a sleepy panda begins its nap, it
 * cannot be rescued afterwards.
 */
public class SleepyPanda extends Panda implements Serializable {

    public boolean isSleeping = false;

    public SleepyPanda () {
    }

    public SleepyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    /**
     * Causes the sleepy panda to go to sleep into the couch that is found on the parameter tile.
     * @param where the tile to go to in order to sleep
     */
    @Override
    public void goToSleep (Tile where) {

        ActionLogger.log (this, "Going to sleep to tile %s", where.toString ());
        ActionLogger.push ();

        moveTo (where);
        isSleeping = true;

        ActionLogger.pop ();

    }

    public void setIsSleeping (boolean v) {
        ActionLogger.log (this, "setIsSleeping (%s)", Objects.toString (v));
        isSleeping = v;
    }

    @Override
    public String toString () {
        return "SleepyPanda{" +
                "id=" + id +
                '}';
    }

    @Override
    public String toPrintableRepresentation () {
        return super.toPrintableRepresentation () + " ISSLEEPING = " + isSleeping
                + " SLEEPINGIN = " + (isSleeping ? reference (this.getStandingOn ().getPlacedItem ()) : reference (null));
    }

    @Override
    public String getTag () {
        return "SLEEPY PANDA";
    }

}
