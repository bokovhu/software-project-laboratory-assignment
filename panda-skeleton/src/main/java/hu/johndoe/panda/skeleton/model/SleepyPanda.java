package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class SleepyPanda extends Panda {

    public SleepyPanda () {
    }

    public SleepyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void goToSleep (Tile where) {

        ActionLogger.log (this, "Going to sleep to tile %s", where.toString ());

    }

    @Override
    public String toString () {
        return "SleepyPanda{" +
                "id=" + id +
                '}';
    }

}
