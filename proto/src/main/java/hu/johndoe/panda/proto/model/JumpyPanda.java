package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

public class JumpyPanda extends Panda implements Serializable {

    public JumpyPanda () {
    }

    public JumpyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

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
