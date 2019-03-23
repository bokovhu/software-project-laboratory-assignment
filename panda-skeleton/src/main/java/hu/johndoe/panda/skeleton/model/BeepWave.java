package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class BeepWave extends Wave {

    public BeepWave () {
    }

    public BeepWave (Tile origin) {
        super (origin);
    }

    @Override
    public void hit (Animal animal) {

        ActionLogger.log (this, "Hitting animal %s", animal.toString ());
        ActionLogger.push ();

        animal.scare ();

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "BeepWave{" +
                "id=" + id +
                '}';
    }

}
