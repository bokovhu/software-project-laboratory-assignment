package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class SleepyWave extends Wave {

    public SleepyWave () {
    }

    public SleepyWave (Tile origin) {
        super (origin);
    }

    @Override
    public void hit (Animal animal) {

        ActionLogger.log (this, "Hitting animal %s, making it use origin's placed item", animal.toString ());
        getOrigin ().getPlacedItem ().use (animal);

    }

    @Override
    public String toString () {
        return "SleepyWave{" +
                "id=" + id +
                '}';
    }

}
