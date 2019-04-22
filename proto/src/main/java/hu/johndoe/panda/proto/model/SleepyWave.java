package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

public class SleepyWave extends Wave implements Serializable {

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
