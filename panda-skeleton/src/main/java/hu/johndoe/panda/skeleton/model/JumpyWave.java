package hu.johndoe.panda.skeleton.model;

public class JumpyWave extends Wave {

    public JumpyWave () {
    }

    public JumpyWave (Tile origin) {
        super (origin);
    }

    @Override
    public void hit (Animal animal) {

        animal.jump ();

    }

}
