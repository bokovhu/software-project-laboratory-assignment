package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;
import hu.johndoe.panda.proto._internal.GameRandom;

import java.io.Serializable;
import java.util.Random;

/**
 * A panda
 */
public abstract class Panda extends Animal implements Serializable {

    public boolean isAsleep;

    public Panda () {
    }

    public Panda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    /**
     * Handles an outgoing (this animal moves INTO another one) collision with another animal
     * @param animal the animal to collide with
     */
    @Override
    public void collideWithAnimal (Animal animal) {

        ActionLogger.log (this, "Colliding with animal %s", animal.toString ());
        ActionLogger.push ();

        animal.collideWithPanda (this);

        ActionLogger.pop ();

    }

    /**
     * Handles an incoming collision with an orangutan
     * @param orangutan the orangutan this animal collided with
     */
    @Override
    public void collideWithOrangutan (Animal orangutan) {

        ActionLogger.log (this, "Colliding with orangutan %s", orangutan.toString ());
        ActionLogger.push ();

        if (orangutan.canGrab ()) {
            startLeading (orangutan);
        }

        ActionLogger.pop ();

    }

    /**
     * Causes this panda to be lead out from the level
     */
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

    /**
     * Causes this panda to be lead by the parameter animal
     * @param leader the animal that's leading this one
     */
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

    /**
     * Updates the internal state of the panda. The pandas may randomly wander around the map when they are not being
     * lead.
     */
    @Override
    public void update () {
        super.update ();
        if(getLeaderAnimal() == null) {
            if (GameRandom.random()) {
                Random random = new Random();
                Tile target = getStandingOn().getNeighbours().get(random.nextInt(getStandingOn().getNeighbours().size()));
                moveTo(target);
            }
        }

        ActionLogger.log (this, "Updating");
    }

    @Override
    public String toString () {
        return "Panda{" +
                "id=" + id +
                '}';
    }

    @Override
    public String getTag () {
        return "PANDA";
    }

}
