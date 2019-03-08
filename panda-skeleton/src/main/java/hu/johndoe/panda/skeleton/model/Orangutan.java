package hu.johndoe.panda.skeleton.model;

public class Orangutan extends Animal {

    public Orangutan () {
    }

    public Orangutan (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void collideWithAnimal (Animal animal) {

        animal.collideWithOrangutan (this);

    }

}
