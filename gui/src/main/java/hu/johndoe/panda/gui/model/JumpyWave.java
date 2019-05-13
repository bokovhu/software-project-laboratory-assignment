package hu.johndoe.panda.gui.model;

public class JumpyWave extends Wave {

    @Override
    public void hit (Animal animal) {

        animal.jump ();

    }

    @Override
    public String getComicText () {
        return "Cling!";
    }

}
