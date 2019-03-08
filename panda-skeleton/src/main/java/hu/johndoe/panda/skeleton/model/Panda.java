package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public abstract class Panda extends Animal {

    public boolean isAsleep;

    public Panda () {
    }

    public Panda (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void collideWithAnimal (Animal animal) {

        ActionLogger.log (this, "Colliding with animal %s", animal.toString ());
        animal.collideWithPanda (this);

    }

    @Override
    public void collideWithOrangutan (Animal orangutan) {

        ActionLogger.log (this, "Colliding with orangutan %s", orangutan.toString ());
        startLeading (orangutan);

    }

    @Override
    public void leadOut () {

        ActionLogger.log (this, "Getting lead out");
        if (getGuidedAnimal () != null) {
            ActionLogger.log (this, "Leading guided animal out");
            getGuidedAnimal ().leadOut ();
        }

        // TODO: Add points

    }

    @Override
    public void update () {
        super.update ();

        ActionLogger.log (this, "Updating");
    }

    @Override
    public String toString () {
        return "Panda{" +
                "id=" + id +
                '}';
    }

}