package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;
import java.util.Objects;

public class SleepyPanda extends Panda implements Serializable {

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

    @Override
    public String toPrintableRepresentation () {
        return super.toPrintableRepresentation () + " ISSLEEPING = " + isSleeping;
    }

    @Override
    public String getTag () {
        return "SLEEPY PANDA";
    }

}
