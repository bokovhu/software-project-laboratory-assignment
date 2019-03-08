package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class JumpyWave extends Wave {

    public JumpyWave () {
    }

    public JumpyWave (Tile origin) {
        super (origin);
    }

    @Override
    public void hit (Animal animal) {

        ActionLogger.log (this, "Hitting animal %s, making it jump", animal.toString ());
        animal.jump ();

    }

    @Override
    public String toString () {
        return "JumpyWave{" +
                "id=" + id +
                '}';
    }

}
