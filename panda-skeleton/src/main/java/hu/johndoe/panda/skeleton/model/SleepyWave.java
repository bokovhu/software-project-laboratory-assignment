package hu.johndoe.panda.skeleton.model;

public class SleepyWave extends Wave {

    public SleepyWave () {
    }

    public SleepyWave (Tile origin) {
        super (origin);
    }

    @Override
    public void hit (Animal animal) {

        getOrigin ().getPlacedItem ().use (animal);

    }

}
