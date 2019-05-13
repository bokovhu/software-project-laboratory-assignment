package hu.johndoe.panda.gui.model;

public class BeepWave extends Wave {

    private static final long serialVersionUID = 1L;

    @Override
    public void hit (Animal animal) {

        animal.scare ();

    }

    @Override
    public String getComicText () {
        return "Beep-boop!";
    }

}
