package hu.johndoe.panda.skeleton.model;

public abstract class Panda extends Animal {

    public boolean isAsleep;

    @Override
    public void collideWithAnimal (Animal animal) {

        animal.collideWithPanda (this);

    }

    @Override
    public void collideWithOrangutan (Animal orangutan) {

        startLeading (orangutan);

    }

    @Override
    public void leadOut () {

        if (getGuidedAnimal () != null) {
            getGuidedAnimal ().leadOut ();
        }

        // TODO: Add points

    }

    @Override
    public void update () {
        super.update ();
    }

}
