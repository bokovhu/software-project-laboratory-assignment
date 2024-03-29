package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Probabilities;
import hu.johndoe.panda.gui.swing.view.game.GameEffects;

import java.util.Random;

public abstract class Panda extends Animal {

    private static final long serialVersionUID = 1L;

    public boolean isSleeping = false;
    private float zzzTimer = 2f;

    /**
     * Handles an outgoing (this animal moves INTO another one) collision with another animal
     * @param animal the animal to collide with
     */
    @Override
    public void collideWithAnimal (Animal animal) {

        animal.collideWithPanda (this);

    }

    /**
     * Handles an incoming collision with an orangutan
     * @param orangutan the orangutan this animal collided with
     */
    @Override
    public void collideWithOrangutan (Animal orangutan) {

        if (orangutan.canGrab () && canBeGrabbed () /* Pandas can be ungrabbable too */) {
            startLeading (orangutan);
        }

    }

    /**
     * Causes this panda to be lead out from the level
     */
    @Override
    public void leadOut () {

        if (getGuidedAnimal () != null) {
            getGuidedAnimal ().leadOut ();
        }

        GameState.getInstance ().getLevel ().removeAnimal (this);
        GameState.getInstance ().addPoint ();

    }

    /**
     * Causes this panda to be lead by the parameter animal
     * @param leader the animal that's leading this one
     */
    @Override
    public void startLeading (Animal leader) {

        setLeaderAnimal (leader);
        if (leader.getGuidedAnimal () != null) {
            setGuidedAnimal (leader.getGuidedAnimal ());
            leader.getGuidedAnimal ().setLeaderAnimal (this);
        }
        leader.setGuidedAnimal (this);

        GameEffects.getInstance ()
                .addFlyingDisappearingText (
                        "Let's be friends!",
                        getX (), getY (),
                        0f, -64f,
                        2f
                );
    }

    @Override
    public void update (float delta) {

        if (getLeaderAnimal () == null && !isSleeping) {
            Random random = new Random ();
            if (random.nextFloat () < Probabilities.PandaMoveProbability) {

                Tile target = getStandingOn ().neighbours.get (random.nextInt (getStandingOn ().neighbours.size ()));

                // Panda should not be able to just walk out
                if (!target.isExit) {
                    moveTo (target);
                }

            }
        }

        if (isSleeping) {
            zzzTimer += delta;
            if (zzzTimer >= 2f) {
                GameEffects.getInstance ()
                        .addFlyingDisappearingText (
                                "Zzz zzz",
                                getX (), getY (),
                                0, -64f,
                                2f
                        );
                zzzTimer = 0;
            }
        }

    }

    @Override
    public boolean canBeGrabbed () {
        return true;
    }

}
