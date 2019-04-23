package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

/**
 * A single jumpy pandas. Jumpy pandas may get scared from the noise of game machines, causing them to jump, which
 * disrupts the currently lead animal chain, and damages the tile the panda is standing on, given the tile is fragile
 */
public class JumpyPanda extends Panda implements Serializable {

    public JumpyPanda () {
    }

    public JumpyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    /**
     * Makes the panda jump
     */
    @Override
    public void jump () {

        ActionLogger.log (this, "Jumping");
        ActionLogger.push ();

        getStandingOn ().damage ();
        stopLeading ();

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "JumpyPanda{" +
                "id=" + id +
                '}';
    }

    @Override
    public String getTag () {
        return "JUMPY PANDA";
    }

}
