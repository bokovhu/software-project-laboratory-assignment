package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

/**
 * Represents a propagating beep wave. When hitting a coward panda, this wave scares them. The wave has no effects on
 * other animals.
 */
public class BeepWave extends Wave {

    public BeepWave () {
    }

    public BeepWave (Tile origin) {
        super (origin);
    }

    /**
     * Hits the parameter animal, and triggers its reaction
     *
     * @param animal the animal to hit
     */
    @Override
    public void hit (Animal animal) {

        ActionLogger.log (this, "Hitting animal %s", animal.toString ());
        ActionLogger.push ();

        animal.scare ();

        ActionLogger.pop ();

    }

    /**
     * Converts this beep wave to a textual representation, that can be used for logging purposes
     *
     * @return the textural representation of the beep wave
     */
    @Override
    public String toString () {
        return "BeepWave{" +
                "id=" + id +
                '}';
    }

}
