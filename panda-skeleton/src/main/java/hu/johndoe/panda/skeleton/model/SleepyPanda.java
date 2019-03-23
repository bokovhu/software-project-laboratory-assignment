package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

import java.util.Objects;

public class SleepyPanda extends Panda {

    public boolean isSleeping = false;

    public SleepyPanda () {
    }

    public SleepyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

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

}
