package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

public class Wardrobe extends Item implements Serializable {

    private Wardrobe otherWardrobe;

    public Wardrobe () {
    }

    public Wardrobe (Tile placedOn, Wardrobe otherWardrobe) {
        super (placedOn);
        this.otherWardrobe = otherWardrobe;
    }

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

}
