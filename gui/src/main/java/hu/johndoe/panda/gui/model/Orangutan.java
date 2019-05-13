package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.swing.view.game.GameEffects;

import java.awt.*;

public class Orangutan extends Animal {

    private static final long serialVersionUID = 1L;

    private int theftTimer;

    /**
     * Returns whether or not this orangutan is able to steal a panda chain
     */
    @Override
    public boolean canGrab () {
        return (this.theftTimer < 1);
    }

    /**
     * Causes the animals in its chain to be lead out, and the player being rewarded with points
     */
    @Override
    public void leadOut () {
        if (getGuidedAnimal () != null) {
            getGuidedAnimal ().leadOut ();
        }
        moveTo (GameState.getInstance ().getLevel ().entranceTile);
        GameEffects.getInstance ()
                .addFlyingDisappearingText (
                        "Free, finally!",
                        getX (), getY (),
                        0f, -64f,
                        2f
                );
    }

    /**
     * Handles an outgoing (this animal moves INTO another one) collision with another animal
     *
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
     *
     * @param orangutan the animal to swap places with
     */
    public void swapWith (Animal orangutan) {
        Tile otherTile = orangutan.getStandingOn ();

        orangutan.setStandingOn (this.getStandingOn ());
        this.getStandingOn ().setCurrentAnimal (orangutan);

        this.setStandingOn (otherTile);
        otherTile.setCurrentAnimal (this);


        GameEffects.getInstance ()
                .addFlyingDisappearingText (
                        "Swap",
                        getX (), getY (),
                        0f, -64f,
                        2f
                );

    }


    @Override
    public boolean moveTo (Tile targetTile) {

        GameEffects.getInstance ()
                .addFlyingDisappearingText (
                        "Move",
                        getX (), getY (),
                        0f, -64f,
                        2f
                );
        if (targetTile.accept (this) && this.theftTimer > 0) {
            theftTimer--;
        }

        return true;

    }

    @Override
    public void draw (Graphics2D g, float delta) {

        setX (getStandingOn ().getX ());
        setY (getStandingOn ().getY ());

        // Draw orangutan image //

        g.setColor (Color.WHITE);
        g.drawImage (
                Resources.OrangutanTexture ().getImage (),
                (int) getX (), (int) getY (),
                (int) Sizes.AnimalSize, (int) Sizes.AnimalSize,
                null
        );

    }

    @Override
    public void update (float delta) {

    }

    @Override
    public boolean select (float x, float y) {
        float dx = x - (getX () + Sizes.AnimalSize / 2f);
        float dy = y - (getY () + Sizes.AnimalSize / 2f);
        return (float) Math.abs (dx) + Math.abs (dy) < Sizes.AnimalSize / 2f;
    }

}
