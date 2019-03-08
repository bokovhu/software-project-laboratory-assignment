package hu.johndoe.panda.skeleton.model;

public class Orangutan extends Animal {

    @Override
    public void collideWithAnimal (Animal animal) {

        animal.collideWithOrangutan (this);

    }

}
