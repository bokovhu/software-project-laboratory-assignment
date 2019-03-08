package hu.johndoe.panda.skeleton.model;

public abstract class Animal implements Updatable {

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

    }

    public void stopLeading () {

    }

    public void kill () {

    }

    public void moveTo (Tile targetTile) {

    }

    public void use (Item item) {

    }

    public void collideWithAnimal (Animal animal) {

    }

    public void collideWithOrangutan (Animal orangutan) {

    }

    public void collideWithPanda (Animal panda) {

    }

    public void goToSleep (Tile where) {

    }

    public void jump () {

    }

    public void scare () {

    }

    public void leadOut () {

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
        return standingOn;
    }

    public void setStandingOn (Tile standingOn) {
        this.standingOn = standingOn;
    }

}
