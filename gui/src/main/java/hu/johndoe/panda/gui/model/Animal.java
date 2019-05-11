package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.swing.view.game.GameEffects;

public abstract class Animal extends BaseGameEntity implements Selectable {

    private Animal leaderAnimal;
    private Animal guidedAnimal;
    private Tile standingOn;

    /**
     * Makes this animal lead. The leader of the animal becomes the parameter, and this animal is set as the new
     * guided animal of the leader
     *
     * @param leader the animal that's leading this one
     */
    public void startLeading (Animal leader) {

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

        if (getLeaderAnimal () != null) {
            getLeaderAnimal ().setGuidedAnimal (null);
            setLeaderAnimal (null);
        }
        if (getGuidedAnimal () != null) {
            getGuidedAnimal ().stopLeading ();
        }

        GameEffects.getInstance ()
                .addFlyingDisappearingText (
                        "Good bye!",
                        getX (), getY (),
                        0f, -64f,
                        2f
                );
    }

    /**
     * Kills this animal, removing it from the game
     */
    public void kill () {

        stopLeading ();

        GameState.getInstance ().getLevel ().removeAnimal (this);

    }

    /**
     * Moves (tries to move) this animal to another tile
     *
     * @param targetTile the tile to move to
     */
    public void moveTo (Tile targetTile) {

        GameEffects.getInstance ()
                .addFlyingDisappearingText (
                        "Move",
                        getX (), getY (),
                        0f, -64f,
                        2f
                );
        if (!standingOn.equals (targetTile)) {
            targetTile.accept (this);
        }

    }

    /**
     * Makes this animal use an item
     *
     * @param item the item to use
     */
    public void use (Item item) {

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

    }

    /**
     * Notifies this animal of a collision with an orangutan
     *
     * @param orangutan the orangutan this animal collided with
     */
    public void collideWithOrangutan (Animal orangutan) {

    }

    /**
     * Notifies this animal of a collision with a panda
     *
     * @param panda the panda this animal collided with
     */
    public void collideWithPanda (Animal panda) {

    }

    /**
     * Orders this animal to go to sleep to a given tile
     *
     * @param where the tile to go to in order to sleep
     */
    public void goToSleep (Tile where) {

    }

    /**
     * Makes this animal jump
     */
    public void jump () {

    }

    /**
     * Scares this animal
     */
    public void scare () {

    }

    /**
     * Leads this animal out, resulting in points being awarded, and the animal being removed from the game
     */
    public void leadOut () {
    }

    public Animal getLeaderAnimal () {
        return leaderAnimal;
    }

    public void setLeaderAnimal (Animal leaderAnimal) {
        this.leaderAnimal = leaderAnimal;
    }

    public Animal getGuidedAnimal () {
        return guidedAnimal;
    }

    public void setGuidedAnimal (Animal guidedAnimal) {
        this.guidedAnimal = guidedAnimal;
    }

    public Tile getStandingOn () {
        return standingOn;
    }

    public void setStandingOn (Tile standingOn) {
        this.standingOn = standingOn;
    }

    @Override
    public boolean select (float x, float y) {
        return false;
    }

    public boolean canBeGrabbed () {
        return false;
    }

}
