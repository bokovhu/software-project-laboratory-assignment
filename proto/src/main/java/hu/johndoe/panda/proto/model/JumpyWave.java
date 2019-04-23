package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

/**
 * A jumpy wave, that when perceived by a jumpy panda causes it to jump.
 */
public class JumpyWave extends Wave implements Serializable {

    public JumpyWave () {
    }

    public JumpyWave (Tile origin) {
        super (origin);
    }

    /**
     * Causes the parameter animal to perceive this jumpy wave. Makes any parameter animal jump, without taking the
     * animal's jumping capabilities into account. Certain animals will have no reaction to this wave however, as per
     * specification the only animal that is able to jump is the jumpy panda.
     * @param animal the animal this wave hits
     */
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
