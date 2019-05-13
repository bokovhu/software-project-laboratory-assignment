package hu.johndoe.panda.gui.model;

public class SleepyWave extends Wave {

    private static final long serialVersionUID = 1L;

    @Override
    public void hit (Animal animal) {

        getOrigin ().placedItem.use (animal);

    }

    @Override
    public String getComicText () {
        return null;
    }

}
