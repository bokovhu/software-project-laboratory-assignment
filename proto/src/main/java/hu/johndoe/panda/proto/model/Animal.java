package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;
import hu.johndoe.panda.proto._internal.IdGenerator;

import java.util.Objects;

/**
 * A single animal in the game. The implemented animal species are orangutans and pandas (and the different specialized
 * pandas).
 */
public abstract class Animal implements Updatable {

    /**
     * The internal ID of the object, used for logging purposes
     */
    protected final int id = IdGenerator.fetch ();

    /**
     * The animal that's leading this one
     */
    private Animal leaderAnimal;

    /**
     * The animal this animal is leading
     */
    private Animal guidedAnimal;

    /**
     * The tile this animal is standing on
     */
    private Tile standingOn;

    public Animal () {
    }

    public Animal (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        this.leaderAnimal = leaderAnimal;
        this.guidedAnimal = guidedAnimal;
        this.standingOn = standingOn;
    }

    /**
     * Makes this animal lead. The leader of the animal becomes the parameter, and this animal is set as the new
     * guided animal of the leader
     *
     * @param leader the animal that's leading this one
     */
    public void startLeading (Animal leader) {

        ActionLogger.log (this, "Starting to be lead by %s", leader.toString ());
        if (leader.getGuidedAnimal () != null) {
            setGuidedAnimal (leader.getGuidedAnimal ());
            leader.getGuidedAnimal ().setLeaderAnimal (this);
        }
        leader.setGuidedAnimal (this);

    }

    /**
     * Stops this animal from being lead. If this animal is leading another animal, the stop event propagates to that
     * one too recursively.
     * This method also handles the case when an orangutan lets go of its pandas.
     */
    public void stopLeading () {

        ActionLogger.log (this, "Stopping being lead");
        ActionLogger.push ();

        if (getLeaderAnimal () != null) {
            getLeaderAnimal ().setGuidedAnimal (null);
            setLeaderAnimal (null);
        }
        if (getGuidedAnimal () != null) {
            getGuidedAnimal ().stopLeading ();
        }

        ActionLogger.pop ();

    }

    /**
     * Kills this animal, removing it from the game
     */
    public void kill () {

        ActionLogger.log (this, "Getting killed");
        ActionLogger.push ();

        stopLeading ();

        Game.getInstance ().level.removeAnimal (this);

        ActionLogger.pop ();

    }

    /**
     * Moves (tries to move) this animal to another tile
     *
     * @param targetTile the tile to move to
     */
    public void moveTo (Tile targetTile) {

        ActionLogger.log (this, "Moving to tile %s", targetTile.toString ());
        ActionLogger.push ();

        targetTile.accept (this);
        ActionLogger.pop ();

    }

    /**
     * Makes this animal use an item
     *
     * @param item the item to use
     */
    public void use (Item item) {

        ActionLogger.log (this, "Using item %s", item.toString ());

    }

    /**
     * Indicates whether the animal can grab a panda or not.
     *
     * @return
     */
    public boolean canGrab () {
        return true;
    }

    /**
     * Orders this animal to collide with another animal. Implementations should call the appropriate collide handler
     * function of the parameter animal
     *
     * @param animal the animal to collide with
     */
    public void collideWithAnimal (Animal animal) {

        ActionLogger.log (this, "Colliding with animal %s", animal.toString ());

    }

    /**
     * Notifies this animal of a collision with an orangutan
     *
     * @param orangutan the orangutan this animal collided with
     */
    public void collideWithOrangutan (Animal orangutan) {

        ActionLogger.log (this, "Colliding with orangutan %s", orangutan.toString ());

    }

    /**
     * Notifies this animal of a collision with a panda
     *
     * @param panda the panda this animal collided with
     */
    public void collideWithPanda (Animal panda) {

        ActionLogger.log (this, "Colliding with panda %s", panda.toString ());

    }

    /**
     * Orders this animal to go to sleep to a given tile
     *
     * @param where the tile to go to in order to sleep
     */
    public void goToSleep (Tile where) {

        ActionLogger.log (this, "Going to sleep to tile %s", where.toString ());

    }

    /**
     * Makes this animal jump
     */
    public void jump () {

        ActionLogger.log (this, "Jumping");

    }

    /**
     * Scares this animal
     */
    public void scare () {

        ActionLogger.log (this, "Being scared");

    }

    /**
     * Leads this animal out, resulting in points being awarded, and the animal being removed from the game
     */
    public void leadOut () {
        ActionLogger.log (this, "Being lead out");

    }

    /**
     * Updates the internal state of this animal
     */
    @Override
    public void update () {

    }

    /**
     * Retrieves the animal that's currently leading this one
     *
     * @return the current leader, or null
     */
    public Animal getLeaderAnimal () {
        return leaderAnimal;
    }

    /**
     * Sets the leader animal
     *
     * @param leaderAnimal the new leader
     */
    public void setLeaderAnimal (Animal leaderAnimal) {
        ActionLogger.log (this, "setLeaderAnimal (%s)", Objects.toString (leaderAnimal));
        this.leaderAnimal = leaderAnimal;
    }

    /**
     * Retrieves the animal that's currently being lead by this one
     *
     * @return the currently lead animal, or null
     */
    public Animal getGuidedAnimal () {
        return guidedAnimal;
    }

    /**
     * Sets the guided animal
     *
     * @param guidedAnimal the new guided animal
     */
    public void setGuidedAnimal (Animal guidedAnimal) {
        ActionLogger.log (this, "setGuidedAnimal (%s)", Objects.toString (guidedAnimal));
        this.guidedAnimal = guidedAnimal;
    }

    /**
     * Retrieves the tile this animal is currently standing on
     *
     * @return the tile this animal is currently standing on
     */
    public Tile getStandingOn () {
        ActionLogger.log (this, "getStandingOn () returns " + standingOn.toString ());
        return standingOn;
    }

    /**
     * Sets the tile this animal is standing on
     *
     * @param standingOn the new location tile
     */
    public void setStandingOn (Tile standingOn) {
        ActionLogger.log (this, "setStandingOn (%s)", standingOn.toString ());
        this.standingOn = standingOn;
    }

    /**
     * Converts this animal to a textual representation, that can be used for logging purposes
     *
     * @return the textural representation of the animal
     */
    @Override
    public String toString () {
        return "Animal{" +
                "id=" + id +
                '}';
    }

}
