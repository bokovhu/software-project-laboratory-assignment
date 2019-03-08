package hu.johndoe.panda.skeleton.model;

public class JumpyPanda extends Panda {

    public JumpyPanda () {
    }

    public JumpyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void jump () {

        throw new UnsupportedOperationException ();

    }

}
