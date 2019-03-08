package hu.johndoe.panda.skeleton.model;

public class JumpyWave extends Wave {

    @Override
    public void hit (Animal animal) {

        animal.jump ();

    }

}
