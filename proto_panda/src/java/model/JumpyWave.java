package java.model;

import java._internal.ActionLogger;
import java._internal.IdGenerator;

public class JumpyWave extends Wave {

    public JumpyWave () {
    }

    public JumpyWave (Tile origin) {
        super (origin);
    }

    @Override
    public void hit (Animal animal) {

        ActionLogger.log (this, "Hitting animal %s, making it jump", animal.toString ());
        ActionLogger.push ();

        animal.jump ();

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "JumpyWave{" +
                "id=" + id +
                '}';
    }

}
