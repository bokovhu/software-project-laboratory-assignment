package hu.johndoe.panda.gui.model;

public class JumpyWave extends Wave {

    private static final long serialVersionUID = 1L;

    @Override
    public void hit (Animal animal) {

        animal.jump ();

    }

    @Override
    public String getComicText () {
        return "Cling!";
    }

}
