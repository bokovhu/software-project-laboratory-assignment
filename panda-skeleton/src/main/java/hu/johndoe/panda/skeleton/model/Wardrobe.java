package hu.johndoe.panda.skeleton.model;

public class Wardrobe extends Item {

    private Wardrobe otherWardrobe;

    public Wardrobe () {
    }

    public Wardrobe (Tile placedOn, Wardrobe otherWardrobe) {
        super (placedOn);
        this.otherWardrobe = otherWardrobe;
    }

    @Override
    public void use (Animal user) {

        user.moveTo (otherWardrobe.getPlacedOn ());

    }

    @Override
    public void update () {

    }

    public Wardrobe getOtherWardrobe () {
        return otherWardrobe;
    }

    public void setOtherWardrobe (Wardrobe otherWardrobe) {
        this.otherWardrobe = otherWardrobe;
    }

}
