package java.model;

import java._internal.ActionLogger;
import java._internal.IdGenerator;

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
