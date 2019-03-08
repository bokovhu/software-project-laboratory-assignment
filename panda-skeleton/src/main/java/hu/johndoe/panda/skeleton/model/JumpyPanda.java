package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class JumpyPanda extends Panda {

    public JumpyPanda () {
    }

    public JumpyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void jump () {

        ActionLogger.log (this, "Jumping");
        throw new UnsupportedOperationException ();

    }

    @Override
    public String toString () {
        return "JumpyPanda{" +
                "id=" + id +
                '}';
    }

}
