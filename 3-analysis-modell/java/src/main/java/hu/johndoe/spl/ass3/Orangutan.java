package hu.johndoe.spl.ass3;

public class Orangutan extends Animal {

    @Override
    public void collideWithAnimal (Animal animal) {

        animal.collideWithOrangutan (this);

    }

    @Override
    public void update () {

    }

}
