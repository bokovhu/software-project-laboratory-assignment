package java.model;

import java._internal.ActionLogger;
import java._internal.IdGenerator;

public class JumpyPanda extends Panda {

    public JumpyPanda () {
    }

    public JumpyPanda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void jump () {

        ActionLogger.log (this, "Jumping");
        ActionLogger.push ();

        getStandingOn ().damage ();
        stopLeading ();

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "JumpyPanda{" +
                "id=" + id +
                '}';
    }

}
