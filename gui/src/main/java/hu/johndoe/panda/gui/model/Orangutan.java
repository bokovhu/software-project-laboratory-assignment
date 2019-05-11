package hu.johndoe.panda.gui.model;

import java.awt.*;

public class Orangutan extends Animal {

    private int theftTimer;

    /** Returns whether or not this orangutan is able to steal a panda chain */
    @Override
    public boolean canGrab () {
        return (this.theftTimer < 1);
    }

    /** Causes the animals in its chain to be lead out, and the player being rewarded with points */
    @Override
    public void leadOut () {
        if (getGuidedAnimal () != null) {
            getGuidedAnimal ().leadOut ();
        }
        setGuidedAnimal (null);
        moveTo (GameState.getInstance ().getLevel ().entranceTile);
    }

    /**
     * Handles an outgoing (this animal moves INTO another one) collision with another animal
     * @param animal the animal to collide with
     */
    @Override
    public void collideWithAnimal (Animal animal) {

        animal.collideWithOrangutan (this);

    }

    /**
     * This handles the collision between orangutans and the stealing
     *
     * @param orangutan the orangutan this animal collided with
     */
    @Override
    public void collideWithOrangutan (Animal orangutan) {

        if (this.getGuidedAnimal () != null && orangutan.canGrab ()) {
            swapWith (orangutan);
            this.getGuidedAnimal ().startLeading (orangutan);
            this.setGuidedAnimal (null);
            this.theftTimer = 3;
        }

    }

    /**
     * Swaps places AND chains with another animal (that can only logically be an orangutan)
     * @param orangutan the animal to swap places with
     */
    public void swapWith (Animal orangutan) {
        Tile otherTile = orangutan.getStandingOn ();

        orangutan.setStandingOn (this.getStandingOn ());
        this.getStandingOn ().setCurrentAnimal (orangutan);

        this.setStandingOn (otherTile);
        otherTile.setCurrentAnimal (this);
    }


    @Override
    public void moveTo (Tile targetTile) {

        if (targetTile.accept (this) && this.theftTimer > 0) {
            theftTimer--;
        }

    }

    @Override
    public void draw (Graphics2D g, float delta) {

    }

    @Override
    public void update (float delta) {

        setX (getStandingOn ().getX ());
        setY (getStandingOn ().getY ());

    }

}
