package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class Orangutan extends Animal {

    public Orangutan () {
    }

    public Orangutan (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void collideWithAnimal (Animal animal) {

        ActionLogger.log (this, "Colliding with animal %s", animal.toString ());
        animal.collideWithOrangutan (this);

    }

    @Override
    public String toString () {
        return "Orangutan{" +
                "id=" + id +
                '}';
    }

}
