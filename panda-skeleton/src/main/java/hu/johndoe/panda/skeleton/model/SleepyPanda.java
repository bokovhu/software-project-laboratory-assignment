package hu.johndoe.panda.skeleton.model;

public class SleepyPanda extends Panda {

    public SleepyPanda () {
    }

    public SleepyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void goToSleep (Tile where) {

        throw new UnsupportedOperationException ();

    }

}
