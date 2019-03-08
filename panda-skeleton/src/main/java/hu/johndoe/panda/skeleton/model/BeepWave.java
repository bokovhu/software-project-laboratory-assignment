package hu.johndoe.panda.skeleton.model;

public class BeepWave extends Wave {

    @Override
    public void hit (Animal animal) {

        animal.scare ();

    }

}
