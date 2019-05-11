package hu.johndoe.panda.gui.model;

public class SleepyWave extends Wave {

    @Override
    public void hit (Animal animal) {

        getOrigin ().placedItem.use (animal);

    }

    @Override
    public String getComicText () {
        return null;
    }

}
