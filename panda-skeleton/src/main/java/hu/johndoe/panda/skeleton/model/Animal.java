package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public abstract class Animal implements Updatable {

    protected final int id = IdGenerator.fetch ();

    private Animal leaderAnimal;
    private Animal guidedAnimal;
    private Tile standingOn;

    public Animal () {
    }

    public Animal (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        this.leaderAnimal = leaderAnimal;
        this.guidedAnimal = guidedAnimal;
        this.standingOn = standingOn;
    }

    public void startLeading (Animal leader) {

        ActionLogger.log (this, "Starting to be lead by %s", leader.toString ());

    }

    public void stopLeading () {

        ActionLogger.log (this, "Stopping to be lead");

    }

    public void kill () {

        ActionLogger.log (this, "Getting killed");

    }

    public void moveTo (Tile targetTile) {

        ActionLogger.log (this, "Moving to tile %s", targetTile.toString ());
        targetTile.accept (this);

    }

    public void use (Item item) {

        ActionLogger.log (this, "Using item %s", item.toString ());

    }

    public void collideWithAnimal (Animal animal) {

        ActionLogger.log (this, "Colliding with animal %s", animal.toString ());

    }

    public void collideWithOrangutan (Animal orangutan) {

        ActionLogger.log (this, "Colliding with orangutan %s", orangutan.toString ());

    }

    public void collideWithPanda (Animal panda) {

        ActionLogger.log (this, "Colliding with panda %s", panda.toString ());

    }

    public void goToSleep (Tile where) {

        ActionLogger.log (this, "Going to sleep to tile %s", where.toString ());

    }

    public void jump () {

        ActionLogger.log (this, "Jumping");

    }

    public void scare () {

        ActionLogger.log (this, "Being scared");

    }

    public void leadOut () {

        ActionLogger.log (this, "Being lead out");

    }

    @Override
    public void update () {

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
        ActionLogger.log (this, "getStandingOn ()");
        return standingOn;
    }

    public void setStandingOn (Tile standingOn) {
        ActionLogger.log (this, "setStandingOn (%s)", standingOn.toString ());
        this.standingOn = standingOn;
    }

    @Override
    public String toString () {
        return "Animal{" +
                "id=" + id +
                '}';
    }

}
