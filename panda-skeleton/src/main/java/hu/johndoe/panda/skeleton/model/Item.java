package hu.johndoe.panda.skeleton.model;

public abstract class Item implements Updatable {

    private Tile placedOn;

    public void use (Animal user) {

    }

    public Tile getPlacedOn () {
        return placedOn;
    }

    public void setPlacedOn (Tile placedOn) {
        this.placedOn = placedOn;
    }

}
