package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public abstract class Item implements Updatable {

    protected final int id = IdGenerator.fetch ();

    private Tile placedOn;

    public Item () {
    }

    public Item (Tile placedOn) {
        this.placedOn = placedOn;
    }

    public void use (Animal user) {

        ActionLogger.log (this, "Getting used by %s", user.toString ());

    }

    public Tile getPlacedOn () {
        return placedOn;
    }

    public void setPlacedOn (Tile placedOn) {
        this.placedOn = placedOn;
    }

    @Override
    public String toString () {
        return "Item{" +
                "id=" + id +
                '}';
    }

}
