package hu.johndoe.panda.gui.model;

public class BeepWave extends Wave {

    @Override
    public void hit (Animal animal) {

        animal.scare ();

    }

    @Override
    public String getComicText () {
        return "Beep-boop!";
    }

}
