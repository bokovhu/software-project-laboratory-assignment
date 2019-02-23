package hu.johndoe.spl.ass3;

public class Wardrobe extends Item {

    public Portal portal;
    public int color;

    @Override
    public void use (Animal user) {

        portal.enter (user);

    }

}
