package hu.johndoe.panda.skeleton.model;

public class BeepWave extends Wave {

    public BeepWave () {
    }

    public BeepWave (Tile origin) {
        super (origin);
    }

    @Override
    public void hit (Animal animal) {

        animal.scare ();

    }

}
