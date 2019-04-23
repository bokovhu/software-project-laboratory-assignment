package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

/**
 * A single wardrobe. Wardrobes may be connected with other wardrobes, forming two-way portals on the map. When a
 * wardrobe is used by an animal, it instantly appears at the counterpart of the wardrobe.
 */
public class Wardrobe extends Item implements Serializable {

    private Wardrobe otherWardrobe;

    public Wardrobe () {
    }

    public Wardrobe (Tile placedOn, Wardrobe otherWardrobe) {
        super (placedOn);
        this.otherWardrobe = otherWardrobe;
    }

    /**
     * Makes this wardrobe be used by the parameter animal. The animal is teleported to the counterpart wardrobe upon
     * calling this function.
     * @param user the item user animal
     */
    @Override
    public void use (Animal user) {

        ActionLogger.log (
                this,
                "Getting used by %s, moving it to %s",
                user.toString (),
                otherWardrobe.getPlacedOn ().toString ()
        );
        ActionLogger.push ();

        user.moveTo (otherWardrobe.getPlacedOn ());

        ActionLogger.pop ();

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

    @Override
    public String toString () {
        return "Wardrobe{" +
                "id=" + id +
                '}';
    }

    @Override
    public String getTag () {
        return "WARDROBE";
    }

    @Override
    public String toPrintableRepresentation () {
        return super.toPrintableRepresentation () + " OTHERWARDROBE = " + reference (otherWardrobe);
    }

}
