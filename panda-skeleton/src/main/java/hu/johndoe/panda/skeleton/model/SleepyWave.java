package hu.johndoe.panda.skeleton.model;

public class SleepyWave extends Wave {

    @Override
    public void hit (Animal animal) {

        getOrigin ().getPlacedItem ().use (animal);

    }

}
