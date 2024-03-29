package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;
import hu.johndoe.panda.proto._internal.IdGenerator;
import hu.johndoe.panda.proto._internal.Printable;
import hu.johndoe.panda.proto._internal.Referencable;

import java.io.Serializable;

/**
 * A single placeable item in the level. Items may be interacted with by animals, causing different kinds of effects.
 * Certain items may also produce different things with the passage of time.
 */
public abstract class Item implements Updatable, Serializable, Referencable, Printable {

    protected int id;

    /** The tile this item is placed on. Only a single item may be placed on any given tile */
    private Tile placedOn;

    public Item () {
    }

    public Item (Tile placedOn) {
        this.placedOn = placedOn;
    }

    /**
     * Makes the item be used by the parameter animal
     * @param user the item user animal
     */
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

    @Override
    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    @Override
    public String toPrintableRepresentation () {

        StringBuilder sb = new StringBuilder ();

        sb.append (getTag ()).append (" ID = ").append (getId ())
                .append (" PLACEDON = ").append (reference (placedOn));

        return sb.toString ();

    }

}
