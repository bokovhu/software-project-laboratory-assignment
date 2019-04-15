package java.model;

import java._internal.ActionLogger;
import java._internal.IdGenerator;

public abstract class Panda extends Animal {

    public boolean isAsleep;

    public Panda () {
    }

    public Panda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void collideWithAnimal (Animal animal) {

        ActionLogger.log (this, "Colliding with animal %s", animal.toString ());
        ActionLogger.push ();

        animal.collideWithPanda (this);

        ActionLogger.pop ();

    }

    @Override
    public void collideWithOrangutan (Animal orangutan) {

        ActionLogger.log (this, "Colliding with orangutan %s", orangutan.toString ());
        ActionLogger.push ();

        if(orangutan.canGrab()) startLeading (orangutan);

        ActionLogger.pop ();

    }

    @Override
    public void leadOut () {

        ActionLogger.log (this, "Getting lead out");
        ActionLogger.push ();

        if (getGuidedAnimal () != null) {
            ActionLogger.log (this, "Leading guided animal out");
            getGuidedAnimal ().leadOut ();
        }

        Game.getInstance ().level.removeAnimal (this);
        Game.getInstance ().addPoint ();

        ActionLogger.pop ();

    }

    @Override
    public void startLeading (Animal leader) {

        ActionLogger.log (this, "Starting to be lead by %s", leader.toString ());
        ActionLogger.push ();

        setLeaderAnimal (leader);
        if (leader.getGuidedAnimal () != null) {
            setGuidedAnimal (leader.getGuidedAnimal ());
            leader.getGuidedAnimal ().setLeaderAnimal (this);
        }
        leader.setGuidedAnimal (this);

        ActionLogger.pop ();

    }

    @Override
    public void update () {
        super.update ();

        ActionLogger.log (this, "Updating");
    }

    @Override
    public String toString () {
        return "Panda{" +
                "id=" + id +
                '}';
    }

}
