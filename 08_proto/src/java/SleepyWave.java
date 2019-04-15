package java;

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
        ActionLogger.push ();
        getOrigin ().getPlacedItem ().use (animal);

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "SleepyWave{" +
                "id=" + id +
                '}';
    }

}
