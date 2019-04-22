package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

public class Orangutan extends Animal implements Serializable {

    private int theftTimer = 0;

    public Orangutan () {
    }

    public Orangutan (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);

    }

    @Override
    public boolean canGrab () {
        return (this.theftTimer < 1);
    }


    @Override
    public void leadOut () {
        ActionLogger.log (this, "Going out and back in");
        ActionLogger.push ();
        if (getGuidedAnimal () != null) {
            getGuidedAnimal ().leadOut ();
        }
        setGuidedAnimal (null);
        moveTo (Game.getInstance ().level.getStartTile ());
    }

    @Override
    public void collideWithAnimal (Animal animal) {

        ActionLogger.log (this, "Colliding with animal %s", animal.toString ());
        ActionLogger.push ();

        animal.collideWithOrangutan (this);

        ActionLogger.pop ();

    }

    /**
     * This handles the collision between orangutans and the stealing
     *
     * @param orangutan the orangutan this animal collided with
     */
    @Override
    public void collideWithOrangutan (Animal orangutan) {
        ActionLogger.log (this, "Colliding with orangutan %s", orangutan.toString ());
        ActionLogger.push ();

        if (this.getGuidedAnimal () != null && orangutan.canGrab ()) {
            swapWith (orangutan);
            this.getGuidedAnimal ().startLeading (orangutan);
            this.setGuidedAnimal (null);
            this.theftTimer = 3;
        }


        ActionLogger.pop ();
    }

    public void swapWith (Animal orangutan) {
        ActionLogger.log (this, "Swapping places with orangutan %s", orangutan.toString ());
        ActionLogger.push ();
        Tile otherTile = orangutan.getStandingOn ();

        orangutan.setStandingOn (this.getStandingOn ());
        this.getStandingOn ().setCurrentAnimal (orangutan);

        this.setStandingOn (otherTile);
        otherTile.setCurrentAnimal (this);
        ActionLogger.pop ();
    }


    @Override
    public void moveTo (Tile targetTile) {

        ActionLogger.log (this, "Moving to tile %s", targetTile.toString ());
        ActionLogger.push ();

        if (targetTile.accept (this) && this.theftTimer > 0) {
            theftTimer--;
        }
        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "Orangutan{" +
                "id=" + id +
                '}';
    }

    @Override
    public String getTag () {
        return "ORANGUTAN";
    }

    @Override
    public String toPrintableRepresentation () {
        return super.toPrintableRepresentation () + " THEFTTIMER = " + theftTimer;
    }

}
